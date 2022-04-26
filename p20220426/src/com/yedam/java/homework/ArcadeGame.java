package com.yedam.java.homework;

public class ArcadeGame implements Keypad {
	public int nowMode;

	public ArcadeGame() {
		this.nowMode = NORMAL_MODE;
		System.out.println("Arcadegame 실행");
	}

	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (this.nowMode == 0) {
			System.out.println("캐릭터가 일반 공격");
		}
		if (this.nowMode == 1) {
			System.out.println("캐릭터가 연속 공격");

		}

	}

	@Override
	public void rightDownButton() {
		if (this.nowMode == 0) {
			System.out.println("캐릭터가 HIT 공격");
		}
		if (this.nowMode == 1) {
			System.out.println("캐릭터가 DOUBLE HIT 공격");

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
