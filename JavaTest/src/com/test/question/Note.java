package com.test.question;

public class Note {
		
		

		private String size;
		private String color;
		private int page;
		private String owner;
		private int price = 500;
	
		// setter, getter 구현
	

		public void setSize(String size) {
			this.size = size;
			//this.price = price;
			
			if (size.equals("A5")) {
				price += 0;  //기본 대표금액 설정
			} else if (size.equals("A3")) {
				price += 400;
			} else if (size.equals("A4")) {
				price += 200;
			} else if (size.equals("B3")) {
				price += 500;
			} else if (size.equals("B4")) {
				price += 300;
			} else if (size.equals("B5")) {
				price += 100;
			} else {
				return;
			}
			
			
		}

		public void setColor(String color) {
			this.color = color;//이것도 유효성검사 말도 안됨
			//this.price = price;
			if (color.equals("흰색")) {
				price += 0;
			} else if (color.equals("검정색")) {
				price += 100;
			} else if (color.equals("노란색")) {
				price += 200;
			} else if (color.equals("파란색")) {
				price += 200;
			} else {
				return; //이것도 좋은 습관 아님 유효성 검사 따로 빼기
				
			}
			
		}

		public void setPage(int page) {
			this.page = page; //이것도 유효성검사 말도 안됨
			//this.price = price;
			if (10 <= page && page <=50 ) { //■
				price += (page-10) * 10;
			} else if (51 <= page && page <= 100) {
				price += (page - 10) * 10;
			} else if (101 <= page && page <= 200) {
				price += (page - 10) * 10;
			} else {
				return;
			}
		
			
		}

		public void setOwner(String owner) {
			this.owner = owner; //이것도 유효성검사 말도 안됨
			
			for (int i=0; i<owner.length(); i++) {
				char c = owner.charAt(i);
				
				if (c < '가' && c > '힣') {
					return;
				}
			}
			if (owner == null || owner.equals("")) {
		        return;
		    }

		    if (owner.length() < 2 || owner.length() > 5) {
		        return;
		    } //위치가 앞에 있는게 좋음.. 문장길이가 길어졌을때 빨리 빠져나올수 있음.
			
		}

	         
   
			public String info() {
			String tempPage = "";
    
			if (this.page >= 10 && this.page <= 50) {
				tempPage = "얇은";
			} else if (51 <= page && page <= 100) {
				tempPage = "보통";
			} else if (101 <= page && page <= 200) {
				tempPage = "두꺼운";

			}
			String temp = "";
			
			temp += "노트정보\n";
			
			if (this.owner == null || this.owner.equals("")) {
		        temp += "주인 없는 노트\n";
		    } else {
		    	temp += String.format("소유자: %s\n", owner);
		    	temp += String.format("특성: %s %s %s노트\n", color,tempPage, size);
		    	temp += String.format("가격: %,d원\n", this.price);
		    
		    } 
			
			
			return temp;
			
			
			
			}

}