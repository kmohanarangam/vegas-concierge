package com.amazon.hackathon.model;

import java.io.Serializable;

public class DialogAction implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -732032589070444268L;
	private String type;
	private Message message;
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "DialogAction [type=" + type + ", message=" + message.toString() + "]";
	}
	
	
}
