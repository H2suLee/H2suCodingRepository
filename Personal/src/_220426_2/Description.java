package _220426_2;

public class Description {
//	
//	Question 2]
//			1) Notebook 인터페이스를 정의한다.
//				- 다음과 같이 상수 필드를 정의한다.
//				(1) public static final int NOTEBOOK_MODE = 1;
//				- 다음과 같이 메소드를 정의한다.
//				(1) public abstract void writeDocumentaion() : 문서를 작성하는 기능
//				(2) public abstract void searchInternet() : 인터넷을 검색하는 기능
//			
//			2) Tablet 인터페이스를 정의한다.
//				- 다음과 같이 상수 필드를 정의한다.
//				(1) public static final int TABLET_MODE = 2;
//				- 다음과 같이 메소드를 정의한다.
//				(1) public abstract void watchVideo() : 영상을 출력하는 기능
//				(2) public abstract void useApp() : 앱을 사용하는 기능
//			
//			3) PortableNotebook 클래스를 정의한다.
//				- Notebook 인터페이스와 Tablet 인터페이스를 구현한 클래스.
//				- MODE, 문서 프로그램, 인터넷 브라우저, 영상종류, 앱종류를 필드로 가지며 생성자를 이용하여 값을 초기화한다.
//				( 단, MODE 필드는 매개변수를 이용하지 않으며 TABLET_MODE를 초기값으로 가지며 현재 모드를 출력해준다. )
//				- Notebook 인터페이스와 Tablet 인터페이스에 정의된 추상 메서드를 다음과 같이 오버라이딩한다.
//				(1) public abstract void writeDocumentaion() : "'문서 프로그램'을 통해 문서를 작성."을 출력한다.
//				(2) public abstract void searchInternet() : "'인터넷 브라우저'를 통해 인터넷을 검색."을 출력한다.
//				(3) public abstract void watchVideo() : "'영상종류'를 시청."을 출력한다.
//				(4) public abstract void useApp() : 
//					- NOTEBOOK_MODE : 현재 모드를 바꾸고 "'앱종류'를 실행."를 출력한다.
//					- TABLET_MODE : "'앱종류'를 실행."을 출력한다.
//				(5) public void changeMode() : 모드를 바꾸고 현재 모드를 출력하는 기능 ( NOTEBOOK_MODE -> TABLET_MODE / TABLET_MODE -> NOTEBOOK_MODE)
//			
//			4) 아래와 같이 출력결과가 나오도록 실행코드를 구현한다.
//			- 출력결과
//				NOTEBOOK_MODE
//				한글2020을 통해 문서를 작성.
//				영화를 시청.
//				TABLET_MODE
//				안드로이드앱을 실행.
//				크롬을 통해 인터넷을 검색.

}
