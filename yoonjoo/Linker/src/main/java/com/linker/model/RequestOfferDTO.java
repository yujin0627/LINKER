package com.linker.model;

import java.sql.Timestamp;

public class RequestOfferDTO {
	private int requestOfferId;
	private String requestStatus;
	private Timestamp requestOfferDate;
	private int requestID;
	private int userID;
	
	public RequestOfferDTO() {
		super();
	}

	public RequestOfferDTO(int requestOfferId, String requestStatus, Timestamp requestOfferDate, int requestID,
			int userID) {
		super();
		this.requestOfferId = requestOfferId;
		this.requestStatus = requestStatus;
		this.requestOfferDate = requestOfferDate;
		this.requestID = requestID;
		this.userID = userID;
	}

	public int getRequestOfferId() {
		return requestOfferId;
	}

	public void setRequestOfferId(int requestOfferId) {
		this.requestOfferId = requestOfferId;
	}

	public String getRequestStatus() {
		return requestStatus;
	}

	public void setRequestStatus(String requestStatus) {
		this.requestStatus = requestStatus;
	}

	public Timestamp getRequestOfferDate() {
		return requestOfferDate;
	}

	public void setRequestOfferDate(Timestamp requestOfferDate) {
		this.requestOfferDate = requestOfferDate;
	}

	public int getRequestID() {
		return requestID;
	}

	public void setRequestID(int requestID) {
		this.requestID = requestID;
	}

	public int getUserID() {
		return userID;
	}

	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	

	
}
