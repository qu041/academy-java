package com.test.java.obj.inheritance;

public class Ex47_Interface {
	
	public static void main(String[] args) {
		
		//Ex47_Interface.java
		/*
		
			자바는 다중 상속이 불가능하다.
			- 자바는 인터페이스 다중 상속은 가능하다.(*** 자주 사용)
		
		*/
		
		//m1();
		회사();
		집();
		
		
	}//main

	public static void 회사() {
		부장 hong = new 홍길동();
		
		hong.결재한다();
		hong.팀원을관리한다();
		
	
	}
	public static void 집() {
		아빠 hong = new 홍길동();
		
		hong.돈을번다();
		hong.아이와논다();
		
		//주말 > 회사 전화 > 결재 승인~
		부장 hong2 = (부장)hong;
		
		hong2.결재한다();
		
		
	}
	
	public static void m1() {
		홍길동 hong = new 홍길동();
		
		hong.결재한다();
		hong.팀원을관리한다();
		
		hong.돈을번다();
		hong.아이와논다();
	}

}

class AAAAA {
	public int a;
}

class BBBBB extends AAAAA {
	public int b;
	public int num;
}

class CCCCC extends AAAAA {
	public int c;
	public int num;
}

//class DDDDD extends BBBBB, CCCCC {
//	//무슨 문제 발생?
//	//public int num; x 2개
//}


//홍길동 객체 생성

//인터페이스 > 어떤 역할 부여
interface 부장 {
	void 결재한다();
	void 팀원을관리한다();
}

interface 아빠 {
	void 돈을번다();
	void 아이와논다();
	
}

class 홍길동 implements 부장, 아빠 {

	@Override
	public void 결재한다() {
		
	}

	@Override
	public void 팀원을관리한다() {
		
	}

	@Override
	public void 돈을번다() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void 아이와논다() {
		// TODO Auto-generated method stub
		
	}	
	
}
























