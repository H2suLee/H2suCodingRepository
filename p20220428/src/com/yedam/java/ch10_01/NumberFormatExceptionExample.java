package com.yedam.java.ch10_01;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "100";
		String data2 = "a100"; // 숫자로 변환 불가, 문자열이 숫자의 형태여야만 .parse메소드로 숫자 변환 가능
		
		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 + "=" + result);
	}

}
