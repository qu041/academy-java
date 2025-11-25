package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q61 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int num = 0;
		int[] nums = new int[5];
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		for (int i=0; i<=nums.length-1;i++) { //입력 for문
			System.out.print("숫자: ");
			num = Integer.parseInt(reader.readLine());
			
			nums[i] = num;
			
		}
		
		for (int i=nums.length-1; i>=0; i--) {
			System.out.printf("nums[%d] = %d\n", i, nums[i]);
		}
		
		
	}

}
