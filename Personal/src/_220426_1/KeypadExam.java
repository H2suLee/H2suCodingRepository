package _220426_1;

public class KeypadExam {

	public static void main(String[] args) {

//		RPGgame 실행
//		캐릭터가 위쪽으로 이동한다.
//		캐릭터가 한칸단위로 점프한다.
//		현재 모드 : HARD_MODE
//		캐릭터가 두칸단위로 점프한다.
//		캐릭터가 HIT 공격.
//		캐릭터가 아래쪽으로 이동한다.
//		현재 모드 : NORMAL_MODE
//		캐릭터가 일반 공격.
		
		Keypad game = new RPGgame();
		game.leftUpButton();
		game.rightUpButton();
		game.changeMode();
		game.rightUpButton();
		game.rightDownButton();
		game.leftDownButton();
		game.changeMode();
		game.rightDownButton();
		
		System.out.println("=======================");
		
//		ArcadeGame 실행
//		캐릭터가 앞쪽으로 이동한다.
//		캐릭터가 일반 공격
//		캐릭터가 뒤쪽으로 이동한다.
//		현재 모드 : HARD_MODE
//		캐릭터가 연속 공격.
//		캐릭터가 앞쪽으로 이동한다.
//		캐릭터가 Double HIT 공격.
		
		game = new ArcadeGame();
		game.leftUpButton();
		game.rightUpButton();
		game.leftDownButton();
		game.changeMode();
		game.rightUpButton();
		game.leftUpButton();
		game.rightDownButton();
		
		

	}

}
