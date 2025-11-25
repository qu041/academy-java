package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex23_For {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex23_For.java
		/*
			
			반복문
			- 특정 코드를 개발자가 원하는 횟수만큼 반복한다.
			
			for (초기식; 조건식; 증감식) {
				 구현부;	
			 }
			
		 */
		
		//- 실행(Ctrl + F11)
		//- BreakPoint(X)
		//- 실행(F11)

		//Debug 모드
		//- BreakPoint(0)
		//- 실행(F11)
		//F5, F6 브레이크포인트 확인 단축키
		
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13(); //난수 만들기
		//m14();
		//m15();
		//m16();
		//m17();//루프 중첩시 모습
		//m18();//별찍기
		//m19();
		//m20();
		//m21(); //첫번째 프로젝트 -콘솔기반 프로젝트시 참고
		m22();
		
		//조건문: if, switch
		//반복문: for, while, do while
		//분기문: break, continue
		
		//반복문: 향상된 for문(Enhanced for statement), forEach문
	
		
		
	}//main

	private static void m22() {
		
		/*
		 		
		 		do while문
		 		
		 		while (조건문) {
		 				구현부
 				}
		 		
		 		
		 		do {
		 				구현부
 				} while (조건문); //몸통이 아래로 // 일단 한번시작 //세미콜론 찍어서확인
		 
		 */
		
		int num = 11;
		
		do {
			System.out.println(num);
			num++;
		} while (num<=10);
		
	}

	private static void m21() throws IOException {
		//자판기
		//-(메뉴 출력 >선택> 결과) X N(루프)

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean loop = true;
		
		while (loop) {
		System.out.println("============");
		System.out.println("   자판기");
		System.out.println("============");
		System.out.println("1. 콜라");
		System.out.println("2. 사이다");
		System.out.println("3. 박카스");
		System.out.println("4. 종료");
		System.out.println("------------");
		System.out.print("선택: ");
		
		String input = reader.readLine();
		
		if (input.equals("1")) {
			System.out.println("700원입니다.");
			
			pause(reader);
			
			
		} else if (input.equals("2")) {
			System.out.println("600원입니다.");
			pause(reader);
		} else if (input.equals("3")) {
			System.out.println("500원입니다.");
			pause(reader);
		} else if (input.equals("4")) {
			//프로그램 종료 == while문 탈출
			//break;
			
			System.out.print("정말 종료하시겠습니까?(y,n)");
			
			String isClosed = reader.readLine();
			
			if (isClosed.equals("y")) {
				//break;  ->직접적으로 포함된 제어문만 탈출
				loop = false; // -> 원하는 제어문 탈출가능
			}
		}
		
	}//while
		
		System.out.println("자판기 종료");
		
		
		
	}

	public static void pause(BufferedReader reader) throws IOException {
		//일시정지
		System.out.println();
		System.out.println("계속하려면 엔터를 입력하세요.");
		reader.read(); // 커서가 깜박거리는 작용 ->엔터를 쳐야 끝남.
						//일시정지로 사용함
	}

	private static void m20() {
		
		//1~100까지 누적하시오.
		int sum = 0;
		
		for (int i =1; i<=100;i++) { //5050
			sum += i;
		}
		System.out.println(sum);
		
		//----
		
		sum = 0;
		int num  =1;
		
		while (num <=100) {
			sum += num;
			num++;
		}
		
	}

	private static void m19() {
		/*
		 	반복문
		 	1.for
		 	2.while
		 	3.do while
		 	
		 	while문
		 	
		 	if (조건식) {
		 		구현부;
		 	}
		 	
		 	while (조건식) { 
		 		구현부;
		 	}
		 	
		 	
		 */
		
		//1~10까지 출력
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
			System.out.println();
			
		int n = 1;	//초기식 for문
		while (n <=10) { //조건식 for문 -> 명시적
			System.out.println(n);
			n++; //증감식 for문
		}
		
		
//		for(;;) {
//			System.out.println("무한 루프");
//		}
		
//		while (true) { //조건문 못 비움
//			System.out.println("무한 루프");
//		}
		
		
		
		
	}

	private static void m18() {
//		int n = 1;
//		//별찍기(5*5)
//		for (int i=0; i<5; i++) {
//			for (int j = 0; j<5; j++) {
//				//System.out.print("*");
//				System.out.printf("%3d", n);
//						n++;
//			}
//			System.out.println();
		
		int n = 1;
		//별찍기(5*5)
		for (int i=0; i<5; i++) {
			for (int j = i; j<0; j++) {
				System.out.print("*");
//				System.out.printf("%3d", n);
//						n++;
			}
			System.out.println();
		}
			
	}

	private static void m17() {
		
		for ( int i=0; i<10; i++) {
			
			
			
			for( int j=0; j<10; j++) {
				
				//if (i == 5) {
				if (j == 5) {
					//if (j == 5 && i == 5) {
				//if (j == 5 || i == 5) {
					//break;
					//continue;
				}
				
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
		
	}

	private static void m16() {
		//구구단
		//- 2단 ~ 9단
	for (int j=2; j<=9; j++) {	
		
		//int dan = 2;
		System.out.println("================");
		System.out.printf("  %d단\n",j     );
		System.out.println("================");
		
		for (int i =1; i<=9; i++) {
			System.out.printf("%d x %d = %2d\n", j, i, j * i);
			
		}
	}
		
	}

	private static void m15() {
		
		//어제. 단일(1중) for문
		//지금. 중첩 for문
		
		//단일 for문
		for (int i=0; i<10; i++) {
			System.out.println("i: " + i);
		}
		System.out.println();
		//2중 for문 (루프변수의 다양화)
		for (int i=0; i<10; i++) { //대회전
			for (int j=0; j<10; j++) { //소회전
				System.out.printf("i: %d, j: %d\n", i, j);
			}
		}
		System.out.println();
		//3중 for 문
		for (int i=0; i<24; i++) { //대회전 시침
			for (int j=0; j<60; j++) { //중회전 분침
				for (int k=0; k<60; k++) {//소회전 초침
					System.out.printf("i: %d, j: %d, k: %d\n", i, j, k);
				}
			}
		}

		/*
		 	학교
		 for (학년) {	
		 	for (반) {
		  	 	for (번호) {
		  	}
		 }
	 }
		
		  	for (번호) {
		  	 	for (반) {
		  	 }
	  	 }
		  	
		  	아파트
		  	for (단지) {
		  	 	for (동) {
		  	 		for (층) {
		  	 			for (호수) {
		  	 			
		  	 			}
	  	 			}
  	 			}
 			}
		  
		 */
	
	
	
	
	
	}
	
	private static void m14() {
			
			//1+2+3 = 6
		int sum = 0;
		
		for (int i =1; i<=3; i++) {
			System.out.print(i + "+");
			sum += i;
		}
		System.out.println("\b\b = " + sum); //문제 이렇게 풀어도 됨 / 정상적인 터미널은 백스페이스가 제대로 돌아감
																	//이클립스만 안됨
		
	}

	private static void m13() {
			
			//난수 만들기
			//- 임의의 수 만들기
			
			//1. Math 클래스
			//2. Random 클래스 (Math를 감싼 클래스, Wrapper Class)
		
//			System.out.println(3.14);
//			System.out.println(Math.PI); //double형 - java진형에서 표현할 수 있는 최대 가수범위.
			
			//0이상 ~ 1미만 / 0 ~0.99999999999999999
			//Returns a double value with a positive sign, greater than or equal to 0.0 and less than 1.0. Returned values are chosen pseudorandomly with (approximately) uniform distribution from that range.
			System.out.println(Math.random()); //double
			
			for (int i = 0; i<10; i++) {
				//System.out.println(Math.random());
				
				//가공
				//System.out.println(Math.random() * 10);
				//System.out.println((int)(Math.random() * 10));
				//System.out.println((int)(Math.random() * 7));
				//System.out.println((int)(Math.random() * 3));
				//System.out.println((int)(Math.random() * 12));
				
				//0.0
				//0.1				0 < x < 1 ---- * 3 ---- 0 < x < 3
				//..
				//0.99999
				//System.out.println((int)(Math.random() * 3));
				
				//1~6 주사위 굴리기
				//0~5 + 1
				
				System.out.println((int)(Math.random() * 6) + 1);
				
				
				
				
				
			}
			
		
	}

	private static void m12() {
		
			//학교 > 선생님 + 학생 상담(30명)
			for (int i=1; i<=30; i++) {
				
				if (i > 16) { 
					break;
				}
				
				if (i == 10 || i == 15 || i == 11 ) {
					continue;
				}
				
				System.out.println(i + "번 학생 상담 중");
				
			}
		
	}

	private static void m11() {
		
			//분기문
			//- switch, 반복문과 같이 사용
			//- 단독으로 사용 불가능 / 아무 의미 없음.
			//- if문 제외(인식 안함)
		 	//1. break
			//- 현재 자신이 속한 제어문을 탈출한다.
			//- 중단하는 역할(break)
			
		
			//2. continue
			//- 현재 자신이 속한 제어문의 처음으로 돌아간다.
			//- 뒤에 남은 문장을 실행 안하고 다시 돌아간다.
			//- 잠시 멈추는 역할(skip)
		
//			for (int i=1; i<=10; i++) {
//				
//				if (i == 5) {
//					break; // if문 탈출 XXX -> for문을 탈출함
//				}
//				System.out.println(i);
//				
//			}
//			System.out.println();

			for (int i=1; i<=10; i++) {
				
				if (i == 5) {
					continue; //건너뛰기(skip/ 5만 안찍힘)
				}
				System.out.println(i);
				
			}
			System.out.println();
		
	}

	private static void m10() throws IOException {
			
			//무한루프, Infinite Loop
			//1. 사용자의 실수
			//2. 사용자 의도적으로
			// a. 반복 횟수 미정
			// b. 진짜로 무한 루프가 필요할 때
			
//			for (int i=0; i<10; i--) { //int 이기때문에 엄밀히는 무한루프 아님. //21억 회전
//				System.out.println("실행문");
//			}
		
			//무한 루프 생성하기
//			                //대놓고 true 또는 공란으로 비워놓음 또는 초기식,조건식,증감식 다 비워둠
// 				for (int i=0; true; i++) {
//				System.out.println("실행문");
//			}
		
			//사용자 입력 숫자(?개) > 총합
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			int sum = 0; //누적변수
			
			for (;;) {
				
				System.out.print("숫자: \n");
				
				String input = reader.readLine();
				System.out.println("끝내고 싶으면 엔터");
				if (input.equals("")) {
					break;
				}
				
				
				int num = Integer.parseInt(input);
				
				sum += num;
			}
			
			//Unreachable code 도달할 수 없는 코드
			System.out.println(sum);
			
		
		
		
	}

	private static void m9() throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("단: ");
		int dan = Integer.parseInt(reader.readLine());
		
		
		for (int i=1; i<=9; i++) {
			System.out.printf("%d * %d = %2d\n", dan, i, dan * i);
		}
		
		
		
		
	}

	private static void m8() {
		
			//요구사항] 구구단 출력
			/*
			 	5 * 1 =  5
			 	5 * 2 = 10
			 	5 * 3 = 15
			 	5 * 3 = 15
			 	5 * 3 = 15
			 	5 * 3 = 15
			 	5 * 3 = 15
			 	5 * 3 = 15
			 	5 * 3 = 15...
			 
			 */
			int sum = 0;
			for (int i=1; i<=9; i++) {
				System.out.printf("5 * %d = %d\n", i, 5 * i);
				sum = sum + i;
			}
				
				System.out.println(sum);


	}

	private static void m7() throws NumberFormatException, IOException {
		
		//요구사항] 사용자가 입력한 10개 > 숫자의 합	
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		
		long sum = 0;
		
		for(int i = 1; i<=10; i++) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
			sum += num;
		}
		
		System.out.println(sum);
		
	}
	private static void m6() throws NumberFormatException, IOException {

			//요구사항] 1~사용자가 지정한 숫자의 합	
		
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		int num = Integer.parseInt(reader.readLine());
		
		long sum = 0;
		
		for(int i = 1; i<=num; i++) {
			sum += i;
		}
		
		System.out.printf("1~ %,d = %,d\n", num, sum);
		
	}

	private static void m5() {
		
			//요구사항] 1~10까지의 합
		
			//1..10 > 루프
			
			int sum = 0;
		
			for (int i=3; i<=100; i+=3) {
			//System.out.println(i);
			sum = sum + i;
		}
			System.out.println(sum);
		
	}

	private static void m4() {
			//반복문
			//1. 반복 횟수
			//2. 루프 변수(*****) > 루프 변수의 변화
		
			//요구사항] 숫자 1~10까지 출력
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
			System.out.println(6);
			System.out.println(7);
			System.out.println(8);
			System.out.println(9);
			System.out.println(10);
			System.out.println();
			
			int num =1; 			  //초기식
			System.out.println(num); //조건식
			num++; 					 //증감식
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			System.out.println(num);
			num++;
			
			num = 1;
			for (int i = 0; i<10; i++) {
				System.out.println(num);
				num++;
			}
		System.out.println();
			
			for(int i = 1; i<=10; i++) {
				System.out.println(i);
			}
		System.out.println();
		
			for(int i = 1; i<=10; i+=2) {
				System.out.println(i);
			}
		System.out.println();
		
			for(int i = 5; i<=100; i*=5) {
				System.out.println(i);
			}
			System.out.println();
		
	}

	private static void m3() {
			
			//반복문
			//1. 반복 횟수
			//2. 루프 변수
			
			for (int i = 0; i<5; i++) {
				//0, 1, 2, 3, 4
				System.out.println("실행문");
				System.out.println();
			}	
			for (int i=1; i<=5; i++) {
				System.out.println("Dd");
			}
			for (int i=1; i<6; i++) {
				System.out.println("dooo");
			}
			for (int i=10; i>5; i--) {
				System.out.println("5바퀴");
		
	}
		
		
	}

	private static void m2() { //{} 블럭(Block), 영역(Scope)
		
		//지역변수
		//-메서드, 제어문 블럭내에서 선언한 변수
		//-메서드, 제어문 블럭내에서만 인식이 가능(영역이 메서드이다.)
		
		int a = 10; // 지역변수(m2) 메서드내에서 인식 가능(if문 안에서도 인식가능)
		System.out.println("a: " + a);
		if (a > 0) {
			int b = 20; //지역 변수(직접적으로 포함 된 if문에서만 인식가능
		}
		
		
	}

	private static void m1() {
		
		//요구사항] "안녕하세요." x 5회 출력
		//요구사항] "반갑습니다."로 수정
		//요구사항] 인사횟수 * 100회
		
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.out.println("안녕하세요.");
		System.err.println();
		
		hello();
		hello();
		hello();
		hello();
		hello();
		System.out.println();
  //변수초기화(초기식),조건식(변수 사용),증감식(변수사용)
		    //i: 루프 변수(루프를 돌리는 변수)
			//1. 초기식 : 루프 변수 초기화
			//2. 조건식 : 루프 반복을 위한 조건
			//3. 증감식 : 루프 조건에 대한 변화
		for (int i = 0; i< 5; i++) {
			System.out.println("하이요.");
			//hello(); //매서드 호출해도 됨
		}
		
		//System.out.println(i); 둘다 지역변수라 확인 안 됨.
		//System.out.println(j);
		
		
	}

	private static void hello() {
		System.out.println("안녕하세요.");
		
	}

}
