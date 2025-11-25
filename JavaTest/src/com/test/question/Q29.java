package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q29 {
		
	public static void main(String[] args) throws NumberFormatException, IOException {
			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 숫자: ");
		int firstNum = Integer.parseInt(reader.readLine());
		
		System.out.print("두번째 숫자: ");
		int secondNum = Integer.parseInt(reader.readLine());
		
		System.out.print("연산자: ");
		String buho = (reader.readLine());
		
		int plus = firstNum + secondNum;
		int sub = firstNum - secondNum;
		int multi = firstNum * secondNum;
		double divide = (double)firstNum / secondNum;
		int divide2 = firstNum % secondNum;
		
		if (buho.equals("+")) {
			System.out.printf("%d %s %d = %d", firstNum, buho, secondNum, plus);
		} else if (buho.equals("-")) {
			System.out.printf("%d %s %d = %d", firstNum, buho, secondNum, sub);
		} else if (buho.equals("*")) {
			System.out.printf("%d %s %d = %d", firstNum, buho, secondNum, multi);
		} else if (buho.equals("/")) {
			System.out.printf("%d %s %d = %.1f", firstNum, buho, secondNum, divide);
		} else if (buho.equals("%")) {
			System.out.printf("%d %s %d = %d", firstNum, buho, secondNum, divide2);
		} else {
			System.out.println("연산이 불가능합니다.");
		}
		
		
		}

}
