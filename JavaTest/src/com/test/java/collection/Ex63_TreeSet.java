package com.test.java.collection;

import java.util.Iterator;
import java.util.TreeSet;

public class Ex63_TreeSet {

	public static void main(String[] args) {
		
		//Ex63_TreeSet.java
		/*
		 
		 	컬렉션 이름 패턴
		 	[물리구조] + [사용법=인터페이스]
		 	Array            +List
		 	Linked           +List
		 	
		 	Hash             +Set
		 	Tree             +Set
		 
		 	Hash             +Map
		 	Tree             +Map
		 	
		 	TreeSet
		 	- 순서(index)가 없다.
		 	- 중복값을 갖지 않는다.
		 	- 내부에 트리구조로 데이터를 저장.
		 	  -이진 탐색 트리 구조 > 레드-블랙 트리(균형잡힌 이진 트리0)
		 	  
		 */
				
			TreeSet<Integer> set =  new TreeSet<Integer>();
			
			set.add(5);
			set.add(3);
			set.add(6);
			set.add(2);
			set.add(1);
			set.add(8);
			set.add(7);
			set.add(9);
			set.add(10);
			set.add(4);
		
			System.out.println(set);
			
			//범위 관련 기능 제공(정렬 때문에)
			System.out.println(set.first());
			System.out.println(set.last());
			System.out.println(set.reversed());
			System.out.println(set.headSet(2)); //끝 미포함
			System.out.println(set.tailSet(2)); //시작포함
			System.out.println(set.subSet(3, 7)); //시작포함 끝 미포함
			
			Iterator<Integer> iter = set.iterator();
			
			while (iter.hasNext()) {
				System.err.println(iter.next());
			}
			
			for (int n : set) {
				System.out.println(n);
			}
		
		
		
		
	}//main
}
