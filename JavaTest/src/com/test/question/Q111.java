package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q111 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("폴더선택: ");
		String path = scan.nextLine();
		
		System.out.print("파일 확장자: ");
		String ext = scan.nextLine();
		
		scan.close();
		
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			if (file.getName().toLowerCase().endsWith(ext.toLowerCase())) {
				System.out.println(file.getName());
			}
		}
		
		
		
	}

}
