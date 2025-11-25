package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q30 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자: ");
		char word = reader.readLine().charAt(0);
		
		if ('a' <= word && word <= 'z') {
			char upper = (char)(word - 32);
			System.out.printf("'%c'의 대문자는 '%c'입니다.", word, upper);
		} else if ('A'<= word && word <='Z') {
			char lower = (char)(word + 32);
			System.out.printf("'%c'의 소문자는 '%c'입니다." , word, lower);
		} else {
			System.out.println("영문자만 입력하시오.");
		
				
				
			}
			
		}
	}


