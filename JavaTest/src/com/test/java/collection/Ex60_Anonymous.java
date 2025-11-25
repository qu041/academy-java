package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ex60_Anonymous {
	
	public static void main(String[] args) {
		
		//Ex60_Anonymous.java
		/*
		 
	 	Collection 인터페이스 (Map은 안들어감)
	 	- List 인터페이스
	 	- Set  인터페이스
	 
	 */
		m1();
		m2();
		
		
		
		
		
		
		
		
	}

	private static void m2() {
		
		/*
		 
		 	익명 클래스, Anonymous Class
		 	- 익명 객체, Anonymous Object
		 	- 이름 없는 클래스
		 	
		 	프로젝트 진행시 (우리가 진행해도) 프로젝트 일주일 :클래스 200~300개
		 	-수많은 클래스 > 관리 문제(작명, 패키지수 증가)
		 	
		 	실명 클래스
		 	- 객체를 여러개 만들 수 있다.
		 	- 클래스를 관리 o 
		 	익명 클래스
		 	- 객체를 딱 1개만 만들 수 있다.
		 	- 클래스를 관리 x
		 	
		 	
		 */
		
		//요구사항] 인터페이스를 구현 클래스 선언하기 > 객체를 생성 > 사용
		//1. 본인 타입의 참조 변수를 만들기 //갤럭시24
		//추가조건] ***** 객체가 딱 1개가 필요 (재사용 필요없을떄, 일회성 사용)
		BBB b1 = new BBB();
		b1.test();
		b1.bbb();
		
		//2. 부모 타입의 참조 변수를 만들기 //스마트폰
		AAA b2 = new BBB(); //업캐스팅
		b2.test();
		//b2.bbb();
		
		//3. 
		//인터페이스는 객체를 만들수 없다. > 추상 메서드 때문에..
		//AAA b3 =  new AAA(); 
		//Cannot instantiate the type AAA
		//must implement the inherited abstract method AAA.test() // {}; 입력시 > 클래스 선언부
		//익명 클래스 선언(인터페이스 상속) + 익명 클래스의 객체 생성
		AAA b3 =  new AAA() {
			@Override
			public void test() {
				
				System.out.println("익명 객체의 추상 메서드 구현");
			}
			
//			public void ccc() {							//자체멤버는 구성 못함
//				System.out.println("자신만의 멤버");   //인터페이스의 추상메서드만 구현가능.
//			}
				
			};
			b3.test();
			
			
		
		
		
		
		
		
		
	}

	private static void m1() {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("강아지");
		list.add("고양이");
		list.add("병아리");
		
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		map.put("red", "사과");
		map.put("yellow", "바나나");
		map.put("blue", "블루베리");
		map.put("green", "블루베리");
		
		HashSet<String> set = new HashSet<String>();
		
		set.add("키보드");
		set.add("마우스");
		set.add("모니터");
		
		//컬렉션(배열)의 변환
		//- List > Set
		//- Set > Set
		//- Map > Set
		
		//list > set
		//? 중복값 제거
		list.add("강아지");
		list.add("고양이");
		System.out.println(list);
		
		//Collection <? extends String>
		//Collection <String>
		HashSet<String> set2 = new HashSet<String>(list);  //변환 ArrayList -> HashSet 변환
		System.out.println(set2);
		
		//set -> list
		//? 중복값 허용 & 순서가 필요 ?LinkedSet?
		
		System.out.println(set);
		
		ArrayList<String> list2 = new ArrayList<String>(set);
		list2.add("모니터");
		System.out.println(list2);
		System.out.println(list2.get(2));
		
		//map(Key, value) > (X) List, Set (index, value), Set(value)
		
		//map(key) > set (key/set 둘다 중복 x) 안성맞춤. //무조건 set으로 먼저 바꿔야됨
		//map(key) > set > list //무조건 set으로 먼저 바꿔야됨
		
		Set<String> keys = map.keySet();
		System.out.println(keys);
		
		//map(value) > set (X)
		//map(value) > Collection(list) (O) 값은 중복을 허용
		Collection<String> values = map.values();
		System.out.println(values);
		
		//List(index, value) > 수동 > map(key, value)
		//map은 키로 숫자를 잘 안씀, 쓸거면 arrayList를 많이씀.
		
		System.out.println(list);
		
		HashMap<Integer, String> map3 = new HashMap<Integer, String>();
		
		for (int i=0; i<list.size(); i++) {
			map3.put(i, list.get(i));
		}
		
		System.out.println(map3);
		System.out.println(map3.get(0));
		System.out.println(map3.get(2));
		
		HashMap<String, String> map4; //HashMap을 잘 살리는건 String밖에 없음
		HashMap<Integer, String> map5; //써도 되긴 함
		HashMap<Double, String> map6; // 써도 되긴 함
		HashMap<Boolean, String> map7; // 써도 되긴 함
		
		String[] arr1 = { "빨강", "노랑", "파랑" };
		
		//array > arrayList
		//? 길이가 가변(x) -> 길이고정(o)
		//진짜 arraylist로 만들려면 1대1 깊은복사 포문 돌려야 됨.
		List<String> list3 = Arrays.asList(arr1);
		System.out.println(list3);
		System.out.println(list3.get(0));
		
		//list3.add("주황"); 
		//list3.remove(0);
		
		List<String> list4 =  new ArrayList<String>();
		
		for (String item : arr1) {
			list4.add(item);
		}
		
		System.out.println(list4);
		
		list4.add("주황");
		System.out.println(list4);
		
		//list -> 순수배열로
		Object[] arr2 = list.toArray();
		//String[] arr3 = (String[]) arr2;
		String[] arr3 = list.toArray(new String[0]);
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		
		
		
		
		
		
		
	}

}

interface AAA {
	void test();
}

class BBB implements AAA {
	
	public int b;
	
	public void bbb() {
		System.out.println("클래스 스스로 추가한 멤버");
	}
	@Override
	public void test() {
		System.out.println("추상 메서드를 구현");
	}
}









