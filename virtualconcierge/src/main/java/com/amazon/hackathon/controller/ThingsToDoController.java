package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThingsToDoController {

	@RequestMapping("/thingsToDo")
	public List<String> getThingsToDo() {
		List<String> thingsToDo = new ArrayList<String>();
		thingsToDo.add("watch shows");
		thingsToDo.add("eat at celebrity chef restaurants");
		thingsToDo.add("play some black jack");
		thingsToDo.add("explore local joints");
		thingsToDo.add("explore Vegas outside of String");
		thingsToDo.add("win some jackpot");
		thingsToDo.add("hang out by the pool");
		thingsToDo.add("party at the clubs");
		return thingsToDo;
	}
}
