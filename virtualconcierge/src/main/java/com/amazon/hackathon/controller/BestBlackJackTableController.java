package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.hackathon.domain.BlackJackTable;

public class BestBlackJackTableController {

	public List<BlackJackTable> getBestBlackJackTable() {
		List<BlackJackTable> bjTables = new ArrayList<BlackJackTable>();
		bjTables.add(new BlackJackTable("Golden Gate Casino", "3:2"));
		bjTables.add(new BlackJackTable("Wynn", "3:2"));
		return bjTables;
	}
}
