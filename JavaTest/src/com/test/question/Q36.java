package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q36 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int sNum = Integer.parseInt(reader.readLine());
		System.out.print("종료 숫자: ");
		int fNum = Integer.parseInt(reader.readLine());
		System.out.print("증감치: ");
		int plus = Integer.parseInt(reader.readLine());
		
		for (int i = sNum; i<=fNum; i+=plus ) {
			System.out.println(i);
		}
		
		
	}

}
