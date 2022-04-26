package com.yedam.java.ch09_02;

public class AnonymousExample {
	public static void main(String[] args) {
		Anonymous anony = new Anonymous();
		
		//익명 객체 필드 사용
		anony.field.wake();  // 6시에 일어납니다.
		
		// 익명 객체 로컬 변수 사용
		anony.method1(); // 출근합니다.
		
		// 익명 객체 매개 변수 사용 // 변수 안에 실행 블록 추가 // 매개 변수로 익명 객체를 넘기는 것
		anony.method2(new Person() {
			void study() {
				System.out.println("공부합니다.");
			}
			
			@Override
			public void wake() {
				System.out.println("8시에 일어납니다.");
				study();
			}
		});
		
	}

}
