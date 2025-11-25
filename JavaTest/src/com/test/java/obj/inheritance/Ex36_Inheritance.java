package com.test.java.obj.inheritance;

public class Ex36_Inheritance {
	public static void main(String[] args) {
		
	
	
		//Ex36_Inheritance.java
		/*
		 
		 	상속, Inheritance
		 	- 부모가 가지는 재산을 자식에게 물려주는 행동
		 	- 부모(클래스)가 가지는 재산(멤버변수, 멤버 메서드)를 자식(클래스)에게 물려주는 행동
		 	
		 	왜?
		 	- 부모 클래스에서 이미 구현한 코드를 자식 클래스에서 재사용> 비용 절감
		
		 
		 
		 
		 
		 */
	
		Parent p1 = new Parent();
		p1.a = 10;
		p1.b = 20;
		p1.ccc();
		
		Child c1 = new Child();
		//c1.xxx
		c1.a = 10;
		c1.b = 20;
		c1.d = 30;
		c1.e = 40;
		c1.ccc();
		c1.fff();
		
		BBB b1 = new BBB();
		
		b1.a = 10;
		b1.b = 20;
		b1.d = 30;
		b1.e = 40;
		b1.ggg = 50;
		b1.hhh = 60;
	

	}//main

}

 class Parent {
	public int a;
	public int b;
	
	public void ccc() {
		System.out.println("ccc");
	}
}

//클래스 상속
//- class 자식클래스명 extends Parent {
class Child extends Parent {
	
	public int d;
	public int e;
	
	public void fff() {
		System.out.println("fff");
	}
	

}

class AAA extends Child {
	public int ggg;
}

class BBB extends AAA {
	public int hhh;
}

class CCC {
	
}

//부모 한명에 자식 여러명 가능 <-> 반대는 안됨 (부모 두명, 다중상속) 
//자바는 공식적으로 다중상속을 지원 안함 (현대 언어들은 지원 안함)
class DDD extends CCC {
	
}

class EEE extends CCC {
	
}