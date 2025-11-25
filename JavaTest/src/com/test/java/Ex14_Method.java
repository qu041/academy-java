package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex14_Method {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex14_Method.java
		/*
			
			메서드, Method
			- 함수(Function), 프로시저(Procedure), 서브 루틴(Sub Routine)
			- 코드의 집합 > 같은 목적을 가진 코드의 집합
			- 코드 재사용의 단위(***)
			
			메서드 사용
			1. 메서드 선언(정의)
			2. 메서드 호출(사용)
			
			
			메서드 사용 이유(목적)?
			1. 코드의 재사용
			2. 코드의 관리(가독성)
			
		*/
		//요구사항] "안녕하세요." x 5회 출력
		//수정사항] "반갑습니다."
		
		
		//Case A.
		//- 가장 단순한 방법
		//- 아무 생각없이..
		//- 하드 코딩
		//- 재사용성 0% > 반복 x 동일한 비용
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println();
		
		//메서드 선언 > 에러 발생
		
		
		//메서드 선언 > 메서드 호출
		hello();
		hello();
		hello();
		hello();
		hello();
		
		//숫자 출력
		printNumber();
		
		hello();
		
		printNumber();
		
		hello();
		
		checkAge();  //내가 만든 툴 전체 드래그 해서 마우스 우클릭 리펙터 Extract Method***
		
		//sum()
		sum();  // ctrl + 1 +> 빨간밑줄 클릭대신 단축키 사용
		
	}//main

	private static void sum() {
		// TODO Auto-generated method stub
		
	}

	public static void checkAge() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("나이: ");
		
		int age = Integer.parseInt(reader.readLine());
		
		System.out.printf("당신은 %s입니다.\n"
							, age >= 19 ? "성인" : "미성년자");
	}

	//메서드 선언 위치
	//- 클래스 내부
	//- 메서드의 순서는 무관
	
	//메서드 선언
	/*
		
		메서드 헤더(header), 서명(Signature)
		- 접근지정자 정적키워드 반환타입 메서드명 인자리스트
		  public     static     void     hello    ()
		  
		메서드 몸통(Body), 구현부
		{
			코드;
		}
		
	*/
	
	//Case B.
	public static void hello() {
		
		System.out.println("반갑습니다.");
		
	}
	
	public static void printNumber() {
		
		System.out.println("하나");
		System.out.println("둘");
		System.out.println("셋");
		System.out.println("넷");
		System.out.println("다섯");
		System.out.println("여섯");
		System.out.println("일곱");
		System.out.println("여덟");
		System.out.println("아홉");
		System.out.println("열");
		
	}
	
}//class











