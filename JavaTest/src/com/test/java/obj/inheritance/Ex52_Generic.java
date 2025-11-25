package com.test.java.obj.inheritance;

public class Ex52_Generic {

	public static void main(String[] args) {

		//Ex52_Generic.java
		
		//Item is a raw type. References to generic type Item<T> should be parameterized
		Item i1 = new Item();
		i1.a = 10;
		i1.b = "20";
		i1.ccc(10);
		System.out.println(i1.a);
		
		
		Item<String> s1 = new Item<String>();
		s1.a = 10;
		s1.c = "문자열";
		
		Item<Integer> s2 = new Item<Integer>();
		s2.a =20;
		s2.c =20;
		
		Pen<Boolean> p1 = new Pen<Boolean>();
		p1.a = true;
		p1.b = false;
		p1.c = true;
		
		Pen<Integer> p2 = new Pen<>(); //뒤에는 생략가능 최신문법
		p2.a = 10;
		p2.b = 20;
		p2.c = 30;
		
		Desk<String> d1 = new Desk<String>();
		
		d1.setData("문자열");
		System.out.println(d1.getData());
		
	}//main

}

//제네릭 클래스
//- <>: 인자리스트
//- T: 매개변수 > 타입변수 > 값을 저장(X), 자료형을 저장(O) > 참조형
//	- T = String
//	- T = Employee
//	- T = Integer
//	- T = Double
//	- T = boolean(X), Boolean(O)
class Item<T> {
	
	//일반 클래스의 멤버 구성
	public int a;
	public String b;
	public T c;
	
	public void ccc(int n) {
		
	}
	
}

class Pen<T> {
	public T a;
	public T b;
	public T c;
}

class Desk<T> {
	
	private T data;
	
	public void setData(T data) {
		this.data = data;
	}
		
	//지역변수 > 금지!!
	//멤버변수,메소드 등 사용 
	public T getData() {
		return data;
	}

}

class Laptop<T,U> {
	private T a;
	private U b;
	
	public Laptop(T a, U b) {
		this.a = a;
		this.b = b;
	}

	public T getA() {
		return a;
	}

	public U getB() {
		return b;
	}
}














