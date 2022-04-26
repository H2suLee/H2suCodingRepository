package com.yedam.java.ch08_02;


// 인터페이스와 직접 관련 없음. 구현 클래스 아님
// 테스트용으로 만든 것임
// p382

public class MyClass {
	
	// 필드
	RemoteControl rc = new SmartTelevision();
	
	// 생성자
	MyClass(){
		
	}
	
	MyClass(RemoteControl rc){
		// this.rc = rc; // meaningless
		rc.turnOn();
		rc.setVolume(5);
	}
	
	// 메소드
	// com.yedam.java.ch08_01에 있는 Audio랑 Television 복사해 와서 인터페이스 implement 정보 고쳐서 씀
	
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}
	
//	void methodB() {
//		rc.turnOn();
//		rc.setVolume(5);
//	}

	public void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}

}
