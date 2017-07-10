package com.amazon.hackathon.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.amazon.hackathon.lambdahandler.LambdaThingsToDoHandler;
import com.amazon.hackathon.service.ThingsToDoService;

@Configuration
public class AppConfig {

	@Bean
	public ThingsToDoService getThingsToDoService() {
		return new ThingsToDoService();
	}
	
	@Bean
	public LambdaThingsToDoHandler getLambdaThingsToDoHandler() {
		return new LambdaThingsToDoHandler();
	}
}

