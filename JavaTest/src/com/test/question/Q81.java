package com.test.question;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q81 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("이메일: ");
		String mAdress = reader.readLine();
		
		//아이디: @를 찾아서 0까지 추출 
		//도메인: @를 찾아서 length까지 추출
		
		//찾는법? -> indexOf .length .substring 사용하면 될듯
		int length = mAdress.length();
		int tem1 = mAdress.indexOf("@");
		
		System.out.println("아이디: " + mAdress.substring(0,tem1)); 
		System.out.println("아이디: " + mAdress.substring(tem1+1,length)); 
		
		
	}
}
