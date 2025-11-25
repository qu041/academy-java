package com.test.java.obj;

import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Ex53_Exception {
	
	public static void main(String[] args) {
		
		//Ex53_Exception.java
		/*
		 
		 	예외, Exception
		 	- 런타임 오류
		 	- 컴파일 발견 (x) -> 실행 중 발견(O)
		 	- 테스트 or 개발자 경험 미리 예측 > 사전 조치
		 	
		 	예외처리, Exception Handling
		 	- 에러 발생 > 미리 차단
		 	- 에러 발생 > 후속 조치
		 	
		 	1. 제어문 사용
		 	2. 전용 처리 구문 사용 > try catch문
		 	
		 
		 
		 */
		
		//m1();
		//m2();	
		//m3();
		//m4();
//		try {
//			m5();
//		} catch (Exception e) {
//			System.out.println("본사에서 처리함.");
//		}
		m6();
		
		
	}//main

	private static void m6() {
		
		Scanner scan = new Scanner(System.in);
		
		
		System.err.println("숫자(짝수만): ");
		
		int n = scan.nextInt();
		
		if (n % 2 ==0) { //이게 경제적임
			System.out.println(n + 10);
		} else {
			System.out.println();
		}
		
		try { //예외 던지기는 이게 별로 안좋음
			
			if ( n % 2 == 1) {
				//예외 던지기
				throw new Exception();
			}
			System.out.println(n + 10);
		} catch (Exception e) {
			System.out.println("홀수 입력 불가");
		}
		
		
	}

	private static void m5() throws Exception {
		
		//예외 미루기
		//중앙 집중형
		//- 특정 메서드에서 발생한 예외를 해당 메서드가 직접 처리하지 않고, 그 예외
		// 처리의 책임을 메서드를 호출한 쪽으로 넘기는 기술.
		
		int n =  0;  //?
		System.out.println(100 / n);
		
		
		
		
		
		
		
		
	}

	private static void m4() {
		
		//요구사항] 숫자를 입력 받아 산술 연산을 하시오
		 Scanner scan = new Scanner(System.in);
		 
		
		 System.out.print("숫자: ");
		
		int num = scan.nextInt();
		 
		try {
			
			//엑셀열기
			//사용중...
			//엑셀닫기
			
			//비지니스 코드영역
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			
			return;
		} catch (Exception e) {
			//예외 처리 코드 영역
			System.out.printf("0을 입력하지 마시오");
		} finally {
			//return 구문 넣어도 무조건 실행하고 나감.
			//클린 코드 영역(자원 해제 코드)
			//- 성공 or 실패 > 무조건 실행하는 영역
			System.out.println("finally");
			
		}
		
		//엑셀닫기(여기서 하면 실행 안 할 때가 있음.
		System.out.println("프로그램 종료");
		
	}
		
	

	private static void m3() {
		try {
			Object o1 = new Random();
			System.out.println(((Calendar)o1).getTimeInMillis());
			
			
			
			int num = 0; //사용자 입력
		
			//throw new ArithmeticException()
			System.out.println(100 / num); //ArithmeticException
		
			int[] nums = { 10, 20, 30 };
			
			System.out.println(nums[5]); //ArrayIndexOutOfBoundsException
			
			
			
			Random rnd = null;
			
			System.out.println(rnd.nextInt()); //NullPointerException
		} catch (ArithmeticException e) {
			System.out.println("0입력 김대리연락");
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("첨자오류 박과장");
		} catch (NullPointerException e) {
			System.out.println("널 오류  최부장");
		}
		
		
		catch (Exception e) { //예측 못 한 예외도 잡기 위해 항상 마지막에 넣어줘야 됨. 항상 마지막에!!
			System.out.println("예외 처리");
			e.printStackTrace();
		}
		
			System.out.println("최종 도달");
		
		
	}

	private static void m2() {
		
		int num = 0; //사용자 입력
	try {
		System.out.println(100 / num);
	} catch (Exception e) {
		System.out.println("0으로 나누기 김대리에게 연락");
	}
		int[] nums = { 10, 20, 30 };
		try {
		System.out.println(nums[5]);
		} catch (Exception e) {
			System.out.println("배열첨자오류");
		}
		
		Random rnd = null;
		try {
		System.out.println(rnd.nextInt());
		} catch (Exception e) {
			System.out.println("널참조");
		}
		System.out.println("최종 도달");
	}

	private static void m1() {
			
		//요구사항] 숫자를 입력 받아 산술 연산을 하시오
		 Scanner scan = new Scanner(System.in);
		 
		
		 System.out.print("숫자: ");
		
		int num = scan.nextInt();
		 
		//선조건 > 후처리
		if (num !=0) {
			//비지니스 코드(업무코드)
			System.out.println(111);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(222);
		} else {
			//예외 처리 코드
			System.out.printf("0을 입력하지 마시오");
			
		}

		//구조 바꾸기 가능
//		if (num ==0) {
//			//예외 처리 코드
//			System.out.printf("0을 입력하지 마시오");
//
//		} else {
//			
//			//비지니스 코드(업무코드)
//			System.out.println(111);
//			System.out.printf("100 / %d = %d\n", num, 100 / num);
//			System.out.println(222);
//		}
		
		
		//선실행 > (에러발생) >후처리
		//구조 못 바꿈.
		try {
			//비지니스 코드(업무 코드)
			System.out.println(333);
			System.out.printf("100 / %d = %d\n", num, 100 / num);
			System.out.println(444);
		} catch (Exception e) {
			//예외 처리 코드
			System.out.printf("0을 입력하지 마시오");
			
			//e: 예외 객체
			//- 발생한 예외에 대한 여러가지 정보를 가지고 있는 객체
			//System.out.println(e.getMessage());
			e.printStackTrace();
			
		}
		
		System.out.println("프로그램 종료");
		
	}

}
