package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q01 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("태어난 년도: "); //
		
		String input1 = reader.readLine();
		
		int n1 = Integer.parseInt(input1);
		
		System.out.println("나이: " + (2025 - n1) + "세");
		
		
		
		
		
		
		
	}

}
