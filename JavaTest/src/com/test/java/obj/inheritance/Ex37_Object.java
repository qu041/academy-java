package com.test.java.obj.inheritance;

public class Ex37_Object {
	public static void main(String[] args) {
		
		//Ex37_Object.java
		/*
		 
		 	Object 클래스
		 	- 개발자가 선언한 모든 클래스는 무조건 자동으로 Object 클래스를 상속받는다.
		 	- 모든 클래스의 근원 클래스 -> 루트 클래스(Root Class)
		 	
		 	상속 관계에 있는 클래스간의 호칭
		 	- 부모 클래스 <-> 자식 클래스
		 	- 슈퍼 클래스 <-> 서브 클래스
		 	- 기본 클래스 <-> 확장 클래스
		 	- 기본 클래스 <-> 파생 클래스
		 
		 
		 */
		
		
		OChild c1 = new OChild();
//		c1.a = 10;
//		c1.b = 20;
		//Object 클래스는 멤버를 9개 구현 > 상속 > 모든 클래스에게 물려준다. 
		// 			> 모든 클래스의 공통기능
		
		//Class Object is the root of the class hierarchy. 
		//Every class has Object as a superclass.  
		//All objects, including arrays, implement the methods of this class.
		Object obj;
		int[] arr = new int[3]; //내부적으로 참조형(클래스 타입)
		
		
		
	}
}

class OParent {
	public int a;
	public int b;
}

class OChild extends OParent {
	
	
}