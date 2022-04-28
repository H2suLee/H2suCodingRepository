package com.yedam.java.homework;

public class Practice2 {
	public static void main(String[] args) {
//		1) 실행코드
		try {
			method(true);
			method(false);
		} catch (RuntimeException e) {
			method(false);
		} catch(Exception e) {
			
		} finally {
			

		}
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

//2) 출력결과
//1
//3
//5
//1
//2
//5
//6
//
//3) 조건
//다중 catch문 사용

