package com.yedam.java.ch08_01;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		RemoteControl1 rc;
		rc = new Television();
		rc.turnOn();
		rc.setVolume(20);
		
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);

	}

}
