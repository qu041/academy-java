package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q48 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("양수만 입력 하시오\n");
		System.out.print("숫자 입력: ");
		
		int num =Integer.parseInt(reader.readLine());
		
				
		int evenSum = 0;
		int oddSum = 0;
		
		while (num > 0) {
			if (num % 10 % 2 == 0) {
				evenSum += num % 10;
			} else {
				oddSum += num% 10;
			}
			
			num /= 10;
		}
		System.out.printf("짝수의 합: %d\n", evenSum);
		System.out.printf("홀수의 합: %d\n", oddSum);
		
		
		
	}
	
	

}
