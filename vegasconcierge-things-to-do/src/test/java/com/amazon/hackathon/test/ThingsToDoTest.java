package com.amazon.hackathon.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.amazon.hackathon.configuration.AppConfig;
import com.amazon.hackathon.service.ThingsToDoService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = 
AnnotationConfigContextLoader.class)
public class ThingsToDoTest {

	@Autowired
	private ThingsToDoService ttdService;
	
	@Test
	public void testGetThingsToDo() {
		Assert.assertTrue(ttdService.getThingsToDo()  != null);
	}
}
