package com.yedam.java.ch11_01;

import java.util.Date;

public class ToStringExampl {
	
	public static void main(String[] args) {
		Object obj1 = new Object();
		System.out.println(obj1.toString());
		System.out.println(obj1);
		
		Date obj2 = new Date();
		
		System.out.println(obj2.toString());
		System.out.println(obj2.toGMTString()); // 레거시코드; 다른 최신 버젼으로 업그레이드 되었다는 뜻, 안 쓰는 걸 권장
		
	}

}
