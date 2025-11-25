package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q44 {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		int sum = 0;
		String formula = "";
		
		while (true) {
			System.out.print("숫자: ");
			int num = Integer.parseInt(reader.readLine());
			
//			if (formula.isEmpty()) {
//				if (num % 2 == 0) {
//					sum += num;
//					formula += num;
//				} else {
//					sum -= num;
//					formula += "-" + num;
//				} 
//			} else {
//				if (num % 2 == 0) {
//					sum += num;
//					formula += "+" + num;
//			} else {
//				sum -= num;
//				formula += "-" + num;
			if (num % 2 == 0) {
			    sum += num;
			    formula += " + " + num;
			} else {
			    sum -= num;
			    formula += " - " + num;
			}

			
		
		
	
		if (sum > 100) {
			break;
		}
			
			
		}
	
		System.out.printf("%s = %d\n", formula, sum);
		
	
}

}
