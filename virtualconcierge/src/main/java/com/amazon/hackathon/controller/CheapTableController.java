package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.hackathon.domain.CheapTable;

public class CheapTableController {
	
	public List<CheapTable> getCheapTable() {
		List<CheapTable> cheapTables = new ArrayList<CheapTable>();
		cheapTables.add(new CheapTable("The Linq", "5", "10"));
		cheapTables.add(new CheapTable("Tropicana", "10", "20"));
		return cheapTables;
	}

}
