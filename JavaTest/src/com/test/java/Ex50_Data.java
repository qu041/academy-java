package com.test.java;

import java.util.Random;

public class Ex50_Data {
	
	public static void main(String[] args) {
		
		//Ex50_Data.java
		
		//m1();
		m2();
		
		
		
	}

	private static void m2() {
		
		//프로젝트 -기획은 크게 하고 구현에서 줄이기 / 볼륨감 키우기/ 더미데이터 만들기(출력용95%)/5% 정확한데이터 직접-기능및 시연용 데이터
		//더미데이터 만들기
		//학생 관리 프로그램
		//1.중학교                     //클라이언트가 원하는 내용? 상황 구체화하기
		//2.1~3학년 > 1학년 데이터
		//3.학급 1~10반  > 1학년 1반
		//4. 30명
		//5. 이름, 나이, 성별, 주소, 국어, 영어, 수학
		
		Random rnd = new Random();
	
		
			
			String[] name1 = { "김", "이", "박", "최", "정", "유", "민", "차", "장", "나", "조" };
			String[] name2 = { "길", "남", "연", "정", "희", "하", "연", "종", "인", "경", "송", "형" };
			
			String[] address1 = { "서울시", "인천시", "부산시", "강릉시", "대구시", "광주시", "제주시" };
			String[] address2 = { "강남구", "강동구", "강북구",	"강서구","중구"};
			String[] address3 = { "역삼동",	"대치동", "압구정동", "신림동", "천호동", "길동" };
			
			
			
			for(int i=0; i<30; i++) {
				
				String name = name1[rnd.nextInt(name1.length)] 
							+ name2[rnd.nextInt(name2.length)] 
							+ name2[rnd.nextInt(name2.length)];
				
				int age = rnd.nextInt(2) + 13; //13~14
				
				String gender = rnd.nextInt(2) == 0 ? "남자" :"여자";		
				
				String address = address1[rnd.nextInt(address1.length)] + " " 
								+ address2[rnd.nextInt(address2.length)] + " "
								+ address3[rnd.nextInt(address3.length)] + " "
								+(rnd.nextInt(300) + 100) + "번지";
				
				
				System.out.printf("%s(%d세) %s %s\n", name, age,gender,address);
				
				
				
				
				
				
			
			
		}
		
		
	}

	private static void m1() {
		
		//난수 만들기
		//1. Math.random()
		//2. Random 클래스
		//System.out.println(Math.random()); //0~1
		//System.out.println(Math.random() * 100); //1~10
		
		Random rnd = new Random();
		
		//rnd.
		
		for (int i=0; i<10; i++) {
			//System.out.println(rnd.nextInt()); //
			//System.out.println(rnd.nextDouble()); // Math.random()
			//System.out.println(rnd.nextBoolean()); //
			System.out.println(rnd.nextInt(10) +1); //
		}
		
		
	}

}
