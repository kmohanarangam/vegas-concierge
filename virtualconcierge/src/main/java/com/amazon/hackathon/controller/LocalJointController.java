package com.amazon.hackathon.controller;

import java.util.ArrayList;
import java.util.List;

import com.amazon.hackathon.domain.LocalJoint;

public class LocalJointController {
	
	public List<LocalJoint> getLocalJoints(){
		List<LocalJoint> localJoints = new ArrayList<LocalJoint>();
		localJoints.add(new LocalJoint("Blue Martini", "martinis and lolipop lamb chops", "Fridays after 9 PM"));
		localJoints.add(new LocalJoint("Skinny Fats", "meltdown and cherry popper", "lunch"));
		return localJoints;
	}

}
