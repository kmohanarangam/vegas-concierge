package com.amazon.hackathon.domain;

public class HotSlot {
	
	private String game;
	private String casino;
	private String denomination;
	private boolean justHit;
	private String payOut;
	
	public HotSlot(String game, String casino, String denomination, boolean justHit, String payOut) {
		this.game = game;
		this.casino = casino;
		this.denomination = denomination;
		this.justHit = justHit;
		this.payOut = payOut;
	}

	public String getGame() {
		return game;
	}

	public String getCasino() {
		return casino;
	}

	public String getDenomination() {
		return denomination;
	}

	public boolean isJustHit() {
		return justHit;
	}
	
	public String getPayOut() {
		return payOut;
	}

	@Override
	public String toString() {
		return "HotSlot [game=" + game + ", casino=" + casino + ", denomination=" + denomination + ", justHit="
				+ justHit + ", payOut=" + payOut + "]";
	}


}
