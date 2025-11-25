package com.test.java;

public class Ex11_Casting {
	
	public static void main(String[] args) {
		
		/*
		  형변환, 자료형 변환
		  -Casting, Promotion 등
		  -하나의 자료형을 다른 자료형으로 변환하는 작업
		  -하나의 자료형을 가진 데이터를 다른 자료형으로 변환하는 작업
		  -int > double
		  -float > short
		  -숫자끼리만 가능(byte, short, long, float, double, char) /  자유롭게 가능
		  
		  1. 암시적 형변환, 자동 형변환, Promotion
		  		-큰형 = 작은형 //작은형을 큰형으로 변환하는 방식
		  		-100% 안전(성공)
		  		-큰형 = (큰형의 자료형)작은형 // 암시적으로 생략되어 있음
		  
		  2. 명시적 형변환, 강제 형변환, Casting
		  		-작은형 = 큰형
		  		-복사과정에서 오버플로우가 발생함
		 
		 */
		
		byte b1;
		short s1;
		
		b1 = 10; //원본
		
		//LValue = RValue
		//*** LValue와 RValue의 자료형은 반드시 동일(!!)***
		//short = byte
		
		s1 = b1; //복사 컴파일중 수정이 일어남
		s1 = (short)b1; //(자료형) : 형변환 연산자
		
		System.out.println(b1); //복사 확인
		
		// byte = short
		// 작은형 = 큰형
	
		byte b2;
		short s2;
		
		s2 = 200; //원본 -복사과정에서 오버플로우가 발생함
		
		b2 = (byte)s2; //복사 큰형을 작은형으로 바꿀때는 명시적으로 연산자를 써줘야함.
					  //
	
		System.out.println(b2); //복사 확인
		
		// 기업은행 > 계좌
		int m1; //역삼
		long m2 = 3000000000L; //홍대점
		
		//계좌이체
		m1 = (int)m2;
		
		System.out.printf("계좌잔액 = %,d\n", m1);
		
		//큰형 = 작은형 //6가지 경우의수
		//long = byte
		//long = short
		//long = int
		//int = short
		//int = byte
		//short = byte
		
		//작은형 = 큰형 //6가지 경우의수
		//byte = long
		//byte = int
		//byte = short
		//short = int
		//short = long
		//int = long
		
		//정수형 리터럴은 int이다. //리터럴 뜻 정확히 이해하기!!
		//LValue = RValue : 자료형 동일
		
		//byte = (byte)int
		byte a1 = 10; // 원래는 byte a1 = (byte)10; 인데 예외를 제공
		short a2 = 10; // short a2 = (short)10;
		
		int a3 = 10; //정상
		
		long a4 = 10; //암시적 형변환
		
		//실수형 리터럴은 double이다.
		float f1 = (float)3.14; //원칙
		float f2 = 3.14F;  		//편의
		
		double d1 = 3.14;
		
	
		//정수 > 정수
		//실수 > 실수
		//정수 > 실수
		//실수 > 정수
		
		int n1 = 100; //원본(4)
		float n2; //복사본(4)
	
		n2 = n1;
		
		System.out.println(n2);
		
		//int(4) = float(4) 
		int n3;
		float n4 = 10000000000F;
		
		n3 = (int)n4; //Type mismatch: cannot convert from float to int
		
		System.out.println(n3); // 오류 float > int
		
		// 정수형 < 실수형 무조건!! 실수형은 지수형으로 나타내서 훨훨훨 큼
		
		//*** 정수와 실수간의 크기 비교는 단순한 메모리 크기가 아닌, 실제 저장 가능한 수의 범위로 비교한다.
		
		// byte(1) < short(2) < int(4) < long(8) <<<<<< float(4) < double (8)
		
		//char 형변환
		char c1 = 'A'; //문자형은 내부적으로 숫자이다. 유니코드...
		System.out.println(c1);
		System.out.println((int)c1);
		
		char c2; //2byte //명시적 형변환인지 암시적형변환인지 항상 생각해야됨
		short t2; //2byte
		
		c2 = 'a';
		
		// short(2) = char(2) ->범위가 다름, char은 음수가 없음 char -> 정수형 변환은 int,long으로 해야됨
		t2 = (short)c2;
		
		System.out.println(t2);
		
		char c3;
		short t3;
		
		t3 = 90;
		
		c3 = (char)t3;
		
		System.out.println(c3);
		
		//***원시형(값형)과 참조형(String) 간에는 형변환이 절대 불가능하다.
		
		System.out.println((int)'A'); //65
		System.out.println((int)"A"); //65
		
		//Integer.parseInt("100") > 100 // 파싱하는 거라 엄밀하게는 형변환이 아님
		
		
	}
}
