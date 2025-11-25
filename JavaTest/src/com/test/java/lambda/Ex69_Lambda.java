package com.test.java.lambda;

import java.util.Calendar;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.LongConsumer;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

import com.test.java.collection.User;

public class Ex69_Lambda {
	
	public static void main(String[] args) {
			
			//Ex69_Lambda.java
			/*
			 
			  		람다식 > 익명 객체의 추상 메서드 > 인터페이스 참조 변수에 저장
			  		> 람다식을 사용하려면 반드시 인터페이스가 필요!!!
			  		
			  		람다식 장점 > 메서드 구현(익명객체 구현) 간단
			  		람다식 단점 > 인터페이스 선언 불편
			  		
			  		*** 자바는 여러가지 형식의 람다식(추상 메서드)을 저장할 수 있는 인터페이스를 제공
			  			>함수형 인터페이스(Functional Interface) 제공 (//20~30개)
			  			
			  			함수형 인터페이스
			  			1. 표준 API 함수형 인터페이스 > JDK 제공
			  			2. 사용자 정의 함수형 인터페이스 > 개발자 선언
			  			
			  			**표준 API 함수형 인터페이스
			  			- 추상 메서드를 딱 1개만 가지고 있는 인터페이스
			  			카테고리
			  			1. Consumer
			  				- Consumer<T> //제네릭 인터페이스..대표적
			  				- BiConsumer<T,U> // 변수 두개
			  				-..
			  				- 매개변수 존재 O, 반환값 X > 추상 메서드를 제공한다.
			  			
			  			2. Supplier
			  				- Supplier<T>
			  				-..
			  				- 매개변수 X, 반환값만 O > 추상 메서드를 제공한다.
			  			
			  			3. Function
			  				-Function<T, R>
			  				-BiFunction<T, U, R>
			  				-..
			  				- 매개변수O, 반환값O > 추상 메서드를 제공한다.
			  			
			  			4. Operator
			  				-Function 하위셋
			  				-SubSet
			  				- 매개변수를 연산 후 반환하는 행동
			  				- 메개변수와 반환값의 자료형이 동일하다
			  				- 1 + 1 = 2 
			  			
			  			5. Predicate
			  				-Function 하위셋
			  				-SubSet
			  				- 매개변수를 조작 후 반드시 boolean을 반환.
			  
			  
			 */
		
		//m1(); //Consumer
		//m2(); //Supplier
		//m3(); //Function
		//m4(); //Operator
		m5(); 	//Predicate
	
	}
	

	private static void m5() {
		//Predicate
		//- 매개변수를 전달하면, 처리 후, 반환값을 돌려주는 업무
		//-testXXX() 추상메서드 제공
		//- 논리 검사 후  Boolean 반환
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Predicate<Integer> p1 = num -> num > 5;
		System.out.println(p1.test(10));
		System.out.println(p1.test(5));
		
		BiPredicate<Integer, Integer> bp1 = (a, b) -> a > b;
		System.out.println(bp1.test(50, 30));
	}


	private static void m4() {
		//Operator
		//- 매개변수를 전달하면, 처리 후, 반환값을 돌려주는 업무
		//- applyXXX() 추상메서드 제공
		//- 추상 메서드의 매개변수와 반환값의 자료형이 동일하다.
		
		BiFunction<Integer, Integer, Integer> bf1 = (a,b) -> a+b;
		System.out.println(bf1.apply(100, 900));
		
		BinaryOperator<Integer> bo1 = (a,b) -> a+b;
		System.out.println(bo1.apply(30, 70));
		
		UnaryOperator<Integer> uo1 = a -> a * a;
		System.out.println(uo1.apply(5));
		
		
		
	}


	private static void m3() {
		//Function
		//- 매개변수를 전달하면, 처리 후, 반환값을 돌려주는 업무
		//-applyXXX() 추상메서드 제공
		
		Function<Integer, Boolean> f1 = num -> num > 0;
		System.out.println(f1.apply(10));
		System.out.println(f1.apply(-10));
		
		Function<String, Integer> f2 = str -> str.length();
		System.out.println(f2.apply("홍길동"));
		
		BiFunction<Integer, Integer, String> bf1 = (a,b) -> {
			if (a>b) {
				return "크다";
			} else {
				return "작다";
			}
		};
		System.out.println(bf1.apply(10, 20));
	}
	

	private static void m2() {
		//Supplier
		//- 매개변수 없이 반환값을 돌려주는 업무를 구현하는 인터페이스
		//- getXXX() 추상 메서드 제공
		
		Supplier<Integer> s1 = () -> 10000;
		System.out.println(s1.get());
		
		Supplier<Double> s2 = () -> Math.random();
		System.out.println(s2.get());
		
		Supplier<String> s3 = () -> "홍길동";
		System.out.println(s3.get());
		
		Supplier<Integer> s4 = () -> {
			Calendar now = Calendar.getInstance();
			return now.get(Calendar.DATE);
		};
		
		System.out.println(s4.get());
		
		
	}

	private static void m1() {
		
		//Consumer
		//- 매개변수를 받아서 소비하는 업무를 구현하는 인터페이스
		//- acceptXXX() 추상메서드 제공
		
		MyConsumer m1 = new MyConsumer() {
			
			@Override
			public void test(int num) {
				System.out.println(num*2);
				
			}
		};
		
		m1.test(100);
		
		MyConsumer m2 = num -> 
			System.out.println(num * 2);
		
		m2.test(200);
		
		
		Consumer<Integer> c1 = new Consumer<Integer>() {
			
			@Override
			public void accept(Integer t) {
				System.out.println(t * 3);
			}
		};
		c1.accept(3);
		
		Consumer<Integer> c2 = t -> System.out.println(t * 3);
		c2.accept(9);
		
		Consumer<String> c3 =  str -> System.out.println(str.length());
		c3.accept("김수완무거북이와두루미");
		
		Consumer<Integer> c4 = count -> {
			for (int i=1; i<=count;i++) {
				System.out.println(i);
			}
		};
		c4.accept(10);
		
		Consumer<User> c5 = user -> {
			System.out.println("이름: " + user.getName());
			System.out.println("등급: " + user.getLevel());
			System.out.println("지역: " + user.getCity());
		};
		c5.accept(new User("홍길동",5,null,"서울"));
		
		BiConsumer<String, Integer> d1 = (name, age) -> System.out.printf("이름:%s, 나이:%d\n",name,age);
		d1.accept("홍길동", 20);
		
		BiConsumer<Integer, Integer> d2 = (a, b) -> System.out.println(a+b);
		d2.accept(20, 80);
		
		Consumer<Integer> ic1; // 범용> 매개변수 타입 >Integer 할당
		IntConsumer ic2; // 전용 > 매개변수 타입 > 처음부터 인티저
		DoubleConsumer ic3; // 전용 > 매개변수 타입 > 처음부터 인티저
		LongConsumer ic4; // 전용 > 매개변수 타입 > 처음부터 인티저
		ObjDoubleConsumer<Integer> odc1;
		
		
		
	}//m1
}

//목적] 인자가 있고 반환값이 없는 메서드를 가진 객체가 필요
// 		- 람다식을 사용하고 싶다.
//		- 인터페이스가 필요하다.
interface MyConsumer {
	void test(int num);
}

interface Test<T> { //제네릭 인터페이스 ex)comparator
	void call(T data);
}
