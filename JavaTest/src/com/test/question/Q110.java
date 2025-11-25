package com.test.question;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q110 {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("파일 경로: ");
		String path = reader.readLine();
		
		File file = new File(path);
		
		System.out.printf("파일명: %s\n",file.getName());
		System.out.printf("종류: %s\n",file.getName().substring(file.getName().lastIndexOf(".") + 1));
		System.out.printf("파일 크기: %s\n",getSize(file.length()));
		
		
		
	}

	private static String getSize(long length) {
		if (length < 1024) {
			return length + "B";
		} else if (length < 1024 * 1024) {
			return String.format("%.1f",length / 1024.0) + "KB";
		} else if (length < 1024 * 1024 * 1024) {
			return String.format("%.1f",length / 1024.0 / 1024.0) + "MB";
		} else if (length < 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f",length / 1024.0 / 1024.0 / 1024.0) + "GB";
		} else if (length < 1024 * 1024 * 1024 * 1024 * 1024) {
			return String.format("%.1f",length / 1024.0 / 1024.0 / 1024.0 / 1024.0) + "TB";	
		} 
		
		return "";
	}
	
	}

