package tama;

import java.util.Random;
import java.util.Scanner;

public class TamaAction {
	Scanner scan = new Scanner(System.in);
	Random random = new Random();
	TamaMinigame minigame = new TamaMinigame();
	public void action() {								// 다마고치가할 행위를 선택하는 메소드.
		while(true) {						// 입력받은 값이 잘못된 경우 다시 메뉴를출력하고 입력받게 한다.
		System.out.println("\r\n무엇을 하시겠습니까?");
		System.out.print("(1.놀기) (2.밥먹기) (3.씻기) (4.운동) (5.리셋)");	// 행위메뉴 출력.
		if(Tama.gameChance == true ) {						// gameChance가 'true'일 경우.(미니게임이 가능한 경우)
			System.out.print(" (6.미니게임)");				// "6.미니게임" 항목을 출력.
		}
		System.out.print("\n입력 : ");
		Tama.inputNum = scan.nextInt();	// 숫자 입력			// inputNum에 숫자입력.
		System.out.println("\r\r");
		if(Tama.inputNum < 1 || 6 < Tama.inputNum || (Tama.inputNum == 6 && Tama.gameChance == false)) {	// 입력받은 숫자가 '1~6'이 아니거나 미니게임을 할수 없는경우에 '6'을 입력했을 경우
			System.out.println("잘못된 입력입니다.");
			continue;									// while문의 처음으로 돌아간다.
		}
		else break;										// 그렇지 않을경우 while문을 빠져나온다.
		}
		switch(Tama.inputNum) {				// 입력받은 숫자에 따라 해당 case 실행.
		case 6:	miniGame(); break;		// '6'을 입력했을 경우 미니게임 실행.
		case 5: break;					// '5'를 입력했을 경우 메인 메소드에 의해서 게임이 종료된다. 
		case 4: health(); break;		// '4'를 입력했을 경우 health메소드 실행. 
		case 3: shower(); break;		// '3'을 입력했을 경우 shower메소드 실행.
		case 2: feed(); break;			// '2'를 입력했을 경우 feed메소드 실행.
		case 1: play(); break;			// '1'을 입력했을 경우 play메소드 실행.
		}
	}
	public void miniGame() {				// 미니게임실행.
		Tama.time += 1;							// 시간이 '1' 증가.
		Tama.gameChance = false;					// Tama.gameChance에 'false'값 일력.(미니게임을 할 기회를 없앤다.)
		int whatGame = random.nextInt(2);	// whatGame에 '0'과'1'중 랜덤으로 숫자 입력.
		switch(whatGame) {					// whatGame에 입력된 값에의해 해당 case 실행	.
		case 0 : minigame.gbb(); break;				// 가위바위보 게임 실행.
		case 1 : minigame.ccc(); break;				// 참참참 게임 실행.
		}
	}
	public void health() { 						// '운동한다'에 대한 행위를 실행
		if (Tama.chealth < 100) {					// chealth가 '100'미만일 경우.
			Tama.chealth += 9;						// chealth값이 '9'만큼 증가.
			Tama.like += 1;							// like값이 '1'만큼 증가.
			System.out.println("┌(*^▽^*)┘└(*＾▽＾*)┐\r\n"  +TamaName.tamaName+"님의 몸이 튼튼해 졌습니다.");		
		}
		else									// 그렇지 않을 경우 알림문만 출력.
			System.out.println("┗(＠°o°＠)┓┏(＠°○°＠)┛\r\n더이상의 운동은 그만두세요!\r\n");
	}
	public void shower() { 						// '씻는다'에 대한 행위를 실행
		if (Tama.cshower < 100) {					// cshower가 '100'미만일 경우.
			Tama.cshower += 42;						// cshower값이 '42'만큼 증가.
			Tama.like += 1;							// like값이 '1'만큼 증가.
			System.out.println("┌(*^▽^*)┘└(*＾▽＾*)┐\r\n"+TamaName.tamaName+"님의 몸이 깨끗해졌습니다.\r\n");
		}
		else									// 그렇지 않을 경우 알림문만 출력.
			System.out.println("┗(＠°o°＠)┓┏(＠°○°＠)┛\r\n피부가 닳아 버리겠어요!\r\n");
	}
	public void feed() { 						// '먹다'에 대한 행위를 실행
		if (Tama.cfeed < 100) {						// cfeed가 '100'미만일 경우.
			Tama.cfeed += 21;						// cfeed값이 '21'만큼 증가.
			Tama.like += 3;							// like값이 '3'만큼 증가.
			System.out.println("┌(*^▽^*)┘└(*＾▽＾*)┐\r\n밥을 먹으니 기분이 좋아집니다!\r\n");
		}
		else									// 그렇지 않을 경우 알림문만 출력.
			System.out.println("┗(＠°o°＠)┓┏(＠°○°＠)┛\r\n"+TamaName.tamaName+"님 배가 터져버리겠어요!\r\n");
	}
	
	
	public void play() { 						// '논다'에 대한 행위를 실행
		
		
		if (Tama.cplay < 100) {						// cplay가 '100'미만일 경우.
			Tama.cplay += 7;							// cplay값이 '7'만큼 증가.
			Tama.like += 1;							// like값이 '1'만큼 증가.
			System.out.println("┌(*^▽^*)┘└(*＾▽＾*)┐\r\n"+TamaName.tamaName+"님이 즐거워합니다.\r\n");
			
		}
		
		else									// 그렇지 않을 경우 알림문만 출력.
			System.out.println("┗(＠°o°＠)┓┏(＠°○°＠)┛\r\n노는것은 그만 둬야겠네요.\r\n");
	}
}
