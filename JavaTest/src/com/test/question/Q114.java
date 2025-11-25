package com.test.question;

import java.io.File;
import java.util.HashMap;
import java.util.Set;

public class Q114 {
	
	public static void main(String[] args) {
		
		String path = "C:\\Users\\user\\Downloads\\파일 디렉토리 문제\\확장자별 카운트";
		File dir = new File(path);
		
		HashMap<String, Integer> count = new HashMap<String, Integer>();
		
		File[] list = dir.listFiles();
		
		for (File file : list) {
			String ext = file.getName().substring(file.getName().lastIndexOf(".") + 1);
			
			if (count.containsKey(ext)) {
				count.put(ext, count.get(ext) + 1 );
			} else {
				count.put(ext, 1);
			}
			
		}
		
		System.out.println(count);
		
		Set<String> keys = count.keySet();
		
		for (String key : keys) {
			System.out.printf("*.%s: %d개\n", key, count.get(key));
		}
		
	}

}
