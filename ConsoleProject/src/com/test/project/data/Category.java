package com.test.project.data;

public class Category {
	
	//private String code;
	private String categoryCode;
	private String categoryName;
	
	public Category(String categoryCode, String categoryName) {
		this.categoryCode = categoryCode;
		this.categoryName = categoryName;
	}

	public String getCategoryCode() {
		return categoryCode;
	}

	public void setCategoryCode(String categoryCode) {
		this.categoryCode = categoryCode;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	@Override
	public String toString() {
		return "Category [categoryCode=" + categoryCode + ", categoryName=" + categoryName + "]";
	}

	

}
