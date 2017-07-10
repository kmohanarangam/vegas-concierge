package amazon.hackathon.restaurant.lambdahandler;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.hackathon.params.LexRequest;
import com.amazon.hackathon.params.LexResponse;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.google.gson.Gson;

import amazon.hackathon.restaurant.configuration.AppConfig;
import amazon.hackathon.restaurant.service.RestaurantService;

public class LambdaRestaurantHandler implements RequestHandler<LexRequest, LexResponse>{
	
	/*@Autowired
	private ThingsToDoService thingsToDoService;*/

	private static ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
	static final Logger log = Logger.getLogger(LambdaRestaurantHandler.class);

	public LexResponse handleRequest(LexRequest input, Context context) {
		// TODO Auto-generated method stub
		
		RestaurantService tds = ctx.getBean(RestaurantService.class);		

		return tds.buildResponse(input);

	
	}
	
}
