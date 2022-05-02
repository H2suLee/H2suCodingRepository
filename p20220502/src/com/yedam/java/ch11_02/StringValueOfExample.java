package com.yedam.java.ch11_02;

public class StringValueOfExample {
	
	// String 외의 타입을 String으로 바꿈
	
	public static void main(String[] args) {
		
		int intValue = 10;
		double doubleValue = 10.5;
		boolean booleanValue = true;
		
		// 정석으로 valueOf 메소드 사용
		String intStr = String.valueOf(intValue);
		String doubleStr = String.valueOf(doubleValue);
		String booleanStr = String.valueOf(booleanValue);
		System.out.println(intStr);
		System.out.println(doubleStr);
		System.out.println(booleanStr);
		
		// 편법으로 + 문자열 결합 연산자 사용
		System.out.println("" + intValue);
		System.out.println("" + doubleValue);
		System.out.println("" + booleanValue);
		
	}

}
