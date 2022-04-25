package com.yedam.java.ch08_01;

public interface RemoteControl1 {
	// 인터페이스 p370
	// 상수 필드
	public static final int MAX_VOLUME = 10;
	int MIN_VOLUME = 0; // public static final을 붙이지 않아도 java가 자동으로 붙여 줌. 초기값만 필수로 잘 설정해 주기
	
	
	// 추상 메소드
	public abstract void turnOn(); // 실행 블럭 ({})이 필요 없음
	void turnOff(); // 앞에 리턴값, 추상 선언을 안 해주어도 컴파일 하면 public abstract void turnOff 로 java가 자동으로 바꿔 줌
	
	public void setVolume(int volume);
	
}
