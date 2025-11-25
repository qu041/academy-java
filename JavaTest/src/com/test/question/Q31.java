package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q31 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int odd = 0;
		int even = 0;
		
		System.out.print("숫자입력: ");
		int num =Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		
		System.out.print("숫자입력: ");
			num =Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			
			System.out.print("숫자입력: ");
			num =Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			
			System.out.print("숫자입력: ");
			num =Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
			
			System.out.print("숫자입력: ");
			num =Integer.parseInt(reader.readLine());
			if (num % 2 == 0) {
				even++;
			} else {
				odd++;
			}
		 
			System.out.printf("짝수는 %d개 홀수는 %d개 입력했습니다\n", even, odd);
			
			if (even > odd) {
				System.out.printf("짝수가 홀수보다 %d개 더 많습니다.", even - odd);
			} else  {
				System.out.printf("홀수가 짝수보다 %d개 더 많습니다.", odd - even);
			}
			
	}

}
