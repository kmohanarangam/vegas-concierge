package com.amazon.hackathon.domain;

public class CheapTable {
	
	public CheapTable(String casino, String minBet, String maxBet) {
		this.casino = casino;
		this.minBet = minBet;
		this.maxBet = maxBet;
	}
	
	private String casino;
	private String minBet;
	private String maxBet;
	
	public String getCasino() {
		return casino;
	}
	public String getMinBet() {
		return minBet;
	}
	public String getMaxBet() {
		return maxBet;
	}
	
	@Override
	public String toString() {
		return "CheapTable [casino=" + casino + ", minBet=" + minBet + ", maxBet=" + maxBet + "]";
	}
	
	
	
	

}
