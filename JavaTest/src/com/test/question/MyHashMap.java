package com.test.question;

public class MyHashMap {
	
	private Item[] list;
	private int index;
	
	public MyHashMap() {
		this.list = new Item[4];
		this.index = 0;
	}
	
	public void put(String key, String value) {
		doubling();
		
		int idx = getIndex(key);
		if (idx > -1) {
			//이미 값존재 수정만
			this.list[idx].value = value;
		} else {
			//새로추가
			this.list[this.index] = new Item(key, value);
			this.index++;
		}
		
	}
	
	public String get(String key) {
		for (int i=0; i<this.index; i++) {
			if (this.list[i].key.equals(key)) {
				return this.list[i].value;
			}
		}
		return null;
	}
	
	private int getIndex(String key) {
		for (int i = 0; i<this.index;i++) {
			if (this.list[i].key.equals(key)) {
				return i;
			}
		}
		return -1;
	}
	
	public void remove(String key) {
		int idx = getIndex(key);
		if (idx == -1) {
			return;
		}
		
		for (int i = idx; i< this.index -1; i++) {
			this.list[i] = this.list[i+1];
		}
 	
		this.list[this.index-1] = null;
		this.index--;
		
	}
	
	public boolean containsKey(String key) {
		return getIndex(key) > -1;
	}
	
	public boolean containsValue(String value) {
		for (int i=0; i<this.index;i++) {
			if (this.list[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	
	public int size() {
		return this.index;
	}
	
	public void clear() {
		this.index= 0;
	}
	
	public void trimToSize() {
		Item[] temp = new Item[this.index];
		for (int i=0; i< this.index; i++) {
			temp[i] = this.list[i];
		}
		this.list = temp;
	}

	private void doubling() {
		if (this.index >= this.list.length) {
			Item[] temp = new Item[this.list.length * 2];
			for (int i=0; i< this.index; i++) {
				temp[i] = this.list[i];
				
			}
			
			this.list = temp;
		}
		
	}









	class Item {
		public String key;
		public String value;
		
		public Item(String key, String value) {
			this.key = key;
			this.value = value;
		}
		
	}
	
	
	
}
