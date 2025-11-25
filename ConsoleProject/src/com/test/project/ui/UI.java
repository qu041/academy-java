package com.test.project.ui;

import java.util.Scanner;

public class UI {
	
	public static final int CREATE = 1;
	public static final int LIST = 2;
	public static final int EDIT = 3;
	public static final int DELETE = 4; //숫자가 의미를 알 수 없엇 의미를 주기 위해 파이널변수 생성.
	
	public static void mainmenu() {
		System.out.println("================================"); // 첫메뉴출력
		System.out.println("============상품관리============"); // 첫메뉴출력
		System.out.println("================================"); // 첫메뉴출력
		System.out.println("1. 상품 등록");
		System.out.println("2. 상품 목록");
		System.out.println("3. 상품 수정");
		System.out.println("4. 상품 삭제");
		System.out.println("5. 종료");
		System.out.println("---------------------");
		System.err.print("선택: ");
	}
	
	public static void submenu(int type) {
		if (type ==UI.CREATE) {
		System.out.println("################################");
		System.out.println("             상품등록           ");
		System.out.println("################################");
		System.out.println("1. 오프라인 상품");
		System.out.println("2. 온라인 상품");
		System.out.println("3. 돌아가기");
		} else if (type == UI.LIST ) {
		System.out.println("################################");
		System.out.println("             상품목록           ");
		System.out.println("################################");
		System.out.println("1. 오프라인 상품");
		System.out.println("2. 온라인 상품");
		System.out.println("3. 모든 상품");
		System.out.println("4. 돌아가기");	
			
		} else if (type == UI.EDIT ) {
			
		} else if (type == UI.DELETE ) {
			System.out.println("################################");
			System.out.println("             상품삭제           ");
			System.out.println("################################");
			System.out.println("1. 오프라인 상품");
			System.out.println("2. 온라인 상품");
			System.out.println("3. 돌아가기");		
		}
		
		System.out.println("--------------------------------");
		System.out.print("선택: ");
	

}
	public static void submenuTitle(String title) { //특수문자 쓰기 번거로워서
		System.out.println("@@@@@@@@@@@@@@@@@@");
		System.out.println(title);
		System.out.println("@@@@@@@@@@@@@@@@@@");
	}
	
	public static void pause() {
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println("계속하려면 엔터를 치세요.");
		scan.nextLine();
		
	}
	
	
}
