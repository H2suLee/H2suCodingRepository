package com.yedam.java.ch08_02;

// 인터페이스 구현, 구현 클래스

public class Television implements RemoteControl {

	private int volume;

	@Override // implement하는 추상 메소드에 대해서 자동으로 아래와 같이 기본 골격을 잡아 줌 (sysoutline말고)
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");

	}

	// setVolume 메소드에서는 유효성 검사를 실시할 것

	@Override
	public void setVolume(int volume) {
		if (volume >= RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;

		} else if (volume <= RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨 : " + this.volume);

	}

}
