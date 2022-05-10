package tama;

import java.util.Random;
import java.util.Scanner;

public class TamaMinigame {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	Tama tama = new Tama();
	int inputNum;
	
	public void ccc() { 						// 참참참 게임.
		System.out.println("참참참 게임");
		System.out.println("1.왼쪽  2.오른쪽");		// 메뉴 출력.
		inputNum = scan.nextInt();				// inputNum에 값을 입력.

		int number = random.nextInt(2);			// 상대의 수를 랜덤으로 입력.
		switch (number) {						// 상대의 수를 출력.
		case 0:									// '0'일 경우.(왼쪽일 경우)
			System.out.println("상대 : 왼쪽");
			break;
		case 1:									// '1'일 경우.(왼쪽일 경우)
			System.out.println("상대 : 오른쪽");
			break;
		}
		switch (inputNum) {						// inputNum에 입력받은 값에따라 맞추면 호감도 증가.
		case 1:											// 자신의 수가'왼쪽'일 경우.
			System.out.println("나는 왼쪽!");				// 자신의 수를 출력.
			if (number == 0) {							// 상대와 나의 패가 같을 경우.
				System.out.println("맞춤"); Tama.like += 30;	// 호감도 '30' 증가.
			} else										// 상대와 나의 패가 다를 경우.
				System.out.println("못맞춤.");
			break;

		case 2:											// 자신의 수가'오른쪽'일 경우.
			System.out.println("나는 오른쪽!");				// 자신의 수를 출력.
			if (number == 1) {							// 상대와 나의 패가 같을 경우.
				System.out.println("맞춤."); Tama.like += 30;	// 호감도 '30' 증가.
			} else										// 상대와 나의 패가 다를 경우.
				System.out.println("못맞춤.");
			break;
		}
	}
	public void gbb() { 							// 가위바위보 게임.
		int number = random.nextInt(3);				// 상대의 수를 랜덤으로 선택.

		System.out.println("가위 바위 보 게임");	
		System.out.println("1.가위  2.바위  3.보");		// 메뉴 출력.
		inputNum = scan.nextInt();					// 자신의 수 선택.

		switch (number) {							// 상대의 수를 출력.
		case 0:
			System.out.println("상대 : 가위");
			break;
		case 1:
			System.out.println("상대 : 바위");
			break;
		case 2:
			System.out.println("상대 : 보");
			break;
		}
	}
}
