package com.yedam.java.ch11_02;

public class StringIndexofExample {
	public static void main(String[] args) {
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location); // "자" 가 0, "바"가 1, ...

		// indexOf는 실무적으로 아래와 같이 활용함
		if (subject.indexOf("자바") != -1) { // -1값이 아니면 subject에 자바가 포함되어 있는 것임 개발자에게 위치는 안 중요
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련이 없는 책이군요");
		}

		subject = "java programming"; // 대소문자 구분
		if (subject.indexOf("JAVA") != -1) {
			System.out.println("자바와 관련된 책이군요");
		} else {
			System.out.println("자바와 관련이 없는 책이군요");

		}
	}
}
