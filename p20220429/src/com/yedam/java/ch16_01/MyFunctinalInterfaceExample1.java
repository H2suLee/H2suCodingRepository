package com.yedam.java.ch16_01;

public class MyFunctinalInterfaceExample1 {
	public static void main(String[] args) {
		// 매개변수도 리턴값도 존재하지 않는 람다식
		// 람다식을 사용하려면 인터페이스 변수를 선언해야 함
		// 람다식도 메소드임. 메소드는 객체 안에서만 가동
		MyFunctionalInterface fi;

		// 인터페이스를 구현하려면 구현클래스가 필요했음
		// 그러나 람다식을 사용할 때는 인터페이스 구현을 위해 구현클래스가 없어도 됨
		// 람다식에 대하여 정의를 내리면 됨

		// fi가 이런 식으로 구현 된다
		fi = () -> {
			String str = "method call1";
			System.out.println(str);
		};

		fi.method();

		fi = () -> {
			System.out.println("method call2");
		};
		fi.method();
		
		// 명령어가 한 줄이면 실행 블록을 빼고 더 간결하게
		fi = () -> System.out.println("method call3");
		fi.method();
		
		

	}

}
