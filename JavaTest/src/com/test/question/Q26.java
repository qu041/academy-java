package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q26 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
	
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	System.out.print("점수: ");
	int score = Integer.parseInt(reader.readLine());
	
	if (90 <= score && score <= 100) {
		System.out.printf("입력한 %d점은 성적 A입니다.", score);
	} else if (80 <= score && score <= 89) {
		System.out.printf("입력한 %d점은 성적 B입니다.", score);
	} else if (70 <= score && score <= 79) {
		System.out.printf("입력한 %d점은 성적 C입니다.", score);
	} else if (60 <= score && score <= 69) {
		System.out.printf("입력한 %d점은 성적 D입니다.", score);
	} else if (0 <= score && score <= 59) {
		System.out.printf("입력한 %d점은 성적 F입니다.", score);
	} else {
		System.out.println("점수가 올바르지 않습니다. 0~100사이의 값을 입력하시오.");
	}
	
	
	
	
	
	}
}
