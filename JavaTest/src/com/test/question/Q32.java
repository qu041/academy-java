package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q32 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("[들어온 시간]");
		System.out.print("시: \n");
		int hour = Integer.parseInt(reader.readLine());
		System.out.print("분: \n");
		int minute = Integer.parseInt(reader.readLine());
		
		System.out.println("[나간 시간]");
		System.out.print("시: \n");
		int oHour = Integer.parseInt(reader.readLine());
		System.out.print("분: \n");
		int oMinute = Integer.parseInt(reader.readLine());
		
		int result1 = hour * 60 + minute;
		int result2 = oHour * 60 + oMinute;
		int gap = result2 - result1;
		int fee = ((gap - 30) / 10) * 2000;
		
		if (gap <= 30) {
			System.out.print("무료입니다. 안녕히가세요.");
		} else {
			System.out.printf("주차요금은 %,d원입니다.", fee);
		}
		
		
		
		
		
		
		
		
		
		
	}

}
