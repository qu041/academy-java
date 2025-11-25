package com.test.java;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

public class Ex20_DateTime {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//Ex20_DateTime.java
		/*
		 	자바의 날짜/시간 자료형
		 	1. Date 클래스
		 	2. Calendar 클래스
		 --------------------------------------------------------우선 앞에 두개 공부.	
		 	3. java.time 패키지 > 클래스
		 
		 	시간(간격), 시각(점)
		 	
		 	-2025년 6월 13일 오전 11시 3분 20초 -시각
		 	-8시간 수업 - 시간
		 	
		 	날짜/시간 > 연산
		 	
		 	시각 + 시각 = X
		 	시각 - 시각 = 시간(O)
		 	시각 * 시각 = X
		 	시각 . 시각 = X
		 	
		 	시간 + 시간 = 시간
		 	시간 - 시간 = 시간
		 	시간 * 시간 = X
		 	시간 / 시간 = X
		 	
		 	시각 + 시간 = 시각 //미래
		 	시각 - 시간 = 시각 //과거
		 	
		 	
		 	2025년 6월 23일 오전 13시 3분 20초
		 	2025년 6월 11일 오후 15시 1분 10초
		 	
		 	1970년 1월 1일 0시 0분 0초 //기준점
		 	-Unix Time
		 	-Epoch Time
		 	
		 
		 */
		
		//m1(); //앞으로 예제 메서드방식으로 입력 //Date
		
		//m2(); //Calendar
		
		//m3();
		
		//m4(); //특정 시각을 만드는 방법
		
		//m5(); //연산
		
		//m6(); //마이너스 연산
		
		//m7(); //시간
		
		m8();
		
		
	}

	private static void m8() {
		
		// 현재 시간의 tick
		Calendar now = Calendar.getInstance();
		System.out.println(now.getTimeInMillis());	//1749795822330
		
		// 현재시간의 tick 구하는 두번째 방법 자주씀
		System.out.println(System.currentTimeMillis()); //1749795822343 // 시간 더 긴 이유는 위에서 아래로 진행되어서 
	
		
	}

	private static void m7() {
		//연산
		//- 시간 + 시간 = 시간
		//- 시간 - 시간 = 시간
		
		//2시간 30분 + 10분 = 2시간 40분
		int hour = 2;
		int min = 30;
		
		//min = min +10;
		min += 10;
		
		System.out.printf("%d시간 %d분\n", hour, min);
		
		//2시간 30분 + 40분 = 3시간 10분
		
		 hour = 2;
		 min = 30;
		 
		 min += 40;
		 
		 hour = hour + (min / 60);  //몫
		 min = min % 60;		   //나머지
		 
		 System.out.printf("%d시간 %d분\n", hour, min); //3항연산자로 안되나?
		 
			
		 
		
		
		
		
		
	}

	private static void m6() throws NumberFormatException, IOException {
		
		 Calendar now= Calendar.getInstance();
		//현재 ~ 특정 시각 > 몇일이 남았는지?
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		//2025-07-30, 2025년 7월 30일, 2025.7.30
		System.out.print("입력(년): ");
		int year = Integer.parseInt(reader.readLine());
		
		System.out.print("입력(월): ");
		int month = Integer.parseInt(reader.readLine());
		
		System.out.print("입력(일): ");
		int date = Integer.parseInt(reader.readLine());
		
		Calendar someday = Calendar.getInstance();
		someday.set(year, month - 1, date);
		
		long nowTick = now.getTimeInMillis();
		long somedayTick = someday.getTimeInMillis();
		
		System.out.printf("두 날짜의 차는 %d일입니다.\n", (somedayTick - nowTick) / 1000 / 60/ 60 / 24);
		
		
	}

	private static void m5() {
		
		//연산
		//-시각 + 시간
		//-시각 - 시간
		
		//오늘 만난 커플 > 100일?
		//오늘(시각) + 100일(시간) = 기념일(시각)
		Calendar now = Calendar.getInstance();
		
		System.out.printf("1일 기념일: %tF\n ", now);
		
		// now + 100
		now.add(Calendar.DATE, 100);
		
		System.out.printf("100일 기념일: %tF\n ", now);
		
		// 1주일 후?
		now= Calendar.getInstance(); // 일자 초기화 해야 됨
		
		now.add(Calendar.DATE, 7);
		System.out.printf("1주일후:%tF\n", now); //2025-09-27 주의 해야됨
		
		
		// 3일 전?
		now = Calendar.getInstance();
		
		now.add(Calendar.DATE, -3); // 빼기도 add로 다함.
		
		System.out.printf("3일전:%tF\n", now);

		//컵라면 >3분뒤?
		
		now = Calendar.getInstance();
		
		now.add(Calendar.MINUTE, 3);
		System.out.printf("%tT\n", now);
		
		Calendar birthday = Calendar.getInstance(); //현재시각
		
		
		
		//10000시간 살았을 때?
		birthday.set(1990, 6, 10, 14, 30, 50);
		System.out.printf("%tF %tT\n", birthday, birthday);
		
		birthday.add(Calendar.HOUR_OF_DAY, 10000);
		System.out.printf("%tF %tT\n", birthday, birthday);
		
		//연산
		//-시각 - 시각 = 시간
		
		//내가 태어나서 총 몇일을 살아왔는지?
		//- 현재 - 생일 = 살아온 시간
		now = Calendar.getInstance();
		
		birthday.set(1990, 6, 10, 14, 30, 50);
		System.out.printf("%tF %tT\n", birthday, birthday);
		
		//birthday.out.println(now - birthday);
		
		System.out.println(now.getTimeInMillis());
		System.out.println(birthday.getTimeInMillis());
		
		long gap = now.getTimeInMillis() - birthday.getTimeInMillis();
		
		System.out.printf("살아온 시간: %,dms\n", gap);
		System.out.printf("살아온 시간: %,d시간\n", gap / 1000 / 60/ 60);
		System.out.printf("살아온 시간: %,d일\n", gap / 1000 / 60/ 60/ 24);
		//System.out.printf("살아온 시간: %,d년\n", gap / 1000 / 60/ 60/ 24/ 365); //윤년/윤달 떄문에 안됨
		
	
		
		
	
	
	
	}

	private static void m4() {
		// 특정 시각을 만드는 방법
		//Calendar 클래스 메서드
		//1. int get(int) : 읽기
		//2. void set() : 쓰기(수정하기)
		
		//올해 크리스마스
		
		Calendar christmas = Calendar.getInstance(); //현재 시각
		System.out.printf("%tF\n", christmas);
		
		//수정(쓰기)
		christmas.set(Calendar.MONTH,11);
		System.out.printf("%tF\n", christmas);
		
		christmas.set(Calendar.DATE, 25);
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		christmas.set(Calendar.HOUR_OF_DAY, 0);
		christmas.set(Calendar.MINUTE, 0);
		christmas.set(Calendar.SECOND, 0);
	
		System.out.printf("%tF %tT\n", christmas, christmas);
		
		//내 생일
		Calendar birthday = Calendar.getInstance(); //현재시각
		
		birthday.set(1990, 6, 10, 14, 30, 50);
		System.out.printf("%tF %tT\n", birthday, birthday);
		
	
	}
	

	private static void m3() {
		
		//+ 연산자
		//1. 산술 연산자
		//- 숫자형 + 숫자형
		
		//2. 문자열 연산자(concatenation)
		//- 문자열 + 문자열
		
		System.out.println("10");
		System.out.println(10 + 20 + 30);	// 계산은 왼쪽부터 (문자열이 만들어진 순서 확인)
		System.out.println("10" + 20 + 30); // 컴파일러가 문자형 뒤에 숫자형을 문자형으로 바꿔버림
		System.out.println(10 + "20" + 30); // 컴파일러가 문자형 뒤에 숫자형을 문자형으로 바꿔버림
		System.out.println(10 + 20 + "30"); // 컴파일러가 문자형 뒤에 숫자형을 문자형으로 바꿔버림
		
		//문자열 > 숫자
		String c = "10";
		int d =  Integer.parseInt(c);
		
				
		//숫자 > 문자열
		int a = 10;
		
		String b =String.valueOf(a);
		String e = a + "";
		
		
	}

	private static void m2() {
		
		//Date > Calendar 클래스
		Calendar now = Calendar.getInstance();
		System.out.println(now);
		System.out.println();
		
		System.out.println(now.get(1));
		System.out.println(now.get(2));
		System.out.println(now.get(3));
		System.out.println(now.get(4));
		
		int year = 1;
		System.out.println(now.get(year));
		
		System.out.println(Calendar.YEAR);           
		System.out.println(now.get(Calendar.YEAR));  // 2025 >년
		System.out.println(now.get(Calendar.MONTH)); // 5 > 월(0~11)
		System.out.println(now.get(Calendar.DATE));  // 13 > 일
		System.out.println(now.get(Calendar.HOUR));	  // 0 > 시(12H)
		System.out.println(now.get(Calendar.HOUR_OF_DAY)); //24
		System.out.println(now.get(Calendar.MINUTE)); //분
		System.out.println(now.get(Calendar.SECOND)); //초
		System.out.println(now.get(Calendar.MILLISECOND)); //밀리초
		System.out.println(now.get(Calendar.AM_PM)); //오후(1) >오전(0)
		System.out.println(now.get(Calendar.DAY_OF_YEAR)); //164일 / 365일
		System.out.println(now.get(Calendar.DAY_OF_MONTH)); //일(월)
		System.out.println(now.get(Calendar.DAY_OF_WEEK)); //일(주).요일 일(1) ~ 토(7)
		System.out.println(now.get(Calendar.WEEK_OF_YEAR)); //몇주차 /올해
		System.out.println(now.get(Calendar.WEEK_OF_MONTH)); //몇주차 /월
		System.out.println();
		System.out.println();
		
		//요구사항] "오늘은 2025년 6월 13일입니다." 출력하시오.
		int month = now.get(Calendar.MONTH) + 1;
		
		System.out.printf("오늘은 %d년 %S월 %d일입니다.\n" 
																	, now.get(Calendar.YEAR)
																	, month + 1 < 10 ? "0" + (month) : "" + month + 1 // +1  해주는거 중요
																	, now.get(Calendar.DATE));
		
		System.out.printf("오늘은 %d년 %02d월 %02d일입니다.\n" 
						, now.get(Calendar.YEAR)
						, now.get(Calendar.MONTH) + 1
						, now.get(Calendar.DATE));
						
		//요구사항] "지금은 오후 12시 46분 05초입니다"
		System.out.printf("지금은 %s %02d시 %02d분 %02d초입니다.\n"
				                                                   ,now.get(Calendar.AM_PM) == 0 ? "오전" : "오후"
																   ,now.get(Calendar.HOUR)
																   ,now.get(Calendar.MINUTE)
																   ,now.get(Calendar.SECOND));
		
		//printf() > 형식 문자(날짜/시간) -> 화면 출력용으로 많이 씀.
		System.out.printf("%tF\n", now);// 2025-06-13
		System.out.printf("%tT\n", now);// 14:07:06
		System.out.printf("%tA\n", now);// 금요일
		
		
		//집합 데이터 > 내가 원하는 항목을 추출
		//집 
	}

	private static void m1() {
		
		//현재 시간
		
		//Date 클래스
		Date now = new Date(); // now > 현재시각
		
		//Fri Jun 13 11:26:22 GMT+09:00 2025
		System.out.println(now);
	
		
		
		
	}

}
