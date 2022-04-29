package com.yedam.java.ch16_01;

public class MyFunctionalInterfaceExam2 {
	public static void main(String[] args) {
//		매개변수가 있고 리턴값이 없는 람다식
		
		MyFunctionalInterface2 fi; // 인터페이스 선언
		// 변수 = () -> {};
		// (메소드에서 매개변수를 받아야 할 때 ) 변수 = (매개변수) -> {};
		
		fi = (x) -> {
			int result = x * 5;
			System.out.println(result);
		};
		fi.method(5);
		
		fi = x -> System.out.println(x*5);
		fi.method(10);
	}
}
