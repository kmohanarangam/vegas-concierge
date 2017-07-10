package amazon.hackathon.restaurant.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import amazon.hackathon.restaurant.lambdahandler.LambdaRestaurantHandler;
import amazon.hackathon.restaurant.service.RestaurantService;

@Configuration
public class AppConfig {

	@Bean
	public RestaurantService getThingsToDoService() {
		return new RestaurantService();
	}
	
	@Bean
	public LambdaRestaurantHandler getLambdaThingsToDoHandler() {
		return new LambdaRestaurantHandler();
	}
}

