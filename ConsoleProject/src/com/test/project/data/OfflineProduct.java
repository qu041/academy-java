package com.test.project.data;

public class OfflineProduct extends Product {
	
	private String location;
	
	public OfflineProduct(String code, String name, int price, int qty, String location, String categoryCode) {
		super(code, name, price, qty, categoryCode);
		this.location = location;
	}

	public String getCode() {
		return super.getCode();
	}

	public void setCode(String code) {
		super.setCode(code);
	}

	public String getName() {
		return super.getName();
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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}
	
	@Override
	public String toString() {
		return "OfflineProduct [code=" + code + ", name=" + name + ", price=" + price + ", qty=" + qty + ", location="
				+ location + ", categoryCode=" + categoryCode + "]";
	}
	//생성자,게터세터,투스트링
	

}
