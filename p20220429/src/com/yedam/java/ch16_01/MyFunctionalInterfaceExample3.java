package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExample3 {

	public static void main(String[] args) {
		// 두 개의 매개변수가 있고, 리턴 값이 있는 람다식
		MyFunctionalInterface3 fi;

		fi = (x, y) -> {
			int result = x + y;
			return result;
		};

		System.out.println(fi.method(2, 5));

		fi = (x, y) -> {
			return x + y;
		};
		System.out.println(fi.method(4, 7));

		// 위 경우에 리턴문구와 실행블록도 생략 가능
		fi = (x, y) -> x + y;
		System.out.println(fi.method(7, 10));

		// 당연히 리턴을 다른 메소드 호출로 할 수 있음
		fi = (x, y) -> Math.subtractExact(x, y);
		System.out.println(fi.method(10, 20));

	}
}
