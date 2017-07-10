package com.amazon.hackathon.lambdahandler;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.amazon.hackathon.configuration.AppConfig;
import com.amazon.hackathon.model.Response;
import com.amazon.hackathon.service.ThingsToDoService;

public class LambdaThingsToDoHandler {
	
	/*@Autowired
	private ThingsToDoService thingsToDoService;*/

	private static ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
	
	static final Logger log = Logger.getLogger(LambdaThingsToDoHandler.class);
	
	public Response handleRequest() {
		ThingsToDoService tds = ctx.getBean(ThingsToDoService.class);
		return tds.getThingsToDo();
	}
	
}
