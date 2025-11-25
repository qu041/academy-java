package com.test.java.obj.inheritance;

public class Ex43_Abstract {
	public static void main(String[] args) {
		
		//콘솔 프로젝트 (팀프로젝트)??? - 데이터 취급 관련 주제(ex 학사관리 도서관리 쇼핑몰 sns ??) 
		//-주제보단 구현에 힘을 쏟아야 됨. 
		//-5일동안 코딩은 최대3일 나머지는 도큐멘트 작업 등등 해야됨..
		//줌 디코 등등으로 수업시간 외에도 해야됨..(시간이 촉박함)
		//프로젝트 때 실력이 오르는 경우가 많음. -> 스스로 찾아서 구현이 중요.
	
	//Ex43.Abstract.java
	
	/*
	 		홍길동(구체적)  -> 추상화 -> 사람 
	 
	 
	 		추상, Abstract <-> 구체적이다.
	 		
	 		추상 클래스, Abstract Class
	 		추상 메서드, Abstract Method
	 		
	 		추상클래스
	 		-일반 멤버를 가질 수 있다.(변수, 메서드) > 구현된 멤버
	 		-추상 멤버를 가질 수 있다. > 추상 메서드
	 		-일반 클래스 + 추상 메서드
	 		
	 		일반 클래스
	 		-일반 멤버를 가질수 있다.(변수, 메서드) > 구현된 멤버
	 		-추상 멤버를 가질 수 없다 > 구현되지 않은 멤버
	 
	 */
		G305 m1 = new G305();
		m1.click();
		m1.click();
		m1.click();

		//5년뒤..
		
		M410 m2 = new M410();
		//m2.click();
//		m2.mouseDown();
//		m2.mouseDown();
		m2.click();
		m2.click();
		m2.click();
		
		
		
		
	}//main
}

//추상 클래스
//-일반 클래스의 부모 역할(상속)
abstract class Mouse {
	public int price;
	
//	public void click() {
//		System.out.println("브론즈 스위치를 사용해서 클릭합니다.");
//	}
	
	//구현부가 없는 메서드 = 추상 메서드
	public abstract void click();
	
	
}



//로지텍
class G305 extends Mouse {
	public String model;
	//public int price;
	
	public void click() {
		System.out.println("골드 스위치를 사용해서 클릭합니다.");
	}
}
//MS
class M410 extends Mouse {
	//public int price;
	public String buttonType;

	@Override //클래스명 빨간줄 클릭
	public void click() {
		System.out.println("실버 스위츠를 사용해서 클릭했습니다.");
	}
	
//	public void click() {
//		System.out.println("실버 스위츠를 사용해서 클릭했습니다.");
//	}
//	public void mouseDown() {
//		System.out.println("실버 스위츠를 사용해서 클릭했습니다.");
//	}
//	@Override //ctrl shift  누르면 뜸
//	public void click() {
//		
//		
//	}
	
	
}