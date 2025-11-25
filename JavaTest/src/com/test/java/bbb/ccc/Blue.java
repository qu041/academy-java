package com.test.java.bbb.ccc;

import com.test.java.aaa.Red;

//다른 패키지 (기준 Red) + 자식클래스
public class Blue extends Red {
	
	public void test() {
		
		this.a = 10; //public    // 모두 공개
//		this.b = 20; //private   // 같은 클래스에서만
//		this.c = 30; //default   // 같은 패키지에서만
		this.d = 40; //protected // 상속관계에서 가능.
		
	}
}
