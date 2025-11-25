package com.test.java;

public class Ex18_Method {
	
	public static void main(String[] args) {
		
	
			//Ex18_Method.java
			
			//객체지향프로그래밍
			//-행동의 단위 > 메서드
			
			/*
			  메서드 오버로딩, Method Overloading
			  - 같은 이름의 메서드를 여러개 만드는 기술
			  - 어떻게?
			  	-메서드의 인자 리스트를 다양하게 구성해서 > 같은 이름의 메서드를 여러개 만드는 기술
			  - 왜?
			  	-성능향샹 (x)
			  	-개발자에게 도움 > 가독성 + 메서드명 1개로만 제공
			  	
			  	
			  메서드 오버로딩 구현 조건 가능	
				1.매개변수의 개수
				2.매개변수의 자료형
				
			  메서드 오버로딩 구현 조건 불가능
			    1.매개변수의 이름(변수명)
			    2.반환값의 자료형
			 
			  메서드 선언 중......
			  	1. public static void test() {} //O
			  	2. public static void test() {} //X, 1번
			  	3. public static void test() {int n} //O
			  	4. public static void test() {int m} //x
			  	5. public static void test() {int n, int m} //O
			  	6. public static void test() {String s} //O
			  	7. public static void test() {byte n} //O
			  	8. public static int test() {} //X, 1번
			  	
			  
			  메서드 호출하기(***)
			  test(); //1번
			  test(10); //3번
			  test(10,20); //5번
			  test("자바"); //6번
			  test(byte(10)); //7번 -되긴 하는데 의미 없음
			  int result = test(); //8번 -1번 때문에 안됨
			  
			  
			  
			  
			  
			 
			 
			 */
			//요구사항] 선을 그리는 메서드를 구현하시오.
			//요구사항] 선의 모양이 다양했으면 좋겠어요.(===,***,---)
			//System.out.println("=============================");
		
		drawLine("=");
		System.out.println("홍길동");
		System.out.println(100);
		System.out.println(true);
		
	}
	
	public static void test() {
		
		
		
	}
	
	public static void println(int num) {
		
		
	}
	
	public static void drawLine() {
		System.out.println("==========");
		
	}
	
	public static void drawLine(String c) {
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		System.out.print(c);
		
		System.out.println();
		
	}
	
	public static void hello() {
		System.out.println("안녕하세요. 홍길동님");
		
	}
	
	public static void hello(String name) {
		System.out.println("안녕하세요. 아무개님.");
	}


}
