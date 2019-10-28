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
	private final GreeterGrpc.GreeterBlockingStub greeterClientStub;
	
	/** Construct client for accessing server using the existing channel. */
    public ProjectClient(String host, int port) {
        this.channel = ManagedChannelBuilder.forAddress(host, port)
                // Channels are secure by default (via SSL/TLS). For the example we disable TLS to avoid
                // needing certificates.
                .usePlaintext()
                .build();
        greeterClientStub = GreeterGrpc.newBlockingStub(channel);
    }
    
    public void shutdown() throws InterruptedException {
    	channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }
    
    /** Say hello to server. */
    public void greet(String name) {
        logger.info("Will try to greet " + name + " ...");
        HelloRequest request = HelloRequest.newBuilder().setName(name).build();
        HelloReply response;
        try {
            response = greeterClientStub.sayHello(request);
        } catch (StatusRuntimeException e) {
            logger.log(Level.WARNING, "RPC failed: {0}", e.getStatus());
            return;
        }
        logger.info("Greeting: " + response.getMessage());
    }
    
    public void hash(String password) {
    	logger.info("Hashing...");
    }
    
    public static void main(String[] args) throws Exception {
        
    	Scanner console = new Scanner(System.in);
    	
    	ProjectClient client = new ProjectClient("localhost", 50051);
        try {
        	
        	//Get username
            System.out.println("Enter username:");
            String username = console.nextLine();
            client.greet(username);
            
            //Get password
            System.out.println("Enter password:");
            String password = console.nextLine();
            client.hash(password);
;        } finally {
            client.shutdown();
        }
    }
    
	
}
