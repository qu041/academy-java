package com.test.java;


	public class Ex07_Output {
	
		public static void main(String[] args) {
		
		
		// Ex07_Output.java
		/*
		 * 콘솔 입출력, Console Input Output > IO - 기본 입력 장치: 키보드 - 기본 출력 장치: 모니터
		 * 
		 * 콘솔 출력 -클래스.필드.메서드(인수)
		 * 
		 * 1. System.out.println(값); 
		 * 		-Println 메서드
		 *      -print line > 줄단위로 출력한다.
		 * 					> 값을 출력한 뒤 엔터를 친다.
		 * 2. System.out.print(값); 
		 * 		-Print 메서드
		 * 			>줄단위를 안바꾸고 출력한다.
		 *      
		 * 
		 * 3. System.out.printf(형식문자열, 값들...); // 제일 중요**
		 *      -Printf 메서드
		 *      -형식 문자를 지원 > 다양한 문자열을 조작/출력 도움 제공
		 *      -가독성 향상
		 *      a. %s > String
		 *      b. %d > Decimal(정수형모두 byte, short, int, long)
		 *      c. %f > Float(float, double)
		 *      d. %b > Boolean
		 *      e. %c > Character
		 *      
		 *   
		 */
		
		System.out.print(100);
		System.out.print(3.14);
		System.out.print('a');
		System.out.print("문자열");
		
		//성적표 출력하기
		String name1 = "홍길동", name2 = "아무개";
		
		int Kor1 = 100, eng1 = 90 ,math1= 70,
			kor2 = 95, eng2 = 89, math2 = 92;
		
		System.out.println();
		System.out.println("========================");
		System.out.println("        🏫성적표          ");
		System.out.println("========================");
		System.out.println("[이름]\t[국어]\t[영어]\t[수학]");
		
		System.out.print(name1);
		System.out.print("\t");
		System.out.print(Kor1);
		System.out.print("\t");
		System.out.print(eng1);
		System.out.print("\t");
		System.out.print(math1);
		
		System.out.println();
		System.out.println(name2 + "\t" + kor2 + "\t" + eng2 + "\t" + math2);
		
		//요구사항] "안녕하세요. 홍길동님" 문장을 출력하시오.
		String name = "홍길동"; //사용자가 키보드로 입력
				
		System.out.println("안녕하세요. " + name + "님");
		System.out.printf("안녕하세요. %s님\r\n", name);
		
		//요구사항2] "안녕하세요. 홍길동님. 안녕히가세요. 홍길동님. 반가웠습니다. 홍길동님.,";
		
		System.out.println("안녕하세요. " + name + "님. 안녕히가세요. " + name + "님. 반가웠습니다. " + name + "님.");
		System.out.printf("안녕하세요. %s님. 안녕히가세요. %s님. 반가웠습니다. %s님.", name, name, name);
		
		//템플릿 변경 > Java statement > sysp((${value});${cursor}
		//sysp > print()
		//sysf > printf()
		
		//확장 기능
			//1. %숫자s, %숫자d, %숫자f, %숫자c, %숫자b
			//- 숫자: 양/음 정수
			//- 출력할 내용의 너비를 지정한다.
			//- 탭문자와 함께 사용
			//- +: 우측 정렬
			//- -: 좌측 정렬
		
		System.out.printf("문자열: %s\n",  "홍길동");
		System.out.printf("정수: %d\n", 100);
		System.out.printf("실수: %f\n", 3.14);
		System.out.printf("문자: %c\n", 'A');
		System.out.printf("논리: %b\n", true);
		System.out.println();
		
		int num = 123;
		System.out.printf("[%d]\n", num);
		System.out.printf("[%10d]\n", num);
		System.out.printf("[%-10d]\n", num);
		
		//2. %.숫자f
		//-소수점 이하 자릿수 지정
		// %f: 소수이하 6자리 출력
		
		double num2 = 3.15;
		
		System.out.println(num2);
		System.out.printf("%f\n", num2);
		System.out.printf("%.1f\n", num2);
		System.out.printf("%.0f\n", num2);
		
		//3. %,d, %,f
		//- 숫자 +,
		//- 자릿수 표기(천단위 표기 -3자리)
		int price = 1_234_567;
		System.out.printf("금액: %d원\n", price);
		System.out.printf("금액: %,d원\n", price);
		System.out.println();
		
		//천단위 + 소수이하(2자리) + 출력너비(20자리, 우측정렬)
		double num3 = 1234567.89012345;
		System.out.printf("[%f]\n", num3);
		System.out.printf("[%,20.2f]\n", num3);
		System.out.println();
		System.out.println();
		System.out.println();

		//메뉴판 출력> 열 정렬 > 탭문자 +형식문자 조합  ->>>> 반복 필수!!!!
		System.out.println("==============");
		System.out.println("  음료가격(단위:원)    ");
		System.out.println("==============");
		System.out.printf("콜라\t\t: \t%,6d\n", 2500);
		System.out.printf("스무디\t\t: \t%,6d\n", 3500);
		System.out.printf("사이다\t\t: \t%,6d\n", 500);
		System.out.printf("아메리카노\t: \t%,6d\n", 15000);
		
		System.out.println();
				
		
	
		
		
		
	}
}
