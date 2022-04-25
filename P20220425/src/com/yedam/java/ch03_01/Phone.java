package com.yedam.java.ch03_01;

public abstract class Phone {
// p360
// 추상 클래스와 일반 클래스 차이는 일반적으로..맨 첫 줄 (3라인) 선언부만 다르다고 할 수 있음

	// 필드

	public String owner;

	// 생성자
	public Phone(String owner) {
		this.owner = owner;
	}

	// 메소드
	// 추상 클래스 안에 일반 메소드 -> 최초 한 번만 기능 정의
	// 추상 클래스라고 해서 추상 메소드를 반드시 포함할 필요는 x
	public void turnOn() {
		System.out.println("폰 전원을 켭니다.");
	}

	public void turnOff() {
		System.out.println("폰 전원을 끕니다.");
	}

}
