package com.test.question;

public class Q41 {
	
	public static void main(String[] args) {
		
		int sum = 0;
		
		for (int i=1;; i++) {
			sum += i;
			
			if (i == 1) {
				System.out.print(i);
			} else {
				System.out.print("+" + i);
			}
		
			if (sum > 1000) {
				System.out.print("=" + sum);
				break;
			}
		}
		
		
	}

}
