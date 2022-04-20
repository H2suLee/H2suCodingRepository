package co.edu.oop;

public class Calculator {

	// 필드
	// 숫자를 받을 수 있는 변수
	int x;
	int y;
	
	// 생성자
		
	// 메소드
	// 기능1. 덧셈
	void plus(int x, int y) {
		System.out.println("덧셈 : " + (x+y));
	}
	// 기능1. 뺄셈
	void minus(int x, int y) {
		System.out.println("뺄셈 : " + (x-y));
	}
	// 기능1. 곱셈
	void multi(int x, int y) {
		System.out.println("곱셈 : " + (x*y));
	}
	// 기능1. 나눗셈
	void div(int x, int y) {
		System.out.println("나눗셈 : " + (x/y));
	}
	
}
