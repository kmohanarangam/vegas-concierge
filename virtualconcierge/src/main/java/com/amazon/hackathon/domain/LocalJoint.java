package com.amazon.hackathon.domain;

public class LocalJoint {
	
	private String jointName;
	private String special;
	private String bestTime;
	
	public LocalJoint(String jointName, String special, String bestTime) {
		super();
		this.jointName = jointName;
		this.special = special;
		this.bestTime = bestTime;
	}

	public String getJointName() {
		return jointName;
	}

	public String getSpecial() {
		return special;
	}

	public String getBestTime() {
		return bestTime;
	}

	@Override
	public String toString() {
		return "LocalJoint [jointName=" + jointName + ", special=" + special + ", bestTime=" + bestTime + "]";
	}
	
	

}
