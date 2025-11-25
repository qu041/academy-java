package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q12 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
				
		System.out.print("숫자: ");
		
		 	int n1 = Integer.parseInt(reader.readLine());
			
		String result1 = getNumber(n1);
		
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n1, result1);
		
		System.out.print("숫자: ");
		
		int n2 = Integer.parseInt(reader.readLine());
		
		String result2 = getNumber(n2);
		
		System.out.printf("입력하신 숫자 '%d'는(은) '%s'입니다.\n", n2, result2);
		
		
		
	}

	private static String getNumber(int n) {
		return (n % 2 == 0) ? "짝수" : "홀수";
		
	}

}
