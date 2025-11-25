package com.test.project.data;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.test.project.file.FileManager;

public class Data {
	
	public static ArrayList<OfflineProduct> offlineProductList;
	
	static {
		offlineProductList = new ArrayList<OfflineProduct>();
	}

	public static void load() throws IOException {
		
		//ArrayList<OfflineProduct> 가변데이터를 컬렉션으로 메모리에 불러옴
		try {
			BufferedReader reader = new BufferedReader(new FileReader(FileManager.오프라인상품));
			
			
			
			//reader > list
			String line = null;
			while ((line = reader.readLine()) !=null) {
				//System.out.println(line);
				//line 1개 == 오프라인상품 1개
				String[] temp = line.split(",");
				
				OfflineProduct off = new OfflineProduct(temp[0]
														, temp[1]
														, Integer.parseInt(temp[2])
														, Integer.parseInt(temp[3])
														, temp[4]
														, temp[5]);
				offlineProductList.add(off);
			}
			
			
			reader.close();
			
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public static void save() {
		
		//처음시작(6건) > 나중에 추가(3건)
		//데이터(txt) 저장시 스트림은 일부내용 수정 불가 -> 수정이든 뭐든 새로운파일로 덮어쓰는 작업
		try {
			
			BufferedWriter writer = new BufferedWriter(new FileWriter(FileManager.오프라인상품));
			
			//offlineProductList > (덮어쓰기) > 오프라인상품.txt
			
			for (OfflineProduct op : Data.offlineProductList) {
				//op 1개 > 텍스트 파일 1줄
				writer.write(String.format("%s,%s,%d,%d,%s,%s\r\n"
															, op.getCode()
															, op.getName        ()
															, op.getPrice()
															, op.getQty()
															, op.getLocation()
															, op.getCategoryCode()));
				
			}
			
			writer.close(); //기록작업이 끝나면 항상 닫아줘야됨
							//자원해제코드 ,Clean Code
			
		} catch (Exception e) {
			System.out.println("Data.save");
			e.printStackTrace();
		}
		
		
		
		
	}

}
