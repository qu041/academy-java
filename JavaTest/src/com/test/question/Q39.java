package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q39 {
	//\b\b 사용해서 풀어요
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		
		System.out.print("시작 숫자: ");
		int sNum = Integer.parseInt(reader.readLine());
		
		System.out.print("종료 숫자: ");
		int eNum = Integer.parseInt(reader.readLine());
		
		for (int i = sNum; i <= eNum; i++) {
			sum += sum;
			
		}
		
		System.out.printf("합: %d", sum);
		
		
	}

}
