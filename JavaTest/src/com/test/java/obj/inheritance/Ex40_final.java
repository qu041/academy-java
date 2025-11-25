package com.test.java.obj.inheritance;

import java.util.Calendar;

public class Ex40_final {
	
	public static void main(String[] args) {
		
		//Ex40_final.java
		/*
			
			final 키워드
			- 한번 결정하면 바꿀 수 없다.
			-왜? 안정성이 높히기 위해서
			
			1. 변수 적용(지역 변수, 멤버 변수) ***
				- 초기화 이후에 값을 변경할 수 없다.
				- (final)상수
			
			2. 메서드 적용
				- 상속 시 오버라이딩 방지
				- 상속 구현시 웬만하면 사용 할 일이 없음. (프로젝트가 크면 구현 할 일 생김)
				
			3. 클래스 적용
				- 상속을 방지
			
		*/
		
		final int A = 10; //되도록 선언과 동시에 초기화를 권장.
		//A= 20; // The final local variable A cannot be assigned.
		
		final int B;
		B = 20; // 수정(x), 초기화(O)
		//B = 30; //불가능
		
		//캘린더 상수
		System.out.println(Calendar.YEAR);
		//Calendar.YEAR = 10; //The final field Calendar.YEAR cannot be assigned
		
		//학생정보 > 성별 구분
//		s1.성별 = "남자";
//		s2.성별 = "여자";
//		s3.성별 = "남자";
		
		
//		final int MALE = 1;
//		final int FEMALE = 2;
		
		
		Student s1 = new Student();
		s1.name = "홍길동";
		s1.age = 20;
//		s1.gender = MALE;
//		s1.gender = Student.MALE;
		s1.gender = Gender.MALE;
		
		Student s2 = new Student();
		s2.name = "호호호";
		s2.age = 22;
//		s2.gender = FEMALE;
//		s2.gender = Student.FEMALE;
		s2.gender = Gender.FEMALE;
		
		
		
		
//		FinalChild c1 = new FinalChild();
//		System.out.println(c1.getNumber());
		
		
		
		
	}//main

}

class Gender {
	public static final int MALE = 1;
	public final static int FEMALE = 2;
	
}



class Student {
	public String name;
	public int age;
	
	public int gender; // 성별 > 남자(1), 여자(2) > 열거형 데이터 > 숫자 사용
	
	//앞뒤가 바껴도 됨
//	public static final int MALE = 1;
//	public final static int FEMALE = 2;
	
}

//최종 클래스
final class FinalParent { 
	//멤버 구현...
	//메소드를  final 붙여서 자식이 못고치게 할 수 있음./ 사용할 때 많은 고민이 필요함.
	public final String getNumber() {
		return "하나";
	}
}

//The type FinalChild cannot subclass the final class FinalParent
//class FinalChild extends FinalParent {
//	
////	public String getNumber() {
////		return "안녕하세요.";
////	}
//	
//}







