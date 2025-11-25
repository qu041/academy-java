package com.test.java.collection;

import java.util.TreeMap;

public class Ex64_TreeMap {

	public static void main(String[] args) {
		
		//Ex64_TreeMap.java
		/*
		 
		 	TreeMap
		 	- Tree(이직 탐색 트리) + Map(키,값)
		 	 
		 	
		 */
		
		TreeMap<String,String> map = new TreeMap<String, String>();
		
		map.put("red","사과");
		map.put("orange","귤");
		map.put("yellow","바나나");
		map.put("green","아보카도");
		map.put("blue","블루베리");
		
		System.out.println(map);  //key로 자동정렬
		
		System.out.println(map.get("yellow"));
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		System.out.println(map.headMap("m"));
		System.out.println(map.tailMap("m"));
		System.out.println(map.subMap("f", "q"));
		
		
		
		
	}
}
