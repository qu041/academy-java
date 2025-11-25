package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q27 {
	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자: ");
		String input = reader.readLine();
		char word = input.charAt(0); //첫글자만 사용
		
		if (word == 'f' || word == 'F') {
			System.out.println("Father");
		} else if (word == 'm' || word == 'M') {
			System.out.println("Mother");
		} else if (word == 'b' || word == 'B') {
			System.out.println("Brother");
		} else if (word == 's' || word == 'S') {
			System.out.println("Sister");
		} else {
			System.out.println("입력한 문자가 올바르지 않습니다.");
		}
		
		
	}

}
