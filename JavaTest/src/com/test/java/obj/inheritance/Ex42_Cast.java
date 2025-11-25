package com.test.java.obj.inheritance;

public class Ex42_Cast {
	
	public static void main(String[] args) {
		
		//Ex42_Cast.java
		/*
		 
		 	형변환, Type Casting
		 	
		 	1. 값형 형변환
		 		- 갑형끼리 형변환(boolean 제외)
		 		- byte, short, int, long, float, double, char
		 		- 문제 발생 >  오버 플로우(Overflow)		

		 	2. 참조형 형변환
		 		- 클래스끼리 형변환(***)
		 		- 
		 		
		 		
		 	참조형 형변환
		 	- 상속 관련
		 	- 상속 관계에 있는 클래스끼리만 형변환이 가능하다.
		 	- 직계 > 가능	(부모,자식)
		 	- 방계 > 불가능 (ex.형제 ..) ? : object에서 내려오면 모두가 방계여서 그런걸수도?
		 	
		 			 		
		 	1. 업캐스팅, Up Casting
		 	- 암시적인 형변환
		 	- 자식 클래스 > 형변환 > 부모 클래스
		 	
		 	2. 다운캐스팅, Down Casting
		 	-명시적인 형변환
		 	- 부모 클래스 > 형변환 > 자식 클래스
		 
		 */
		
//		char c1 = 'A';
//		String s1 = "A";
//		String s2 = "100";
//		
//		int n = Integer.parseInt(s2); // "100" > 100 //엄밀히는 형변환이 아님
//													 //parsing 해서 처리한다.
//		
//		System.out.println((int)c1); //형변환 O	 //값형은 값이 그대로 들어있기 때문에 가능
		//System.out.println((int)s1); //형변환 X //참조형이기 때문에 주소값이 들어있음
		
		CParent p1;
		CChild c1;
		
		c1 = new CChild(); //자식 객체 > 원본 역할
		
		//복사
		//CParent = CChild
		//암시적인 형변환
		//부모클래스 = 자식클래스
		//업캐스팅이 발생한다.
		p1 = c1;
		//p1 = (CParent)c1; //위와 동일.
		
		//검증?
		// -값형: 원본과 복사본이 동일한지?
		//- 참조형: 복사본을 사용했을 때 문제가 발생하는지?
		
		//p1 (복사본)이 잘 작동하는지?
		p1.a = 10;
		p1.b = 20;
		
		System.out.println(p1.a);
		System.out.println(p1.b);
		
		CParent p2;
		CChild c2;
		
		p2 = new CParent(); //부모 클래스 > 원보ㅜㄴ 역할
		
		//복사
		//Child = Parent
		//명시적 형변환
		// 자식클래스 = 부모클래스
		//다운캐스팅이 발생한다.
		//불안정 > 100% 불가능
		//c2 = (CChild)p2;
		
		//검증?
		//c2.a = 10;
		//c2.b = 20;
		//c2.c = 30;
		//c2.d = 40;
		
		CParent p3;
		CChild c3;
		
		c3 = new CChild(); //원본
		
		//업캐스팅
		p3 = c3;
		
		CChild c4;
		
		//다운 캐스팅 - 이거 이해 못 함. 다시보기 //왜? 하는지에 대한 고찰하기. 값형형변환 등등 (ex) 형변환 - 코드를 부드럽게 유연하게 딱딱하지 않게 만들어줌
		c4 =(CChild) p3;							//도구 사용하는 이유 > 도구 사용법보다 중요
		
		c4.a = 10;
		c4.b = 20;
		c4.c = 30;
		c4.d = 40;
		
		System.out.println(c4.a);
		System.out.println(c4.b);
		System.out.println(c4.c);
		System.out.println(c4.d);
		
		CDescendent d5 = new CDescendent(); //손자
		CChild c5; //아버지
		CParent p5; //할아버지
		
		//c5(a,b,c,d) = d5(a,b,c,d,e,f)
		c5 = d5;
		
		//p5(a,b) = d5(a,b,c,d,e,f) //못쓰고 감춰지는 애들이 많지만 업캐스팅은 세대 건너뛰어도 가능함.
		p5 = d5;
		
	}//main

}

class CParent {
	public int a;
	public int b;
	
}

class CChild extends CParent {
	public int c;
	public int d;
	
}

class CDescendent extends CChild {
	public int e;
	public int f;
}