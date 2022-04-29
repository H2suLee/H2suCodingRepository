package com.yedam.java.homework;

public class Plus1 {
// 문제를 제대로 이해한 지 모르겠습니다..
	// 내가 푼 거
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

	// 풀이
	// 출력결과를 234로
//	public static void main2(String[] args) {
//
//		try {
//			method1();
//			System.out.println(1);
//		} catch (NullPointerException e) {
//			System.out.println(2);
//		} finally {
//			System.out.println(3);
//		}
//		System.out.println(3);
//
//	}

	public static void method1() {
		throw new NullPointerException();
	}
}
