package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q03 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("너비(cm): ");
		String input1 = reader.readLine();
		
		System.out.print("높이(cm): ");
		String input2 = reader.readLine();
		
		int n1 = Integer.parseInt(input1);
		int n2 = Integer.parseInt(input2);
		
		int result1 = n1 * n2;
		int result2 = n1 * 2 + n2 * 2;
		
		System.out.println("사각형의 넓이는" + result1 +"cm\u00B2입니다.");
		System.out.println("사각형의 둘레는" + result2 +"cm입니다.");
			
		
		
		
		
		
		
		
	}
}
