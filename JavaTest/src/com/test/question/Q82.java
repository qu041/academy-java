package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q82 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("숫자: ");
		String num = reader.readLine();
		int sum = 0;					//숫자와 문자로 쪼개서 계산	
		String result = "";				//문자로 한글자씩 추출해서 parseint
		
		for (int i=0; i<num.length(); i++) {
			sum += Integer.parseInt(num.substring(i, i+1));
			result += num.substring(i, i+1); 
			
			if (i < num.length()-1) {
				result += " + ";
			}
		}
		
		System.out.printf("결과: %s = %d\n", result, sum);
		
		
	}

}
