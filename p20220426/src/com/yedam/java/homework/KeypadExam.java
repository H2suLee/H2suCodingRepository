package com.yedam.java.homework;

public class KeypadExam {

	public static void main(String[] args) {
		
		Keypad keypad;
		keypad = new RPGgame();
		
		keypad.leftUpButton();
		
		keypad.rightUpButton();
		keypad.changeMode();
		keypad.rightUpButton();
		keypad.rightDownButton();
		keypad.leftDownButton();
		keypad.changeMode();
		keypad.rightDownButton();
		System.out.println("==================");
		
		keypad = new ArcadeGame();
		
		keypad.leftUpButton();
		keypad.rightUpButton();
		keypad.leftDownButton();
		keypad.changeMode();
		keypad.rightUpButton();
		keypad.leftUpButton();
		keypad.rightDownButton();
		System.out.println("==================");
		
//		ArcadeGame 실행
//		캐릭터가 앞쪽으로 이동한다.
//		캐릭터가 일반 공격
//		캐릭터가 뒤쪽으로 이동한다.
//		현재 모드 : HARD_MODE
//		캐릭터가 연속 공격.
//		캐릭터가 앞쪽으로 이동한다.
//		캐릭터가 Double HIT 공격.
//	
		
	}

}
