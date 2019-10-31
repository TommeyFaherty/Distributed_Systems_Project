package ie.gmit.ds;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.logging.Logger;

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
    		Passwords ps = new Passwords();
    		byte[] salt = ps.getNextSalt();
			char[] password = (req.getPassword()).toCharArray();
			
			byte[] hashedPass = ps.hash(password,salt);
			
			HashReply reply = HashReply.newBuilder().setMessage(req.getName()+":"+hashedPass+":"+salt).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
    	}
    	
    	@Override
    	public void validate(ValidateRequest req, StreamObserver<ValidateReply> responseObserver) {
    		
    		Passwords ps = new Passwords();
    		
    		char[] password = req.getPassword().toCharArray();
    		byte[] expectedHash = req.getHashedPass().getBytes();
    		byte[] salt = req.getSalt().getBytes();
    		
    		boolean checker = ps.isExpectedPassword(password, salt, expectedHash);
			ValidateReply reply = ValidateReply.newBuilder().setMessage("is... "+checker).build();
			responseObserver.onNext(reply);
			responseObserver.onCompleted();
    		
    		
    	}
    }
}
