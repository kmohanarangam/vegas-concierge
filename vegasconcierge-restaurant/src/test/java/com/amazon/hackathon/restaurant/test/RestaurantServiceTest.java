package com.amazon.hackathon.restaurant.test;

import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.HashMap;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.amazon.hackathon.params.CurrentIntent;
import com.amazon.hackathon.params.LexRequest;
import com.amazon.hackathon.params.LexResponse;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;

import amazon.hackathon.restaurant.configuration.AppConfig;
import amazon.hackathon.restaurant.service.RestaurantService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = 
AnnotationConfigContextLoader.class)
public class RestaurantServiceTest {

	@Autowired
	private RestaurantService restaurantService;
	
	private static LexRequest requestWithSlot;
	private static LexRequest requestWithoutSlot;
	private static LexRequest requestWithTwoSlots;
	private static LexRequest requestWithoutIntentName;
	
	private static String requestInJson;
	
	@BeforeClass
	public static void setUp() throws UnsupportedEncodingException, IOException, URISyntaxException {
		requestWithSlot = new LexRequest();
		requestWithSlot.setCurrentIntent(new CurrentIntent());
		requestWithSlot.getCurrentIntent().setName("PlacesToEat");
		requestWithSlot.getCurrentIntent().setSlots(new HashMap<String, String>());
		requestWithSlot.getCurrentIntent().setConfirmationStatus("None");
		requestWithSlot.setSessionAttributes(new HashMap<String, String>());
		requestWithSlot.getCurrentIntent().getSlots().put("restaurantType", "Mexican");
		
		requestWithoutSlot = new LexRequest ();
		requestWithoutSlot.setCurrentIntent(new CurrentIntent());
		requestWithoutSlot.getCurrentIntent().setName("PlacesToEat");
		requestWithoutSlot.getCurrentIntent().setSlots(new HashMap<String, String>());
		
		requestWithoutIntentName = new LexRequest ();
		
		requestWithTwoSlots = new LexRequest();
		requestWithTwoSlots.setCurrentIntent(new CurrentIntent());
		requestWithTwoSlots.getCurrentIntent().setName("PlacesToEat");
		requestWithTwoSlots.getCurrentIntent().setSlots(new HashMap<String, String>());
		requestWithTwoSlots.getCurrentIntent().getSlots().put("restaurantType", "Mexican");
		requestWithTwoSlots.getCurrentIntent().getSlots().put("restaurantType", "Chinese");
		
		/*java.net.URL url = RestaurantServiceTest.class.getResource("src/test/resources/requestWithSlot.json");
        java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
        requestInJson = new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");*/
		
		Scanner scanner = new Scanner(new File("src/test/resources/requestWithSlot.json"));
		requestInJson = scanner.useDelimiter("\\Z").next();
		scanner.close();
	}
	
	@Test
	public void testBuildResponseWithSlots() {
		Assert.assertTrue(restaurantService.buildResponse(requestWithSlot)  != null);
	}
	
	@Test
	public void testBuildResponseWithoutSlot() {		
		Assert.assertTrue(restaurantService.buildResponse(requestWithoutSlot)  != null);
	}
	
	@Test
	public void testBuildResponseNullInputEvent() {		
		Assert.assertTrue(restaurantService.buildResponse(null)  == null);
	}
	
	@Test
	public void testBuildResponseNullCurrentIntent() {		
		LexResponse response = restaurantService.buildResponse(requestWithoutIntentName);
		Assert.assertTrue(response.getDialogAction().getType().equals("ElicitIntent"));
	}
	
	@Test
	public void testBuildResponseWithJsonInput() throws JsonParseException, JsonMappingException, IOException {		
		String response = restaurantService.processRequest(requestInJson);
		Assert.assertTrue(response != null);
	}
	
}

