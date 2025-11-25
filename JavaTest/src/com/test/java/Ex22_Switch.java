package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex22_Switch {

	public static void main(String[] args) throws NumberFormatException, IOException {

		//Ex22_Switch.java
		/*
		
			switch문, switch case문
			- 조건: 값 > 정수, 문자열, 열거형
			
			switch (조건) {
				case 값:
					구현부;
					break;
				[case 값:
					구현부;
					break;] x N
				[default:
					구현부;
					break;]
			}
		
		*/
		
		//m1();
		//m2();
		m3();

	}

	private static void m3() throws NumberFormatException, IOException{
		
		//요구사항] 사용자 > 월(1~12) 입력 > 해당월의 마지막 일?
		//월: 5
		//출력: 5월은 31일까지 있습니다.
		
		//if문, switch문
		int lastDay = 0;  //마지막 일
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("월: ");
		String input = reader.readLine();
		
		if (input.equals("1") 
				|| input.equals("3") 
				|| input.equals("5") 
				|| input.equals("7") 
				|| input.equals("8") 
				|| input.equals("10") 
				|| input.equals("12")) {
			lastDay = 31;
		} else if (input.equals("4") 
				|| input.equals("6") 
				|| input.equals("9") 
				|| input.equals("11")) {
			lastDay = 30;
		} else {
			lastDay = 28;
		}
		
		//값:
		//- Label
		//- 표지판
		
		//case "1":
		
		switch (input) {
			case "1": case "3":  case "5": case "7":
			case "8": case "10": case "12":
				lastDay = 31;
				break;
			case "4": case "6": case "9": case "11":
				lastDay = 30;
				break;
			case "2":
				lastDay = 28;
				break;
		}
		
		System.out.printf("%s월은 %d일까지 있습니다.\n", input, lastDay);
	}

	private static void m2() throws NumberFormatException, IOException {
		
		//요구사항] 자판기
		//- 메뉴 출력 > 음료 선택 > 가격 출력
		//- 가격 변동 > 앞으로 평생 콜라와 사이다는 가격을 동일하게 판매
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("============");
		System.out.println("   자판기");
		System.out.println("============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("------------");
		System.out.print("선택: ");
		
		String input = reader.readLine();
		
		if (input.equals("1") || input.equals("2") || input.equals("3")) {
			
//			if (input.equals("1")) {
//				System.out.println("700원입니다.");
//			} else if (input.equals("2")) {
//				System.out.println("700원입니다.");
//			} else if (input.equals("3")) {
//				System.out.println("500원입니다.");
//			}
			
			if (input.equals("1") || input.equals("2")) {
				System.out.println("700원입니다.");
			} else if (input.equals("3")) {
				System.out.println("500원입니다.");
			}
			
			switch (input) {
				case "1":
				case "2":
					System.out.println("700원입니다.");
					break;
				case "3":
					System.out.println("500원입니다.");
					break;
			}
			
		} else {
			System.out.println("선택한 음료는 없습니다.");
		}
		
	}

	private static void m1() throws NumberFormatException, IOException {
		
		//요구사항] 숫자 1개 입력 > 한글로 출력
		//1 > 하나
		//2 > 둘
		//3 > 셋
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		
		if (num == 1) {
			System.out.println("하나");
		} else if (num == 2) {
			System.out.println("둘");
		} else if (num == 3) {
			System.out.println("셋");
		} else {
			System.out.println("나머지 숫자");
		}
		
		switch (num) {
			case 1:
				System.out.println("하나");
				break;
			case 2:
				System.out.println("둘");
				break;
			case 3:
				System.out.println("셋");
				break;
			default:
				System.out.println("나머지 숫자");
				break;
		}
		
//		if (num > 0) {
//			
//		}
		
		//Cannot switch on a value of type boolean. Only convertible int values, strings or enum variables are permitted
//		switch (num > 0) {
//		
//		}
		
	}

}











