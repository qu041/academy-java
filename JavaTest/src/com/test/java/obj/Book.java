package com.test.java.obj;

public class Book {

//	public int a = 10;
//	private int b = 20;
//	
//	public void check() {
//		System.out.println("a: " + a);
//		System.out.println("b: " + b);
//	}
	
	//접근 지정자를 어떻게? 가이드
	//1. 멤버 변수는 무조건 private을 사용한다.
	
	private String title;
	private int price;
	
	private String publisher;
	private String author;
	private String ISBN = "ABC12345";
	private int pages;
	
	//외부 > (값) > 내부
	//쓰기 작업
	//Setter, Set Method
	public void aaa(int a) {
		if (a >= 0 && a <= 1000000) {
			price = a;
		}
	}
	
	//내부 > (값) > 외부
	//읽기 작업
	//Getter, Get Method
	public int bbb() {
		
		return price;
	}
	
	
	//price > setter
	public void setPrice(int price) {
		
		//1. 매개변수 price
		//2. 멤버변수 price
			
		//this 
		//- 객체 자신을 가르키는 참조 변수(키워드)
		//- 객체 접근 연산자
		//- 나(자기 자신을 가르키는 상대 표현)
		this.price = price;
	}
	
	//price > getter
	public int getPrice() {
		
		return this.price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getISBN() {
		return ISBN;
	}
	
	public String getLevel() {
		
		//노트의 등급(품질)
		if (this.pages >= 100 && this.price >= 1000) {
			return "A";
		} else if (this.pages >= 50 && this.price >= 500) {
			return "B";
		} else {
			return "C";
		}
		
	}
	
}


























