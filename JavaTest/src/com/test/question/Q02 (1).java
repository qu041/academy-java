package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q02 {
	
	public static void main(String[] args) throws IOException {
		
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: "); //
		String input1 = reader.readLine();
		
		System.out.print("두번째 숫자: "); //
		String input2 = reader.readLine();
		
		double n1 = Double.parseDouble(input1);
		double n2 = Double.parseDouble(input2);
		
		double result1 = n1 + n2;
		double result2 = n1 - n2;
		double result3 = n1 * n2;
		double result4 = n1 / n2;
		double result5 = n1 % n2;
		


		System.out.printf("%,.0f + %,.0f = %,.0f\n", n1, n2, result1);
		System.out.printf("%,.0f - %,.0f = %,.0f\n", n1, n2, result2);
		System.out.printf("%,.0f * %,.0f = %,.0f\n", n1, n2, result3);
		System.out.printf("%,.0f / %,.0f = %,.1f\n", n1, n2, result4);
		System.out.printf("%,.0f %% %,.0f = %,.0f\n", n1, n2, result5);


		
		
	
		
		
		
		
		
		
		
	}

}
