package com.test.java.obj.inheritance;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Ex49_Object {

	public static void main(String[] args) {
		
		//Ex49_Object.java
		//m1();
		 m2();
	}

	private static void m2() {
		
		int a = 10;//값형
		Integer b = new Integer(10); //참조형 //기본생성자가 없다는게 뭐야? //클래스 세계에 들어가기 위해서 씀
		
		
		//업캐스팅 발생
		Object o1 = new AAAAAA();
		
		//업캐스팅 + 박싱 발생 // 박싱이 뭔지?
		Object o2 = 100; //100 > new Integer(100) -> 전형적인 객체생성, 자바가 스스로 변환
		
		//언박싱 산술연산 하기위해 등등...
		//System.out.println(o2 * 2); 
		System.out.println(((Integer)o2 * 2));
		System.out.println(((int)o2 * 2));
		
		
		
	}

	private static void m1() {
		
		AAAAAA a1 = new AAAAAA();
		AAAAAA a2 = new BBBBBB();//업캐스팅 자식
		AAAAAA a3 = new CCCCCC();//업캐스팅 손자
		
		Object o1 = new AAAAAA();//업캐스팅
		Object o2 = new BBBBBB();
		Object o3 = new CCCCCC();
		
		Object o4 = new Scanner(System.in);
		Object o5 = new BufferedReader(new InputStreamReader(System.in));
		Object o6 = new Student();
		
		Object o7 = "홍길동";
		Object o8 = new int[3];

		
		//*** 이상하다?
		//참조형 = 값데이터가 들어와있음. 왜그런지 말해줘.
		Object o9 = 100;
		Object o10 = true;
		
		//결론] 모든 자료형을 Object 변수에 넣을 수 있다.(값형, 참조형)
		
		//주의점!!
		//- 단, 처음 담은 자료형으로 나머지 방에도 통일해줘야 한다.
		Object[] list = new Object[5];
		list[0] = "홍길동";
		list[1] = 20;
		list[2] = true;
		list[3] = new Student();
		list[4] = new Scanner(System.in);
		
		
		
		}
}

class AAAAAA {
	
}

class BBBBBB extends AAAAAA {
	
}

class CCCCCC extends BBBBBB {
	
}