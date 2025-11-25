package com.test.java;

public class Ex17_LocalVariable {
	
	int a; //전역 변수(X)
	
	public static void main(String[] args) {
		
		//Ex17_LocalVariable.java
		/*
		
			자바 변수의 종류
			- 선언된 위치, 역할 차이
			
			1. 멤버 변수, Member Variables
				- 클래스 수업
			
			2. 지역 변수, Local Variables
				- 이미 배웠음. 여태까지의 변수들
				- 메서드 내에서 선언한 변수
				- 변수 스코프(Scope) > 변수의 사용할 수 있는 영역(범위)
				
			지역 변수의 생명주기, Life Cycle
			-변수가 언제 태어나서(생성) ~ 언제 죽는지(소멸) 
			-생성 > 변수 선언문이 실행될 때 
			-소멸 > 변수 선언문이 포함된(자신의 스코프) 블럭을 벗어날 때 
		
		*/
		
		int a = 10;
		//int a = 20;
		System.out.println(a);
		int b = 20;
		
		m1();
		
	}//main 

	private static void m1() {
		
		//System.out.println(b);
		
		int a = 20;
		System.out.println(a);
		
	}

}











