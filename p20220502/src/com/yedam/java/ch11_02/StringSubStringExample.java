package com.yedam.java.ch11_02;

public class StringSubStringExample {
	
	public static void main(String[] args) {
		
		String ssn = "880815-1234567";
		String firstNum = ssn.substring(0, 6); // 매개변수가 2개일 때 시작하는 인덱스와 길이 지정. 0~5만 살리겠다
		System.out.println(firstNum);
		
		String secondNum = ssn.substring(7); // 매개변수가 1개일 때 시작 인덱스만 지정. 7~끝까지 살리겠다
		System.out.println(secondNum);
	}

}
