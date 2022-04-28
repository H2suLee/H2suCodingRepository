package com.yedam.java.homework;

public class Plus1 {
// 문제를 제대로 이해한 지 모르겠습니다..
	
	public static void main(String[] args) {

		try {
			method1();
			System.out.println(1);

			System.out.println(2);

		} catch (NullPointerException e) {
			System.out.println(3);
		} finally {
			System.out.println(4);
		}

	}

	public static void method1() {
		throw new NullPointerException();
	}
}
