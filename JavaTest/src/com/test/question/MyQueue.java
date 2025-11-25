package com.test.question;

public class MyQueue {
	
	private String[] list;
	private int index;
	
	public MyQueue() {
		this.list = new String[4];
		this.index = 0;
	}
	
	public void add(String value) {
		doubling();
		
		this.list[this.index] = value;
		this.index++;
	}

	public void doubling() {
		if (this.index <= this.list.length) {
			String[] temp = new String[this.list.length * 2];
			for(int i=0; i < this.index; i++) {
				temp[i] = this.list[i];
			}
			this.list = temp;
		}
	}
	
	public String poll() {
		if (this.index == 0) {
			return null;
		}
		
		String temp = this.list[0];
		
		for (int i=0; i < this.index -1; i++) {
			this.list[i] = this.list[i + 1];
			
		}
		this.index --;
			return temp;
		
	}
	
	public String peek() {
		if (this.index ==0) {
			return null;
		} return this.list[0];
	}
	
	public int size() {
		return this.index;
	}
	
	public void clear() {
		this.index = 0;
	}
	
	public void trimToSize() {
		String[] temp = new String[this.index];
		for (int i =0; i<this.index; i++) {
			temp[i] = this.list[i];
	}
		this.list = temp;

	
}	
	//디버깅용 // 현재상태 확인용
	public String toString() {
		String temp = "";
		temp += "length: " + this.list.length + "\r\n";
		temp += "index: " + this.index + "\r\n";
		temp += "[\r\n";
		for (int i = 0; i < this.list.length; i++) {
			temp += " " + i + ":" + this.list[i] + "\r\n";
		}
		temp += "]";
		return temp;
	}
	
}
