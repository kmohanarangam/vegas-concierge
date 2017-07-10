package com.amazon.hackathon.model;

import java.io.Serializable;

public class Message implements Serializable  {

	/**
	 * 
	 */
	private static final long serialVersionUID = 701037349063136025L;
	
	private String contentType;
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	private String content;
	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	@Override
	public String toString() {
		return "Message [contentType=" + contentType + ", content=" + content + "]";
	}
	
	
	
}
