package com.test.java;

public class Ex15_Method {
	
	//main 메서드
	//- 이름이 예약어(main)
	//- 개발자가 호출하는 메서드(x)
	//- 프로그램이 시작되면 자동으로 호출되는 메서드 > JVM이 호출한다.
	//- 프로그램의 시작점(Entry Point)
	//- 프로그램의 종착점(End Point)
	public static void main(String[] args) {
		
		//Ex15_Method.java
		
		//public static void hello() {}
		
		//메서드 인자리스트
		//- 파라미터(Parameter)
		//- 매개변수
		
		//*** 메서드의 가용성을 높힌다.
		
		//요구사항] '홍길동'에게 인사를 하는 메서드를 구현하시오.
		//요구사항] '아무개'에게 인사를 하는 메서드를 구현하시오.
		//요구사항] '강아지'에게 인사를 하는 메서드를 구현하시오.
		//요구사항] 우리 강의실에 모든 사람에게 인사 * 15개
		//요구사항] 대한민국 모든 국민에게 인사 * 5171만개
		
		//public static void helloEveryone(String name)
		//-매개변수, 파라미터, 인자리스트, 가인자
		
		//helloEveryone("홍길동");
		//-인수, Arguments, 실인자
		
		hello();
		hello_amugae();
		hello_dog();
		helloEveryone("홍길동");
		helloEveryone("아무개");
		helloEveryone("강아지");
		sum(10, 20);
		//helloEveryone(10); int -> string으로 형변환이 불가능해서. //다시한번 보기
		
		//호출 주의!!
		//1. 인수의 자료형 > 형변환 가능하면 (인정) 다르면 오류
		//2. 인수의 개수 다를시 오류
		System.out.println();
		
		checkScore(100, 90, 80);
		checkScore(70, 30, 20);
		checkScore(0, 0, 0);
		checkScore(0, 0, 0);
		
	}//main
	
	public static void hello() {
		
		String name = "홍길동";
		
		System.out.println(name + "님. 안녕하세요.");
		
	}
	
	public static void hello_amugae() {
		
		String name = "아무개";
		
		System.out.println(name + "님. 안녕하세요.");
		
	}
	
	public static void hello_dog() {
		
		String name = "강아지";
		
		System.out.println(name + "님. 안녕하세요.");
		
	}
	
	public static void hi() {
		
		System.out.println("Hi~ 홍");
		
		
	}
	
	//모든 사람에게 인사
	public static void helloEveryone(String name) {
									// 매개변수
		//String name = "홍길동";
		
		System.out.println(name + "님. 안녕하세요.");
		
		
	}
						//매개변수는 여러개 입력 가능
	public static void sum(int a, int b) {
		
		System.out.println(a + b);
	
	
	}
	
	//성적 평가
	// -인수: 국어,영어,수학
	// -결과: 평균, 합격/불합격
	// -기준: 평균 60점 이상

	// /**이건 문서주석 컴파일 때 안 사라짐.
	/**
	 * 학생의 성적을 계산 후 출력합니다.
	 * @param kor 국어점수
	 * @param eng 영어점수
	 * @param math 수학점수
	 */
	public static void checkScore(int kor, int eng, int math) {
		
		int total = kor + eng + math; //총점
		double avg = total / 3.0; //평균
		
		String result = avg >= 60 ? "합격" : "불합격";
		
		System.out.printf("평균 점수 %.1f점은 %s입니다.\n", avg, result);
		
		
		
		
	}		
	}

	

		
	

