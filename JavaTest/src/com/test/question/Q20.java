package com.test.question;

import java.util.Calendar;

public class Q20 {
	
	public static void main(String[] args) {
		
		Calendar now = Calendar.getInstance(); // 오늘
		
		now.add(Calendar.DATE, 100); //백일
		System.out.printf("백일: %tF\n", now);
		
		now = Calendar.getInstance(); //초기화 필수
		now.add(Calendar.YEAR, 1); //첫돌
		System.out.printf("첫돌: %tF\n", now);
		
		
		
	}

}
