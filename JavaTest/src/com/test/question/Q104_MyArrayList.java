package com.test.question;

import java.util.Arrays;

public class Q104_MyArrayList {
	
	private String[] list;
	private int index;
	
	public Q104_MyArrayList() {
		this.list = new String[4];
		this.index = 0;
	}

	@Override
	public String toString() {
		
		String temp = "";
		
		temp += "\r\n";
		temp += String.format("length: %d\r\n", this.list.length);
		temp += String.format("index: %d\r\n", this.index);
		temp += "[\r\n";
		for (int i=0; i<this.list.length;i++) {		
			temp += String.format(" %d: %s\r\n", i, this.list[i]);
		}	
		temp += "]";
		return temp += "\r\n";
		
		
	}

	public void add(String value) {
		
		//배열의 깊은 복사?
		if (checkLength()) {
			doubleLength();
		}
		
		this.list[this.index] = value;
		this.index++;
		
	}

	
	
	private void doubleLength() {
		//1. 2배길이 배열생성
		//2. 깊은 복사(직접 or Arrays)
		//3. 바꿔치기
		
		
		String[] temp =  new String[this.list.length *2];
		
		for (int i=0; i<this.index;i++) {
			temp[i] = this.list[i];
		}
		
			this.list = temp; //교체(=확장)
	}
	
	private boolean checkLength() {
		return this.list.length == this.index;
	}

	public String get(int index) {
		if (invaildIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		
		return this.list[index];
	}

	private boolean invaildIndex(int index) {
		if (index<0 || index >= this.index) {
			return true;
		}
		
		return false;
	}

	public int size() {
		
		return this.index;
	}

	public void set(int index, String value) {
		if (invaildIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		
		//수정
		this.list[index] =value;
		
	}

	public void remove(int index) {
		if (invaildIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		//왼쪽 시프트 발생
		for(int i=index; i<=this.list.length-1;i++) {
			this.list[i] = this.list[i+1];
		}
		this.index--;
	}

	public void add(int index, String value) {
			
		if (invaildIndex(index)) {
			//예외 발생
			throw new IndexOutOfBoundsException();
		}
		
		//배열의 깊은 복사?
				if (checkLength()) {
					doubleLength();
				}
				
		//오른쪽 시프트 발생
		for (int i=this.list.length-2; i>=index;i--) {
			this.list[i+1] = this.list[i];
			
		}
		
		this.list[index]= value;
		this.index++;
		
		
	}

	public int indexOf1(String value) {
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int lastIndexOf(String value) {
		for (int i=this.index-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public boolean contains(String value) {
		for (int i=this.index-1; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return true;
			}
		
		
		return false;
	}
	
	
	
	
}
	public int indexOf(String value,int beginIndex) {
		for (int i=beginIndex; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}
	
	public int LastIndexOf(String value,int beginIndex) {
		for (int i=beginIndex; i>=0; i--) {
			if (this.list[i].equals(value)) {
				return i;
			}
		}
		
		return -1;
	}

	public void clear() {
	 //모든 요소 삭제
//		for (int i=0; i<this.index; i++) {
//			this.list[i]= null;
//		}
//		
//		this.index = 0;
		
//		this.list = new String[4];
//		this.index = 0;
		
		this.index = 0; //이방식으로 하려면 유효성검사로 외부에서 데이터에 접근 못하게 막아놔야됨.
						//저렴한 비용, 편한 방법임.
		
		
	}
	
	public void trimToSize() {
		
			//1. 2배길이 배열생성
			//2. 깊은 복사(직접 or Arrays)
			//3. 바꿔치기
			
			
			String[] temp =  new String[this.index];
			
			for (int i=0; i<this.index;i++) {
				temp[i] = this.list[i];
			}
			
				this.list = temp; //교체(=확장)
		}
		
	}
	

