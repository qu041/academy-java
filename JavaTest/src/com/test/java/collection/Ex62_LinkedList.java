package com.test.java.collection;

import java.util.ArrayList;
import java.util.LinkedList;

public class Ex62_LinkedList {
	
	public static void main(String[] args) {
		
		//Ex62_LinkedList.java
		/*
		 
		  	Collection(I) < List(I) < ArrayList(C) , LinkedList(C)
		  	
		  	ArrayList vs LinkedList
		  	- 같은 인터페이스 구현 > 사용법이 아주 유사하다.
		  	- 내부 구조가 다르다(***) > 사용 용도(목적)이 다르다.
		  	
		  	LinkedList 종류
		  	1. LinkedList (단방향)
		  	2. Double LinkedList (양방향)
		  	3. Double Circular LinkedList > (순환 구조) > 자바의 LinkedList
		  	4. 
		  	
		 
		 */
		
		//m1();
		m2();
		
		
	}//main

	private static void m2() {
		
		//ArrayList vs LinkedList 속도 비교
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 =  new LinkedList<Integer>();
		
		long begin = 0, end = 0;
		
		//1. 순차적으로 데이터 추가하기, Append
		System.out.println("[1. 순차적으로 데이터 추가하기, Append]");
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i< 1000000; i++) {
			list1.add(i);
		}
		
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업 시간:  %,dms\n", end - begin);
		
		//LinkedList
		begin = System.currentTimeMillis();
		
		for (int i=0; i< 1000000; i++) {
			list2.add(i);
		}
		
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업 시간:  %,dms\n", end - begin);
		
		//2. 순차적으로 데이터 추가하기, Append
		System.out.println("[2. 중간에 데이터 추가하기, insert]");
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i< 100000; i++) {
			list1.add(0,i);
		}
		
		end = System.currentTimeMillis();
		System.out.printf("ArrayList 작업 시간:  %,dms\n", end - begin);
		
		//2.LinkedList
		
		begin = System.currentTimeMillis();
		
		for (int i=0; i< 100000; i++) {
			list2.add(0,i);
		}
		
		end = System.currentTimeMillis();
		System.out.printf("LinkedList 작업 시간:  %,dms\n", end - begin);
				
			
	//3. 중간에 데이터 삭제하기, Delete
		//-시프트발생
	System.out.println("[3. 중간에 데이터 삭제하기, Delete]");
	
	begin = System.currentTimeMillis();
	
	for (int i=0; i< 100000; i++) {
		list1.remove(0);
	}
	
	end = System.currentTimeMillis();
	System.out.printf("ArrayList 작업 시간:  %,dms\n", end - begin);
	
	//2.LinkedList
	
	begin = System.currentTimeMillis();
	
	for (int i=0; i< 100000; i++) {
		list2.remove(0);
	}
	
	end = System.currentTimeMillis();
	System.out.printf("LinkedList 작업 시간:  %,dms\n", end - begin);
	
	//4. 순차적으로 데이터 삭제하기, Delete
	//-시프트발생 XXX
	System.out.println("[4. 순차적으로 데이터 삭제하기, Delete]");
	
	begin = System.currentTimeMillis();
	
	for (int i=list1.size()-1; i>=0; i--) {
		list1.remove(i);
	}
	
	end = System.currentTimeMillis();
	System.out.printf("ArrayList 작업 시간:  %,dms\n", end - begin);
	
	//2.LinkedList
	
	begin = System.currentTimeMillis();
	
	for (int i=list2.size()-1; i>=0; i--) {
		list2.remove(i);
	}
	
	end = System.currentTimeMillis();
	System.out.printf("LinkedList 작업 시간:  %,dms\n", end - begin);
	
	//ArrayList
	//- 순차적인 추가/삭제
	
	//LinkedList
	//- 중간에 추가/삭제
	
}
		
	

	private static void m1() {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		LinkedList<Integer> list2 =  new LinkedList<Integer>();
		
		//ArrayList > LinkedList 변환가능 -ArrayList 쓰다가 추가삭제시만 LinkedList로 변환해서 쓰는게 싸게먹힘.
		//적절한 상태에 적절한 도구 사용;
		LinkedList<Integer> list3 = new LinkedList<Integer>(list1);
		
		list1.add(100);
		list1.add(200);
		list1.add(300);
		
		list2.add(100);
		list2.add(200);
		list2.add(300);
		
		System.out.println(list1.size());
		System.out.println(list2.size());
		
		System.out.println(list1.get(0));
		System.out.println(list2.get(0));
		
	}

	
	
	
}


