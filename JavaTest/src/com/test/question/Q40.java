package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q40 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("시작 숫자: ");
		int start = Integer.parseInt(reader.readLine());
		
		System.out.print("마지막 숫자: ");
		int end = Integer.parseInt(reader.readLine());
		
		int sum = 0;
		String txt = "";
		
		for (int i=start; i<=end;i++) {
			if (i % 2 ==1) {
				sum += i;
				txt += i;
				if (i < end) txt += "-";
			} else {
				sum -= i;
				txt += i;
				if (i <end) txt += "+";
			}
		}
		System.out.println(txt + "=" + sum);
	}

}
