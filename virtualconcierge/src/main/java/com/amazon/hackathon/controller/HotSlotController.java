package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.hackathon.domain.HotSlot;

public class HotSlotController {

	public List<HotSlot> getHotSlots() {
		List<HotSlot> hotSlots = new ArrayList<HotSlot>();
		hotSlots.add(new HotSlot("Cleopatra", "The Venetian Casino", "50 cents", false, "99.95%"));
		hotSlots.add(new HotSlot("Siberian Storm", "Mandalay Bay", "$1", false, "99.99%"));
		hotSlots.add(new HotSlot("Wolf Run", "El Cortez", "1 cent", true, "99.90%"));
		return hotSlots;
	}
}
