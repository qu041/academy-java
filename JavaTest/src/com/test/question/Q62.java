package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Q62 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("학생수: ");
		int count = Integer.parseInt(reader.readLine());
		
		String[] names = new String[count];
		
		for (int i=0; i<count;i++) {
			System.out.print("학생명: ");
			names[i] = reader.readLine();
			
		}
		
		Arrays.sort(names);
		
		System.out.printf("입력한 학생은 총 %d명입니다.\n", count);
		
		for (int i = 0; i <names.length; i++) {
			System.out.printf("%d. %s\n", i+1, names[i]);
		}
		
		
	}

}
