package com.test.java.collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Ex55_Stack {
	
	public static void main(String[] args) {
		
		
		
		//Ex55_Stack.java
		/*
		 
	 		ADT, Abstract Data Type(추상적 자료형)
	 		- 배열 + 사용법을 용도에 맞게 구현
	 		- Stack
	 			- 후입선출 /구조를 갖는 데이터 구조.
	 			- LIFO
	 			ex) 메모리 구조 (Stack)
	 			ex) 되돌리기(CTRL Z) <--> 다시하기(CTRL Y)
	 			ex) 브라우저 > 뒤로가기, 앞으로가기
	 		- Queue
		 		- 선입선출 /구조를 갖는 데이터 구조.
		 		- FIFO
		 		- 쉬프트 발생
		 		ex) 줄서기
		 		ex) 주문목록
		 		ex) 편의점 재고관리
		 
		 */
		
		//Stack
		//m1();
		m2();
	
	}//main

	private static void m2() {
		
		//Queue
		Queue<String> queue = new LinkedList<String>(); //인터페이스라 객체생성 x //LinkedList 쓰는이유? 껍데기가 Queue 내부는 LinkedList
		
		
		//1. 요소 추가하기
		//-boolean add(T value)
		queue.add("빨강"); //enqueue()
		queue.add("노랑");
		queue.add("파랑");
		
		System.out.println(queue);
		
		//2. 요소 개수
		System.out.println(queue.size());
		
		//3. 요소 읽기
//		System.out.println(queue.poll());//dequeue()
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll());
//		System.out.println(queue.size());
//		
//		System.out.println(queue.poll()); //에러 대신 null 뜸
		
//		while (queue.size() >0) {
//			System.out.println(queue.poll());
//			System.out.println(queue.poll());
//		}
		
		//4.요소 읽기
		System.out.println(queue.peek());
		System.out.println(queue.peek());
		System.out.println(queue.peek());
	}

	private static void m1() {
		
		//Stack
		Stack<String> stack = new Stack<String>();
		
		//1. 요소 추가하기
		//- T push(T value)
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		System.out.println(stack);

		//2. 요소 개수
		stack.size();
		System.out.println(stack.size());
		
		//3. 요소 읽기 (물리적으론 꺼내기임) 사이즈 줄어드는게 보임.
		//- T pop() /푸쉬다운 <> 팝업
		//- 한번 읽으면 두번 못 읽음
		System.out.println(stack.pop());
		System.out.println(stack.size()); //2
		
		System.out.println(stack.pop());
		System.out.println(stack.size()); //1	
		
		System.out.println(stack.pop());
		System.out.println(stack.size()); //0

		System.out.println(stack.pop());  //에러	
		System.out.println(stack.size()); //에러
		
		int size = stack.size(); //미리 고정
		
		for (int i=0; i<size; i++) {  //stack.size() 가변이라 안됨
			System.out.println(stack.pop());
		}
			
		while (stack.size() > 0) {
			System.out.println(stack.pop());
		}
		
		//4. 빈배열
		System.out.println(stack.isEmpty());
		
		stack.push("빨강");
		stack.push("노랑");
		stack.push("파랑");
		
		System.out.println(stack.isEmpty());
		
		//5. 요소 읽기 (pop이랑 다름) // 마지막에 넣은 애만 바라보는 애 // 꺼내기 전 확인시 사용
		//- peek >> pop
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		System.out.println(stack.peek());
		
		
		
		
	}
}
