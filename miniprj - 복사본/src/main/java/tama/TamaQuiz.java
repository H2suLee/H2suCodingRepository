package tama;

import java.util.Random;
import java.util.Scanner;

public class TamaQuiz {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	int inputNum;
	
	public void bonusGame() {						// 퀴즈를  맞췄을 때 뽑기실행.
		System.out.println("\r\n▶축하드립니다! 뽑기 찬스가 주어졌습니다");			
		int luckybox = random.nextInt(3)+1;			// 당첨일 될 순번을 랜덤으로 입력.
		System.out.print("1,2,3 중 하나를 선택해주세요 : ");		// 메뉴 출력.
		inputNum = scan.nextInt();					// 셋 중 하나를 선택.
		if(inputNum == luckybox) {					// 당첨일 경우.
			System.out.println("당첨입니다!!");				
			Tama.like += 50;								// 호감도 '50' 증가.
		}
		else {
			System.out.println("꽝이에요ㅜㅠ\r\n");
		}
	}
	public void quiz1() {						// 나이가 '1'이 될 때 나오는 첫 번째 퀴즈.
		String answerStr;						// 답을 입력 받을 변수.
		System.out.println("\r\n▶퀴즈가 등장했습니다 !\r\n");
		System.out.println("(프로그래밍 기초) 현재 J2반의 프로그래밍 기초를 가르치시는 담당 교수님의 성함은 무엇일까요?");
		System.out.print("\r\n정답입력 : ");
		answerStr = scan.next();				// 답을 입력 받음.
		if(answerStr.equals("김기종")) {			// 정답일 경우.
			System.out.print(""
					+ "\r\n정답입니다!! ,");
			Tama.like += 100;						// 호감도 '100' 증가.
			System.out.println("첫번째 힌트글자: 영");	// 힌트 출력.
			bonusGame();						// 뽑기 실행.
		}
		else {									// 오답일 경우.
			System.out.println("바로 옆에 있습니다\r\n");
			Tama.like-=25;
		}
	}
	
	public void quiz2() {						// 나이가 '2'이 될 때 나오는 두 번째 퀴즈.
		int answerNum;							// 답을 입력 받을 변수.
		System.out.println("\r\n▶2번쨰 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(일본어)天氣予報に(   )午後からあめがふるそうです。");
		System.out.print("1.ついて　2.よると 3.たいして 4.よむと\r\n 정답입력 : ");
		answerNum = scan.nextInt();				// 답을 입력 받음.
		switch (answerNum) {					// 정답인지 아닌지 판별.
		case 1:									// 오답일 경우.
			System.out.print("땡!..오답입니다.\r\n");
			Tama.like-=50;
			break;
		case 2:									// 정답일 경우.
			Tama.like += 200;						// 호감도 '200' 증가.
			System.out.print("정답입니다!! ,");
			System.out.println("두번째 힌트글자 : 진\r\n");	// 힌트 출력.
			break;
		case 3:									// 오답일 경우.
			System.out.print("땡!..오답입니다.\r\n");
			Tama.like-=50;
			break;
		case 4:									// 오답일 경우.
			System.out.print("땡!..오답입니다.\r\n");
			Tama.like-=50;
			break;
		}
		System.out.println("\r\n\r\n풀이 : \"今朝見た天気予報に（よると）午後から雨が降るそうです。\"");
		System.out.println("\r\n");
	}
	
	public void quiz3() {						// 나이가 '3'이 될 때 나오는 세 번째 퀴즈.
		String answerStr;						// 답을 입력 받을 변수.
		System.out.println("\r\n▶3번째 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(운영체제) 다중처리 시스템은 한개의 CPU를 가지고 기억장치 및 주변기기를 공유한다.(O.X퀴즈)");
		System.out.print("정답입력(O/X) : ");
		answerStr = scan.next();				// 답을 입력 받음.
		if(answerStr.equals("O")) {				// 정답일 경우.
			System.out.print("정답입니다!! ,");
			Tama.like += 300;						// 호감도 '300' 증가.
			System.out.println("세번째 힌트글자 : 전\r\n");	// 힌트 출력.
		}
		else {									// 오답일 경우.
			System.out.println("땡!...정답은 O입니다\r\n");
			Tama.like-=70;
		}
		System.out.println("\r\n풀이 : 다중처리 시스템은 한개 이상의 CPU를 가지고 기억장치 및 주변기기를 공유합니다.");
	}

	public void quiz4() {							// 나이가 '4'이 될 때 나오는 네 번째 퀴즈.
		String answerStr;							// 답을 입력 받을 변수.
		System.out.println("\r\n▶4번쨰 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(네트워크 개론)서로 구조가 다른 망을 연결할 수 있어 LAN과MAN,WAN을 연결하는데 주로 사용하는 네트워크 접속장치를 입력하라");
		System.out.print("정답입력 : ");
		answerStr = scan.next();					// 답을 입력 받음.
		if(answerStr.equals("라우터")) {				// 정답일 경우.
			System.out.print("\r\n정답입니다!! ,");
			Tama.like += 400;							// 호감도 '400' 증가.
			System.out.println("네번째 힌트글자 : 문\r\n");		// 힌트 출력.
		}
		else {
			System.out.println("\r\n땡!...정답은 라우터입니다.\r\n");			// 오답일 경우.
			Tama.like-=99;
		}
		System.out.println(".");
	}
	
	public void quiz5() {								// 나이가 '5'이 될 때 나오는 다섯 번째 퀴즈.
		String answerStr;								// 답을 입력 받을 변수.
		System.out.println("\r\n▶5번째 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(데이터베이스) 데이터 베이스에 보존된 데이터가 물리적으로 방대하게 증가한 것을 가르키는 키워드는 무엇인가 ?");
		System.out.print("정답입력 : ");
		answerStr = scan.next();						// 답을 입력 받음.
		if(answerStr.equals("빅데이터")) {					// 정답일 경우.
			System.out.print("\r\n정답입니다!! ,");			
			Tama.like += 500;								// 호감도 '500' 증가.
			System.out.println("다섯번째 힌트글자 : 대\r\n");			// 힌트 출력.
		}
		else {
			System.out.println("\r\n땡!...정답은 빅데이터입니다.\r\n");				// 오답일 경우.
			Tama.like-=195;
		}
		System.out.println(".");
	}
	
	public void quiz6() {							// 나이가 '6'이 될 때 나오는 여섯 번째 퀴즈.
		String answerStr;							// 답을 입력 받을 변수.
		System.out.println("\r\n▶6번째 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(프로그래밍 기초).프로그래밍 언어 JAVA에서 가장 많이 사용되는 정수를 표현하는 자료형는 무엇일까요 ?");
		System.out.print("정답입력 : ");
		answerStr = scan.next();					// 답을 입력 받음.	
		if(answerStr.equals("int")) {				// 정답일 경우.
			System.out.print("\r\n정답입니다!! ,");
			Tama.like += 600;							// 호감도 '600' 증가.
			System.out.println("여섯번째 힌트글자 : J\r\n");		// 힌트 출력.
		}
		else {										// 오답일 경우.
			System.out.println("\r\n땡...정답은 int입니다.\r\n");
		}
					Tama.like-=250;
		System.out.println(".");
	}
	
	public void quiz7() {								// 나이가 '7'이 될 때 나오는 일곱 번째 퀴즈.
		String answerStr;								// 답을 입력 받을 변수.
		System.out.println("\r\n▶7번째 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(네트워크 개론)	네트워크에서 가장 많이 사용되는 서버와 클라이언트의 1:1 통신 방식은 무엇인가?");
		System.out.print("정답입력 : ");
		answerStr = scan.next();						// 답을 입력 받음.
		if(answerStr.equals("유니캐스트")) {				// 정답일 경우.
			Tama.like += 700;								// 호감도 '700' 증가.
			System.out.print("\r\n정답입니다!! ,");
			System.out.println("일곱번째 힌트글자 : 2\r\n");			// 힌트 출력.
		}
		else {											// 오답일 경우.
			System.out.println("\r\n땡!...정답은 유니캐스트입니다.\r\n");
		}
						Tama.like-=350;
		System.out.println(".");
	}
	
	public void quiz8() {								// 나이가 '8'이 될 때 나오는 여덟 번째 퀴즈.
		String answerStr;								// 답을 입력 받을 변수.
		System.out.println("\r\n▶8번째 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(데이터 베이스)	시스템을 만들기 위한 물리 레벨로 하드웨어와 소프트웨어를 포함한 컴퓨터 시스템 전체의 설계방식은 무엇인가?");
		System.out.print("정답입력 : ");				
		answerStr = scan.next();						// 답을 입력 받음.
		if(answerStr.equals("아키텍처")) {					// 정답일 경우.
			System.out.print("\r\n정답입니다!! ,");
			Tama.like += 800;								// 호감도 '800' 증가.
			System.out.println("여덟번째 힌트글자 : 화\r\n");			// 힌트 출력.
		}
		else {											// 오답일 경우.
			System.out.println("\r\n땡!...정답은 아키텍처입니다.\r\n");
		}
							Tama.like-=350;
		System.out.println(".");
	}
	
	public void quiz9() {								// 나이가 '9'이 될 때 나오는 아홉 번째 퀴즈.
		String answerStr;								// 답을 입력 받을 변수.
		System.out.println("\r\n▶9번쨰 퀴즈가 등장했습니다 !\r\n");
		System.out.println("(운영체제)운영체제에서 가장 중요한 개념으로 여러작업을 동시에 처리하고 여러프로그램을 메인 메모리에 적재하고 \n" + 
							"프로세스를 분할하여 시스템의 효율성을 향상시키는 방식은 무엇인가?");
		System.out.print("정답입력 : ");
		answerStr = scan.next();						// 답을 입력 받음.
		if(answerStr.equals("다중프로그래밍")) {			// 정답일 경우.
			Tama.like += 900;								// 호감도 '900' 증가.
			System.out.print("\r\n정답입니다!! ,");
			System.out.println("아홉 번째 힌트글자 : 이\r\n");			// 힌트 출력.
		}
		else {											// 오답일 경우.
			System.out.println("\r\n땡!...정답은 다중프로그래밍입니다.\r\n");
		}
								Tama.like-=750;
		System.out.println(".");
	}
	
	public void quiz10() {								// 나이가 '10'이 될 때 나오는 열 번째 퀴즈.
		int answerNum;									// 답을 입력 받을 변수.
		System.out.println("\r\n▶10번쨰 퀴즈가 등장했습니다 !\r\n");
		System.out.println("아이들은 즐거운 듯이 놀고있다고 합니다.");
		System.out.println("1.たのしように   2.たのしいそうに  3.たのしそうに  4.たのしくそうに ");
		
		
		
		
		System.out.print("정답입력 : ");
		answerNum = scan.nextInt();						// 답을 입력 받음.
		System.out.println("정답은... \"3번\" 입니다.\r\n");
		switch (answerNum) {
		case 1:											// 오답일 경우.
			System.out.print("오답입니다.\r\n");
			Tama.like-=820;
			break;
		case 2:											// 오답일 경우.
			System.out.print("오답입니다.\r\n");
			Tama.like-=820;
			break;
		case 3:											// 오답일 경우.
			System.out.print("정답입니다!! ,");			// 정답일 경우.
			System.out.println("10번째 힌트글자 : 팅\r\n");			// 힌트 출력.
			Tama.like += 1000;
			break;
		case 4:											// 오답일 경우.
			System.out.print("오답입니다. 다음에는 꼭 풀 수 있을거에욤!!>.<");
			Tama.like-=820;
			break;
		}
		
	}
}
