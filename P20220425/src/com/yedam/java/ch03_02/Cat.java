package com.yedam.java.ch03_02;

public class Cat extends Animal {

	@Override
	public void sound() {
		System.out.println("야옹");
	}
	
	// 생성자
	public Cat() {
		this.kind = "포유류";
	}

}
