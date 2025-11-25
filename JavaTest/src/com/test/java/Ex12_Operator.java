package com.test.java;

public class Ex12_Operator {
	
	public static void main(String[] args) {
		
		//Ex12_Operator.java
		/*
		 
		  	연산자, Operator
		  	-수학 연산자 > 프로그래밍 연산자
		  	-피연산자를 대상으로 미리 정해진 연산(행동)을 한 후에 연산의 결과를 반환하는 역활
		  	-주로 기호를 사용 + 단어도 사용
		  	
		  			  1. 문장, Statement
		  			  2. 표현식, Expression
		  			  3. 연산자, Operator
		  			  4. 피연산자, Operand
		  			  5. 연산자 우선순위
		  			  6. 연산자 연산방향
		  			  
		  			  1. 문장, Statement
		  			  -1개 이상의 표현식이 모여서 문장을 만든다.
		  			  ex) int sum = 10 +20;
		  			 
		  			  2. 표현식 Expression
		  			  -문장을 구성하는 최소 단위
		  			  -값을 나타내는 의미
		 	          ex) int sum = 10 +20;
		 			  	   10 + 20
		 			  	   sum = 30
		 			  	   10
		 			  	   20
		 			  	   
		 			  3. 연산자, Operator
		 			  ex) int sum = 10 +20;
		 					- +
		 					- =
		 			  4. 피연산자, Operand
		 			   ex) int sum = 10 +20;
		 			   		- +: 10, 20
		 					- =: sum, 30
		 			
		 			  5. 연산자 우선순위
		 			  	-하나의 문장에 속해있는 연산자들 중 누구를 먼저 실행해야할지 정해져있는 순서
		 			  	ex) 1 + 2 * 3
		 
		 				int sum = 1 + 2 * 3; //7
		 				int sum = 1 + 6;
		 				int sum	= 7;
		 				int sum; > sum 7 // 공간 만들기
		 				sum = 7;
		 				; //리턴값 없음
		 				
		 				1. = > 3
		 				2. + > 2
		 				3. * > 1
		 
		 			  6. 연산자 연산방향
		 			  - 하나의 문장에 속해있는 연산자들이 모두 연산자 우선 순위가 동일할 때 누구를 먼저 실행해야할 지 정해져 있는 순서
		 			  ex) 1 + 2 + 3 // 왼쪽에서 오른쪽으로

		 			  
		 			  연산자 종류 // 모든 연산자는 1,2 동시에 충족
		 			  1. 행동(목적)
		 			  		a. 산술 연산자
		 			  		b. 비교 연산자
		 			  		c. 논리 연산자
		 			  		d. 대입 연산자
		 			  		e. 증감 연산자
		 			  		f. 조건 연산자
		 			  		g. 비트 연산자
		 			  
		 			  2. 형태(피연산자 개수)
		 			  		a. 1항 연산자
		 			  		b. 2항 연산자
		 			  		c. 3항 연산자
		 			  
		 			  
		 
		 */
		
					//a. 산술 연산자
					//- +, -, *, /, %(mod, 나머지)
					//- 2항 연산자
					//- 피연산자를 숫자형을 가진다.(정수, 실수)
		
				int a = 10;
				int b = 3;
				
				System.out.printf("%d + %d = %d\n", a, b, a + b);
				System.out.printf("%d - %d = %d\n", a, b, a - b);
				System.out.printf("%d * %d = %d\n", a, b, a * b);
				System.out.printf("%d / %d = %d\n", a, b, a / b);  //몫
				System.out.printf("%d %% %d = %d\n", a, b, a % b); //나머지 //java.util.IllegalFormatFlagsException: Flags = ' '
				System.out.println("===========================");
				
				double c =10;
				double d= 3;
				
				// ctrl + F => 드래그 해서 전체 및 원하는 내용으로 수정 가능. ctrl + H
				
				System.out.printf("%.0f + %.0f = %f\n", c, d, c + d);
				System.out.printf("%.0f - %.0f = %f\n", c, d, c - d);
				System.out.printf("%.0f * %.0f = %f\n", c, d, c * d);
				System.out.printf("%.0f / %.0f = %f\n", c, d, c / d);  //몫
				System.out.printf("%.0f %% %.0f = %f\n", c, d, c % d); //나머지
				
				System.out.println(10); //정수
				System.out.println(10F); //실수(float)
				System.out.println(10D); //실수(double)
				System.out.println(10.0); //.0 > 실수
				
				System.out.println(10 / 3.0); //실수
				System.out.println(10.0 / 3 ); //실수
				
				
				
				
				
				//정수 / 실수 = 실수
				//실수 / 정수 = 실수
				//정수 / 정수 = 정수
				//실수 / 실수 = 실수
				
				//*** 모든 산술 연산자의 결과값의 자료형 > 두 피연산자 중 자료형의 크기가 더 큰 자료형으로 반환한다.
				System.out.println(10 / 3); 	// int / int = int
				System.out.println(10.0 / 3.0); // double / double = double
				System.out.println(10 / 3.0); 	// int / double = double
				System.out.println(10.0 / 3);	// double / int = double
				
				int e = 1000;
				byte f = 10;
				System.out.println(e + f); //int + byte = int
				
				int g = 1000000000;
				int h = 2000000000;
				
				System.out.println(g + h); // 오버플로우 됨
				System.out.println((long)g + h); // 형변환 함
				
				//정수 사용 > 대다수 int 사용한다. 가끔 long을 사용한다.
				byte j = 10;
				byte k = 20;
				
				System.out.println(j + k);
				
				//Type mismatch: cannot convert from int to byte
				//*** byte와 short의 산술 연산의 결과는 항상 int이다.
				//byte l = j + k;
				int lm = j + k;
				byte ln = (byte)(j + k);
				
				//***정수 > int 주로 사용 + long
				//***실수 > double 주로 사용(정밀도)
				
				System.out.println(-1000000000-2000000000);
				
				//%(나머지)
				System.out.println(100 % 3);
				System.out.println(100 % 4);
				System.out.println(100 % 5);
				System.out.println(100 % 6);
				
				
		
		
		
		
		
		
	}
}
