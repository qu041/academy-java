package com.test.java.obj;

import java.text.Format;

public class Ex35_Static {
	public static void main(String[] args) {
		
			/*
			 
			 
			 
			 
			 
			 */
			
			//요구사항] 
			//1. 펜을 생산하시오.
			//2. 생산된 펜의 갯수를 세시오.
		
		//case 1.
		//- 간편함
		//- Pen 과 count간의 관계..모호
		//- count++ 누락 위험 높음!!
		
		
//		int count = 0; //누적 변수
//		
//		Pen p1 = new Pen("MonAmi 153", "black");
//		count++; //p1과의 관계가 불확실함.
//		
//		Pen p2 = new Pen("MonAmi 153", "black");
//		count++;
//		
//		Pen p3 = new Pen("MonAmi 153", "black");
//		count++;
//		
//		System.out.println("볼펜 갯수: " + count);
		
		//Case 2.
		//- Pen 클래스와 count 변수의 관계 강화
		//count(객체변수) > 객체마다 생성>  count는 개인데이터x > 공용데이터o
//		Pen p1 = new Pen("MonAmi 153", "black");
//		p1.count++;
//		
//		Pen p2 = new Pen("MonAmi 153", "black");
//		p2.count++;
//		
//		Pen p3 = new Pen("MonAmi 153", "black");
//		p3.count++;
//		
//		System.out.println("볼펜 갯수: " + p1.count);
//		System.out.println("볼펜 갯수: " + p2.count);
//		System.out.println("볼펜 갯수: " + p3.count);
		
		//Case3.
		//- Pen 클래스와 count 변수의 관계강화
		//- 개인 데이터와 공용 데이터를 구분지어서 관리
		//- count++ 누락 위
//		Pen p1 = new Pen("MonAmi 153", "black");
//		Pen.count++;  //개인 행동x > 공통 행동
//				
//		Pen p2 = new Pen("MonAmi 153", "black");
//		Pen.count++;  //개인 행동x > 공통 행동
//		
//		Pen p3 = new Pen("MonAmi 153", "black");
//		Pen.count++;  //개인 행동x > 공통 행동
//		
//		System.out.println("펜의 갯수: " + Pen.count);
		
		//Case4.
		
		Pen p1 = new Pen("MonAmi 153", "black");
		Pen p2 = new Pen("MonAmi 153", "black");
		Pen p3 = new Pen("MonAmi 153", "black");
		
		System.out.println("펜의 갯수: " + Pen.count);
		
		
		
		
		
	}//main

}

//Case 4.
class Pen {
	
	private String model;
	private String color;
	//private int count = 0; //누적변수(펜 갯수를 펜 클래스에서 )
	public static int count; //교육 편의성 퍼블릭으로 일단, 객체변수
						//static 공용변수
	
	//정적 생성자 > static 변수 전용생성자
	static {
		Pen.count = 0;
		//System.out.println("정적 생성자");
	}
	
	//객체 생성자
	public Pen(String model, String color) {
		this.model = model;
		this.color = color;
		//Pen.count = 0; //선언과 동시에 하지말고 여기서 하는걸 적극 권장
		System.out.println("객체 생성자");
		Pen.count++;
		
	}					//초기화는 생성자에!
	
	public String info() {
		return String.format("[model: %s, color: %s]"
				, this.model
				, this,color);
		
	}

//Case3. 
//class Pen {
//	
//	private String model;
//	private String color;
//	//private int count = 0; //누적변수(펜 갯수를 펜 클래스에서 )
//	public static int count; //교육 편의성 퍼블릭으로 일단, 객체변수
//						//static 공용변수
//	
//	//정적 생성자 > static 변수 전용생성자
//	static {
//		Pen.count = 0;
//	}
//	
//	//객체 생성자
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		//Pen.count = 0; //선언과 동시에 하지말고 여기서 하는걸 적극 권장
//	}					//초기화는 생성자에!
//	
//	public String info() {
//		return String.format("[model: %s, color: %s]"
//				, this.model
//				, this,color);
//		
//	}
//Case 2.
//class Pen {
//	
//	private String model;
//	private String color;
//	//private int count = 0; //누적변수(펜 갯수를 펜 클래스에서 )
//	public  int count; //교육 편의성 퍼블릭으로 일단, 객체변수
//						//static 공용변수
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//		this.count = 0; //선언과 동시에 하지말고 여기서 하는걸 적극 권장
//	}					//초기화는 생성자에!
//	
//	public String info() {
//		return String.format("[model: %s, color: %s]"
//				, this.model
//				, this,color);
//		
//	}
	
//class Pen {
//	
//	private String model;
//	private String color;
//	
//	public Pen(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//	
//	public String info() {
//		return String.format("[model: %s, color: %s]"
//								, this.model
//								, this,color);
//		
//	}
	
	
	
	
	
}
