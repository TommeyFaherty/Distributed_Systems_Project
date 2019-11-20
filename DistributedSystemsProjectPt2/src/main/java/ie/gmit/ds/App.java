package ie.gmit.ds;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
 
import ie.gmit.ds.controller.UserRESTController;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class App extends Application<ApiConfig> {
	private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
	
	@Override
	public void initialize(Bootstrap<ApiConfig> b) {
		
	}
	
	@Override
	public void run(ApiConfig c, Environment e) throws Exception {
		LOGGER.info("Registering REST resources");
		e.jersey().register(new UserRESTController(e.getValidator()));
	}
	
	public static void main(String[] args) throws Exception {
		new App().run(args);
	}

}