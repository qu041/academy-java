package com.test.question;

public class Q16 {
	
	public static void main(String[] args) {
	
		int n1 = 10,
		    n2 = 20,
		    n3 = 30,
		    n4 = 40,
		    n5 = 50;
		
		sum(n1);
		sum(n1, n2);
		sum(n1, n2, n3);
		sum(n1, n2, n3, n4);
		sum(n1, n2, n3, n4, n5);
		
		
	}

	private static void sum(int n1) {
		
		int sum = n1;
		
		System.out.printf("%d = %d\n",sum, n1);
		
	}
	
	private static void sum(int n1, int n2) {
		
		int sum = n1 + n2;
		
		System.out.printf("%d + %d = %d\n",n1, n2, sum);
		
	}
	private static void sum(int n1, int n2, int n3) {
		
		int sum = n1 + n2 + n3;
		
		System.out.printf("%d + %d + %d = %d\n",n1, n2, n3, sum);
		
	}
	private static void sum(int n1, int n2, int n3, int n4) {
		
		int sum = n1 + n2 + n3 + n4;
		
		System.out.printf("%d + %d + %d + %d = %d\n",n1, n2, n3, n4, sum);
		
	}
	private static void sum(int n1, int n2, int n3, int n4, int n5) {
		
		int sum = n1 + n2 + n3 + n4 + n5;
		
		System.out.printf("%d + %d + %d + %d + %d = %d\n",n1, n2, n3, n4, n5, sum);
		
	}


}
