package com.test.question;

import java.io.File;
import java.util.HashMap;

public class Q117 {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\폴더 삭제";
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		count.put("file", 0);
		count.put("directory", 0);
		
		File dir = new File(path);
		
		deleteFile(dir, count);
		
		System.out.printf("폴더를 삭제했습니다.\r\n삭제된 풀더는 %d개이고 파일은 %d개입니다."
								,count.get("directory"),count.get("file"));
		
		
		
		
		
	}

	private static void deleteFile(File dir, HashMap<String, Integer> count) {
		File[] list = dir.listFiles();
		for (File file : list) {
			if (file.isFile()) {
				count.put("file", count.get("file")+1);
				file.delete();
			}
		}
		
		for (File subdir : list) {
			if (subdir.isDirectory()) {
				deleteFile(subdir, count);
				
			}
		}
		count.put("directory", count.get("directory") + 1);
		dir.delete();
		
	}

}
