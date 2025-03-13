package com.linker.model;

public class OrderDetailDTO {
	private int orderId;
	private int productDetailId;
	private int productCnt;
	
	public OrderDetailDTO() {
		super();
	}

	public OrderDetailDTO(int orderId, int productDetailId, int productCnt) {
		super();
		this.orderId = orderId;
		this.productDetailId = productDetailId;
		this.productCnt = productCnt;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

	public int getProductCnt() {
		return productCnt;
	}

	public void setProductCnt(int productCnt) {
		this.productCnt = productCnt;
	}
	
	
	
	
}
