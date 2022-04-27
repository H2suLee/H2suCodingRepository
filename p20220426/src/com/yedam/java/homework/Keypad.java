package com.yedam.java.homework;

public interface Keypad {
//	- 다음과 같이 상수 필드를 정의한다.
	public static final int NORMAL_MODE = 0;
	public static final int HARD_MODE = 1;
	
//	- 다음과 같이 추상 메서드를 정의한다.
	public abstract void leftUpButton();
	
	public abstract void leftDownButton();
	
	public abstract void rightUpButton();
	
	public abstract void rightDownButton();
	
	public abstract void changeMode();
	
	
}
