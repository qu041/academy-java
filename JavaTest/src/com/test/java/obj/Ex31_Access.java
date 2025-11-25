package com.test.java.obj;

public class Ex31_Access {
	
	public static void main(String[] args) {
		
		//Ex31_Access.java
		/*
		
			OOO 지정자(제어자)
			- 클래스 or 클래스 멤버 > 부가적인 기능을 제공하는 키워드
			
			접근 지정자(제어자), Access Modifier
			- 클래스 자체에 붙일 수 있다.
			- 클래스 멤버(변수,멤서드)에 붙일 수 있다. > 수업 내용
			- 지역 변수에는 사용이 불가능하다.
			
			1. public
				- 100% 공개
			2. private
				- 100% 비공개
			------------
			3. protected
			4. (default, package)
		
		*/
		
		m1();
		//m2();
		
	}//main

	private static void m2() {
		
		//자바 > 어떤 업무
		//- 모든 업무를 객체들이 한다.
		//- 객체(클래스)
		//	- 데이터(멤버변수)
		//	- 행동(멤버메서드)
		
		
		
		
	}

	public static void m1() {
		
		Book b1 = new Book();
		
		//멤버 접근 연산자
		//- 부모.자식
		//b1.a
		
		//System.out.println(b1.a);
		//System.out.println(b1.b); //The field Book.b is not visible
		//b1.check();
		
		//b1.title = "이것이 자바다!";
		//b1.price = 38000000;
		
		//System.out.println(b1.title);
		//System.out.println(b1.price);
		
		//b1.price = 100;
		
		b1.aaa(38000);
		System.out.println(b1.bbb());
		
		
		
		b1.setPublisher("영진 출판사"); //setter
		System.out.println(b1.getPublisher()); //getter
		
		//쓰기O, 읽기X
		//- 쓰기 전용 프로퍼티(속성)
		
		//b1.author = "홍길동";
		//System.out.println(b1.author);
		
		b1.setAuthor("홍길동");
		//System.out.println(b1.getAuthor());
		//System.out.println(b1.author);
		
		
		//읽기 전용 프로퍼티
		System.out.println(b1.getISBN());
		
		//가상 프로퍼티 or 계산된 프로퍼티
		System.out.println(b1.getLevel());
		
	}
	
}


class Note {
	
	//성질, 상태, 데이터 > 변수
	private String color;
	private int page;
	
	private String owner;
	private int price;
	private int weight;
	private int size;
	
	//행동, 기능 > 메서드
	public void setColor(String color) {
		
		if (color.equals("white") 
				|| color.equals("black") 
				|| color.equals("gray")) {
			this.color = color;
		} else {
			System.out.println("잘못된 색상을 입력했습니다.");
			//throw new Exception(); 강제로 에러 발생
		}
		
	}
	
	public String getColor() {
		
		return this.color;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getOwner() {
		return owner;
	}

	//public String owner;
	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}

























