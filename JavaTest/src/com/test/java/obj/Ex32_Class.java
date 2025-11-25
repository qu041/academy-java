package com.test.java.obj;

import java.util.Arrays;

public class Ex32_Class {
	public static void main(String[] args) {
		
		//Ex32_Class.java
		
//		Employee e2 = new Employee(); // 직원1
//		e2.setName("아무개");
//		e2.setDepartment("개발부");
//		
//
//		Employee e1 = new Employee(); // 직원1
//		e1.setName("홍길동");
//		e1.setDepartment("홍길동");
//		e1.setBossName("아무개");
//		e1.setBossDepartment("개발부");
		
		//m1();
		//m2();
		m3();
		
	}

	private static void m3() {
		
		Person p1 = new Person();
		p1.setName("홍길동");
		p1.setAge(20);
		p1.setAddress("서울시 강남구 역삼동");
		
//		String[] nick = new String[3];
//		nick[0] = "멸치";
//		nick[1] = "무말랭이";
		
//		p1.setNick(nick);
		
//		p1.getNick()[0] ="멸치";
//		p1.getNick()[1] ="무말랭이";
		
		p1.addNick("멸치");
		p1.addNick("무말랭이");
		p1.addNick("이쑤시개");
		p1.addNick("바보");
		
		//System.out.println(p1.getNick()); //알아서 순차적으로
		System.out.println(p1.getNick(1)); //배열의 방번호
		
		
		
//		System.out.println(p1.getName());
//		System.out.println(p1.getAge());
//		System.out.println(p1.getAddress());
//		System.out.println(Arrays.toString(p1.getNick()));
		
		System.out.println(p1.info()); //dump
	}

	private static void m2() {
		Parent father = new Parent();
		father.setName("홍길동");
		father.setAge(40);
		
		Parent mother = new Parent();
		mother.setName("김영희");
		mother.setAge(36);
		
		Child child = new Child();
		child.setName("홍철수");
		child.setAge(3);
		
		child.setFather(father);
		child.setMother(mother);
		
		System.out.println(child.getFather().getName());
	}

	public static void m1() {
		Employee e2 = new Employee();
		e2.setName("아무개");
		e2.setDepartment("개발부");
		
		Employee e1 = new Employee();
		e1.setName("홍길동");
		e1.setDepartment("개발부");
		e1.setBoss(e2);
		
		System.out.println(e1.getBoss().getName());
	}		
}	
	
//직원, 사원 클래스
class Employee {
		
	
		private String name; 		//직원명
		private String department;  //부서명
	
		//직속 상사
		//private String bossName;		//상사명
		//private String bossDepartment;  //상사 부서명
		
		private Employee boss;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
//		public String getBossName() {
//			return bossName;
//		}
//		public void setBossName(String bossName) {
//			this.bossName = bossName;
//		}
//		public String getBossDepartment() {
//			return bossDepartment;
//		}
//		public void setBossDepartment(String bossDepartment) {
//			this.bossDepartment = bossDepartment;
//		}
		public Employee getBoss() {
			return boss;
		}
		public void setBoss(Employee boss) {
			this.boss = boss;
		}
		
	
}

class Parent {
	
		private String name;
		private int age;
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
}

class Child {
		
		private String name;
		private int age;
		
		private Parent father;
		private Parent mother;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public Parent getFather() {
			return father;
		}
		public void setFather(Parent father) {
			this.father = father;
		}
		public Parent getMother() {
			return mother;
		}
		public void setMother(Parent mother) {
			this.mother = mother;
		}
		
	
}
//사람 클래스
class Person {
	
	private String name;
	private int age;
	private String address;
	private int index = 0;
	//별명 > 배열
//	private String nick1;
//	private String nick2;
//	private String nick3;
	private String[] nick = new String[3];

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String[] getNick() {
		return nick;
	}

	public void setNick(String[] nick) {
		this.nick = nick;
	}
	
	public void addNick(String nick) {
		if (index < this.nick.length) {
		this.nick[index] = nick;
		index++;
	} else {
		System.out.println("더 이상 별명을 추가하지 못합니다.");
	}
	
	}	
	
	//getter
	public String getNick(int index) {
		return this.nick[index];
	}
	
	//dump 메서드
	public String info() {
		String temp = "";
		
		temp += "이름: " + name + "\r\n";
		temp += "나이: " + age + "\r\n";
		temp += "주소: " + address + "\r\n";
		temp += "별명: " + Arrays.toString(nick) + "\r\n";
		
		return temp;
	}
	
}

