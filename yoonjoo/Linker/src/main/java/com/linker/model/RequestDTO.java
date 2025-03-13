package com.linker.model;

import java.sql.Timestamp;

public class RequestDTO {
	private int requestId;
	private String requestTitle;
	private String requestContent;
	private Timestamp requestCreatedAt;
	private int userId;
	
	public RequestDTO() {
		super();
	}

	public RequestDTO(int requestId, String requestTitle, String requestContent, Timestamp requestCreatedAt,
			int userId) {
		super();
		this.requestId = requestId;
		this.requestTitle = requestTitle;
		this.requestContent = requestContent;
		this.requestCreatedAt = requestCreatedAt;
		this.userId = userId;
	}

	public int getRequestId() {
		return requestId;
	}

	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}

	public String getRequestTitle() {
		return requestTitle;
	}

	public void setRequestTitle(String requestTitle) {
		this.requestTitle = requestTitle;
	}

	public String getRequestContent() {
		return requestContent;
	}

	public void setRequestContent(String requestContent) {
		this.requestContent = requestContent;
	}

	public Timestamp getRequestCreatedAt() {
		return requestCreatedAt;
	}

	public void setRequestCreatedAt(Timestamp requestCreatedAt) {
		this.requestCreatedAt = requestCreatedAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
