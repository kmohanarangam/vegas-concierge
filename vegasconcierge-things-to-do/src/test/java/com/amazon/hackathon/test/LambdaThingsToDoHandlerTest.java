package com.amazon.hackathon.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.amazon.hackathon.configuration.AppConfig;
import com.amazon.hackathon.lambdahandler.LambdaThingsToDoHandler;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = 
AnnotationConfigContextLoader.class)
public class LambdaThingsToDoHandlerTest {
	
	@Autowired
	private LambdaThingsToDoHandler handler;
	
	@Test
	public void testHandleRequest() {
		System.out.println(handler.handleRequest().toString());
		Assert.assertTrue(handler.handleRequest() != null);
	}

}
