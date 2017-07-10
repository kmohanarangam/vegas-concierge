package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.hackathon.domain.DayClub;
import com.amazon.hackathon.domain.NightClub;

public class ClubController {

	public List<DayClub> getDayClub() {
		List<DayClub> dayClubs = new ArrayList<DayClub> ();
		dayClubs.add(new DayClub("Drais day club", "30, Ladies free", "0", "9 AM - 4 PM"));
		dayClubs.add(new DayClub("Marquee day club", "55", "2", "8 AM - 3 PM"));
		return dayClubs;
	}
	
	public List<NightClub> getNightClub() {
		List<NightClub> nightClubs = new ArrayList<NightClub> ();
		nightClubs.add(new NightClub("Drais night club", "50", "2", "9 PM - 6 AM"));
		nightClubs.add(new NightClub("Ghost Bar", "30", "1", "8 PM - 5 AM"));
		return nightClubs;
	}

}
