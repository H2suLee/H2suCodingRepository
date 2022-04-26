package com.yedam.java.homework;

public class RPGgame implements Keypad {
	// 필드
	int nowMode;
//	- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
//	  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )

	public RPGgame() {
		this.nowMode = NORMAL_MODE;
		System.out.println("RPGgame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (this.nowMode == 0) {
			System.out.println("캐릭터가 한 칸 단위로 점프한다.");
		}
		if (this.nowMode == 1) {
			System.out.println("캐릭터가 두 칸 단위로 점프한다.");

		}

	}

	@Override
	public void rightDownButton() {
		if (this.nowMode == 0) {
			System.out.println("캐릭터가 일반 공격");
		}
		if (this.nowMode == 1) {
			System.out.println("캐릭터가 HIT 공격");

		}
	}

	@Override
	public void changeMode() {
//		(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
		if(nowMode == NORMAL_MODE) {
			nowMode = HARD_MODE;
			System.out.println("현재 모드: HARD_MODE");
		}else if(nowMode == HARD_MODE) {
			nowMode = NORMAL_MODE;
			System.out.println("현재 모드: NORMAL_MODE");
		}
		
		

	}

}
