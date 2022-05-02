package com.yedam.java.ch11_02;

public class StringTrimExample {
	public static void main(String[] args) {
		
		// trim은 앞뒤 공백만 제외해 줌
		
		String tel1 = "    02";
		String tel2 = "123    ";
		String tel3 = "    1234    ";
		String tel = tel1.trim() + tel2.trim() + tel3.trim();
		System.out.println(tel1+tel2+tel3);
		System.out.println(tel);
		
	}

}
