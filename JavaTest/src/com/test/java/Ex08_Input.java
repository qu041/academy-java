package com.test.java;

import java.io.IOException;

public class Ex08_Input {

	public static void main(String[] args) throws IOException {
		
		//Ex08_Input.java
		/*
		  	콘솔 입력
		  	
		  	1. System.in.read();
		  		-System.out.print();
		  		-바이트 단위 입력 도구 (1바이트 => 영어 1글자 기반, 한글은 최소 2바이트)
		  		-1byte 읽기
		  		
		  		
		  	2. BufferedReader 클래스
		  		-문자 단위 입력 도구 (바이트,문자 둘 다 가능)
		  	3. Scanner 클래스
		  
		 */
			
		//요구사항] 사용자에게 문자 1개를 입력 받아 화면에 출력하시오. -> 두가지 행동 수행
		
		//제어의 흐름 필요
		
		//0. 입력 안내 메시지 출력
		//1. 문자입력
		//2. 문자를 화면에 출력
		
		System.out.print("문자 입력: "); //Label
		
		int code = System.in.read();  //콘솔창에 입력한 문자를 유니코드 숫자로 읽는 방식임
		System.out.println(code);
		System.out.printf("%c\n", code);
		 	code = System.in.read();  

		 	System.out.println(code);
		
		 	code = System.in.read();  //한글자만 입력도해도 여러개가 나오는 이유
		
		 	System.out.println(code); 	  // enter -> \r\n을 버퍼에 같이 읽어버림.
		
			code = System.in.read();  
		System.out.println(code);
		
			code = System.in.read();  
		System.out.println(code);
		
		/*
		 System.out.printf("입력한 문자는 '%d'입니다.\n", code);
		 System.out.printf("입력한 문자는 '%c'입니다.\n", code);
		*/
		
		//터미널 사용해서 task 한번에 중지하는 방법
		//win+r > cmd
		//> -> $taskkill /f /im javaw.exe 
		
		
	}
}
