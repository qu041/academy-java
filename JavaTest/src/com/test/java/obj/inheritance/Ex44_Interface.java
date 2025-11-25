package com.test.java.obj.inheritance;

public class Ex44_Interface {
	
	public static void main(String[] args) {
		
		//Ex44_Interface.java
		/*
		 
		 
		 	추상 클래스 > 일반 클래스 + 추상 메서드
		 	자식 클래스 > 반드시 추상 메서드 구현 > 모든 자식들이 공통된 시그니처를 가지는 메서드를 구현
		 				>모든 자식들이 공통된 행동을 가지게 된다. > 클래스 사용자(개발자)들이 공통된 경험을 제공받는다.
		 
		 			추상화 기술
		 				-추상 클래스
		 				-인터페이스
		 				
		 
		 
		 */
		
		 //최종 사용자
		S25 p1 = new S25();
		p1.powerOn();
		p1.call();
		p1.powerOff();
		
		Iphone16 p2 = new Iphone16();
		p2.powerOn();
		p2.call();
		p2.powerOff();
		
		
	}

}

//인터페이스 선언
//-추상 메서드의 집합
interface Phone {
	
	//인터페이스 멤버 선언
	//-추상 멤버만 선언할 수 있다.(***)
	//-구현된 멤버는 가질 수 없다.(***)
	//public int a; /일반변수
	//private int b; /일반변수
	
//	public void ccc() {
//		System.out.println("Ccc"); 
//	}
	
//	public abstract void ddd(); // 무조건 public이라 생략가능.
//	abstract void eee(); //abstract도 생략가능.
//	void fff(); //이렇게 씀.
	
	//전화기가 갖춰야할 최소한의 규칙(행동 or 사용법)
	
	void call();
	void powerOn();
	void powerOff();
	
	
	
	
}

//클래스 extends 클래스
//클래스 extends 추상클래스
//클래스 implements 인터페이스


class S25 implements Phone {

	@Override
	public void call() {
		System.out.println("삼성기술 > 통화");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOn() {
		System.out.println("삼성기술> 전원 온");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		System.out.println("삼성기술 > 전원 오프");
		// TODO Auto-generated method stub
		
	}

	
}


class Iphone16 implements Phone {

	@Override
	public void call() {
		System.out.println("애플기술 > 통화");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOn() {
		System.out.println("애플기술 > 전원 온");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		System.out.println("애플기술 > 전원 오프");
		// TODO Auto-generated method stub
		
	}
	
}