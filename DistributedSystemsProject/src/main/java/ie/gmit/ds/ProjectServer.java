package ie.gmit.ds;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Logger;

import ie.gmit.ds.PasswordStorage.CannotPerformOperationException;

public class ProjectServer {
	
	private Server server;
    private static final Logger logger = Logger.getLogger(ProjectServer.class.getName());
    
	public static void main(String[] args) throws IOException, InterruptedException {
		final ProjectServer server = new ProjectServer();
		server.start();
		server.blockUntilShutdown();
	}
	
	private void start() throws IOException {
        /* The port on which the server should run */
        int port = 50051;
        server = ServerBuilder.forPort(port)
                .addService(new ProjectServer.PasswordImpl())
                .build()
                .start();
        logger.info("Server started, listening on " + port);
	}
	
	private void stop() {
		if(server != null) {
			server.shutdown();
		}
	}
	
	/**
     * Await termination on the main thread since the grpc library uses daemon threads.
     */
    private void blockUntilShutdown() throws InterruptedException {
        if (server != null) {
            server.awaitTermination();
        }
    }
       
    private static void SavePassword(int username, String hashedPassword) 
    		  throws IOException {
    		    FileWriter fileWriter = new FileWriter("hashedPasswords.txt");
    		    PrintWriter printWriter = new PrintWriter(fileWriter);
    		    printWriter.print(username);
    		    printWriter.printf("%d %s", username, hashedPassword);
    		    printWriter.close();
    		}
    
    static class PasswordImpl extends PasswordGrpc.PasswordImplBase {
    	@Override
    	public void hashPassword(HashRequest req, StreamObserver<HashReply> responseObserver) {		
    			
    		PasswordStorage ps = new PasswordStorage();
    		try {
    			String password = req.getPassword();
    			int id =req.getName();
    			
				String hashedPass = ps.createHash(password);
				
				HashReply reply = HashReply.newBuilder().setMessage(hashedPass).build();
				responseObserver.onNext(reply);
				responseObserver.onCompleted();
				
				try {
					SavePassword(id, hashedPass);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			} catch (CannotPerformOperationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 		
    	}
    	
//    	@Override
//    	public void validate(IdRequest req, StreamObserver<IdReply> responseObserver) {
//    		IdReply reply = IdReply.newBuilder().setMessage("Hello " + req.getName()).build();
//    		responseObserver.onNext(reply);
//    		responseObserver.onCompleted();
//    	}
    }
}
