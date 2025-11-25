package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q38 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int num = 0;
		int odd = 0;
		int even = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		
		System.out.print("입력횟수: ");
		int hs = Integer.parseInt(reader.readLine()); 
		
		
		for (int i=0; i<hs; i++) {
			System.out.print("숫자: ");
			num = Integer.parseInt(reader.readLine());
			
			if (num % 2 == 0) {
				even ++;
				evenSum += num;
			} else {
				odd ++;
				oddSum += num;
			}
			
			
			
			
		}
		
		System.out.printf("짝수 %d개의 합: %d\n", even, evenSum);
		System.out.printf("홀수 %d개의 합: %d\n", odd, oddSum);
		
		
	}


}
