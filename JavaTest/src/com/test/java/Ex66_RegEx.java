package com.test.java;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex66_RegEx {
	
	public static void main(String[] args) {
		
		//Ex66_RegEx.java
		/*
		  
		 	정규 표현식, Regular Expression
		 	- 정규식 (연습 잘해두면 좋음 / 써 먹을 데가 많음 / 다들 정리하려고 함/ 근데 잘 안함)
		 	- "특정 패턴"을 가지는 문자열을 검색하는 도구
		 	
		 	정규 표현식 요소(문법)
		 	
		 	1. x
		 		- x는 임의의 문자 1개
		 		ex) a > a
		 		ex) abc > abc
		 		ex) 홍길동 > 홍길동
		 		
		 	2. "." dot
		 		- 임의의 문자 1개(와일드카드, wildcard)
		 		ex) "." > 문자 1개
		 		ex) ".." > 문자 2개
		 		ex) "a.c" > abc, aac, acc, adc, a1c, a홍c... 을 찾을 수 있음.
		 		ex) "a..c" > abc, aac, acdc, addc, a21c, a헹홍c...
		 
		 	3. 출현횟수
		 		- 바로 앞의 문자(집합)의 출현 횟수를 표현
		 		
		 		3.1 생략
		 			- 바로 앞의 문자의 출현 횟수가 생략X, 중복X
		 			- 출현 횟수 : 1 / 반드시 한번
		 			- ex) "abc" abc > bc, abc, abb, ac, bc, bbc, aaabc,aaaaaaabc
		 			- ex) "홍길동" 홍길동 > 안녕~ 길동아~ 홍동 네 이름은 홍길동이지? 홍홍홍홍홍홍홍길동
		 			- ex) "자바코드" 자바코드가 있습니다. 그런데 자코드 코드에 에러가 있어요. 자바자바자바코드,자바코드자바코드
		 
		 		
		 		3.2 "x?"
		 			- 바로 앞의 문자의 출현 횟수가 생략 가능, 중복X
		 			- 출현 횟수 : 0~1 / 안나타나도 되고 나타나도 되지만 중복은 안됨
		 			- ex) "a?bc" abc > bc, abc, abb, ac, bc, bbc, aaabc
		 			- ex) "홍?길동" 홍길동 > 안녕~ 길동아~ 홍동 네 이름은 홍길동이지?
		 			- ex) "홍길동?" 홍길동 > 안녕~ 길동아~ 홍길 네 이름은 홍길동이지?
		 			- ex) "(자바)?코드" 자바코드가 있습니다. 그런데 자코드 코드에 에러가 있어요.
		 		
		 		3.3 "+"
		 			- 바로 앞의 문자의 출현 횟수가 생략 안됨, 중복O
		 			- 출현 횟수 : 1~무한대 / 최소 한번 ~ 무한대 등장 가능
		 			- ex) "a+bc" abc > bc, abc, abb, ac, bc, bbc, aaabc,aaaaaaabc
		 			- ex) "홍+길동" 홍길동 > 안녕~ 길동아~ 홍동 네 이름은 홍길동이지? 홍홍홍홍홍홍홍길동
		 			- ex) "(자바)+코드" 자바코드가 있습니다. 그런데 자코드 코드에 에러가 있어요. 자바자바자바코드,자바코드자바코드
		 		
		 		3.4 "*"
		 			- 바로 앞의 문자의 출현 횟수가 생략 가능, 중복O
		 			- 출현 횟수 : 0~무한대 / 최소 0번 ~ 무한대 등장 가능
		 			- ex) "a*bc" abc > bc, abc, abb, ac, bc, bbc, aaabc,aaaaaaabc
		 			- ex) "홍*길동" 홍길동 > 안녕~ 길동아~ 홍동 네 이름은 홍길동이지? 홍홍홍홍홍홍홍길동
		 			- ex) "(자바)*코드" 자바코드가 있습니다. 그런데 자코드 코드에 에러가 있어요. 자바자바자바코드,자바코드자바코드
		 
		 
		 	- ex) "a?a?abc" abc aabc aaabc > bc, abc, abb, aabc, aaabc, aaaaabc, aaaabc, ac, bc, bbc, aaabc,aaaaaaabc
		 	- 찾긴 찾는데 최대치 조절 가능.. 출현횟수 조절하는 다른 방법있음.
		 	
		 	
		 		4. 선택, Choice
		 			- 연산자(or) 역할
		 			- [] 안에 문자 중 1개를 선택
		 			
		 		4.1 [값]
		 			-한가지라도 일치하면 찾겠습니다.
		 			- ex) [012] > 1 or 2 or 0 제 나이는 12살입니다. 제 동생은 11살이에요. 제 키는 160cm입니다. 몸무게는 50kg입니다. 제 동생 키는 120cm입니다.
		 			- ex) [나생은] > 나 or 생 or 은 제 나이는 12살입니다. 제 동생은 10살이에요. 제 키는 160cm입니다. 몸무게는 50kg입니다. 제 동생 키는 120cm입니다.
		 			- ex) [홍최이] 홍길동,최길동,이길동 > 홍길동 아무개 김길동 최길동 박길동 정길동 이길동 홍최이길동
		 				  [홍최이]?길동   +길동
		 				  [홍최이]*길동 홍최이최최최홍이길동
		 			
		 			- ex) 연속된 숫자 [0123456789]+ // [4567893210]+
		 			- ex) 짝수만  [0123456789]*[02468]
		 			- ex) 홀수만  [0123456789]*[13579]
		 			- ex) 주민등록번호 > 950401-2345691 > [0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789][0123456789][0123456789][0123456789]
		 			  					  050101-3492390
		 			- ex) 전화번호 > 010-1234-5678  					  	
		 							 011-278-0983
		 							 019-2345-2345
		 							 016-1234-4232
		 							 
		 							 01[01698]-[0123456789][0123456789][0123456789][0123456789]?-[0123456789][0123456789][0123456789][0123456789]
		 			
				 	- ex) 영어 소문자 단어 > [abcdefghijklmnopqrstuvwxyz]+
				 	- ex) 영어 소문자 단어 > [ABCDEFGHIJKLMNOPQRSTUVWXYZ]+
				 	- ex) 영문자 단어 > [ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz]+
		 			- ex) 한글
		 				
		 				*** []에서 연속된 문자(코드)를 간단하게 표현하는 방법
		 				ex) 숫자 > [0123456789] > [0-9]
		 				ex) 숫자 > [02468] != [0-8] > [012345678]
		 				ex) 숫자 > [0123456789] > [0-36-9]
		 				ex) 숫자 > [045679] >[04-79]
		 				ex) 영어소문자 > [a-z]
		 				ex) 영어대문자 > [A-Z]
		 				ex) 영문자 > [A-Za-z],[a-zA-Z] / [A-z] (X)
		 				ex) 한글 > [가-힣]+ 
		 				
		 				ex) 주민등록번호 > [0-9][0-9][0-9][0-9][0-9][0-9]-[0-9][0-9][0-9][0-9][0-9][0-9][0-9]
		 				ex) 전화번호 > 010-[0-9]?[0-9][0-9][0-9]-[0-9][0-9][0-9][0-9]
		 				ex) 홍길동, 홍순신, 홍재석, 홍철수, 홍영희
		 					-홍[가-힣][가-힣]
		 					
		 				ex) 영문자 + 숫자 > [A-Za-z0-9]
		 				ex) 영문자 + 숫자 + 한글 >[A-Za-z0-9가-힣]
		 				ex) 식별자로써 적합한 문자(영어 + 숫자 + _)
		 					-[A-za-z0-9_]
		 			
		 							 	
		 		4.2 [^값]	
		 			- 4.1의 부정형
		 			- 나열된 값들 빼고 나머지 검색
		 			
		 			ex) [0-9]+
		 			ex) [^0-9]+
		
				5. 출현횟수
					- 바로 앞의 문자(집합)의 출현 횟수를 표현
					- 생략, ?, +, * -> 더 세밀한 패턴 지정이 가능
					
					 5.1 {n}
					 	-n : 출현횟수
					 	ex) a{1}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc	
					 	ex) a{2}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc	
					 	ex) a{3}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc	
					 
					 5.2 {n,m}
					 	-n: 최소 출현 횟수
					 	-m: 최대 출현 횟수
					 	ex) a{1,3}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
					 	ex) a{2,3}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
					 	ex) a{0,3}bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
					 	ex) a?bc > a{0,1}bc

					 5.3 {n, }
					 	-n :최소 출현 횟수
					 	-m :무한대 (생략)
					 	ex) a{1, }bc> ab, bc, abc, ac, abbc, abcc, aabc, aaabc
		
						ex) a?bc > a{0,1}bc
						ex) a+bc > a{1, }bc
						ex) a*bc > a{0, }bc
						
						ex}주민등록번호
						[0-9]{6}-[0-9]{7}
						
						ex) 전화번호
						010-[0-9]{3,4}-[0-9]{4}
						
						ex 이름(1~5자)
							홍[가-힣]{1,5}
							
						ex) 자바 키워드(영단어)
						[A-Za-z]{1, }
						
						ex) 영단어 > 첫문자는 대문자고 나머지 문자는 소문자
						[A-Z][a-z]{1, }
						
						ex) 식별자(영어 + 숫자 + _)
							-숫자로 시작 불가능
							
							[A-Za-z_][A-Za-z0-9_]{1, }
					
					6. 처음과 끝
							-입력 컨트롤 or 입력값 등을 대상으로 사용
							
							6.1 ^
								- 뒤에 표현으로 반드시 시작
								- str.startswit("홍")
							6.2 $
								- 앞의 표현으로 반드시 끝
								- str.endswith("동")
								
						
						
					7. 줄임표현
							
							7.1 \d or \D
								-Digital
								-[0-9] == \d
								-[^0-9] == \D 자바에 쓸 때는 \\d , \\D로 써야됨
								ex) [0-9]{6}-\d{7}
								
							7.2 \w or \W
								- Word > 영어대소문자 + 숫자 + _
								ex)[A-Za--z0-9_]{2,5}
								ex)\w{2,5}
								ex)[^A-Za--z0-9_]{2,5} == \W
								
							7.3 \s or \S
								- 공백 문자(스페이스, 개행, 탭)
								ex) + 
								ex) \s+
								ex) \S+ -> 공백이 아닌 모든것들
				
				상황 > 정규식 생성
				-http://regexlib.com
				
				-이메일
		 */			
			//m1();
			//m2();
			//m3();
			//m4();
			//m5();
			m6();
		
	}

	private static void m6() {
		
		//유효성검사 >> 정규표현식 사용
		//회원가입
		//1. 아이디 > 필수값, 4~12자 이내, 영문자+숫자+_, 숫자로 시작X
		//2. 암호 > 필수값 4~12자 이내
		//3. 이름 > 필수값, 한글 2~5자이내
		//4. 나이 > 필수값, 숫자, 범위(1~120)
		
		
		System.out.println("회원가입");
		
		boolean result =  register();
		
		if (result) {
			System.out.println("회원가입 완료");
		} else {
			System.out.println("회원가입 실패");
		}
		
	}

	private static boolean register() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("아이디: ");
		String id = scan.nextLine();
		
		if (checkId(id)) {
			System.out.println("필수값, 4~12자 이내, 영문자+숫자+_, 숫자로 시작X");
			return false; //회원가입 실패
		} 
		
		System.out.print("암호: ");
		String pw = scan.nextLine();
		
		if (checkPw(pw)) {
			System.out.println("필수값 4~12자 이내");
			return false; //회원가입 실패
		} 
		
		System.out.print("나이: ");
		int age = scan.nextInt();
		
		if (checkAge(age)) {
			System.out.println("필수값 4~12자 이내");
			return false; //회원가입 실패
		} 
		scan.nextLine(); // ** 버리기 개행문자? 인티제 스캔하면 해줘야됨..!!
		
		System.out.print("이름: ");
		String name = scan.nextLine();
		
		if (checkName(name)) {
			System.out.println("필수값, 한글 2~5자이내");
			return false; //회원가입 실패
		} 
		
			return true;
	}

	private static boolean checkName(String name) {
		if (name ==null || name.equals("")) {
			return true;
		}
		String regex = "^[가-힣]{2,5}$";
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(name);
		
		
		return !m1.find();
	}

	private static boolean checkAge(int age) {
		//필수값 , 범위 1~120 //범위검사는 정규식으로 힘듬.
		if (age <1 || age>120) {
			return true;
		}
		
		
		return false;
	}

	private static boolean checkPw(String pw) {
		//필수값 4~12자 이내
		if (pw == null || pw.equals("")) {
			return true;
		}
		
		if (pw.length()<4 || pw.length() >12) {
			return true;
		}
		
//		String regex =  "^.{4,12}$";
		
		
		return false;
	}

	private static boolean checkId(String id) {
		//필수값, 4~12자 이내, 영문자+숫자+_, 숫자로 시작X
		//1. 문자열 함수로 유효성검사 1.
//		if (id == null || id.equals("")) {
//			return true;
//		} 
//		
//		if (id.length() <4 || id.length() >12) {
//			return true;
//		}
//		
//		for (int i=0; i<id.length();i++) {
//			char c = id.charAt(i);
//			//System.out.println("c: " + (int)c);
//			if ((c < 'A' || c > 'Z') 
//					&& (c < 'a' || c > 'z')  
//					&& (c < '0' || c > '9')
//					&& (c != '_')
//					) {
//				return true;
//			}
//		}
//		
//		char c2 = id.charAt(0);
//		
//		if (c2>= '0' && c2 <= '9') {
//			return true;
//		}
		
		//2.정규식으로 유효성 검사
		String regex = "^[A-Za-z_][A-Za-z0-9_]{3,11}$";  //^로 시작해야됨 $로 끝나야됨 
		Pattern p1 = Pattern.compile(regex);
		Matcher m1 = p1.matcher(id);
		
		
		return !m1.find();
	}

	private static void m5() {
		
			String txt = "출석을 부르겠습니다. 홍길동~ 김길동~ 박길동~ 최길동~ 이길동~ 남궁길동~";
				//요구사항] 모든 길동이를 찾아서 나열
				//-성 : 홍,김,박,최,이,남궁
				//String regex = "[홍김박최이남궁]길동"; //"[가-힣]{2,5}";
				String regex = "(홍|김|박|최|이|남궁)길동"; //"[가-힣]{2,5}";
				Pattern p1 = Pattern.compile(regex);
				Matcher m1 = p1.matcher(txt);
				
				while (m1.find()) {
					System.out.println("결과: " + m1.group());
					System.out.println("성: " + m1.group(1));
				}
				
		
	}

	private static void m4() {
			//Text Block > JDK 15  """ 엔터 허용 """; 문자열로 인식
			String txt = """
					칼로리를 더 많이 소모하거나 체중을 빨리 감량하고 싶다면 달리기가 더 좋은 선택지다. 하지만 걷기는 건강한 체중을 유지하는 데 도움이 되는 등 건강에 여러 가지 이점을 제공할 수도 있다. 한 연구에 따르면 달리기는 걷기보다 칼로리가 두 배 정도 더 많이 소모된다는 사실이 밝혀졌다.

체중감량을 목표로 한다면 빠르게 걷는 운동이나 달리기를 선택하는 것이 좋다. 스rndbs89@kakao.com피드 워킹은 보통 시속 5km 이상의 빠른 속도로 걷는 것이다. 스피드 워킹을 할 때 심박수가 상승한다. 평소 속도로 걷는 것보다 스피드 워킹을 하면 분당 더 많은 칼로리를 소모할 수 있다.

파워 워킹은 일반적으로 스피드 워킹rndbs89@gmail.com보다 더 빠르게 걷rndbs89@nate.com는 것이다. 파워 워킹은 달리기와 비슷한 칼로리를 소모한다. 

스피드워킹은 달리기만큼 빨리 칼로리를 소모rndbs89@naver.com하지 않는다. 달리기와 같은 양의 칼로리를 소모하려면 스피드워킹을 더 오래 해야 한다. 하지만 심박수를 높이고 기분을 좋게 하며 유산소 운동 수준을 향상시키는 효과적인 운동이 될 수 있다.

걷기 또는 달리기의 효과를 높이기 위해 무게 있는 조rndbs89@daum.net끼를 입고 걷는 것도 좋다. 무게가 있는 조끼를 입고 걸으면 칼로리 소모량이 증가할 수 있다. 안전을 유지하려면 체중의 5~10% 이하인 조끼를 착용하자.

체중을 줄이거나 근육을 긴장시키는 다른 방법을 찾고 있다면 대신 인터벌 워킹을 시도해 보자. 속도를 늦추기 전에 일정 시간 동안 속도를 높이거나 가벼운 덤벨을 양손에 들고 걷는 것도 좋다.

오르막을 걷는 경사 보행도 운동이 많이 된다. 달리는 것과 비슷한 칼로리를 소모할 수 있다. 평평한 표면에서 걷는 것과 같은 속도를 유지하면 경사면에서 더 많은 칼로리를 소모하게 된다. 
					
					""";
			
			//이메일 추출하기
			String regex = "([a-zA-Z0-9._%+-]+)@([a-zA-Z0-9.-]+\\.[a-zA-Z]{2,})";
			
			Pattern p1 = Pattern.compile(regex);
			
			Matcher m1 = p1.matcher(txt);
			
			while (m1.find()) {
				System.out.println(m1.group());
				System.out.println("아이디: "+ m1.group(1));
				System.out.println("도메인: "+ m1.group(2));
				//System.out.println("도메인: "+ m1.group(3));
			}
			
	}	

	private static void m3() {
		
		//자바 > 정규식 클래스 제공
		String txt ="안녕하세요. 홍길동입니다. 제 연락처는 010-1234-5678입니다. 혹시 연락이 안되면 010-9876-5432로 연락주세요."
				+ "010-5555-5555 / 01034443333 / 01032205127/ 0102527-7681";
		
		//txt 안에 전화번호가 있는가?
		String regex = "([0-9]{3})-?([0-9]{3,4})-?([0-9]{4})";
		
		//정규 표현식 객체
		Pattern p1 = Pattern.compile(regex);
		
		//검색
		Matcher m1 = p1.matcher(txt); //txt내에서 정규식으로 검색해라~
		
		//txt내에서 정규식으로 검색 > 일치하는 문자열을 찾았다
		//System.out.println(m1.find());
		
//		if (m1.find()) {
//			System.out.println("전화번호 발견");
//		} else { 
//			System.out.println("전화번호 미발견");
//		}
		
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
//		System.out.println(m1.find());
		
//		int count =0;
//		while (m1.find()) {
//			count++;
//		}
//		System.out.println();
//		System.out.println("전화번호 총 갯수: " + count);
		
		while (m1.find()) {
			System.out.println("[전화번호 발견]");
			System.out.println("전화번호: " + m1.group());
			System.out.println("전화번호: " + m1.group(0));
			System.out.println("통신사: " + m1.group(1)); //소괄호 사용시 그룹으로 묶기 가능.
			System.out.println("가운데: " + m1.group(2)); //소괄호 사용시 그룹으로 묶기 가능.
			System.out.println("뒷자리: " + m1.group(3)); //소괄호 사용시 그룹으로 묶기 가능.
			System.out.println();
		}
		
		
	}

	private static void m2() { //스플릿이랑 정규식이랑 섞어서 씀
		
		String names = "홍길동3아무개,,강아지.고양이 병아리65코끼리";
		
		String[] list =  names.split("[,\\.\\s\\d]+");
		for (String name : list) {
			System.out.println(name);
		}
		
		
	}

	private static void m1() {
		
		//자바
		//1. 여러 메서드가 인자로 정규식을 지원
		//2. 정규식 지원 기능
		
		//게시판 > 글쓰기 > 개인정보(전화번호) 마스킹
		String txt ="안녕하세요. 홍길동입니다. 제 연락처는 010-1234-5678입니다. 혹시 연락이 안되면 010-9876-5432로 연락주세요."
				+ "010.5555.5555 / 01034443333";
		System.out.println(txt.replace("010-1234-5678", "xxx-xxxx-xxxx"));
		System.out.println(txt.replaceAll("010-?[0-9]{3,4}-?[0-9]{4}", "xxx-xxxx-xxxx")
					.replaceAll("010\\.[0-9]{3,4}\\.[0-9]{4}", "xxx-xxxx-xxxx")
				);
		System.out.println(txt.replaceFirst("010-?[0-9]{3,4}-?[0-9]{4}", "xxx-xxxx-xxxx")
				.replaceFirst("010\\.[0-9]{3,4}\\.[0-9]{4}", "xxx-xxxx-xxxx")
				);
				
		
				
		
		
	}
}
