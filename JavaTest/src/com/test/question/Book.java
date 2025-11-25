package com.test.question;

public class Book {
	
	private String title;
	private int price;
	private String author;
	private String publisher;
	private String pubYear = "2019";
	private String isbn;
	private int page;

	// getter, setter



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		if (title.length() > 50) {
			return;
		} else {
			for (int i=0; i<title.length(); i++) {
				char t = title.charAt(i);
				if ((t <'가' || t > '힣') && 
				    (t <'a' || t > 'z') &&
					(t <'A' || t > 'Z') &&
					(t <'0' || t > '9') &&
					 t != ' ') {
					return;	
				}
			}
			this.title = title;
		    }
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		
		if (0 <= price && price <= 1000000) {
			this.price = price;
		} else {
			return;
		}
	}	

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		if (page >= 1) {
		this.page = page;
		} else {
			return;
		  }
	}
	
	public String getPubYear() {
		return pubYear;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String info() {
        
		return String.format("제목: %s\r\n"
						     + "가격: %,d원\r\n"
						     + "저자: %s\r\n"
						     + "출판사: %s\r\n"				
						     + "발행년도: %s년\r\n"
						     + "ISBN: %s\r\n"				
						     + "페이지: %,d장\r\n"				
						     , title				
						     , price				
						     , author				
						     , publisher				
						     , pubYear				
						     , isbn				
						     , page			
							);

}	
	
	
	
	
	
	
	
}