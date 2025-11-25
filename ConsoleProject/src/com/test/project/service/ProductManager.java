package com.test.project.service;

import java.util.List;

import com.test.project.data.OfflineProduct;
import com.test.project.data.OnlineProduct;
import com.test.project.data.Product;

public interface ProductManager { 
	
	void create(); //온오프라인 둘다 등록가능 업캐스팅!! //상품등록
	//void create(OfflineProduct product); //입력내용이 달라서
	//void create(OnlineProduct product); //입력내용이 달라서
	
	 void list(); //상품 목록 (1.모든 2.오프 3.온라인)
	 void edit(); //상품 수정
	 void delete();	//상품 삭제
	 
	 

}
