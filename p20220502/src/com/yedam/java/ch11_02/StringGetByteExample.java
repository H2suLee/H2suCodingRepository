package com.yedam.java.ch11_02;

import java.io.UnsupportedEncodingException;

public class StringGetByteExample {
	public static void main(String[] args) {
		// String 생성자 : byte 타입 -> String 타입
		// getBytes 메소드 : String타입 -> byte 타입
		
		String str = "안녕하세요";
		byte[] strBytes1 = str.getBytes();
		System.out.println(strBytes1); // 16진수가 출력됨
		
		String str1 = new String(strBytes1); // 다시 String 타입으로 바꾸고 싶으면 생성자를 이용하면 됨
		System.out.println(str1);
		
		try {
		byte[] strBytes2 = str.getBytes("EUC-KR"); // 인코딩
		System.out.println("strBytes2의 길이: " + strBytes2.length);
		String str2 = new String(strBytes2, "EUC-KR"); // 디코딩, 생성자에게 값(strBytes2)과 함께 기준점이 되는 문자set(EUC-KR) 알려줘야 함
		System.out.println("strBytes2->String: " + str2);
		
		} catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}

}
