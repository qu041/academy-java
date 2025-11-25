package com.test.java;

public class Ex04_Variable {
	
	public static void main(String[] args) {
		
		//자료형(8가지) + 변수 생성하기
		
		//정수
		byte b1;
		b1 = 100; //100 -> 상수(=데이터), 정수형 리터럴, 정수형 상수
		
		//b1 = 128;
		//Type mismatch: cannot convert from int to byte
		
		//Byte 클래스 MAX,MIN > 유틸리티 클래스, Wrapper 클래스
		//short 클래스 : Short 클래스
		//int : Integer 클래스
		//long :  Long 클래스
		//float : Float 클래스
		//double : Double 클래스
		//boolean : Boolean 클래스
		//char : Char 클래스
		b1 = Byte.MIN_VALUE;
		System.out.println(b1);
		
		short s1 = 100;
		
		System.out.println(s1);
		s1 = Short.MAX_VALUE;
		System.out.println(s1);
		
		int n1 =1000000000;
			n1 =1_000_000_000;
		System.out.println(n1);
		
		n1 = Integer.MAX_VALUE;
		System.out.println(n1);
		
		long l1 = 100;
		System.out.println(l1);
		
		//The literal 3000000000 of type int is out of range 
		//l1= 3000000000L; // int 4바이트 작용 대신 long 8바이트 적용하기 위해 대문자 L 써줌
		System.out.println(l1);
		
		//CPU가 한번에 가져오는 크기의 정수 > int 라고 하자고 정의.(4바이트) 정수의 기본 자료형 int
		
		//정수 자료형
		//byte
		//short
		//int
		//long
		
		//실수형
		System.out.println(3.14);//3.14dml 자료형? (double) 실수의 기본 자료형 double
		
		//= 연산자
		//LValue(변수) = RValue(상수,변수)
		//*** LValue 와 RValue의 자료형이 같아야 한다.
		
		
		float f1;
		f1 = 3.14F; //Type mismatch: cannot convert from double to float
					//실수형 기본 자료형이 double 이기 때문에 float형으로 나타내야 됨  
			
		double d1;
		d1 = 3.14D;
	
		f1 = 123.123456789123456789123456789123456789F;
		d1 = 123.123456789123456789123456789123456789D;
		
		System.out.println(f1);
		System.out.println(d1);
		
		f1 = 123456789123456789123456789123456789F;
		d1 = 123456789123456789123456789123456789D;
		
		System.out.println(Float.MAX_VALUE);
		System.out.println(Double.MAX_VALUE);
				
		//문자형
		char c1;
		c1 = 'A'; //문자 리터럴 표기법 ' '
		System.out.println(c1);
		
		c1 = '가'; //문자 리터럴 표기법 ' '
		System.out.println(c1);
		
		c1 = '@'; //문자 리터럴 표기법 ' '
		System.out.println(c1);
	
		c1 = '1'; //문자 리터럴 표기법 ' '//49 ??? 문자열 '1' -> 49?
		System.out.println(c1);//1
		System.out.println(1);//1
		
		//Invalid character constant
		//c1 = '홍길동'; //한글자만
		
		//논리형
		//boolean(불리언), bool(부울)
		boolean flag;
		
		flag = true; // 논리형 리터럴 (상수)
		flag = false;
		
		System.out.println(flag);
		
		//추가
		//String, 문자열
		//- 문자 열 > 문자들이 열을 지어 있는 형태 > 문자 집합 > char들을 모아놓은 자료형
		
		//char = '홍길동';
		char name1 = '홍';
		char name2 = '길';
	    char name3 = '동';
			 
		//String 클래스 - 참조형
		String name = "홍길동"; // 문자열 리터럴
		System.out.println(name);
		
		name = "홍";
		name = " "; // 빈문자열, Empty String
		
		
		//주민등록번호 입력 > 출력
		//ex) 990610
		
		//int Jumin = 990610;
		String Jumin = "990610";
		System.out.println("주민등록번호: " + Jumin);
		
		//Jumin = 030711;
		String Jumin2 = "030711";
		System.out.println("주민등록번호: " + Jumin2);
		
		//자바의 기수법
		//10진수
		//8진수
		//16진수
		//2진수

		System.out.println(10); //10진수
		System.out.println(010); //8진수
		System.out.println(0x10); //16진수
		System.out.println(0b10); //2진수
		
		//실수 리터럴
		double d2 = 1200;
		double d3 = 1.2e+3;
		
		System.out.println(d2);
		System.out.println(d3);
		
		d2 = 0.012;
	 	d3 = 1.2e-2;
		
		System.out.println(d2);
		System.out.println(d3);
		
		
		
		
		
		
	}

}
