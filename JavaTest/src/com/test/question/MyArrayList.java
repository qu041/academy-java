package com.test.question;

public class MyArrayList {
	
	private String[] list;
	private int index;
	
	public MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public MyArrayList(int capacity) { //오버로딩
		this.list = new String[capacity];
		this.index = 0;
	}

	public boolean add(String value) {
	 if (this.index == this.list.length) {
		 
		 String[] temp = new String[list.length * 2]; //사이즈가 꽉차면 두배 확장후 기존꺼 새로운곳에 복사
		 
		 for (int i=0; i<list.length;i++) {
			 temp[i] = list[i];
		 }
		 this.list = temp; //  확장된 배열을  다시 연결해줌
	 } 
	 	list[index] =value;		// 값 추가는 항상 있어야 하기 때문에 이프문 바깥에 추가
	 	index++;
	 	return true;
	}

	public String get(int index) {
		return this.list[index]; // 유효성검사 삭제해도 되는지?
	}

	public int size() {
		 return this.index; //실제 넣은 값의 갯수 반환
	}

	public void set(int index, String value) {
		//유효성검사?
		
	    this.list[index] = value;
	    
		
	}

	public void remove(int index) {
		for (int i=index; i<this.index -1;i++) {
			this.list[i] = this.list[i+1]; //한칸씩 땡김
		}
		
		this.index--;// 개수 감소
		
	}

	public boolean add(int index, String value) {
		 if (this.index == this.list.length) {   // 기존 오버로딩 전 코드 재활용
			 String[] temp = new String[list.length * 2]; //사이즈가 꽉차면 두배 확장후 기존꺼 새로운곳에 복사
			 
			 for (int i=0; i<list.length;i++) {
				 temp[i] = list[i];
			 }
			 this.list = temp; //  확장된 배열을  다시 연결해줌
		
	}
		 	
		 for (int i = this.index; i > index; i--) { //인덱스 끝부터 넣으려는 방 앞까지 떙기기 시전
			 this.list[i] = this.list[i-1]; // 결론적으로 넣으려는 위치까지 뒤로 한칸씩 이동
		 }
		 	this.list[index] = value; //넣으려는 값 삽입
		 	this.index ++; //인덱스 하나 늘려주기 
		 	
		 	return true;
	
	}

	public int indexOf(String value) {
		for (int i = 0; i < this.index; i++) {
			if (this.list[i] !=null && this.list[i].equals(value)) {
				return i;
		}
		
	}
	 	return -1;
}
		
	public void clear() {

		this.index = 0;
	


}

}
