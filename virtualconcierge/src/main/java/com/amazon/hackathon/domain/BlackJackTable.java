package com.amazon.hackathon.domain;

public class BlackJackTable {

	public BlackJackTable(String casino, String odds){
		this.casino = casino;
		this.odds = odds;
	}
	
	private String casino;
	private String odds;
	
	public String getCasino() {
		return casino;
	}
	
	public String getOdds() {
		return odds;
	}	
	
	@Override
	public String toString() {
		return "BlackJackTable [casino=" + casino + ", odds=" + odds + "]";
	}
	
	
}
