package com.test.java;

public class Ex16_Method {

	public static void main(String[] args) {
		
		//Ex16_Method.java
		
		//public static void hello()
		
		//void > 반환타입
		//메서드가 실행 후 호출된 곳으로 다시 돌아온다. > 값을 가지고 돌아 올 수 있다.
		
		m1();
		int n = m2();
		System.out.println(n);
		System.out.println();
		String result = getNumber(10);
		System.out.println(result);
	}//main
	
	public static void m1() {
		
		System.out.println("m1");
		
	}
	
	//This method must return a result of type int
	public static int m2() {
		System.out.println("m2");
		return 10;
		
		
	}
	
	public static String getNumber(int num) {
		
		return num > 0 ? "양수" : "양수아님";
		
		
	}
	
}
