package com.ephesoft.timesheet.core.model;

public enum ResponseCode {
	
	UNAUTHORISED(401, "Unauthorised"),
	RSERVER_ERROR(500, "ServerError");
	
	private int responseCode;
	private String message;
	
	ResponseCode(int responseCode, String message) {
		this.responseCode = responseCode;
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	
	public int getResponseCode() {
		return responseCode;
	}
}
