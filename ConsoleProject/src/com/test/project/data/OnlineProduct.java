package com.test.project.data;

public class OnlineProduct extends Product {
	
	private String code;
	private String name;
	private int price;
	private int qty;
	private int shippingFee;
	private String categoryCode;
	
	public OnlineProduct(String code, String name, int price, int qty, int shippingFee, String categoryCode) {
		
		super(code, name, price, qty, categoryCode);
		this.shippingFee = shippingFee;
		
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public int getShippingFee() {
		return shippingFee;
	}

	public void setShippingFee(int shippingFee) {
		this.shippingFee = shippingFee;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	@Override
	public String toString() {
		return "OnlineProduct [code=" + code + ", name=" + name + ", price=" + price + ", qty=" + qty + ", shippingFee="
				+ shippingFee + ", categoryCode=" + categoryCode + "]";
	}

}
