package com.test.java.obj.inheritance;

import java.util.Date;



public class Ex39_toString {
	
	public static void main(String[] args) {
		
		
		
		//Ex39_toString.java
		
		Monitor m1 = new Monitor();
		m1.setModel("LG100");
		m1.setPrice(300000);
		
		//개발자: 방금 만든 객체의 상태?? > 출력을 통해 확인
		System.out.println(m1.getModel());
		System.out.println(m1.getPrice());
		
		//객체의 상태를 일괄적으로 확인 > info() 메서드를 다른 개발자가 모름 (내가 만들어서)
		System.out.println(m1.info());
		
		//com.test.java.obj.inheritance.Monitor@7ef20235
		System.out.println(m1.toString()); //
		System.out.println(m1); //객체는 직접적으로 출력을 못함. 위에 toString 메서드랑 같은 쓰임.
		
		Date now = new Date();
		System.out.println(now.toString());
		
		Time t1 = new Time(2, 30);
		System.out.println(t1);
		System.out.println(t1.toString());
		
		
		
	}

}

class Monitor {
	
	private String model;
	private int price;
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	public String info() {
		return String.format("[%s, %d원]"
								, this.model
								, this.price);
	}
	
	//자동완성 우클릭 source -> Generate toString
	@Override
	public String toString() {
		return "Monitor [model=" + model + ", price=" + price + "]";
	}
	
	//어노테이션
	//@(골뱅이)+ 단어
	//- 기능성 주석 , 아무 메서드에 못 씀(오버라이드한 부분만 가능)
	//- 자주 쓰임, 자신의 데이터를 누구나 확인 할 수 있게끔 씀, 안 쓰면 미안한?
//	@Override
//	public String toString() {
//	
//		return String.format("[%s, %d원]"
//				, this.model
//				, this.price);
//	}
}	
class Time {
	
	private int hour;
	private int minute;
	
	public Time(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
		
	}
	//객체 상태 확인용 오버라이드 > toString()
	@Override
	public String toString() {
		return "Time [hour=" + hour + ", minute=" + minute + "]";
	}
	
	
	
	
	
}
	
	
	

















