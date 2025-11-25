package com.test.java.obj;

public class Ex34_Static {
	public static void main(String[] args) {
		
			//Ex34.Static
			/*
			 
			 	static 정적 키워드
			 	-지시자(제어자) 중 하나
			 	-클래스 or 클래스 멤버에 붙이는 키워드
			 	-메모리 절약 && 유지보수, 데이터 일괄성 유지
			 */
		
		//요구사항] 학생 3명> 관리 프로그램
		//- "역삼 중학교"(타 학교 학생)
		//- 
		
		//Math.random(); //관리가 어려워 많이 쓰진 않음, 대부분 객체임.
						//개성이 필요없는 특성들은 공용으로 관리 -> 정적으로 관리 static
//		Math m1 = new Math();
//		m1.random();
//		
//		Math m2 = new Math();
//		m2.random();
//		
//		Math m3 = new Math();
//		m3.random();
//		
		Student.setSchool("역삼중학교"); //메모리 절약 && 유지보수, 데이터 일괄성 유지
		
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setAge(15);
		//s1.setSchool("역삼중학교");
		
		Student s2 = new Student();
		s2.setName("아무개");
		s2.setAge(13);
		//s2.setSchool("역삼중학교");
		
		Student s3 = new Student();
		s3.setName("테스트");
		s3.setAge(15);
		//s3.setSchool("역삼중학교");
		
		 System.out.println(s1.info());
		 System.out.println(s2.info());
		 System.out.println(s3.info());
		
		
	}//main
}


class Student {
	
	private String name;  //객체 메서드 <--->  school 클래스 메서드,static 붙은 메서드
	private int Age;
	//private String school; //공용데이터 처리 하는게 좋음
	private static String school; //static x -> Heap에 생성 / static o ->  메서드에 생성 
									//JVM이 관여 // {스택 , 힙 , 매서드}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	
//	public String getSchool() {
//		return school;
//	}
//	public void setSchool(String school) {
//		//The static field Student.school should be accessed in a static way
//		//this.school = school;
//		Student.school = school;
//	
//	
//	}
	
	public static String getSchool() { //static이 붙음
		return school;
	}
	public static void setSchool(String school) { //static이 붙음
		Student.school = school;
	}
	public String info() {
		
		//System.out.printf("문자열",값) //하는일이 같음 // 처리된 문자열을 출력하고 끝남./console에서만 사용
		//return String.format("문자열", 값) //처리된 문자열을 그대로 반환(이후 계속 사용가능함)/ 범용성 굳(*****)
		return String.format("%s[%d세,%s]"
								, this.name
								, this.Age
								, school);
	}
	
	
}

