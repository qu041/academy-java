 package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q33 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("년도 입력: ");
		int year = Integer.parseInt(reader.readLine());
		
		
		 if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			 System.out.printf("%d년은 윤년입니다.", year);
		 } else {
			 System.out.printf("%d년은 평년입니다.", year);
		 }
		
	}

}
