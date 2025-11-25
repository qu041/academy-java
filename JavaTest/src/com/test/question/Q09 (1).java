package com.test.question;

public class Q09 {
	
	public static void main(String[] args) {
		
	  String result =""; // result를 공백으로 선언? 해줘야 밑에서 오류가 안남.
	  					 // 선언과 동시에 메소드 호출하면 아무개 할 때 result 중복 오류 뜸.ㅠㅠ
	  					 // main()의 result와 getName()의 result는 전혀 다른 변수
		
	  result = getName("홍길동"); 
	  System.out.printf("고객: %s\n", result);

	  result = getName("아무개");
	  System.out.printf("고객: %s\n", result);
	  
		
	}

	public static String getName(String name) {
		
		String result = name + "님"; //main()의 result와 getName()의 result는 전혀 다른 변수
		
		return result;
		
		
	}
}
