package com.ephesoft.timesheet.core;

import com.ephesoft.timesheet.core.model.ResponseCode;

public class ApplicationException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private int errorCode;
	private String message;
	
	public ApplicationException(int errorCode, String messge) {
		super(messge);
		this.errorCode = errorCode;
		this.message = messge;
	}
	
	public ApplicationException(ResponseCode responseCode) {
		this.errorCode = responseCode.getResponseCode();
		this.message = responseCode.getMessage();
	}

	public int getErrorCode() {
		return errorCode;
	}

	public String getMessage() {
		return message;
	}

}
