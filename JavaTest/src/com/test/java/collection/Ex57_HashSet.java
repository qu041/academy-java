package com.test.java.collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Ex57_HashSet {

	public static void main(String[] args) {

		//Ex57_HashSet.java
		/*
			
			1. List
				- 순서가 있는 집합
				- 첨자(방번호)
				- 데이터 중복을 허용
			
			2. Map
				- 순서가 없는 집합
				- 키(방이름)
				- 데이터 중복을 허용
			
			3. Set
				- 순서가 없는 집합
				- 식별자가 없다.(방번호(X), 방이름(X)) > 방을 구분할 수 없다.
				- 데이터 중복을 허용 안함(***)
				
			
			
		*/
		
		//m1();
		//m2();
		//m3();
		//m4(); //덩치 큰 프로젝트 관련
		m5();
		
	}//main

	private static void m5() {
		
		
		//사람들 중 동명이인 없음
		HashSet<Member> group = new HashSet<Member>();
		
		group.add(new Member("홍길동",20));
		group.add(new Member("아무개",25));
		group.add(new Member("하하하",21));
		group.add(new Member("홍길동",20));
		
		System.out.println(group);
		
		
	}

	private static void m4() {
		
		//주의!!!! set을 다루다 보면 생기는 상황 클래스랑 연관있음 객체 !
		//set은 얕은 비교만 함. 힙까지 안가고 스택에서 주소값만 비교함.
		//깊은 비교 하려면 두메서드를 오버라이딩 해야됨 hashCode()랑 equals() 임.
		Member m1 = new Member("홍길동",20);
		Member m2 = new Member("아무개",25);
		Member m3 = new Member("홍길동",20);
		Member m4 = m1;
		
		//m1과 m3가 같은 사람 ?
		System.out.println(m1.equals(m3));
		System.out.println(m1.equals(m4));
		
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		System.out.println(m3.hashCode());
		
		
	}

private static void m3() {
		
		//마트 경품 추천
		//- 중복 당첨 허용O
		//- 중복 당첨 허용X
		
		String[] list = { "홍길동", "아무개", "강아지", "고양이", "병아리", "사자", "호랑이", "팬더", "까치", "참새" };
		Random rnd = new Random();
		
		//- 중복 당첨 허용O > 당첨자 명단
		ArrayList<String> result1 = new ArrayList<>();
		
		//추첨
		for (int i=0; i<5; i++) {
			result1.add(list[rnd.nextInt(list.length)]);
		}
		
		System.out.println(result1);
		
		
		//- 중복 당첨 허용X > 당첨자 명단
		HashSet<String> result2 = new HashSet<String>();
		
		//추첨
		while (result2.size() < 5) {
			result2.add(list[rnd.nextInt(list.length)]);
		}
		
		System.out.println(result2);
		
	}

	private static void m2() {
		
		//로또 번호 > 난수 + 유일한 번호들
		
		Random rnd = new Random();
		
		//Case 1.
		ArrayList<Integer> lotto = new ArrayList<Integer>();
		
//		for (int i=0; i<6; i++) {
//			
//			int n = rnd.nextInt(45) + 1; //1~45
//			
//			//중복 검사
//			if (!lotto.contains(n)) {
//				lotto.add(n);				
//			} else {
//				i--;
//			}
//			
//		}
		
		while (lotto.size() < 6) {
			
			int n = rnd.nextInt(45) + 1; //1~45
			
			//중복 검사
			if (!lotto.contains(n)) {
				lotto.add(n);				
			}
			
		}
		
		System.out.println(lotto);
		
		//Case 2.
		HashSet<Integer> lotto2 = new HashSet<Integer>();
		
		while (lotto2.size() < 6) {
			
			int n = rnd.nextInt(45) + 1;
			lotto2.add(n);
			
		}
		
		System.out.println(lotto2);
				
	}

	private static boolean check(ArrayList<Integer> lotto, int n) {
		
		return !lotto.contains(n);
	}

	private static void m1() {
		
		HashSet<String> set = new HashSet<String>();
		
		//1. 요소 추가
		set.add("사과");
		System.out.println(set.add("바나나")); //true
		set.add("딸기");
		System.out.println(set.add("바나나")); //false
		
		//2. 요소 개수
		System.out.println(set.size());
		System.out.println(set);
		System.out.println();
		
		//3. 요소 읽기 > 방 구분 불가능 > 원하는 요소 추출 불가능;;
		//- 읽기 도구 제공 > Iterator == 향상된 for문
		
		//어떤객체.iterator() 발견!!
		//-> 일괄 탐색이 가능
		
		Iterator<String> iter = set.iterator();
		
		System.out.println(iter.hasNext()); //다음번 next() 호출한다면 읽어올 데이터가 존재하느냐?
		System.out.println(iter.next()); //요소 1개를 가져와라
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		System.out.println(iter.hasNext());
		System.out.println(iter.next());
		
		//System.out.println(iter.hasNext());
		//System.out.println(iter.next());
		
		//다시 처음부터 읽기
		System.out.println(set);
		
		iter = set.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		
		for (String item : set) {
			System.out.println(item);
		}
		
		for (String item : set) {
			System.out.println(item);
		}
		
	}

}

class Member {
	
	private String name;
	private int age;
	
	public Member(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return String.format("%s(%d)",this.name, this.age);
	}
	
	@Override
	public int hashCode() {
		
		//이름+나이
//		System.out.println("홍길동20".hashCode()); //498603628
//		System.out.println("홍길동20".hashCode()); //498603628
//		System.out.println("홍길덩20".hashCode()); //498603628
		
			
			
			
			return (this.name + this.age).hashCode(); //어떤값을 비교할지 기준을 잘 정립해야됨
			//return 10; ->>다 같은 값만 비교돼서 한명만 출력됨
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//본인 & obj(매개변수)
		
		
		return this.hashCode() == obj.hashCode();
	
}//member

}











