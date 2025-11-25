package com.test.java;


//import java.io.BufferedReader;
//import java.io.BufferedReader; /java.io <- 전용 클래스 끼리 모아둔 프로젝트 / 자바 io클래스에 모여있는 도구 중에 하나
//import java.io.InputStreamReader;
import java.io.*; // *와일드 카드 패키지 내에 모든 클래스를 가져옴. 한 패키지내에서 여러개 가져올 때 편함

public class Ex09_BufferdReader {
	
	public static void main(String[] args) throws IOException {
		
		//Ex09_BufferdReader.java
		
		//BufferedrReader 클래스
		//1.유니코드 입력 가능(한글 입력) > 문자 단위 입력
		//2.문장을 입력
		
		//요구사항] 사용자로부터 문자 1개를 입력 > 출력
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//ctrl + shift + o -> 모든 클래스를 한번에 임포트 하는 단축키
		
		//System.out.print("문자 입력: ");
		
		//System.in.read();
		//int code = reader.read(); // 뒤에 아직 안배워서 왜인지 아직 모르지만 예외처리 해야됨
		
		//System.out.println(code);
		//System.out.printf("%c\n", code);
	//유효성 검사에 쓰임	
		//A(65) ~ Z(90)
		//a(97) ~ z(122)
		//0(48) ~ 9(57)
		//\r(13)
		//\n(10)
		//스페이스(32)
		//탭(9)
		
		//한글(완성형 vs 조합형) - 현재는 완성형만 씀
		//-가(44032) ~ 힣(55203) 11,172자
		
		//한글자판
		//-두벌식(자음,모음)
		//-세벌식(초성,중성,종성)
		
	/*	//요구사항] 이름 입력 > 인삿말 출력
		System.out.print("이름: ");
		
		//입력한 한줄을 모두 반환
		//-입력 버퍼에서 \r\n을 만나기 직전까지
		//-남은 \r\n을 자동으로 버린다.
		String name = reader.readLine();
		
		System.out.printf("안녕하세요. %s님\n", name);
		
		//나이 입력
		System.out.print("나이: ");
		String age = reader.readLine(); //20> "20"으로 인식
		System.out.printf("%s님의 나이는 %s세입니다.\n", name, age);
	*/	
		//요구사항] 숫자 2개 입력 > 두 수의 합을 구하시오. 초간단계산기
		System.out.print("첫번째 숫자: ");
		String input1 = reader.readLine();
		
		System.out.print("두번째 숫자: ");
		String input2 = reader.readLine();
		
		System.out.println(input1 + input2); //문자열로 취급하기 때문에 1020
		
		//문자열 -> (변환) -> 숫자열로 바꾸는 방법이 있음.
		//-Integer.parseInt()*****
		//-Byte.parseByte("10")
		//-short.parseShort()
		//-Long.parseLong()
		
		//-Float.parseFloat()
		//-Double.parseDouble("3.14") *****
		
		//-Boolean.parseBoolean("true")
		
		System.out.println(Integer.parseInt("10") + 10);
		
		int n1 = Integer.parseInt(input1);
		int n2 = Integer.parseInt(input2);
		
		System.out.println(n1 + n2);
		
		System.out.println(Integer.parseInt("100") + 100); // 숫자로 계산됨
		
		
	
		
		
	
		
		
		
		
		
		
	}

}
