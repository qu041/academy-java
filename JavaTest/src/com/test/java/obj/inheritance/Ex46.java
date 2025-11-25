package com.test.java.obj.inheritance;

public class Ex46 {

	public static void main(String[] args) {

		//Ex46.java
		AAAA o1 = new AAAA();
		o1.a = 10;
		o1.bbb();
		
//		BBBB o2 = new BBBB();
//		//BBBB o2;
//		o2.a = 10;
//		o2.bbb();
//		o2.ccc();
				
		//CCCC o3 = new CCCC();
		//CCCC o3;
		
		
		BBBB o2; //= 객체();
		CCCC o3; //= 객체();
		
		
		DDDD p1 = new DDDD();
		p1.color = "자신의 색상";
		
		p1.a = 10; //상속된 구현 멤버
		p1.bbb();  //상속된 구현 멤버
		p1.ccc();  //상속된 추상 구현 멤버
		
		EEEE p2 = new EEEE();
		p2.price = 1000; //자신의 가격
		
		p2.a = 20;
		p2.bbb();
		p2.ccc();
		
		//부모 = 자식
		//업캐스트(100% 안전)
		BBBB p3 = new DDDD();
		p3.a = 10;
		p3.bbb();
		p3.ccc();
		
		BBBB p4 = new EEEE();
		p4.a = 10;
		p4.bbb();
		p4.ccc();
		
		
	}

}

class AAAA {
	public int a;
	public void bbb() {
		System.out.println("bbb");
	}
}

abstract class BBBB {
	public int a;
	public void bbb() {
		System.out.println("bbb");
	}
	public abstract void ccc();
}

interface CCCC {
	void aaa();
}

class DDDD extends BBBB {
	
	public String color;
	
	@Override
	public void ccc() {
		System.out.println("ccc");
	}
}

class EEEE extends BBBB {
	
	public int price;
	
	@Override
	public void ccc() {
		System.out.println("씨씨씨");
	}
	
}















