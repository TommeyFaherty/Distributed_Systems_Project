package ie.gmit.ds;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.StatusRuntimeException;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProjectClient {
	private static final Logger logger = Logger.getLogger(ProjectClient.class.getName());
	private final ManagedChannel channel;
	private final PasswordGrpc.PasswordBlockingStub passwordClientStub;
	
	/** Construct client for accessing server using the existing channel. */
    public ProjectClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        passwordClientStub = PasswordGrpc.newBlockingStub(channel);
    }
    
    public void shutdown() throws InterruptedException {
    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    
    public void hash(int id, String password) {
    	logger.info("Hashing..." + password);
    	HashRequest request = HashRequest.newBuilder()
    			.setName(id)
    			.setPassword(password)
    			.build();
        HashReply response;
        try {
            response = passwordClientStub.hashPassword(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Hashed: " + response.getMessage());
//        String tempPass = response.getMessage();
//        String[] tempPassArray = tempPass.split(":");
        
    }
    
    
    public void validate(String password, String hashedPass, String salt) {
    	logger.info("Validating ...");
    	ValidateRequest request = ValidateRequest.newBuilder()
    			.setPassword(password)
    			.setHashedPass(hashedPass)
    			.setSalt(salt)
    			.build();
    	ValidateReply response;
    	try {
    		response = passwordClientStub.validate(request);
    	}catch (StatusRuntimeException e) {
    		logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
    	}
    	logger.info("Validity: "+ response.getMessage());
    }
    
    public static void main(String[] args) throws Exception {
        
    	Scanner console = new Scanner(System.in);
    	
    	ProjectClient client = new ProjectClient("localhost", 50051);
        try {
        	
        	//Get username id
            System.out.println("Enter username ID:");
            int id = console.nextInt();
            
            //Get password
            System.out.println("Enter password:");
            String password = console.nextLine();
            password = console.nextLine();
            client.hash(id, password);
            
            String hashedPass = "[B@7d29c560";
            String salt = "[B@1dd14335";
            client.validate(password, hashedPass, salt);
            
        } finally {
            client.shutdown();
        }
    }
    
	
}
