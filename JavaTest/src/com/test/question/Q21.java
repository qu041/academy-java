package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Calendar;

public class Q21 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도: ");
		int birthYear = Integer.parseInt(reader.readLine());
		
		Calendar now = Calendar.getInstance();
		int nowYear = now.get(Calendar.YEAR);
		
		int age = nowYear - birthYear + 1;
		
		System.out.printf("나이: %d세\n", age);	
		
	}

}
