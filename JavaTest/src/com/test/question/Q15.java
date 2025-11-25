package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q15 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		
		System.out.print("맑은 날: ");
		int sunny = Integer.parseInt(reader.readLine());
		
		System.out.print("흐린 날: ");
		int cloudy = Integer.parseInt(reader.readLine());
		
		int result = getApple(sunny, cloudy);
		System.out.printf("사과가 총 %d개 열렸습니다.\n", result);
		
		
	}

	private static int getApple(int sunny, int cloudy) {
		int length = sunny * 5 + cloudy * 2; // 총길이
		return (length < 100) ? 0 : (length - 100) / 10; // 몫만
		
		
	}

}
