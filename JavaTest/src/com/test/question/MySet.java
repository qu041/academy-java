package com.test.question;

public class MySet {
	private String[] list;
	private int index;
	private int sindex;
	
	public MySet() {
		this.list = new String[4];
		this.index = 0;
		this.sindex = 0;
	}
	
	public boolean add(String value) {
		try {
			if(isDuplicate(value)) {
				return false;
			}
			
			if (checkLength()) {
				doubleList();
			}
			
			this.list[this.index] = value;
			this.index++;
			
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	private boolean isDuplicate(String value) {
		for (int i=0; i < this.index; i++) {
			if(this.list[i].equals(value)) {
				return true;
			}
		}
		return false;
		}
	
	private boolean checkLength() {
		return this.index == this.list.length;
	}
	
	private void doubleList() {
		String[] temp = new String[this.list.length *2];
		for (int i = 0; i <this.list.length; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}
	
	public int size() {
		return this.index;
	}
	
	public String remove(String value) {
		int index = -1;
		for (int i=0; i<this.index; i++) {
			if (this.list[i].equals(value)) {
				index = i;
				break;
			}
		
		
		
		}
		
		if (index == -1) {
			return null;
		}
		
		for (int i = index; i<this.list.length-1;i++) {
			this.list[i] = this.list[i+1];
		}
		
		this.list[this.index - 1] = null;
		this.index--;
		return value;
		
	}
	
	public void clear()	{
		this.index = 0;
	}
	
	public boolean hasNext() {
		if (this.sindex < this.index) {
			return true;
		}
		return false;
	}
	
	public String next() {
		String temp = this.list[this.sindex];
		this.sindex++;
		return temp;
	}

}
