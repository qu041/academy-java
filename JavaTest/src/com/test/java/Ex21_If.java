package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex21_If {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex21_If.java
		/*
			
			제어문
			- 수많은 명령어 > 명령어의 실행 순서 > 위에서 아래로..
			- 제어의 흐름을 통제하는 도구
			- 조건 제어, 반복 제어, 분기 제어
			
			1. 조건문
				- 개발자가 조건을 제시한 후 결과에 따라 흐름을 제어
				- 3항 연산자
				a. if
				b. switch
			
			2. 반복문
				- 특정 코드를 원하는 횟수만큼 반복 제어
				a. for
				b. while
				c. do while
				d. for
			
			3. 분기문
				- 코드의 흐름을 원하는 곳으로 이동
				a. break
				b. continue
				c. goto(JDK 1.5 폐기)
			
		*/
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
		
	}//main

	private static void m4() throws NumberFormatException, IOException {
		
		//성적(0~100) 입력 > 합격/불합격
		//-유효성 검사(validation)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
	System.out.print("성적(0~100): ");
		
		int score = Integer.parseInt(reader.readLine());
		
		if (score >= 60 && score <= 100) {
			System.out.println("합격");
		} else if (score >= 0 && score < 60) {  
			System.out.println("불합격");
		}	else {
				System.out.println("점수는 0~100 이내로 입력하시오.");
			}
		
		
		if (score >= 0 && score <= 100) {
			
			//올바른 입력 > 성적처리
			if (score <= 60) {
				System.out.println("합격");
			} else {
				System.out.println("불합격");
				
			}
			
		} else {
			System.out.println("점수는 0~100 이내로 입력하시오.");
		}
	}	
		
	

private static void m3() throws IOException {
		
		//조건문 + 누적 연산
		
		int sum = 0; //누적 변수(***)
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("1. 어떤 개발툴을 선호합니까?");
		System.out.println("a. 메모장");		//+1
		System.out.println("b. 이클립스");		//+3
		System.out.println("c. 인텔리제이");	//+5
		
		System.out.print("선택: ");
		
		String seq = reader.readLine();
		
		//if(seq == "a")'
		if (seq.equals("a")) {
			sum += 1;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 5;
			
		}
		
		System.out.println("2.프로그래밍 언어를 선호합니까?");
		System.out.println("a. C++");		//+1
		System.out.println("b. 자바");		//+3
		System.out.println("c. 자바스크립트");	//+5
		
		System.out.print("선택: ");
		
		seq = reader.readLine();
		
		//if(seq == "a")'
		if (seq.equals("a")) {
			sum += 2;
		} else if (seq.equals("b")) {
			sum += 3;
		} else if (seq.equals("c")) {
			sum += 4;
			
		}
		
		System.out.println("3.하루에 얼마나 코딩을 합니까?");
		System.out.println("a. 1시간");		//+1
		System.out.println("b. 5시간");		//+3
		System.out.println("c. 10시간");	//+5
		
		System.out.print("선택: ");
		
		seq = reader.readLine();
		
		//if(seq == "a")'
		if (seq.equals("a")) {
			sum += 1;
		} else if (seq.equals("b")) {
			sum += 2;
		} else if (seq.equals("c")) {
			sum += 3;
			
		}
		
		System.out.println("설문이 완료되었습니다.");
		System.out.println();
		System.out.println("[결과]");
		
		if (sum > 10) {
			System.out.println("당신은 타고난 개발자입니다.");
			
		} else if (sum >= 5) {
			System.out.println("개발자가 되려면 조금 더 노력하세요");
			
		} else {
				System.out.println("다른거 하세요~");
			}
			
			}
		
		
		
	
	

	private static void m2() throws NumberFormatException, IOException {
		
		// 출근 > 기상?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("기상 시간(시): ");
		
		int hour = Integer.parseInt(reader.readLine());
		
		//제어문 > 제어의 흐름 > 순서도 그리기
			if (hour < 6) {
				System.out.println("지하철을 타고 출근한다.");
			} else if (hour < 7) {
				System.out.println("버스를 타고 출근한다.");
			} else if (hour < 8) {
				System.out.println("택시를 타고 출근한다.");
			} else {
				System.out.println("병가를 낸다.");
			}
		
		
		}
		
		
		
		
		
		
		
	

	private static void m1() throws NumberFormatException, IOException {
		
		/*
		
			if문
			- 개발자가 조건을 제시 후 결과에 따라 흐름을 제어
			- 조건식 > boolean 값을 가지는 표현식
			
			if (조건식) { 
				문장; 
			}
			
			
			if (조건식) { 
				문장; //참블럭
			} else {
				문장; //거짓블럭
			}
			
			다중 조건문
			
			if (조건식) { 
				문장; 
			} else if (조건식) { 
				문장; 
			}
			
			
			if (조건식) { 
				문장; 
			} else if (조건식) { 
				문장; 
			} else {
				문장;
			}
			
			
			if (조건식) { 
				문장; 
			} [else if (조건식) { 
				문장; 
			}] x N
			[else {
				문장;
			}]
		
		*/
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		
		int num = Integer.parseInt(reader.readLine());
		
		if (num > 0) {
			System.out.println("num은 양수입니다.");
		}
		
		if (num > 0) {
			System.out.println("num은 양수입니다.");
		} else {
			System.out.println("num은 양수가 아닙니다.");
		}
		
		if (num > 0) {
			System.out.println("num은 양수입니다.");
		} else if (num < 0) {
			System.out.println("num은 음수입니다.");
		}
		
		if (num > 0) {
			System.out.println("num은 양수입니다.");
		} else if (num < 0) {
			System.out.println("num은 음수입니다.");
		} else {
			System.out.println("num은 0입니다.");
		}
		
		System.out.println("종료");
	}

}









