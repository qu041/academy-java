package com.test.java.obj.inheritance;

import com.sun.source.tree.InstanceOfTree;

public class Ex48 {
	
	public static void main(String[] args) {
		
		//Ex48.java
		/*
		 	
		 	1. 추상 클래스 or 인터페이스
		 	2. 업캐스팅 or 다운캐스팅
		 	
		 	상황]프린터 대리점 운영
		 	1.LG100 x 5대, HP200 x 3대
		 	2.하루 1번씩 > 제품 점검 > 출력 기능 확인
		 	
		 	추가상황]
		 	1. 프린터 재고 증가
		 	 -LG100 >500대
		 	 -HP200 >300대
		 	2. 프린터 종류 증가
		 	 -DELL300
		 	3. 브랜드별 자체 기능 점검
		 	 -LG100 > selfTest()
		 	 -HP200 > AI()
		 	
		 	
		 */
		
		//m1();
		//m2();
		//m3();
		m4();
		
		
		
	}//main

	private static void m4() {
		
		LG100 lg1 =  new LG100(5,300000);
		Printer p1;
		
		//부모=자식
		//업캐스팅(100%)
		p1 = lg1;
		
		Printer p2 = new LG100(5,300000);
		Printer p3 = new HP200("touch",400000);
		
		//배열 특성: 같은 자료형의 집합
		//          : 다른 자료형의 집합 > 참조형의 형변환을 이용(다른 자료형이 형제에 한해서-업캐스팅 특징을 이용해서?)
		
		//***업캐스팅 사용 이유:다른 자료형을 가지는 집합을 만들기 위해?
		Printer[] ps = new Printer[2]; //이부분 객체를 만든게 아니라 배열 만든거임
		ps[0] = new LG100(5,300000);
		ps[1] = new HP200("touch",400000);
		
		
		Printer[] list = new Printer[8];
		
		for (int i=0; i<list.length; i++) {
			if (i < 5) {
				list[i] = new LG100(5, 300000);
			} else if (i < 8) { 
				list[i] = new HP200("touch", 400000);
			}
		}
		
		//점검 시간
		//혜택의 원인
		//1.상속 > 집합을 한개로 통일 > 루프를 한개만 돌릴수 있게 됨
		//2.상속 > 추상 클래스(메서드)를 이용하여 행동도 맞춰야 됨
		for (int i=0; i<list.length; i++) {
			//list[i].print("테스트");
			
			//다운 캐스팅의 목적 업캐스팅으로 한번에 관리하다 자식 고유메서드 실행하기위해??
//			if (i < 5) {
//			((LG100)list[i]).selfTest();
//		} else if (i < 8) {
//			((HP200)list[i]).ai();
//		}
			//				객체    			클래스 // 출력 :boolean 객체를 클래스에 담을 수 있습니까?
//		System.out.println(list[i] instanceof Printer);	
//		System.out.println(list[i] instanceof LG100);
		//System.out.println(list[i] instanceof HP200);
			
			if (list[i] instanceof LG100) {
				((LG100)list[i]).selfTest();
			} else if (list[i] instanceof HP200) {
				((HP200)list[i]).ai();
			}
		}	
			
	}		
	

	private static void m3() {
		
		//Case 2.
				//- 배열 사용
				LG100[] lg = new LG100[500];
				HP200[] hp = new HP200[300];
				DELL300[] dell = new DELL300[3];
				
//				LG100 lg1;
//				LG100 lg2;
//				LG100 lg3;
//				LG100 lg4;
//				LG100 lg5;
				
				//lg[0].print("테스트");
				
				for (int i=0; i<lg.length; i++) {
					lg[i] = new LG100(5, 300000);
				}
				
				for (int i=0; i<hp.length; i++) {
					hp[i] = new HP200("touch", 400000);
				}
				
				for (int i=0; i<dell.length; i++) {
					dell[i] = new DELL300(250000);
				}
				
				//점검 시간
				for (int i=0; i<lg.length; i++) {
					lg[i].print("테스트");
					lg[i].selfTest();
					
				}
				
				for (int i=0; i<hp.length; i++) {
					hp[i].print("테스트");
					hp[i].ai();
					
				}
				
//				for (int i=0; i<dell.length; i++) {
//					dell[i].print("테스트");
//				}
				
				
			}

	private static void m2() {
		
		//case 1.
		//1. 재고 확보
		//-비효율적
		//-대당 비용 x 동일
		LG100 lg1 =  new LG100(5, 300000);
		LG100 lg2 =  new LG100(5, 300000);
		LG100 lg3 =  new LG100(5, 300000);
		LG100 lg4 =  new LG100(5, 300000);
		LG100 lg5 =  new LG100(5, 300000);
		
		HP200 hp1 = new HP200("touch", 400000);
		HP200 hp2 = new HP200("touch", 400000);
		HP200 hp3 = new HP200("touch", 400000);
		
		//2.점검시간
		lg1.print("테스트");
		lg2.print("테스트");
		lg3.print("테스트");
		lg4.print("테스트");
		lg5.print("테스트");
		
		hp1.print("테스트");
		hp2.print("테스트");
		hp3.print("테스트");
		
		
		
		
		
		
		
	}
	
	

	private static void m1() {
		
		//방금 설계한 클래스들의 문제점!! > 리팩토링 하기
		//클래스 > 반복 코드 or 사용법 > 추상 클래스 or 인터페이스
		
		//                *         *    
		//LG100(weight, price) + output() + selfTest()
		//HP200(type, price) + print() + ai()
		
		//부모를 추상클래스로 결정
		
//		Printer p1 = new Printer(10000); 추상클래스는 객체 못만듬!!!
		
		
	}

}

abstract class Printer {
	
	private int price;
	
	public Printer(int price) {
		this.price = price;
	}
	//추상 메서드> 프린터로서 가져야할 공통 행동 > 출력 기능
	public abstract void print(String txt);
	
	
}


class LG100 extends Printer {
	
	private int weight;
	//private int price;
	
	public LG100(int weight, int price) {
		super(price); //부모 생성자를 부름
		this.weight = weight;
		//this.price = price;
	}
	
	//출력기능
//	public void output(String txt) {
//		System.out.println("LG100 출력: " +  txt);
//	}
	
	
	//자가진단
	public void selfTest() {
		System.out.println("자가진단을 합니다.");
	}

	@Override
	public void print(String txt) {
		System.out.println("LG100 출력: " +  txt);
		
	}
}

class HP200 extends Printer {
	
	private String type; //터치 비터치
	//private int price;
	
	public HP200(String type, int price) {
		super(price); // 부모생성자는 항상 다른코드보다 위에 나와야됨!!!1
		this.type = type;
		//this.price = price;
	}
	
	//출력기능
	public void print(String msg) {
		System.out.println("HP200 출력 결과: " + msg);
	}
	
	//ai 기능
	public void ai() {
		System.out.println("Ai 기능 작동 중...");
	}
	
}

class DELL300 extends Printer {
	
	//자체 멤버 구현
	public DELL300(int price) {
		super(price);
		
	}

	@Override
	public void print(String txt) {
		 System.out.println("구현......");
		
	}
	
}