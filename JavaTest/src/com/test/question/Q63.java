package com.test.question;

public class Q63 {
	
	public static void main(String[] args) {
		
		int[] list = new int[4];
		list[0] = 10;
		list[1] = 20;
		list[2] = 30;
		list[3] = 40;
		
		String result = dump(list);
		
		System.out.printf("nums = %s\n", result);
		
	
		
	}

	public static String dump(int[] list) {
		
		String temp = "[ ";
		for (int i=0; i<list.length; i++) {
			temp += list[i];
			
			if (i <list.length-1) {
				temp +=", ";
			}
			
		}
		temp += " ]";
		return temp;
		
		
	}

	

}
