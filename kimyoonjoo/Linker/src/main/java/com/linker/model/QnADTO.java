package com.linker.model;

import java.sql.Timestamp;

public class QnADTO {
	private int qnaId;
	private String qnaTitle;
	private String qnaContent;
	private String qnaStatus;
	private Timestamp qnaCreateAt;
	private int userId;
	
	public QnADTO() {
		super();
	}

	public QnADTO(int qnaId, String qnaTitle, String qnaContent, String qnaStatus, Timestamp qnaCreateAt, int userId) {
		super();
		this.qnaId = qnaId;
		this.qnaTitle = qnaTitle;
		this.qnaContent = qnaContent;
		this.qnaStatus = qnaStatus;
		this.qnaCreateAt = qnaCreateAt;
		this.userId = userId;
	}

	public int getQnaId() {
		return qnaId;
	}

	public void setQnaId(int qnaId) {
		this.qnaId = qnaId;
	}

	public String getQnaTitle() {
		return qnaTitle;
	}

	public void setQnaTitle(String qnaTitle) {
		this.qnaTitle = qnaTitle;
	}

	public String getQnaContent() {
		return qnaContent;
	}

	public void setQnaContent(String qnaContent) {
		this.qnaContent = qnaContent;
	}

	public String getQnaStatus() {
		return qnaStatus;
	}

	public void setQnaStatus(String qnaStatus) {
		this.qnaStatus = qnaStatus;
	}

	public Timestamp getQnaCreateAt() {
		return qnaCreateAt;
	}

	public void setQnaCreateAt(Timestamp qnaCreateAt) {
		this.qnaCreateAt = qnaCreateAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
	
	

}
