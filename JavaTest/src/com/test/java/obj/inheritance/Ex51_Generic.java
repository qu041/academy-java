package com.test.java.obj.inheritance;

public class Ex51_Generic {

	public static void main(String[] args) {

		//Ex51_Generic.java
		/*

			제네릭, Generic
			1. 제네릭 클래스(O)
			2. 제네릭 메서드
			
			
			요구사항] 클래스 설계해 주세요
			1. 멤버 변수 1개 > int
			2. 멤버 변수를 중심으로 여러가지 행동을 하는 메서드를 구현
			
			추가사항] String 중심으로 하는 클래스 설계
			추가사항] boolean 중심으로 하는 클래스 설계
			추가사항 ] double 중심으로 하는 클래스 설계
			추가사항 ] byte 중심으로 하는 클래스 설계
			추가사항] Student 중심으로 하는 클래스 설계
			추가사항] Employee 중심으로 하는 클래스 설계
			추가사항] 무한대... 서용자 정의
			
			
			  
			 


		*/
		//전용 클래스
		WrapperInt n1 = new WrapperInt(100);
		System.out.println(n1);
		System.out.println(n1.getData() * 2);
		System.out.println();
		
		//범용 클래스
		WrapperObject n2 = new WrapperObject(200); //박싱
		System.out.println(n2);
		System.out.println((int)n2.getData() *2);
		System.out.println();
		
		//제네릭 클래스
		Wrapper<Integer> n3 = new Wrapper<Integer>(300);
		System.out.println(n3);
		System.out.println(n3.getData() * 2);
		System.out.println();
		
		
		WrapperString s1 = new WrapperString("홍길동");
		System.out.println(s1);
		System.out.println(s1.getData().length());
		System.out.println();
		
		WrapperObject s2 = new WrapperObject("남궁길동"); //박싱
		System.out.println(s2);
		System.out.println(((String)s2.getData()).length());
		System.out.println();
		
		Wrapper<String> s3 = new Wrapper<String>("김수한무두루미");
		System.out.println(s3);
		System.out.println(s3.getData().length());
		System.out.println();
		
		
		WrapperBoolean b1 = new WrapperBoolean(true);
		System.out.println(b1);
		System.out.println(b1.getData() ? "참" : "거짓");
		System.out.println();
		
		WrapperObject b2 = new WrapperObject(false); //박싱
		System.out.println(b2);
		System.out.println((boolean)b2.getData() ? "참" : "거짓");
		System.out.println();
		
		Wrapper<Boolean> b3 = new Wrapper<Boolean>(true);
		System.out.println(b3);
		System.out.println(b3.getData() ? "참" : "거짓");
		System.out.println();
		

	}//main

}


class WrapperInt {
	
	//1. 클래스의 중심
	private int data;
	
	//2. data 중심 > 조작하는 메서드
	public WrapperInt(int data) {
		this.data = data;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}
	
	//객체 상태 확인 > toString() 재정의
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}


class WrapperString {
	
	private String data;
	
	public WrapperString(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperBoolean {
	
	private boolean data;
	
	public WrapperBoolean(boolean data) {
		this.data = data;
	}

	public boolean getData() {
		return data;
	}

	public void setData(boolean data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

class WrapperObject {
	
	private Object data;
	
	public WrapperObject(Object data) {
		this.data = data;
	}
	
	public Object getData() {
		return data;
	}
	
	public void setData(Object data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}

//제네릭 클래스
class Wrapper<T> {
	
	private T data;
	
	public Wrapper(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}
	
	public void setData(T data) {
		this.data = data;
	}
	
	@Override
	public String toString() {
		return "[data=" + data + "]";
	}
	
}











