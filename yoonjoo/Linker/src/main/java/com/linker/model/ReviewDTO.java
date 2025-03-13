package com.linker.model;

import java.sql.Timestamp;

public class ReviewDTO {
	private int reviewId;
	private int productDetailId;
	private String reviewContent;
	private Timestamp reviewCreatedAt;
	private int userId;
	
	public ReviewDTO() {
		super();
	}

	public ReviewDTO(int reviewId, int productDetailId, String reviewContent, Timestamp reviewCreatedAt, int userId) {
		super();
		this.reviewId = reviewId;
		this.productDetailId = productDetailId;
		this.reviewContent = reviewContent;
		this.reviewCreatedAt = reviewCreatedAt;
		this.userId = userId;
	}

	public int getReviewId() {
		return reviewId;
	}

	public void setReviewId(int reviewId) {
		this.reviewId = reviewId;
	}

	public int getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public String getReviewContent() {
		return reviewContent;
	}

	public void setReviewContent(String reviewContent) {
		this.reviewContent = reviewContent;
	}

	public Timestamp getReviewCreatedAt() {
		return reviewCreatedAt;
	}

	public void setReviewCreatedAt(Timestamp reviewCreatedAt) {
		this.reviewCreatedAt = reviewCreatedAt;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	

}
