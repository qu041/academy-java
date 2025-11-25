package com.test.java.lambda;

public class Ex67_Lambda {
	
	public static void main(String[] args) {
		
		//Ex67_Lambda.java
		/*
		 
		 	람다식,  Lambda Expression
		 	- 함수형 프로그래밍 방식을 지원하는 표현식
		 	- 람다식을 사용하면 코드가 간결해진다.(호불호)
		 	- 자바 > 익명 객체가 필요한 곳에 쓰임.
		 			> 컬렉션(배열)을 조작하는 기능에서 많이 사용.
		 			
		 	- 람다식은 매개변수를 가지는 코드블럭(내부적으로 메서드라서)
		 	- 자바의 람다식은 반드시 인터페이스를 사용해서 만든다. (다른언어는 독립적으로 사용가능)		
		 	
		 	람다식 형식
		 	- 인터페이스 변수 = 람다식;
		 	- ex) MyInterface m1 = () -> {};
		 	
		 	() -> {};
		 	- 익명 클래스의 익명 객체의 추상 메서드
		 	
		 	(매개변수) -> {구현부};
		 	a. (매개변수) : 추상 메서드의 인자리스트
		 	b. ->: 화살표(Arrow) 연결역할
		 	c. {구현부} : 추상 메서드의 구현부
		 			 
		 
		 */
		
		//요구사항] MyInterface를 구현한 객체를 생성하시오.
		//1. MyInterface
		//2. MyClass
		//3. 객체 생성
		
		//Case 1. 인터페이스 선언 + 클래스 선언 + 객체 생성
		//MyClass m1 = new MyClass();
		MyInterface m1 = new MyClass();
		m1.test();
		
		//Case 2. 인터페이스 선언 + 익명 객체 선언
		MyInterface m2 = new MyInterface() {
			
			@Override
			public void test() {
				System.out.println("익명 객체에서 구현한 메서드");
			}
		};
		m2.test();
	
		
		//Case 3. 인터페이스 선언 + 람다식
		MyInterface m3 = () -> {
			System.out.println("람다로 구현한 메서드");
		};
		m3.test();
		
		TestInterface t1 = new TestInterface() {
			
			@Override
			public void bbb() {
				
			}
			
			@Override
			public void aaa() {
				
			}
		};
	TestInterface t2 = () -> {}; //인터페이스에 추상메서드 두개이상이면 람다로 구현 못함.
	
	
	
	
	}//메인

}

@FunctionalInterface
interface MyInterface {
	void test();
}

class MyClass implements MyInterface {

	@Override
	public void test() {
		System.out.println("실명 객체(클래스)에서 구현한 메서드");
	}
	
}
//@FunctionalInterface // ->람다식을 저장 할 수 있는 인터페이스, 컴파일 때 확인하기 위해 작성하는 안전장치
interface TestInterface {
	void aaa();
	void bbb();
}

