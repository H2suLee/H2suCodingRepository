package com.yedam.java.ch13_03;

public class Coin {
	private int value;
	
	// 생성자를 이용해서 값을 넣고 getter로 끄집어 내기
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return this.value;
	}
}
