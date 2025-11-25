package com.test.java.obj.inheritance;

import java.awt.dnd.DragGestureEvent;

public class Ex45 {
	
	public static void main(String[] args) {
		
		//Ex45.java
		/*
			클래스 & 추상클래스 & 인터페이스
			
			클래스 = 구현된 멤버(변수, 구현된 메서드)
			추상클래스 = 구현된 멤버(변수, 구현된 메서드) + 추상 메서드
			인터페이스 = 추상 메서드
			
			상속 관계 (4,5,7번 빼고는 어디가든 많이 씀)
			1. 자식 클래스 > 부모 클래스
			2. 자식 클래스 > 부모 추상클래스
			3. 자식 클래스 > 부모 인터페이스
			4. 자식 추상클래스 > 부모 클래스//2번 역전 가능o ,사용x
			5. 자식 인터페이스 > 부모 클래스//3번  역전 -> 가능x ,  인터페이스는 구현된 멤버를 가질수없음
			6. 자식 추상클래스 > 부모 인터페이스//가능o
			7. 자식 인터페이스 > 부모 추상클래스//가능x - 5번과 같은 이유.
			8. 자식 추상클래스 > 부모 추상클래스//가능o
			9. 자식 인터페이스 > 부모 인터페이스//가능o
		*/
		
	}//main

}

//1.
class AA {
	//구현된 멤버
	public int a; 
	public void bbb() {
		System.out.println("bbb");
	}
}

//1.
class BB extends AA {
	//부모 상속 + 자기 구현
	public int c;
	public void ddd() {
		System.out.println("ddd");
	}
}

//2.
abstract class CC {
	//구현된 멤버
	public int a;
	public void bbb() {}
	
	//추상 멤버
	public abstract void ccc();
}

class DD extends CC {
	
	//구현된 멤버
	public int c;
	public void ddd() {}
	
	//public int a;
	//public void bbb() {}

	//부모의 추상 메서드를 구현했다.
	@Override
	public void ccc() {	}
	
}

//3번 
interface EE {
	//추상멤버
	void aaa();
	void bbb();
	
}

class FF implements EE {

	//자신만의 구현된 멤버
	public int c;
	public void ddd() {
		System.out.println();
	}
	
	
	//부모 인터페이스 물려준 추상 메서드를 구현.
	@Override
	public void aaa() {
		
		
	}

	@Override
	public void bbb() {
		
		
	}
	
	
}
//4.
class GG {
	public int a;
	public void bb() {
		
	}
}


//4.
abstract class HH extends GG {
	public int c;
	public void ddd() {
		
	}
	public abstract void eee();
}


//5.
class II {
	public int a;
	public void bbb() {}
	
}


//5
//interface JJ extends II { //구현화된 멤버들을 가질수 없음 ->불가능
	
//}

//6.
interface KK {
	void aaa();
	void bbb();
	
}
//6.
abstract class LL implements KK {
//	void aaa();
//	void bbb();
	@Override
	public void aaa() {
		// TODO Auto-generated method stub
		
	}
	@Override
		public void bbb() {
			// TODO Auto-generated method stub
			
		}
	
}

//7.
abstract class NN {
	
}

//7.
//interface OO extends NN { 인터페이스가 추상클래스의 구현화된 멤버를 상속 못받음.
	
//}
//8
abstract class PP {
	public int a;
	public abstract void ddd();
}
	

//8
abstract class QQ extends PP {
	
}

//9.
interface RR {
	
}

//9
interface SS extends RR{
	
}