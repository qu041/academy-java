package com.test.java.obj.inheritance;

public class Ex38_Overriding {

	public static void main(String[] args) {
		
		//Ex.Overriding.java
		/*
		 	//면접에서 종종 비교질문 하는데 이상한 질문임. 보면 대답 알려줘.
		 	메서드 오버로딩, Method Overloading
		 	- 메서드 이름 동일 x N개 생성
		 	
		 	메서드 오버라이딩, Method Overriding
		 	- 클래스 상속할 때 발생
		 	- 메서드의 재정의 >  상속받은 메서드를 수정하는 기술
		 
		 
		 */
		
		OverridingParent hong = new OverridingParent();
		hong.name = "홍길동";
		hong.hello();
		
		OverridingChild jhong = new OverridingChild();
		jhong.name = "홍철수";
		jhong.hello();
		//jhong.hi();
		
		jhong.test(); //super로 부모메서드에 접근 // 잘안씀 //이럴거면 재정의(오버라이딩) 안함.
		
		//*** a, b
		//- 
		MChild c2 = new MChild();
		c2.a = 10;
		c2.c= 30;
		
		c2.check();
		
		
		
	}
}

class OverridingParent {
	
	public String name;
	
	public void hello() {
		System.out.printf("안녕하세요. 좋은 아침입니다. 저는 %s입니다.\n", this.name);
	}
	
}

class OverridingChild extends OverridingParent {
	//상속받은 부모의 메서드를 그대로 사용하기 싫어서 따로 직접 선언
//	public void hi() {
//		System.out.printf("hi~ my name is %s\n", this.name);
//	}
	
	//메서드 오버라이딩, 메서드 재정의
	public void hello() {
		System.out.printf("hi~ my name is %s\n", this.name);
	}
	
	public void test() {
		this.hello(); // 자기자신 객체. this
		super.hello();	// 부모객체를 뜻함. super
	}
	
}

//***상속시 멤버의 접근 지정자는 그대로 유지된다.(private는 접근 안됨)
class MParent {
	public int a;
	private int b;
}

class MChild extends MParent {
	public int c;
	private int d;
	
	public void check() {
		System.out.println("a: " + this.a);
		//System.out.println("b: " + this.b);
		System.out.println("c: " + this.c);
		System.out.println("d: " + this.d);
	}
}