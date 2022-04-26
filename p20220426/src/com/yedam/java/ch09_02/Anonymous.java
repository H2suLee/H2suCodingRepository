package com.yedam.java.ch09_02;

//p 427

public class Anonymous {
	// 필드값으로 익명 객체 대입
	Person field = new Person() {
		// 메소드
		void work() {
			System.out.println("출근합니다.");
		}

		@Override
		public void wake() {
			System.out.println("6시에 일어납니다.");
			work();
		}

	}; // ★ 익명 개체 블록은 ;로 끝남
	
	
	// 로컬 변수값으로 대입
	void method1() {
		Person localVar = new Person() {
			void walk() {
				System.out.println("산책합니다.");
			}
			@Override
			public void wake() {
				super.wake();
				walk();
				
			}
		};
		// loval 변수 사용
		localVar.wake();
	}
	
	void method2(Person person) {
		person.wake();
	}
}
