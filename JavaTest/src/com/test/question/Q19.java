package com.test.question;

import java.util.Calendar;

public class Q19 {
	
	public static void main(String[] args) {
		
		nowTime();
		
		
		
	}

	private static void nowTime() {
        Calendar now = Calendar.getInstance();
		
		int hour = now.get(Calendar.HOUR_OF_DAY);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.printf("현재시간: %d시 %d분 %d초\n", hour, minute, second);
		
		String ampm = (now.get(Calendar.AM_PM)) == 0 ? "오전" : "오후";
		int hour12 = now.get(Calendar.HOUR);
		
		System.out.printf("현재시간: %s %d시 %d분 %d초\n",ampm, hour12, minute,second);
		
	}

}
