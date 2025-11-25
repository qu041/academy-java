package com.test.java;

import java.util.Calendar;

public class Ex24_Calendar {

	public static void main(String[] args) {
		
		//Ex24_Calendar.java
		
		//달력 만들기
		//1. 해당 년월의 마지막 일
		//2. 해당 년월의 1일의 요일
		
//		int year = 2025;
//		int month = 1;
//		
//		printCalendar(year, month);
		
		//다이어리
//		for (int i=1; i<=12; i++) {
//			printCalendar(2025, i);
//			System.out.println();
//			System.out.println();
//		}
		
		//이번달 달력 > 자동으로 출력
		Calendar now = Calendar.getInstance();
		
		printCalendar(now.get(Calendar.YEAR), now.get(Calendar.MONTH) + 1);
		
		
		
		//도구(JUnit)
		//단위 테스트 //프로그램이 거대해지다보니 중요성이 커짐.
		//-테스트 코드 //본인이 짜서 확인 후 남에게 전달.
		//System.out.println(isLeafYear(2024)); //1.검증뒤에서부터 하나하나
		//System.out.println(getLastDay(year, 2)); //2.
		
		
	}

	private static void printCalendar(int year, int month) {
		
		int lastDay = getLastDay(year, month);
		int dayOfWeek = getDayOfWeek(year, month);
		
		//System.out.println("lastDay: " + lastDay);
		
		System.out.println("====================================================");
		System.out.printf("                    %d년  %02d월\n    ", year, month);
		System.out.println();
		System.out.println("====================================================");
		System.out.println("[일]\t[월]\t[화]\t[수]\t[목]\t[금]\t[토]");
		
		
		for (int i=0; i<dayOfWeek; i++) {
			System.out.print("\t");
		}
		
		
		for (int i=1; i<=lastDay; i++) {
			System.out.printf("%d\t", i);
			
			//토요일 > 개행
			//if (i % 7 ==3) {
			if((i + dayOfWeek) % 7 == 0) {
				System.out.println();
			}
		}
		
	}

	private static int getDayOfWeek(int year, int month) {
		
		//서기 1년 1월 1일 ~ 2025년 6월 17일
		int sum = 0; //누적변수
		
		//1. 1년 1월 1일 ~ 2024년 12월 31일 > 1년 365일 //대략 계산 가능
		for (int i=1; i<year;i++) {
			sum += 365;
			
			if (isLeafYear(i)) {
				sum++; // 365일도 더하고 1도 더하고
		}
		}	
		
		//2. 2025년 1월 1일 ~ 2025년 5월 31일 > 한달씩 셈
		for (int i=1; i<month;i++) {
			sum += getLastDay(year, i);
		}
		
		//3. 2025년 6월1일 //~ 오늘까지면
		sum += 1; //1일까지 // +n하면 됨
		
		return sum % 7;
		
	}

	private static int getLastDay(int year, int month) {
		
		switch (month) {
		case 1: case 3: case 5: case 7: case 8: case 10: case 12:
			return 31;
		case 4: case 6: case 9: case 11:
			return 30;
		case 2:
			return isLeafYear(year) ? 29 : 28; //boolean값 불러오는 메소드 is 많이씀
		}
		return 0;
		
		
		
	}

	private static boolean isLeafYear(int year) {
		
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					return true;
				} else {
					return false;
				}
			} else {
				return true;
			}
		} else {
			return false;
		}
		//Unreachable code
		//return false;
	}
}
