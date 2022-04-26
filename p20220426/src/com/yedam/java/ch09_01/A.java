package com.yedam.java.ch09_01;

public class A { // 바깥 클래스

	A() {
		System.out.println("A 인스턴스가 생성됨");
	}

	// 인스턴스 멤버 클래스

	class B {
		B() {
			System.out.println("B 인스턴스가 생성됨");
		}

		// 필드
		int field1;
//		static int field2; // 인스턴트 없이 접근할 수 있는 static 필드에 아예 접근이 불가함 // 내부에 존재하는 일반 클래스 안에는 정적 메소드, 정적 필드 만들 수 없다

		// 메소드
		void method1() {
		}
	}

	// 정적 멤버 클래스
	static class C {
		C() {
			System.out.println("C 인스턴트가 생성됨");
		}

		// 필드
		int field1;
		static int field2;

		// 메소드
		void method1() {
		}

		static void method2() {
		}

	}

	// 로컬 클래스, 메소드 내에 클래스가 존재
	// 로컬 클래스에는 public, private, static 을 붙일 수 없다
	// 메소드 내부에서만 사용할 거기 때문에 접근을 제한할 필요가 없기 때문
	// 로컬 클래스에는 인스턴트 멤버만 선언할 수 있고, 정적 멤버는 사용 불가능
	void method() {
		class D {
			D() {
				System.out.println("D 인스턴스가 생성됨.");
			}

			// 필드
			int field1;
//			static int field2; // 인스턴트 필드만 사용 가능

			// 메소드
			void method1() {
			}
//			static void method2 {} // 인스턴트 멤버만 사용 가능, static 사용 못함

		}
		D d = new D();

	}

}
