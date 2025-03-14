package com.linker.model;

import java.sql.Timestamp;

public class ProductDetailDTO {
	private int productDetailId;
	private byte[] productImage;
	private String productDescription;
	private String productContactInfo;
	private Timestamp productCreatedAt;
	private int productPrice;
	private String productType;
	private int userId;
	
	public ProductDetailDTO() {
		super();
	}

	public ProductDetailDTO(int productDetailId, byte[] productImage, String productDescription,
			String productContactInfo, Timestamp productCreatedAt, int productPrice, String productType, int userId) {
		super();
		this.productDetailId = productDetailId;
		this.productImage = productImage;
		this.productDescription = productDescription;
		this.productContactInfo = productContactInfo;
		this.productCreatedAt = productCreatedAt;
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

	public Timestamp getProductCreatedAt() {
		return productCreatedAt;
	}

	public void setProductCreatedAt(Timestamp productCreatedAt) {
		this.productCreatedAt = productCreatedAt;
	}

	public int getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(int productPrice) {
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
