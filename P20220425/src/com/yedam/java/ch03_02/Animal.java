package com.yedam.java.ch03_02;

// 추상 메소드를 포함하는 클래스는 무조건 추상 클래스로 선언해 줘야 한다. public abstract class Animal{ 에서 abstract 지우면 에러남

public abstract class Animal {
	public String kind;

	public void breath() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();

	{ // 모든 동물들이 소리를 내지만 구체화할 수 없기 때문에 얘는 추상 메소드로

	}

}
