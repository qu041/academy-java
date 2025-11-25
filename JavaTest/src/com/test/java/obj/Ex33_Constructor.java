package com.test.java.obj;

public class Ex33_Constructor {
	
	public static void main(String[] args) {
		
		//Ex33_Constructor.java
		/*
			
			생성자, Constructor
			-(특수한 목적을 가지는) 메서드
			-객체의 멤버(변수)를 초기화하는 역할(*******)
			-객체 초기화 전용 메서드(****)
			
			-접근 지정자 public (대부분 이걸로함) //<-> private
			-반환값 없음> 보이드 생략
			-생성자명 == 클래스명 (반드시 같아야함)
			
			Point p1 = new Point();
			
		*/
		
		//1.new - 객체 생성 -설계도대로 메모리에 객체 생성
		//2.Box() 분리된 행동임. - 매서드 호출처럼 생김,근데 하는일도 맞음. 객체 = 인스턴스?
		Box b1 = new Box();
		
		b1.setSize("소형"); //수정의 개념 //언제든 수정가능
		b1.setPrice(1000);
		
		
		System.out.println("b1.size: "	+ b1.getSize());
		System.out.println("b1.price: "	+ b1.getPrice());
		
		Box b2 = new Box("소형", 3000);
		
		
		System.out.println("b2.size: "	+ b2.getSize());
		System.out.println("b2.price: "	+ b2.getPrice());
		
		Cup c1 = new Cup("white", 500);
		
		
		
		
	}//main

}//

class Box {
	
	private String size;
	private int price;
	
	//기본 생성자, Default Constructor
	//-개발자가 코딩을 안해도 컴파일러가 자동으로 만들어준다.
//	public Box() {
//		this.size = null;
//		this.price = 0;
//		
//	}
	
	
	//입맛에 맞게 초기상태를 만들 때. //setter랑 조금 다름?? 어떤점이.?
	//생성자 오버로딩 (자주함) -> 한게 유용함.
	public Box() {					
		//this.size = "대형";
		//this.price = price;
		this("대형", 1000); // 밑에 오버로딩 된 밑에 생성자를 불러온다. 번거로운 구문들 생략 가능.
	}						//위임해서 한쪽으로 모는 방법. 자주씀.
	
	public Box(String size,int price) {					
		this.size = size;
		this.price = price;
		
	}
//	public Box() {					// 생성자는 초기화 개념, setter는 수정 개념//처음에만 만들고 수정함.
//		this.size = "대형";
//		this.price = 1000;
		
	
	
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}

class Cup {
	
	//1. 멤버변수
	private String color;
	private int size;
	
	
	//2. 생성자(기본 or 오버로딩) //이클립스가 만들어줌 소스 -> 인스트럭터 .,..
	public Cup(String color, int size) {

		this.color = color;
		this.size = size;
		
	
	//3. Getter, Setter 만듬.	
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
}





















