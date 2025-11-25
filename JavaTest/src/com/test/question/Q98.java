package com.test.question;

public class Q98 {
	
	public static void main(String[] args) {
		
		//학생 1
		Student s1 = new Student(); //기본 생성자 호출
		System.out.println(s1.info());

		//학생 2
		Student s2= new Student("홍길동", 13); //오버로딩 생성자 호출
		System.out.println(s2.info());

		//학생 3
		Student s3= new Student(3, 10, 30); //오버로딩 생성자 호출
		System.out.println(s3.info());

		//학생 4
		Student s4= new Student("아무개", 12, 1, 5, 11); //오버로딩 생성자 호출
		System.out.println(s4.info());
	}
	

}

class Student {
	private String name;
	private int age;
	private int grade;
	private int ban;
	private int number;
	
	public Student() {
		this.name = "미정";
		this.age = 0;
		this.grade = 0;
		this.ban = 0;
		this.number = 0;
	}
	
	public Student(String name, int age, int grade, int ban, int number) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
	}
	
	public Student(String name, int age) {
		this.name = name;
		this.age = age;
		this.grade = 0;
		this.ban = 0;
		this.number = 0;
	}
	
	public Student(int grade, int ban, int number) {
		this.name = "미정";
		this.age = 0;
		this.grade = grade;
		this.ban = ban;
		this.number = number;
	}
	
	public String info() {
		return String.format("%s(나이:%s,학년:%s,반:%s,번호:%s)"
									, this.name
									, age != 0 ? this.age + "세" : "미정"
									, grade != 0 ? this.grade : "미정"
									, ban != 0 ? this.ban : "미정"
									, number != 0 ? this.number : "미정"
									);
	}
	
}