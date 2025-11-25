package com.test.question;

import java.io.File;

public class Q119 {
	
	public static void main(String[] args) {
//		경로 지정
//		모든 파일 읽기
//		이름, 년도 파싱
//		폴더 생성 (mkdir)
//		파일 이동 (renameTo)
		
		m1();
		//m2();
		
		
	}

	private static void m2() {
		String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\직원";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		
		
		
		
		
		
		
		
	}

	public static void m1() {
		String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\직원";
		File dir = new File(path);
		
		File[] list = dir.listFiles();
		
		for (File file: list) {
			String filename = file.getName();
			String[] temp = filename.split("_");
			
			File namedir = new File(path + "\\" + temp[0]);
			if(!namedir.exists()) {
				namedir.mkdir();
			}
			
			File yeardir = new File(path + "\\" + temp[0] + "\\" + temp[1]);
			if(!yeardir.exists()) {
				yeardir.mkdir();
			}
			
			File movefile =  new File(path + "\\" + temp[0] + "\\" + temp[1] + "\\" + filename);
			file.renameTo(movefile);
			
			System.out.println(movefile.getAbsolutePath());
			
		}
		
		System.out.println("complete");
	}

}



