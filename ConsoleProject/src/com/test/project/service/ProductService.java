package com.test.project.service;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import com.test.project.data.Data;
import com.test.project.data.OfflineProduct;
import com.test.project.file.FileManager;
import com.test.project.ui.UI;

public class ProductService implements ProductManager {

	@Override
	public void create() {
		
		Scanner scan = new Scanner(System.in);
		
		//상품 등록
		UI.submenu(UI.CREATE);
		
		String sel = scan.nextLine();
		
		if (sel.equals("1")) {
			createOfflineProduct();
			
		} else if (sel.equals("2")) {
			createOnflineProduct();
		} else {
			//메인 메뉴로 돌아가기 > ??
			//Main.main(null); // 새로운 메인을 열어서 기존 메인메뉴가 남아있음. //메인메서드는 호출 X
			
			
		}
		
		
		
	}

	private void createOnflineProduct() {
		// TODO Auto-generated method stub
		
	}

	private void createOfflineProduct() {
		UI.submenuTitle("오프라인 > 등록");
		
		Scanner scan = new Scanner(System.in); //오프라인상품txt입력받는화면
		System.out.print("상품코드: ");
		String code =  scan.nextLine();
		
		System.out.print("상품명: ");
		String name = scan.nextLine();
		
		System.out.print("가격: ");
		int price = scan.nextInt();
		
		System.out.print("수량: ");
		int qty = scan.nextInt();
		scan.nextLine(); // 인티저다음에 문자열이 올때 발생하는 현상 때문에
		
		System.out.print("위치: ");
		String location = scan.nextLine();
		
		System.out.print("카테고리: "); //C1 여기서 카테코리 txt 불러와서 출력을 해주고 고르는 방법을 써야됨....
		String category = scan.nextLine();
		
		//파일쓰기 > 컬렉션 추가 > 텍스트 파일 반영을 시키려면 별도의 작업필요 > 메인 메서드 프로그램 종료전
		
		OfflineProduct op =  new OfflineProduct(code, name, price, qty, location, category);
		
		Data.offlineProductList.add(op);
		Data.save();
		
		UI.pause();
		
		//파일쓰기 > 바로 메모리의 txt파일
//		try {
//			BufferedWriter writer = new BufferedWriter(new FileWriter(FileManager.오프라인상품, true)); //덮어쓰기로 하면 망함
//			writer.write(String.format("%s,%s,%d,%d,%s,%s\r\n",code
//															,name
//															,price
//															,qty
//															,location
//															,category));
//			writer.close();
//			
//			UI.pause();
//			
//			
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} //파일경로 클래스 빼기
		
		
		
	}

	@Override
	public void list() {
		
		Scanner scan = new Scanner(System.in);
		
		
		UI.submenu(UI.LIST);
		//전체상품? 오프라인? 온라인?
		System.out.print("선택: ");
		String sel = scan.nextLine();
		
		if (sel.equals("1")) {
			//오프라인
			listOfflineProduct();
		} else if (sel.equals("2")) {
			listOnlineProduct();
		} else if (sel.equals("3")) {
			listAllProduct();
		} else {
			
		}
		
		
	}

	private void listAllProduct() {
		// TODO Auto-generated method stub
		
	}

	private void listOnlineProduct() {
		// TODO Auto-generated method stub
		
	}

	private void listOfflineProduct() {
		UI.submenuTitle("오프라인 >  목록");
		
		//원래: 파일읽기
		//현재: 컬렉션 읽기->>하는법 확실히!
		System.out.println("[코드]\t[상품명]\t[가격]\t[수량]\t[위치]\t[카테고리]");
		
		for (OfflineProduct p : Data.offlineProductList) {
			System.out.printf("%s\t%5s\t%,d\t%,d\t%s\t%s\r\n"
								, p.getCode()
								, p.getName()
								, p.getPrice()
								, p.getQty()
								, p.getLocation()
								, p.getCategoryCode());
		}
		
	}

	@Override
	public void edit() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete() {
		
		//삭제처리
		UI.submenu(UI.DELETE);
		
		Scanner scan = new Scanner(System.in);
		String sel = scan.nextLine();
		
		if(sel.equals("1")) {
			deleteOfflineProduct();
		} else if (sel.equals("2")) {
			deleteOnlineProduct();
		} else {
			
		}
		
		
		
	}

	private void deleteOnlineProduct() {
		// TODO Auto-generated method stub
		
	}

	private void deleteOfflineProduct() {
		UI.submenuTitle("오프라인 > 삭제");
		//1.목록 출력 > 선택 >삭제 (1번방법)
		System.out.println("[코드]\t[상품명]");
		
		for (OfflineProduct op : Data.offlineProductList) {
			System.out.printf("%s: %s\r\n"
										,op.getCode()
										,op.getName());
		}
		Scanner scan = new Scanner(System.in);
		System.out.print("삭제할 상품코드: ");
		String code = scan.nextLine();
		//컬렉션 내부 > code를 가진 상품 검색 >  remove
		//Data.offlineProductList.remove(방번호)
		//Data.offlineProductList.remove(요소)
		
		for (OfflineProduct op : Data.offlineProductList) {
			
			if (op.getCode().equals(code)) {
				//이 상품 삭제
				Data.offlineProductList.remove(op);
				break;
			}
		}
		Data.save(); // 중간에 예기치않게 꺼지는 상황 백업용 // 여기랑 메인 종료전에 쓰면 좋음? 물어보기
		UI.pause();
		
		
		//2. 입력 > 삭제 (2번방법)
		
		
	}

	

}
