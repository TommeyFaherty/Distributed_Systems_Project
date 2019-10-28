package ie.gmit.ds;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.stub.StreamObserver;

import java.io.IOException;
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
    
    static class PasswordImpl extends PasswordGrpc.PasswordImplBase {
    	@Override
    	public void sayHello(HelloRequest req, StreamObserver<HelloReply> responseObserver) {
    		HelloReply reply = HelloReply.newBuilder().setMessage("Hello " + req.getName()).build();
    		responseObserver.onNext(reply);
    		responseObserver.onCompleted();
    	}
    	
    	@Override
    	public void hashPassword(PassRequest req, StreamObserver<PassReply> responseObserver) {		
    		
    		PasswordStorage ps = new PasswordStorage();
    		try {
				String hashedPass = ps.createHash(req.toString());
				
				PassReply reply = PassReply.newBuilder().setMessage("hashed: "+ hashedPass +" || " + req.getName()).build();
				responseObserver.onNext(reply);
				responseObserver.onCompleted();
				
			} catch (CannotPerformOperationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    		
    		
    	}
    }
}
