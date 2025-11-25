package com.test.java.obj;

public class Ex28_Class {
	
	public static void main(String[] args) {
		
		//Ex28_Class.java
		
		/*
		 	자바, Java
		 	-객체 지향 프로그래밍 언어
		 	-Object Oriented Programming Language > OOP
		 	-객체를 중심으로 프로그램을 만드는 방식
		 	-클래스라는 설계도를 만들고,
		     그 설계도를 사용해서 객체(***)라는 것을 만들고,
		     만들어진 객체를 사용해서,
		     내가 원하는 행동을 구현하는 것.
		 
		 	
		 	1. 클래스, Class
		 		-객체를 만드는 설계도
		 		-붕어빵틀
		 	
		 	2. 객체, Object
		 		-붕어빵
		 		-
		 	3. 인스턴스,  Instance
		 	
		 	4. 추상화
		 	
		 	5. 정보은닉
		 	
		 	6. 캡슐화
		 	
		 	7. 인터페이스
		 	
		 	8. 프로퍼티, 속성
		 	
		 	9. 상태, 행동
		 	
		 	10. 상속
		 
		 */
		
		//요구사항] 지도 > 우리집 > 좌표 저장
		
		//Case 1.
		//- 가장 간단한 방법
		//- 식별자 문제 > 같은 성질의 데이터가 다른 식별자를 사용(x, x2...)
		//- 구조적인 문제 > x와 y가 하나의 집합이라는 증명 불가능.
		
		
		//우리집 좌표
		int x = 100;
		int y = 200;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\r\n",x,y);
		
		//마트 좌표
		int x2 = 300;
		int y2 = 400;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\r\n",x2,y2);
		
		//Case 2.
		//- 배열 사용
		//- 데이터 저장 가능한 구조 생성 > 집합 > 관리용이 + 가독성
		//- 배열의 단점 > 요소의 성질 차이를 구분하기 힘들다. > 첨자(숫자) 사용
		//우리집 좌표
		//- 정수 x 2개
		int[] a1 = { 100, 200 };
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\r\n",a1[0],a1[1]);

		//마트좌표
		int[] a2 = { 300, 400 };
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\r\n",a2[0],a2[1]);
		
		//Case 3.
		//- 클래스 사용
		//- 데이터 저장 구조 > 관리 용이
		//- 각 멤버의 이름이 지정 가능 > 데이터 성질 구분 용이
		//- 초기 비용 발생
		
		//*** Point 클래스: 데이터 집합으로서의 클래스
		
		//클래스 > 객체 생성
		
		//클래스 변수명 = new 클래스();
		//클래스 객체명 = 객체생성연산자 생성자();
		
		//우리집
		Point p1 = new Point();
		p1.x = 100;
		p1.y = 200;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\r\n",p1.x,p1.y);
		
		//마트
		Point p2 = new Point();
		p2.x = 300;
		p2.y = 400;
		
		System.out.printf("우리집은 [%d,%d]에 위치합니다.\r\n",p2.x,p2.y);
		
		int n1;
							//원시형 기본형
		double n2;
							//참조형 
		Point n3;
		
		
		
		
	}//main		
		
		
}//class
		
//클래스 선언하기
//-클래스명: 파스칼 표기법

class Point {
	
		//구현부
		//- 클래스 멤버 선언하기
		//1. 변수
		//2. 메서드
	
	//클래스 변수, 멤버 변수
	//접근지정자 > 자료형 > 변수명;
	
	//객체의 데이터 역할
	//- 객체의 상태(State) > 특징
	public int x;
	public int y;
	
	
	
	
	
}
		
		
		
		
	

	



