package com.test.java.collection;

import java.io.FileOutputStream;
import java.util.Hashtable;
import java.util.Properties;
import java.util.Vector;

public class Ex65 { //이건 안해도/ 됨 까먹어도 됨 / 앞에꺼 열심히 해야됨/ 앞에 세개만 잘해도 컬렉션 쓰는데 충분하다!!!!
						//어레이ㅅ리스트 , 해쉬셋, 해쉬맵 세개를 말하는 거임.
	public static void main(String[] args) {
		
		//Ex65.java
		/*
		 
		 	- Vector > ArrayList 대체됨
		 	- HashTable > HashMap 대체됨
		 	- Properties
		 	
		 
		 
		 
		 */
		
			//m1();
			m2();
		
		
		}

	private static void m2() {
			
			//어떤 옵션들이나 상태값을 저장하는 용도
			//
			Properties prop = new Properties();
			
			prop.put("color", "red");
			prop.put("font", "JetBrains");
			
			System.out.println(prop.get("color")); //형변환시 다운캐스팅 필요
			//legacy (취소선) - 언제 사라질지 모름.
			try {
				prop.save(new FileOutputStream(".\\setting.ini"), "환경설정 저장");
				
			} catch (Exception e) {
				System.out.println("Ex65.m2");
				e.printStackTrace();
			}
			
	
	}
	private static void m1() {
		
		//ArrayList vs Vector
		//- 동기화 지원, 스레드 안전(safe)
		//- ArrayList(빠름)
		
		Vector<String> list =  new Vector<String>();
		
		list.add("하나");
		System.out.println(list.get(0));
		System.out.println(list.size());
		
		//HashMap vs HashTable
		//- 동기화 지원, 스레드 안전(safe)
		
		Hashtable<String, Integer> map = new Hashtable<String, Integer>();
		map.put("kor", 100);
		System.out.println(map.get("kor"));
		System.out.println(map.size());
		
		//요약
		//- Vector, Hashtable은 동기화되어 멀티스레드 환경에서 안전하다. 하지만 느리다.
		
		//- ArrayList, HashMap은 동기화가 없어 빠르며, 멀티스레드 환경에서 별도의 동기화가 필요하다.
				// > 최신 자바(JDK1.2 1998년);;;;
		
	}

}
