package com.test.java.collection;

import java.util.Calendar;

public class User {
	
	private String name;
	public User(String name, int level, Calendar regdate, String city) {
		this.name = name;
		this.level = level;
		this.regdate = regdate;
		this.city = city;
	}
	
	public User(String name, int level, int year, int month, int date, String city) {
		Calendar c = Calendar.getInstance();
		c.set(year, month, date);
		
		this.name = name;
		this.level = level;
		this.regdate = c;
		this.city = city;
	}
	
	private int level;
	private Calendar regdate;
	private String city;
	
	public String getName() {
		return name;
	}
	public int getLevel() {
		return level;
	}
	public Calendar getRegdate() {
		return regdate;
	}
	public String getCity() {
		return city;
	}
	@Override
	public String toString() {
		return String.format("%s(%d) %s %tF"
										, this.name
										, this.level
										, this.city
										, this.regdate);
	}
	
	//city(String)
	

}
