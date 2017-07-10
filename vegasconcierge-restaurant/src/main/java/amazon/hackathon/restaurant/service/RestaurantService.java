package amazon.hackathon.restaurant.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;

import com.amazon.hackathon.params.DialogAction;
import com.amazon.hackathon.params.LexRequest;
import com.amazon.hackathon.params.LexResponse;
import com.amazon.hackathon.params.Message;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Service
public class RestaurantService {

	private LexResponse response = null;
	
	private static final Logger log = Logger.getLogger(RestaurantService.class);
	
	public String processRequest(String input) throws JsonParseException, JsonMappingException, IOException {
	/*	Gson gson = new Gson();
		LexRequest inputEvent = gson.fromJson(input, LexRequest.class);
		LexResponse response = buildResponse(inputEvent);
		return gson.toJson(response, LexResponse.class);*/
		
		/*Map<String, Object> retMap = new Gson().fromJson(
			    jsonString, new TypeToken<HashMap<String, Object>>() {}.getType()
			);*/
		
		ObjectMapper mapper = new ObjectMapper();
		LexRequest request = mapper.readValue(input, LexRequest.class);
		LexResponse response = buildResponse(request);
		
		return mapper.writeValueAsString(response);
	}
	
	public LexResponse buildResponse(LexRequest inputEvent) {			
			
		if (inputEvent == null) {
			log.debug("Input event is null");
			return null;
		}
		log.trace("input event " + inputEvent.toString());
		if (inputEvent.getCurrentIntent() == null)
			log.debug("Current Intent is null");
		if (inputEvent.getCurrentIntent() != null && inputEvent.getCurrentIntent().getSlots() == null) {
			log.debug("Slots are null");
		}
		
		log.debug("input request " + new Gson().toJson(inputEvent, LexRequest.class));
		
		response = new LexResponse();
		Message message;
		DialogAction da;
		if(inputEvent.getCurrentIntent() == null ) {
			da = new DialogAction();
			message = new Message();
			da.setType("ElicitIntent");
			da.setMessage(message);
			response.setDialogAction(da);
			return response;
			
		}
		
		if(inputEvent.getCurrentIntent().getSlots() == null ||
				inputEvent.getCurrentIntent().getSlots().isEmpty()) {			
			return elicitSlot(inputEvent);	
			
		}			
		
		//we've slot and intent
	
		response = new LexResponse();
		message = new Message();
		message.setContentType("PlainText");
		StringBuilder str = new StringBuilder();
		str.append("You can't go wrong with "+inputEvent.getCurrentIntent().getSlots().
				get("restaurantType").toString()+" in Vegas. ");
		str.append("You should try ");
		str.append(String.join(", ", getRestaurants(inputEvent.getCurrentIntent().getSlots().
				get("restaurantType"))));
		str.append(" .Would you like any other information?");
		message.setContent(str.toString());		
		da = new DialogAction();
		da.setType("ElicitIntent");
		da.setMessage(message);
		response.setDialogAction(da);			

		Gson gson = new Gson();
		System.out.println(gson.toJson(response));
		return response;
	
	}
	
	
	public List<String> getRestaurants(String restaurantType) {
		List<String> eateries = new ArrayList<String>();
		eateries.add("Super dooper " + restaurantType + " eatery");
		eateries.add("Awesome "+ restaurantType + " place");
		eateries.add("World's great "+ restaurantType + " joint");
		return eateries;
	}
	
	public LexResponse elicitSlot(LexRequest request) {
		response = new LexResponse();
		Message message = new Message();
		message.setContentType("PlainText");
		StringBuilder str = new StringBuilder();
		str.append("I can help you with that. Can you tell me what kind of food do you like? ");
		str.append("You can say buffet, mexican, chinese or no preference");
		message.setContent(str.toString());		
		DialogAction da = new DialogAction();
		da.setIntentName(request.getCurrentIntent().getName());
		da.setType("ElicitSlot");
		da.setMessage(message);
		response.setDialogAction(da);
		return response;
	}
}
