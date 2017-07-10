package com.amazon.hackathon.model;

import java.io.Serializable;

public class Response implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7216936709072352338L;

	private DialogAction dialogAction;
	

	public DialogAction getDialogAction() {
		return dialogAction;
	}

	public void setDialogAction(DialogAction dialogAction) {
		this.dialogAction = dialogAction;
	}

	@Override
	public String toString() {
		return "Response [dialogAction=" + dialogAction.toString() + "]";
	}
	
	
	
}
