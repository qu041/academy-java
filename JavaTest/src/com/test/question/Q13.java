package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q13 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("국어: ");
		int kor =Integer.parseInt(reader.readLine());
		
		System.out.print("영어: ");
		int eng =Integer.parseInt(reader.readLine());
		
		System.out.print("수학: ");
		int math =Integer.parseInt(reader.readLine());
		
		String result = test(kor, eng, math);
		System.out.printf("%s입니다.\n", result);
	
	}

	private static String test(int kor, int eng, int math) {
		String result;
		
		result = ((kor + eng + math) / 3.0 >= 60) ? "합격" : "불합격";
		result = (kor < 40 || eng < 40 || math < 40) ? "불합격" : result;
		
		return result;
		
	}

}
