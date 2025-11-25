package com.test.java;

public class Ex06_Escape {
	
	public static void main(String[] args) {
		
		//Ex06_Escape.java
		
		//특수문자 > Escape Sequence
		//-컴파일러가 번역을 할 때 소스 상의 문자를 그대로 출력하지 않고, 미리 약속된 표현으로 바꿔서 출력하는 요소
		
		//1. \n
		//-개행문자(엔터)
		//-new line, line feed
		
		char c1 = '\n';
		String s1 = "\n";
		
		//요구사항] "안녕하세요. 홍길동입니다."를 출력하시오.
		//수정사항] "안녕하세요."와 "홍길동입니다." 각각 다른 줄에 출력
		
		//문자열 리터럴내에는 개행을 할 수가 없다.
		String a1 = "안녕하세요. \n\n홍길동입니다.";
		
			 
		System.out.println(a1);
		
		//2. \r
		//- carriage return
		//- 캐럿의 위치 현재 라인의 맨 앞으로 이동 //캐럿 : 깜박이는 그겈
		//- 키보드 > home 키 역할
		
		a1 = "안녕하세요.\r홍길동"; 
		System.out.println(a1); //홍길동세요. 삽입쓰기 (현재기본모드) -> (insert - 덮어쓰기모드로 출력됨)
		
		
		//운영체제의 개행문자 역슬래쉬 -> 예전 수동 타자기에서 유래
		//1. 윈도우 > \r\n
		//2. 맥os > \r > \n
		//3. 리눅스 > \n
		
		System.out.println("하나\r\n둘");
		System.out.println("하나\n둘");
		
		//3. \t
		//- 탭문자
		//- 탭이 뭐에요? > 4칸씩 띄는겁니다.(일반적인 대답)
		//- 탭 : 가장 가까운 탭으로 이동 ( 눈에 안보이는 고정(절대위치) 된 가장 가까운 탭으로 이동
		
		a1 = "하나\t둘\t\t셋";
		System.out.println(a1);
	}

}
