package com.test.project;

import java.io.IOException;
import java.util.Scanner;

import com.test.project.data.Data;
import com.test.project.service.ProductManager;
import com.test.project.service.ProductService;
import com.test.project.ui.UI;

public class Main {
	
	public static void main(String[] args) throws IOException {
		//텍스트 파일: HDD > 복사 >메모리
		//1. 속도
		//2. 코드 편의성(***)
		Data.load();
		System.out.println("시작 화면"); //스플래시 화면 아스키코드 등 
		boolean loop = true;
		
		
		
		Scanner scan = new Scanner(System.in);
		
		//ProductService service = new ProductService();
		ProductManager service = new ProductService(); //
		//DManager dService = new DService();
		
		while (loop) {
			
			UI.mainmenu(); //메뉴 호출 UI클래스에서
			
			String sel = scan.nextLine();
			
			if (sel.equals("1")) {
				service.create();
			} else if (sel.equals("2")) {
				service.list();
			} else if (sel.equals("3")) {
				service.edit();
			} else if (sel.equals("4")) {
				service.delete();
			} else {
				loop = false;
			}
			
		}
		
		Data.save();
		
		System.out.println("종료");
		
		
	}//main

}
