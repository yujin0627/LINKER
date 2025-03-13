package com.linker.model;

public class CartDTO {
	private int cartId;
	private int buyerId;
	private int quantity;
	private int productDetailId;
	
	public CartDTO() {
		super();
	}

	public CartDTO(int cartId, int buyerId, int quantity, int productDetailId) {
		super();
		this.cartId = cartId;
		this.buyerId = buyerId;
		this.quantity = quantity;
		this.productDetailId = productDetailId;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public int getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getProductDetailId() {
		return productDetailId;
	}

	public void setProductDetailId(int productDetailId) {
		this.productDetailId = productDetailId;
	}

}
