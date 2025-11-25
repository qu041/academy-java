package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q11_2 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		//ctrl + shift + o'
		
		System.out.print("첫번째 숫자: ");
		
		int n1 = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		
		int n2 = Integer.parseInt(reader.readLine());
		
		String result;
		
		result  = add(n1, n2);
		
		
		
	
	}

	private static String add(int n1, int n2) {
		// TODO Auto-generated method stub
		return null;
	}

}
