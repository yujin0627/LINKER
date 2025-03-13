package com.linker.model;

import java.sql.Timestamp;

public class ProductDTO {
	private int productDetailId;
	private byte[] productImage; 
	private String productDescription;
	private String productContactInfo;
	private Timestamp productCreated;
	private double productPrice;
	private String productType;
	private int userId;
	
	
	public ProductDTO() {
	}


	public ProductDTO(int productDetailId, byte[] productImage, String productDescription, String productContactInfo,
			Timestamp productCreated, double productPrice, String productType, int userId) {
		this.productDetailId = productDetailId;
		this.productImage = productImage;
		this.productDescription = productDescription;
		this.productContactInfo = productContactInfo;
		this.productCreated = productCreated;
		this.productPrice = productPrice;
		this.productType = productType;
		this.userId = userId;
	}


	public int getProductDetailId() {
		return productDetailId;
	}


	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}


	public byte[] getProductImage() {
		return productImage;
	}


	public void setProductImage(byte[] productImage) {
		this.productImage = productImage;
	}


	public String getProductDescription() {
		return productDescription;
	}


	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}


	public String getProductContactInfo() {
		return productContactInfo;
	}


	public void setProductContactInfo(String productContactInfo) {
		this.productContactInfo = productContactInfo;
	}


	public Timestamp getProductCreated() {
		return productCreated;
	}


	public void setProductCreated(Timestamp productCreated) {
		this.productCreated = productCreated;
	}


	public double getProductPrice() {
		return productPrice;
	}


	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}


	public String getProductType() {
		return productType;
	}


	public void setProductType(String productType) {
		this.productType = productType;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	

}
