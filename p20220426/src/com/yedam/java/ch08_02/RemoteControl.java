package com.yedam.java.ch08_02;

public interface RemoteControl {
	
	// 상수 필드
	public static final int MAX_VOLUME = 10;
	public static final int MIN_VOLUME = 0;
	
	// 추상 메소드
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setVolume(int volume);
}
