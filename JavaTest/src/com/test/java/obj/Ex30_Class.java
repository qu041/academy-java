package com.test.java.obj;

public class Ex30_Class {
	
	public static void main(String[] args) {
		
		//Ex30_Class.java
		
		Member m1 = new Member();
		m1.name = "홍길동";
		m1.age = 20;
		m1.hello();
		
		Member m2 = new Member();
		m2.name = "아무개";
		m2.age = 25;
		m2.hello();
		
		Member m3 = new Member();
		m3.name = "테스트";
		m3.age = 23;
		m3.hello();
		
	}

}

//The type Member is already defined
class Member {
	
	//멤버 변수
	public String name;
	public int age;
	
	//멤버 메서드
	public void hello() {
		//System.out.println("안녕하세요."); // 굳이 필요없는 객체, 다 똑같음.
		System.out.printf("안녕하세요. 저는 %s입니다.\n", name); //객체의 특성에 맞게 작동하게 작성해야 됨.
	}
	
}














