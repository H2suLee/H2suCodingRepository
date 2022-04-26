package com.yedam.java.ch09_01;

public class Outter {
	// 필드
	String field = "Outter-field";
	
	// 메소드
	void method() {
		System.out.println("Outter-method");
	}
	
	// 인스턴스 멤버
	class Nested{
		String field = "Nested-field";
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field); // field라고 적으면 내부에 있는 걸 우선적으로 찾음(14라인, Nested-field 를 출력할 것)
			// this.를 붙이면 ★내부★에 있는 필드, 메소드를 호출함
			this.method();
			
			System.out.println(Outter.this.field);
			Outter.this.method();
		}
	}

}
