package _220426_1;

public class Description {
//	Question 1]
//			1) Keypad 인터페이스를 정의한다.
//			- 다음과 같이 상수 필드를 정의한다.
//			(1) public static final int NORMAL_MODE = 0;
//			(2) public static final int HARD_MODE = 1;
//			- 다음과 같이 추상 메서드를 정의한다.
//			(1) public abstract void leftUpButton() : 왼쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
//			(2) public abstract void leftDownButton() : 왼쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
//			(3) public abstract void rightUpButton() : 오른쪽에서 위쪽 버튼을 눌렀을 때 동작하는 기능
//			(4) public abstract void rightDownButton() : 오른쪽에서 아래쪽 버튼을 눌렀을 때 동작하는 기능
//			(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
//			
//			2) RPGgame 클래스를 정의한다.
//			- Keypad를 구현하는 클래스.
//			- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "RPGgmae 실행"을 출력한다.
//			  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
//			- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
//			(1) public abstract void leftUpButton() : "캐릭터가 위쪽으로 이동한다"를 출력한다.
//			(2) public abstract void leftDownButton() : "캐릭터가 아래쪽으로 이동한다"를 출력한다.
//			(3) public abstract void rightUpButton()
//				- NORMAL_MODE : "캐릭터가 한칸단위로 점프한다."를 출력한다.
//				- HARD_MODE : "캐릭터가 두칸단위로 점프한다."를 출력한다.
//			(4) public abstract void rightDownButton()
//				- NORMAL_MODE : "캐릭터가 일반 공격."를 출력한다.
//				- HARD_MODE : "캐릭터가 HIT 공격."를 출력한다.
//			(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
//			
//			3) ArcadeGame 클래스를 정의한다.
//			- Keypad를 구현하는 클래스.
//			- 현재 모드를 값으로 가지는 필드를 가지며 생성자를 이용하여 값을 초기화한후 "ArcadeGame 실행"을 출력한다.
//			  ( 단, 매개변수를 이용하지 않으며 최초의 값은 NORMAL_MODE 이다. )
//			- Keypad 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
//			(1) public abstract void leftUpButton() : "캐릭터가 앞쪽으로 이동한다"를 출력한다.
//			(2) public abstract void leftDownButton() : "캐릭터가 뒤쪽으로 이동한다"를 출력한다.
//			(3) public abstract void rightUpButton()
//				- NORMAL_MODE : "캐릭터가 일반 공격"를 출력한다.
//				- HARD_MODE : "캐릭터가 연속 공격"를 출력한다.
//			(4) public abstract void rightDownButton()
//				- NORMAL_MODE : "캐릭터가 HIT 공격."를 출력한다.
//				- HARD_MODE : "캐릭터가 Double HIT 공격."를 출력한다.
//			(5) public abstract void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NORMAL_MODE -> HARD_MODE / HARD_MODE -> NORMAL_MODE)
//			
//			4)  아래와 같은 출력결과가 나오도록 실행코드를 구현한다.
//			- 출력결과
//				RPGgame 실행
//				캐릭터가 위쪽으로 이동한다.
//				캐릭터가 한칸단위로 점프한다.
//				현재 모드 : HARD_MODE
//				캐릭터가 두칸단위로 점프한다.
//				캐릭터가 HIT 공격.
//				캐릭터가 아래쪽으로 이동한다.
//				현재 모드 : NORMAL_MODE
//				캐릭터가 일반 공격.
//				======================
//				ArcadeGame 실행
//				캐릭터가 앞쪽으로 이동한다.
//				캐릭터가 일반 공격
//				캐릭터가 뒤쪽으로 이동한다.
//				현재 모드 : HARD_MODE
//				캐릭터가 연속 공격.
//				캐릭터가 앞쪽으로 이동한다.
//				캐릭터가 Double HIT 공격.
//			
}
