package com.test.question;

public class Q93 {
	
	public static void main(String[] args) {
		
		Note note = new Note();

		note.setSize("B4");
		note.setColor("노란색");
		note.setPage(25);
		note.setOwner("홍길동");

		System.out.println(note.info());


		Note note2 = new Note();

		note2.setSize("A4");
		note2.setColor("검정색");
		note2.setPage(100);

		System.out.println(note2.info());
		
	}

}
//https://ddururiiiiiii.tistory.com/category/%F0%9F%92%BB%20%EB%9A%9D%EB%94%B1%EB%9A%9D%EB%94%B1?page=2