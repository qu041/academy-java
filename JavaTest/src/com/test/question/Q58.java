package com.test.question;

public class Q58 {
	
	public static void main(String[] args) {
		
		int sum = 0; 
		for(int i=10; i<=100; i+=10) {
			sum = 0;
			for (int j=i-9; j<=i; j++) {
				sum += j;
			}
			
			System.out.printf("%2d ~ %3d: %4d\n", i-9, i, sum);
		}
	}


}
