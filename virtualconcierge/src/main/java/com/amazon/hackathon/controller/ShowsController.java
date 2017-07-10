package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

public class ShowsController {

	public List<String> getShows() {
		List<String> shows = new ArrayList<String>();
		shows.add("Jennifer Lopez");
		shows.add("Cirque de Soleil");
		shows.add("Mariah Carey");
		return shows;
	}
}
