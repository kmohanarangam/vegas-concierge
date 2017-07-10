package com.amazon.hackathon.service;

import org.springframework.stereotype.Service;

import com.amazon.hackathon.model.DialogAction;
import com.amazon.hackathon.model.Message;
import com.amazon.hackathon.model.Response;

@Service
public class ThingsToDoService {

	
	public Response getThingsToDo() {
		
		
		Response response = new Response();
		Message message = new Message();
		message.setContentType("PlainText");
		StringBuilder str = new StringBuilder();
		str.append("You can ");
		str.append("watch shows, ");
		str.append("eat at celebrity chef restaurants, ");
		str.append("play some black jack, ");
		str.append("explore local joints, ");
		str.append("explore Vegas outside of strip, ");
		str.append("win some jackpot, ");
		str.append("hang out by the pool, ");
		str.append("or party at the clubs. ");
		str.append("Which one I can help you with?");
		message.setContent(str.toString());
		
		DialogAction da = new DialogAction();
		da.setType("ElicitIntent");
		da.setMessage(message);
		response.setDialogAction(da);
		
		

		return response;
	}
}
