package ie.gmit.ds;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
		
		final ApiResource resource =
				new ApiResource(e.getValidator());
		 
		
		e.jersey().register(resource);
	}
	
	public static void main(String[] args) throws Exception {
		new App().run(args);
	}

}
