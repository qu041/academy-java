package com.test.java.lambda;

import java.awt.JobAttributes.MultipleDocumentHandlingType;
import java.util.ArrayList;
import java.util.Comparator;

public class Ex68_Lambda {
	
	public static void main(String[] args) {
		
		//Ex68_Lambda.java
		
		//람다식 == 추상 매서드 구현체
		//- 매개변수 유/무
		//- 반환값 유/무
	
		NoParameterNoReturn pr1 = new NoParameterNoReturn() {
			
			@Override
			public void call() {
				System.out.println("pr1");
				
			}
		};
		pr1.call();
		
		NoParameterNoReturn pr2 = () -> {
			System.out.println("pr2");
		};
		pr2.call();
		
		//** 람다식 구현부 > 문장 1개 > {} 생략 가능
		NoParameterNoReturn pr3 = () -> System.out.println("pr3");
		pr3.call();
		
		ParameterNoReturn pr4 = (int n) -> {
			System.out.println(n);
		}; 
		pr4.call(10);
		pr4.call(20);
		pr4.call(30);
		
		//** 람다식의 매개변수 자료형은 생략할 수 있다.
		ParameterNoReturn pr5 = (n) -> {
			System.out.println(n);
		}; 
		pr5.call(40);
		pr5.call(50);
		
		//** 람다식 매개변수 개수가 1개면 () 생략할 수 있다.
		ParameterNoReturn pr6 = n -> {
			System.out.println(n);
		}; 
		pr6.call(1000);
		
		ParameterNoReturn pr7 = n -> System.out.println(n);
		pr7.call(2000);
		
		MultiParameterNoReturn pr8 = (String name, int age) -> {
			System.out.println(name + "," + age);
		};
		pr8.call("홍길동",20);
		
		MultiParameterNoReturn pr9 = (name, age) -> {
			System.out.println(name + "," + age);
		};
		pr9.call("아무개",22);
		
//		MultiParameterNoReturn pr10 = name, age -> {
//			System.out.println(name + "," + age);
//		};
		
		MultiParameterNoReturn pr11 = (name, age) -> System.out.println(name + "," + age);
		pr11.call("강아지", 100);
		
		NoParameterReturn pr12 = () -> {
			return 10;
		};
		System.out.println(pr12.call());
		
		//**구현부에 리턴문이 유일하다면 {}와 return을 생략할 수 있다. 
		NoParameterReturn pr13 = () -> 50;
		System.out.println(pr13.call());
			
		ParameterReturn pr14 = (int a, int b) -> {
				return a+b;
		};
		System.out.println(pr14.call(10, 20));
		
		ParameterReturn pr15 = (a,b) -> a+b;
		System.out.println(pr15.call(20, 50));
		
		ArrayList<Integer> nums = new ArrayList<Integer>();
		
		nums.add(1);
		nums.add(2);
		nums.add(5);
		nums.add(6);
		nums.add(3);
		nums.add(4);
		nums.add(7);
		nums.add(8);
		nums.add(10);
		nums.add(9);
		
		System.out.println(nums);
		
		//정렬
//		nums.sort(new Comparator<Integer>() {
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				// TODO Auto-generated method stub
//				return o2-o1;
//			}
//		});
//		System.out.println(nums);
		
		nums.sort((o1,o2) -> o2-o1);
		System.out.println(nums);
		
		
		
		
		
		
		
	}//main
	

}

interface NoParameterNoReturn {
	void call();
}
interface ParameterNoReturn {
	void call(int n);
}
interface MultiParameterNoReturn {
	void call(String s, int age);
}
interface NoParameterReturn {
	int call();
}
interface ParameterReturn {
	int call(int a, int b);
}

