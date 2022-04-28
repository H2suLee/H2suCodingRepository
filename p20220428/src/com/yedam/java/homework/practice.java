package com.yedam.java.homework;

public class practice {
	public static void main(String[] args) {
//		1) 실행코드
		method(true);
		method(false);
	}

	public static void method(boolean value) {
		System.out.println(1);
		if (value) {
			throw new RuntimeException();
		}
		System.out.println(2);

		System.out.println(3);

		System.out.println(4);

		System.out.println(5);

		System.out.println(6);
	}
}