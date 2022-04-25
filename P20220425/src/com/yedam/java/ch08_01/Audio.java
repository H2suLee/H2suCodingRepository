package com.yedam.java.ch08_01;

public class Audio implements RemoteControl1 {

	private int volume; // 구현 객체?

	@Override
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("Audio를 끕니다.");

	}

	@Override
	public void setVolume(int volume) {
		if (volume >= RemoteControl1.MAX_VOLUME) {
			this.volume = RemoteControl1.MAX_VOLUME;

		} else if (volume <= RemoteControl1.MIN_VOLUME) {
			this.volume = RemoteControl1.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 Audio 볼륨 : " + this.volume);

	}

}
