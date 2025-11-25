package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ex13_Operator {
	
	public static void main(String[] args) throws IOException {
		
		//Ex13_Operator.java
		/*
		
			비교 연산자
			- >, >=, <, <=, ==(equals), !=(not equals)
			- 2항 연산자
			- 피연산자들의 우위(동등) 비교
			- 피연산자는 숫자형을 가진다.
			- 연산의 결과가 boolean이다.
					
		*/
		int a = 10;
		int b = 3;
		
		System.out.println(a > b);
		System.out.println(a >= b);
		System.out.println(a < b);
		System.out.println(a <= b);
		System.out.println(a == b);
		System.out.println(a != b);
		
		//요구사항] 사용자 나이 입력 > 19세 이상 통과, 거절
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); //Ctrl + Shift + O
		
		System.out.print("나이: ");
		
		//String input = reader.readLine(); //"20" > 20
		
		//"20" > 20
		//int age = Integer.parseInt(input);
		
		//System.out.println(age >= 19); //좋은 코드
		//System.out.println(19 <= age); //나쁜 코드
		
		System.out.println();
		
		
		
		System.out.println(10 > 3);
		System.out.println(10 == 3);
		System.out.println(10 != 3);
		
		//System.out.println("홍길동" > "아무개");
		
		//==, !=
		System.out.println("홍길동" == "홍길동");
		
		String s1 = "홍길동";
		String s2 = "홍길동";
		String s3 = "홍";
		s3 = s3 + "길동";
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3); //false(***)
		
		//*** 문자열끼리의 비교는 ==, != 연산자를 무조건 사용하면 안된다.
		//*** 문자열의 비교는 equals() 메서드를 사용한다.
		
		System.out.println(s1.equals(s2)); //s1 == s2
		System.out.println(s1.equals(s3)); //s1 == s3
		System.out.println();
		System.out.println();
		
		
		/*
		
			논리 연산자
			- &&(and), ||(or), !(not)
			- 2항 연산자(&&, ||)
			- 1항 연산자(!)
			- 피연산자의 자료형은 boolean이다.
			- 연산의 결과는 boolean이다.
			- 명제
			
			A && B = ?
			
			논리곱(x)
			T && T = T
			T && F = F
			F && T = F
			F && F = F
			
			A || B = ?
			
			논리합(+)
			T || T = T
			T || F = T
			F || T = T
			F || F = F
			
			
			!A = ?
			
			!T = F
			!F = T
			
			
			베타적 논리합(xor, exclusive or)
			A ^ B = ?
			
			T ^ T = F
			T ^ F = T
			F ^ T = T
			F ^ F = F
			
		*/
		
		boolean f1 = true;
		boolean f2 = false;
		
		System.out.println(f1 && f2);
		System.out.println(f1 || f2);
		System.out.println(!f1);
		System.out.println(f1 ^ f2);
		
		//나이 입력 > 19세 이상 + 60세 미만
		int age = 150;
		
		//System.out.println(19 <= age < 60);
		
		System.out.println(19 <= age && age < 60);
		System.out.println((19 <= age) && (age < 60));
				
		System.out.println(age >= 19 && age < 60);
		
		//연산자 우선 순서
		//- 산술 연산자(1) > 비교 연산자(2) > 논리 연산자(3)
		
		
		/*
		
			대입 연산자, 할당 연산자
			- =
			- +=, -=, *=, /=, %= (복합 대입 연산자)
			- LValue(변수) = RValue(변수,상수)
			- LValue와 RValue의 자료형이 동일해야 한다. > 형변환
			- 대입 연산자는 모든 연산자들 중 우선 순위가 가장 낮다.
			- 대입 연산자는 연산 방향이 오른쪽 > 왼쪽 순으로 실행한다.

		*/
		
		int sum = 1 + 2 * 3;
		
		int a1 = 100;
		int a2;
		int a3;
		
		a2 = a1;
		a3 = a1;
		
		a3 = a2 = a1;
		
		
		//복합 대입 연산자
		int n = 10;
		
		//n에 1을 추가하시오. > n의 값에 1을 더해서 n에 다시 넣어라 > 누적
		n = n + 1;
		System.out.println(n);
		
		n += 1;
		System.out.println(n);
		
		n += 5;
		System.out.println(n);
		
		n = n - 2;
		System.out.println(n);
		
		n -= 3;
		System.out.println(n);
		
		n -= 2;
		System.out.println(n);
		
		n = n * 2;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);
		
		n = n / 6;
		System.out.println(n);
		
		n /= 4;
		System.out.println(n);
		
		n = 10;
		n = n % 4;
		System.out.println(n);
		
		n = 10;
		n %= 4;
		System.out.println(n);
		
		n = n + 10;
		n += 10;
		
		n = 10 + n;
		n += 10;
		
		n = n - 10;
		n -= 10;
		
		n = 10 - n;
		n -= 10;
		
		
		/*
			
			증감 연산자
			- ++(증가), --(감소)
			- 1항 연산자
			- 피연산자는 숫자형을 가진다.
			- 누적 연산을 한다.(***)
			- 기존의 값에 1을 더하거나, 1을 뺀다.
			
			*** 연산자와 피연산자의 위치를 바꿀 수 있다.
				- 연산자 우선순위가 바뀐다.
			1. ++n: 전위배치(전치) > 연산자 우선 순위가 가장 높다.
			2. n++: 후위배치(후치) > 연산자 우선 순위가 가장 낮다.
			
			1. --n
			2. n--
			
		*/
		
		n = 10;
		System.out.println(n + 1);
		System.out.println(n);
		
		//n = n + 1;
		//n += 1;
		//++n;
		n++;
		
		System.out.println(n); //11
		
		//n = n - 1;
		//n -= 1;
		//--n;
		n--;
		
		System.out.println(n); //10
		
		
		n = 10;
		int result = 0;
		
		//result = 10 + ++n;
		
		++n;
		
		result = 10 + n;
		
		System.out.println("result: " + result);
		
		
		
		
		n = 10;
		result = 0;
		
		//result = 10 + n++;
		
		result = 10 + n;
		
		++n;
		
		System.out.println("result: " + result);
		System.out.println("n: " + n);
		
		
		int o = 10;
		
		System.out.println(--o-o--);
		System.out.println();
				
		/*
			조건 연산자
			- ?:
			- 3항 연산자
			- A ? B : C
			- A: boolean > 조건으로 사용
			- B,C: 값(상수, 변수) > 연산의 결과값으로 사용
			- A가 참이면 B를 반환, 거짓이면 C를 반환			
			
		*/
		n = 10;
		
 		System.out.println((n > 0) ? "양수" : "양수아님"); 
		
 		System.out.println((n % 2 == 0) ? 1 : "홀수");
 		System.out.println((n % 2 == 0) ? "짝수" : 2);
 		
 		String msg = n > 0 ? "양수" : "양수아님";
 		System.out.println(msg);
 		
 		//비트 연산자
 		a = 10;
 		b = 5;
 		
 		System.out.println(a & b); //0
 		System.out.println(a | b); //15
 		
 		
 		
		
	}

}
















