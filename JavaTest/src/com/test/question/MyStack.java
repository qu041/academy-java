package com.test.question;

public class MyStack {
	
	private String[] list;
	private int index;
	
	public MyStack() { //생성자 만들기  초기생성 방은 4개 값은 0 기본값
		this.list = new String[4];
		this.index = 0;
	}
	
	public boolean push(String value) {
		
		
		
		doubling(); //꽉찼을시 두배로 두배로 할지는 맘대로 해도됨.
		
		list[index] =value;		// 값 추가는 항상 있어야 하기 때문에 더블링 이프문 바깥에 추가
	 	index++;
	 	return true;
		
	}

	private void doubling() {
		 if (this.index == this.list.length) {
			 
			 String[] temp = new String[list.length * 2]; //사이즈가 꽉차면 두배 확장후 기존꺼 새로운곳에 복사
			 
			 for (int i=0; i<list.length;i++) {
				 temp[i] = list[i];
			 }
			 this.list = temp; //  확장된 배열을  다시 연결해줌
		 } 
		 	
		
	}
	//혼자 구현  //유효성검사 추가
	public String pop() { // 꺼내기.. 스택은 후입선출이니까 뒤에서부터 꺼내고 없앰
	if (this.index == 0) {
		System.out.println("빈스택입니다.");
		return null;
	} 
		String lastIn = this.list[this.index-1]; // 맨뒤에 읽기 // 인덱스에서 인덱스 -1한게 방위치
		index --; //꺼낸뒤 다시 읽지 않고 빼버림. 인덱스 수를 줄여서 못읽게 함. 값은 보이지않지만 남아있음.
		return lastIn;
	}

	public int size() { 
		return this.index; //인덱스 길이가 곧 length니까  인덱스 값 반환
	}

	public String peek() { //들여다 보기만 하니까 제일 뒤에꺼 String으로 훔쳐보기
		if (this.index == 0) {
			System.out.println("빈스택입니다.");
			return null;
		}
		return this.list[this.index-1]; // 마지막 방 보기 출력
		
	}

	public void trimToSize() {					
		String[] temp = new String[this.index]; //원래 있던 인덱스 크기의 새로운주소 생성
		for (int i=0; i<this.index;i++) {
			temp[i] = this.list[i];   //하나하나 옮기기  여기서 빈칸이 왜 사라지는지 물어보기      //??이해안됨  //힢에서 새로운 주소 연결(이사)
		}
		this.list = temp;		// 다시 힢 원래 방(주소)에 연결 -> 참조형이라
	}
	
	public void printArrayLength() { //트림 확인용 메서드 제작
		System.out.println("배열의 길이: " + this.list.length);
	}

	public void clear() {
//		1.모든 요소 삭제용 클리어
//					// <=this.index -1;
//		for (int i=0; i<this.index; i++) {
//			this.list[i] = null; //하나하나 공란(null)으로 수정
//		} 
//		this.index = 0; //공란으로 만든후 방 줄이기 
					
		//2.인덱스 길이를 0으로 바꿔서 값은 남아있지만 접근 못하게 막는 초기화 방법
		//this.index = 0; 
		
		//3.수미상관식 방법
		this.list = new String[4];
		this.index = 0; //초기화시 그대로의 상태로 클리어
	}

}
