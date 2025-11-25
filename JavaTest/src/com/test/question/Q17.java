package com.test.question;

public class Q17 {
	
	public static void main(String[] args) {
		
		String p1 = "홍길동",
			   p2 = "유재석",
			   p3 = "박명수",
			   p4 = "정형돈";
		
		position(p1);
		position(p1,p2);
		position(p1,p2,p3);
		position(p1,p2,p3,p4);
		
		
		
	}
	
	private static void position(String p1, String p2, String p3, String p4) {
		
		
		
		System.out.printf("사원:%s\n대리:%s\n과장:%s\n부장:%s\n\n" , p1, p2, p3, p4);
		
		
	}
	
	private static void position(String p1, String p2, String p3) {
		
		
		
		System.out.printf("사원:%s\n대리:%s\n과장:%s\n\n" , p1, p2, p3);
		
		
	}

	private static void position(String p1, String p2) {
		
		
		
		System.out.printf("사원:%s\n대리:%s\n\n" , p1, p2);
		
		
	}

	private static void position(String p1) {
		
		
		System.out.printf("사원:%s\n\n", p1);
				
							
		
	}

}
