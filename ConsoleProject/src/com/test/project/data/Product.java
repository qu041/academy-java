package com.test.project.data;

public abstract class Product {
	
	public String code;
	public String name;
	public int price;
	public int qty;
	public String categoryCode;
	
	public Product(String code, String name, int price, int qty, String categoryCode) {
		this.code = code;
		this.name = name;
		this.price = price;
		this.qty = qty;
		this.categoryCode = categoryCode;
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

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

}
