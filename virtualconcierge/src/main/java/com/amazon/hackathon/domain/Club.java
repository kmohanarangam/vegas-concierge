package com.amazon.hackathon.domain;

public class Club {

	private String name;
	private String cover;
	private String freeDrinks;
	private String hoursOfOperation;
	
	public Club(String name, String cover, String freeDrinks, String hoursOfOperation) {
		this.name = name;
		this.cover = cover;
		this.freeDrinks = freeDrinks;
		this.hoursOfOperation = hoursOfOperation;
	}

	public String getName() {
		return name;
	}

	public String getCover() {
		return cover;
	}

	public String getFreeDrinks() {
		return freeDrinks;
	}

	public String getHoursOfOperation() {
		return hoursOfOperation;
	}

	@Override
	public String toString() {
		return "Club [name=" + name + ", cover=" + cover + ", freeDrinks=" + freeDrinks + ", hoursOfOperation="
				+ hoursOfOperation + "]";
	}
	
	
	
}
