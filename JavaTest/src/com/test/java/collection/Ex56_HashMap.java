package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap.KeySetView;

public class Ex56_HashMap {
	
	public static void main(String[] args) {
		
		//Ex56_HashMap.java
		/*
		 	1. List > ArrayList
		 	2. Map > HashMap
		 
		 	ArrayList
		 	- 요소 접근 > 첨자(index) 사용 > 방번호
		 	- 순서가 있는 집합(방번호 == 요소의 순서) > 루프 사용가능
		 	ex) 1강의실,2....
		 	- 스칼라 배열(Scalar Array)
		 	- 요소(Element) = 첨자(index) + 값(value)
		 	- 첨자(index)는 유일하다
		 	- 값(Value)은 중복이 가능하다 > 방번호(index)가 유일하기 때문에
		 	
		 	HashMap
		 	- 요소 접근 > 첨자 X , 키(Key) 사용 > 방이름
		 	- 순서가 없는 집합
		 	ex) 햇님반, 달님반 ....
		 	- 연관 배열, 사전 구조(Dictionary)
		 	- 요소(Element) = 키(Key) + 값(Value)
		 	- 키(Key)는 유일하다. > 값(Value)은 중복이 가능하다
		 
		 */
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() { //특이한 경우에 씀
		
		// Map > Loop 돌릴 수  있는 경우가 있음.
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("red", "장미꽃");
		map.put("yellow", "개나리꽃");
		map.put("blue", "라일락");
		
		Set<String> set = map.keySet(); 
		System.out.println(set);
		
		for (String key : set) {
			System.out.println(key);
		}
		
		Collection<String> values = map.values();
		
		System.out.println(values);
		
		for (String value : values) {
			System.out.println(value);
		}
		
		for (String item : set) {
			System.out.println(item + ":" + map.get(item));
		}
		
		
		
	}

	private static void m2() {
		
		HashMap<String, String> map = new HashMap<String, String>();
		
			//1. 요소 추가
			map.put("red", "장미꽃");
			map.put("yellow", "개나리꽃");
			map.put("blue", "라일락");
			
			//2. 요소 갯수
			map.size();
			System.out.println(map.size());
			
			//3. 요소 읽기
			System.out.println(map.get("red"));
			System.out.println(map.get("blue"));
			//4. 요소 수정
			map.put("blue", "창포꽃");
			System.out.println(map.get("blue"));
			
			//5. 요소 삭제
			map.remove("blue");
			System.out.println(map);
			System.out.println(map.size());
			System.out.println(map.get("blue"));
			
			//6. 요소 검색
			System.out.println(map.containsKey("red"));
			System.out.println(map.containsValue("라일락"));
			
			//7. 초기화
			map.clear();
			System.out.println(map);
	
	
	}

	private static void m1() {
		
		//학생 1명의 국어, 영어, 수학 점수 저장 > 어떤 집합?
		//1. 배열
		//2. ArrayList
		//3. HashMap
		//4. Class
		
		//1. 배열
		//- 집합
		
		int[] s1 = new int[3];
		
		s1[0] = 100;
		s1[1] = 90;
		s1[2] = 80;
		
		System.out.println(s1[0] + s1[1] + s1[2]); //루프(장점) //과목알기 어려움
		
		//2. ArrayList
		//- 집합
		ArrayList<Integer> s2 =  new ArrayList<Integer>();
		
		s2.add(100);
		s2.add(90);
		s2.add(80);
		
		System.out.println(s2.get(0) + s2.get(1) + s2.get(2)); //루프 (장점) //과목알기 어려움
		
		//3. HashMap
		//- 집합
		//- 방번호 x > 방이름 o > 가독성 높음, 루프 불가능
		HashMap<String, Integer> s3 = new HashMap<String, Integer>();
		
		s3.put("kor", 100);
		s3.put("eng", 90);
		s3.put("math", 80);
		
		System.out.println(s3.get("kor") +s3.get("eng") + s3.get("math")); // 루프 안됨 //
		
		//4. Class
		//- 집합
		//- 방번호 x > 방이름 o > 가독석 높음, 루프불가능
		Score s4 = new Score();
		
		s4.setKor(100);
		s4.setEng(90);
		s4.setMath(80);
		
		System.out.println(s4.getTotal());
		
			/*
			 
			 	데이터 집합
			 	1. 순서대로 관리 or 루프 처리
			 		- 순수 배열 > 길이 고정
			 		- List > 길이 가변
			 		
			 
			 	2. 가독성 높은 관리(데이터 의미 명확)
			 		-Map > 초기 비용 없음 (x) > 일회용 > 가내수공업 
			 		-Class > 초기 비용 발생 (o) > N회용 > 공장
			 
			 */
		
		//지도 좌표
		HashMap<String, Integer> p1 = new HashMap<String, Integer>();
		
		p1.put("x", 100);
		p1.put("y", 200);
		
		System.out.println(p1); //{x=100,y=200}
		
		HashMap<String, Integer> p2 = new HashMap<String, Integer>();
		
		p2.put("lat", 300);
		p2.put("lng", 400);
		
		System.out.println(p2);

		HashMap<String, Integer> p3 = new HashMap<String, Integer>();
		
		p3.put("lt", 300); //오타 발생 가능
		p3.put("lg", 400);
		
		System.out.println(p3);
		
	}

}


