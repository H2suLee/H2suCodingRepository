package com.yedam.java.ch15_02;

public class BoxingMEthodExample {
	public static void main(String[] args) {
		Box<Integer> box = Util.<Integer>boxing(100); // 메소드 이름 앞에 타입 파라미터 선언, 변수로 선언한 Box에도 <Integer> 선언.  
		int intValue = box.getT();
		
		Box<String> strBox = Util.<String>boxing("홍길동");
		String strValue = strBox.getT();
//		System.out.println(intValue + strValue);
	}
}
