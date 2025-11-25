package com.test.question;

import java.io.File;
import java.util.Scanner;

public class Q112 {
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\aaa\\aaa.txt";
		String path2 = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\bbb\\aaa.txt";
		
		File file1 = new File(path1);
		File file2 = new File(path2);
		System.out.println("파일 이동을 실행합니다.");
		
		if (!file2.exists()) {
			file1.renameTo(file2);
			System.out.println("파일 이동을 완료했습니다.");
			
		} else {
			System.out.print("같은 이름을 가진 파일을 이미 가지고 있습니다. 덮어쓸까요?(y/n): ");
			Scanner scan = new Scanner(System.in);
			if (scan.nextLine().equals("y")) {
				file2.delete();
				file1.renameTo(file2);
				System.out.println("파일이동을 완료했습니다.");
			} else {
				System.out.println("작업을 취소합니다.");
			}
			scan.close();
		}
		
		
	}

}
