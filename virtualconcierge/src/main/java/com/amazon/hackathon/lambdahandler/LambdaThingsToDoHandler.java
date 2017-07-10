package com.amazon.hackathon.lambdahandler;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;

import com.amazon.hackathon.controller.ThingsToDoController;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaThingsToDoHandler {
	
	@Autowired
	private ThingsToDoController thingsToDo;

	
	public List<String> handleRequest() {
		// TODO Auto-generated method stub
		return thingsToDo.getThingsToDo();
	}

}
