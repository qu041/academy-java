package com.test.java.obj;

public class Ex29_Class {
	
	public static void main(String[] args) {
		
		//Ex29_Class.java
		
		/*
		 	
		 	클래스 선언하기
		 	1. 클래스 선언
		 	2. 멤버 선언
		 		a. 변수
		 		b. 메서드
		 		
		 	클래스 선언할 때 권장사항
		 	- 클래스 1개당 물리적인 파일 1개를 만든다.	(절대적으로 지키길 권장)
		 	- 관리가 용이
		 	
		 	클래스를 선언할 때 절대규칙(에러발생)
		 	- 파일의 이름과 클래스의 이름은 반드시 같아야 한다.
		 	- 컴파일 에러 
			- 하나의 파일에 2개 이상을 클래스를 선언시
				-파일내의 모든 클래스 중 public을 가지는 클래스는 유일하다
				-public 클래스 > 파일내의 대표 클래스 > 대표클래스의 이름이 파일명이 된다.

		 	
		 	
		 	
		 */
		
		User u1 = new User();
		u1.name = "홍길동";
		
		
	}

}

//class User {
//	
//}

