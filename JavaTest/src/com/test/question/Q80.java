package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q80 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문장입력: ");
		String result = reader.readLine();
		String sum = "";
		
		for (int i=result.length()-1; i>=0;i--) {
			
			result.charAt(i);
			sum +=result.charAt(i);
			
			
		}
		System.out.println(sum);
		
		
	}

}
