package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Ex27_String {

	public static void main(String[] args) {
		
		//Ex27_String.java
		
		//문자열 > 문자열 조작 기능들...
		//m1();
		//m2();
		//m3();
		//m4();
		//m5();
		//m6();
		//m7();
		//m8();
		//m9();
		//m10();
		//m11();
		//m12();
		//m13();
		m14();
		
		
	}	

	private static void m14() {
		
		//문자열 분리
		//- String[] split(String delimiter)
		
		String txt = "홍길동, 아무개, 강아지, 고양이, 병아리";
		
		String[] list = txt.split(",");
		
		System.out.println(Arrays.toString(list));
		
		for (int i=0; i<list.length;i++) {
			System.out.println(list[i].trim());
		}
		
	}

	private static void m13() {
		
		//문자열 치환(바꾸기)
		//- String replace(char old, char new)
		//- String replace(String old, String new)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
//		System.out.println(txt.replace("홍길동", "아무개"));
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		System.out.print("이름수정: ");
//		System.out.println(txt.replace("홍길동", reader.readLine()));
//		
		String content = "게시판 글을 작성합니다.";
		String stop = "바보";
		
		//masking
		System.out.println(content.replace(stop, "**"));
		System.out.println();
		
		txt = "  하나  둘  셋  ";
		System.out.println(txt.trim());
		System.out.println(txt.replace(" ", ""));
		System.out.println();
		
		content = "오늘은 메서드수업을 했습니다. 어려워요";
		String word = "메서드 수업";
		
		if (content.replace(" ","").contains(word.replace(" ", ""))) {
			System.out.println("결과o");
		} else {
			System.out.println("결과 x");
		}
		
		
	}

	private static void m12() {
		
		//문자열 검색
		//- indexOf()
		//- lastIndexOf()
		//- startsWith()
		//- endsWith()
		//- boolean contains(String s)
		
		String txt = "안녕하세요. 홍길동입니다.";
		
		if (txt.indexOf("홍길동") > -1) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		
		if (txt.contains("홍길동")) {
			System.out.println("있다");
		} else {
			System.out.println("없다");
		}
		
		
		
	}

	private static void m11() {
		
		//- length()
		//- indexOf()
		//- substring() //추출함수
		
		//문자 추출
		//- charAt(int index)
		//문자열 추출
		//-String substring(int beginIndex, int endIndex)
		//-String substring(int beginIndex)
		
		// - beginIndex : 포함(inclusive)
		// - endIndex: 미포함(exclusive)
		
		String txt = "가나다라마바사아자차카타파하";
		System.out.println(txt.substring(3,7));
		System.out.println(txt.substring(3,txt.length()));
		System.out.println();
		
		String jumin = "970619-1223456";
		System.out.println(jumin.substring(7,8).equals("1") ?  "남자" : "여자" );
		
		//몇년생?
		System.out.println("" + jumin.charAt(0) + jumin.charAt(1)); //97
		System.out.println(jumin.substring(0,2)); //97
		
		//몇월생
		System.out.println(jumin.substring(2,4));
		
		//몇일생
		System.out.println(jumin.substring(4,6));
		System.out.println();
		
		//파일경로
		String path = "C:\\code\\java\\JavaTest\\Ex27_String.java";
				
		//indexOf(), lastIndexOf()
		//substring(0
		
		//1.파일명 추출 > Ex27_String.java
		
		int temp1 = path.lastIndexOf("\\");
		System.out.println(path.substring(temp1 +1));
		
		//2. 파일명 추출 > 확장자 없는 파일명 > Ex27_String
		
		int temp2 = path.lastIndexOf(".java");
		System.out.println(path.substring(temp1 +1, temp2));
		
		//3. 확장자 추출 > .java
		
		int temp3 = path.indexOf(".java");
		System.out.println(path.substring(temp3));
		
		
	}

	private static void m10() {
		
		//검색
		//- 문자열내에서 원하는 문자(열)을 검색 > 발견된 위치(index) 반환
		//- int indexOf(char c)
		//- int indexOf(String s)
		//- int indexOf(char c, int beginIndex) //시작위치 지정가능
		//- int indexOf(String s, int beginIndex) //시작위치 지정가능
		
		//끝에서 부터 검색
		//- 문자열내에서 원하는 문자(열)을 검색 > 발견된 위치(index) 반환
		//- int lastIndexOf(char c)
		//- int lastIndexOf(String s)
		//- int lastIndexOf(char c, int beginIndex) //시작위치 지정가능
		//- int lastIndexOf(String s, int beginIndex) //시작위치 지정가능
		
		String txt = "홍길동 자바 아무개 자바 테스트";
		
		System.out.println(txt.indexOf("자바"));//4
		System.out.println(txt.indexOf("자바",6));//4
		System.out.println();
				
		System.out.println(txt.lastIndexOf("자바"));
		System.out.println(txt.lastIndexOf("자바",10));
		System.out.println();
		
	}

	private static void m9() {
		
		//패턴검색
		//- boolean startsWith(String word)
		//- boolean endsWith(String word)
		
		String name = "홍길동";
		
		//이 사람이 '홍'씨? > 네/아니오
		System.out.println(name.charAt(0) == '홍');
		System.out.println(name.indexOf('홍') == 0);
		System.out.println(name.startsWith("홍"));
		System.out.println();
		
		//'동'으로 끝나는지?
		System.out.println(name.charAt(name.length()-1) == '동');
		System.out.println(name.indexOf('동') == name.length() -1);
		System.out.println(name.endsWith("동"));
		System.out.println();
		
		//현재 예제 파일
		String path = "C:\\code\\java\\JavaTest\\Ex27_String.java";
		
		//위의 파일의 자바 소스 파일인가? 확장자?
		if (path.toLowerCase().endsWith(".Java".toLowerCase())) {
			System.out.println("o");
		} else {
			System.out.println("x");
		}
		
		
	}

	private static void m8() {
		
		//대소문자 변환
		//- String toUpperCase()
		//- String toLowerCase()
		
		String word = "Java";
		System.out.println(word);
		System.out.println(word.toLowerCase());
		System.out.println(word.toUpperCase());
		
		String content = "오늘 수업 과목 Java입니다.";
		
		System.out.println(word.toUpperCase());
		System.out.println(content.toUpperCase());
		
		//대소문자 구분(Case sensitive)
		//-구분 O: 정확도 높음, 검색율 낮음
		//-구분 x: 정확도 낮음, 검색율 높음
		
		if (content.toUpperCase().indexOf(word.toUpperCase()) > -1) {
			System.out.println("0");
		} else {
			System.out.println("X");
		}
		
		//메서드 체이닝
		//content.toUpperCase().indexOf(word.toUpperCase())
		
		//String temp1 = content.toUpperCase();
		//int result = temp1.indexOf(word); //이런 경우 자잘한 변수 굳이 안 만들어도  됨
		
	}

	private static void m7() {
		
		//게시판 글쓰기 > 금지어 설정
		//
		
		String stop = "바보"; //금지어
		String content = "안녕하세요. 바보야 저는 자바를 배우는 학생입니다.";  //글내용
		
		System.out.println(content.indexOf(stop)); //위치 or -1
		
		if (content.indexOf(stop) > -1) {
			System.out.println("금지어 발견");
		} else {
			System.out.println("글쓰기 완료~");
		}
		
		content = "안녕하세요. 저는 자바를 배우는 학생입니다.";  
		String[] stops = {"바보", "멍청이", "메롱", "ㅂㅏ보" };
		
		for (int i=0; i<stops.length; i++) {
			
			if(content.indexOf(stops[i]) > -1) {
				System.out.println("금지어 발견");
				break;
			}
			
		}
		
		System.out.println("종료");
		
	}
	
	
	
	

	private static void m6() {
		
		//검색
		//- 문자열내에서 원하는 문자(열)을 검색 > 발견된 위치(index) 반환
		//- int indexOf(char c)
		//- int indexOf(String s)
		//- int indexOf(char c, int beginIndex) //시작위치 지정가능
		//- int indexOf(String s, int beginIndex) //시작위치 지정가능
		
		String txt = "안녕하세요. 홍길동입니다.";
		int index = -1; //초기화시 -1로 하면 인덱스 여부를 판별하기 편함.
						//못찾으면 -1 찾으면 찾은 곳
		index = txt.indexOf('하');
		System.out.println(index);
		
		index = txt.indexOf('홍');
		System.out.println(index);
		
		index = txt.indexOf("홍길동");
		System.out.println(index);
		
		index = txt.indexOf('강');
		System.out.println(index);
		
		txt = "안녕하세요. 홍길동입니다. 반갑습니다. 홍길동입니다. 안녕히가세요. 홍길동입니다.";
		
		index = txt.indexOf("홍길동"); // 기본값이 대상의 첫번째 부터 찾기 시작함.
										//찾으면 작업 멈춤.
		System.out.println(index);
	
		index = txt.indexOf("홍길동", index + 3);
		System.out.println(index);
		
		index = txt.indexOf("홍길동", index + 3); //나중엔 반복문 돌림. 로직 
		System.out.println(index);
		
		
		
	}

	private static void m5() {
		
		//공백 제거
		//- String trim()
		//- 문자열에 존재하는 공백(whitespace > 스페이스, 탭, 개행)을 제거
		//- 문자열의 시작과 끝에 존재하는 공백 문자만 제거한다.
		//- 불필요하거나 or 사용자 실수로 생긴 공백 제거하는 역할
		//- 엑셀에서 써봄
		
		String txt = "     하나     둘     셋     ";
		
		System.out.printf("[%s]\n",txt);
		System.out.printf("[%s]\n",txt.trim());
		
		
	}

	private static void m4() {
		
		//단어 입력
		//- 영어 소문자로만
		Scanner scan = new Scanner(System.in);
		
		System.out.print("단어(영문자): ");
		String word = scan.nextLine();
		
		if (isValid(word)) {
			System.out.println("통과");
		} else {
			System.out.println("실패");
		}
		
	}

	private static boolean isValid(String word) {
		
		//word = "java"
		//j, a, v, a
		
//		word.charAt(0)
//		word.charAt(1)
//		word.charAt(2)
//		word.charAt(3)
		
		for (int i=0; i <word.length(); i++) {
			char c = word.charAt(i);
//			System.out.println(c);
			
			//test
			
			//*** 유효성 검사는 잘못된 부분을 검색해라!!!
			//'c'
			
			if ((c < 'a' || c > 'z') 
					&& (c < 'A' || c > 'Z')
					&& (c < '0' || c > '9')) {
				return false;
			}
			
		}
		return true;
		
		
	}

	private static void m3() {
		
		//주민번호입력
		//950401-1032215
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("주문번호입력(-필수): ");
		
		String jumin = scan.nextLine();
		
		if (jumin.charAt(6) == '-') {
			System.out.println("올바른 주민번호");
		} else {
			System.out.println("잘못된 주민번호");
		}
		
	}

	private static void m2() {
		
		//문자열 추출
		//-char chatAt(int index)
		//- 원하는 위치의 문자를 추출
		String txt = "안녕하세요. 홍길동입니다.";
		
		System.out.println(txt.charAt(4));
		
		// 미자막 글자
		
		
				
		
	}

	private static void m1() {
		
		//문자열 생성
		//1. 리터럴
		//2. 객체 생성
		
		//String 클래스
		String s1 = "홍길동";
		String s2 = new String("홍길동");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//문자열 == 문자의 집합
		//String == char[]
		
		//문자열 길이
		//- int length()
		
//		String txt = "홍길동";
//		System.out.println(txt.length());
//		System.out.println("자바".length());
//		System.out.println("abc한글123!@#$#".length());
		
		//요구사항] 사용자가 입력 > 문자수?
//		Scanner scan = new Scanner(System.in);
//		System.out.print("문장: ");
//		String line = scan.nextLine();
//		
//		System.out.printf("%s > %,d문자\n", line, line.length());
		
		//유효성 검사
		//- 이름 입력
		//- 성 + ~5자 = 2~6자 이내
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (name.length() >2 && name.length() <= 6) {
			System.out.println("올바른 이름");
		} else {
			System.out.println("올바르지 않은 이름");
		}
		
		
	}
}
