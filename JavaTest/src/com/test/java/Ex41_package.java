package com.test.java;

import com.test.java.aaa.Yellow;

//import com.test.java.aaa.Red;

public class Ex41_package {

	public static void main(String[] args) {
		
		//Ex41_package.java
		/*
		  
		  	패키지, package
		  	- 클래스를 저장하기 위한 폴더
		  	- 많은 클래스들을 체계적으로 관리하기 위한 용도
		  	-구분자
		  		- 파일 or 폴더: C:\\AAA\BBB\CCC
		  		- 패키지: aaa.bbb.ccc
		  	
		  	-"com.test.java.aaa" > "Red.java	
		  	-"com.test.java.aaa" > "Yellow.java	
		  	-"com.test.java.bbb" > "Yellow.java	
		  	-"com.test.java.bbb.ccc" > "Blue.java	
		  	
		  	접근 지정자
		  
		  
		  
		 */
			
			//다른 패키지에 있는 Red 객체 생성
			com.test.java.aaa.Red r1 = new com.test.java.aaa.Red();
			
			r1.a = 10;
//			r1.b = 20;
//			r1.c = 30; //default(package)
//			r1.d = 40; //protected
			
		/*
		 
		  		패키지 + 접근 지정자
		  		1. public > 100% 공개
		  		2. private > 100% 비공개
		  		-------------------------------
		  		3. default(package)
		  			- 같은 패키지에서는 100% 공개
		  			- 다른 패키지에서는 100% 비공개
		  			
		  		4. protected
		  			- 같은 패키지에서는 100% 공개
		  			- 다른 패키지에서는 100% 비공개
		  			- 다른 패키지라도 자식 클래스라면 100% 공개
		  	
		 */
			
		//com.test.java.aaa.Yellow	
		//com.test.java.bbb.Yellow
			//ctrl shift o -> 구분 잘해야됨
			//이런 일이 거의 없지만 사용하려면 뒤에껀 경로 다 쓰기.
			
		Yellow y1 = new Yellow();	//aaa

		com.test.java.bbb.Yellow y2 = new com.test.java.bbb.Yellow();	//bbb
		
	
	}//main
	
}
