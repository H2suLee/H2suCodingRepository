package com.yedam.java.ch03_02;

public class Dog extends Animal {
	
	// 자동으로 override 하라고 안내 해 줌
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	// 생성자
	public Dog() {
		this.kind = "포유류";
	}

}
