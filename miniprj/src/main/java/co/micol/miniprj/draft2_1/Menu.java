package co.micol.miniprj.draft2_1;

import java.util.Scanner;

public class Menu {

	Scanner sc = new Scanner(System.in);
	Puppy puppy = new Puppy();

	private void title1() {
		System.out.println("---------------------------------");
		System.out.println("   1. 게임 시작         2. 게임 설명  ");
		System.out.println("---------------------------------");
	}

	private void title2() {
		System.out.println("---------------------------------");
		System.out.println("   1. 강아지 등록하기");
//		System.out.println("   2. 강아지 등록 확인 하기");
		System.out.println("   3. 돌아가기"); // -> title1
		System.out.println("---------------------------------");
	}

	private void title3() {
		System.out.println("---------------------------------");

		System.out.println("1. 상태 확인하기");
		System.out.println("2. 활동하기"); // = title4
		System.out.println("3. 돌아가기"); // -> title2
		System.out.println("4. 종료하기");

	}

	private void title4() { // 활동하기
		System.out.println("---------------------------------");

		System.out.println("1. 잠");
		System.out.println("2. 식사");
		System.out.println("3. 산책");
		System.out.println("4. 목욕");
		System.out.println("5. 돌아가기"); // -> title3

	}

	private void menu1() {
		boolean b = false;
		do {
			title1();
			System.out.println("선택");
			int menu1 = Integer.parseInt(sc.next());
			switch (menu1) {
			case 1: // 게임 시작
				menu2();
				break;
			case 2: // 게임 설명
				System.out.println("게임설명?");
				break;
			default:
				break;
			}
		} while (!b);
	}

	private void menu2() { //
		boolean b = false;
		do {
			title2();
			System.out.println("선택");
			int menu2 = sc.nextInt();
			switch (menu2) {
			case 1: // 강아지 등록
				puppy.register();
				State.initState();
				menu3();
				break;
//			case 2: // 강아지 등록 확인
//				System.out.println("강아지 등록 확인하기");
//				break;
			case 3:
				menu1();
			default:
				break;
			}
		} while (!b);

	}

	private void menu3() {
		boolean b = false;
		do {
			title3();
			int menu3 = sc.nextInt();
			switch (menu3) {
			case 1: // 상태 확인 	
				State.stateTable();
				break;
			case 2: // 활동
				menu4();
				break;
			case 3: // 돌아가기
				menu2();
				break;
			case 4: // 종료
				System.out.println("강아지의 하루 요약");				// 상태에 따라 출력 
				Ending.summary();
				b=true;
				System.exit(0);
				break;
			default:
				break;
			}
		} while (!b);
	}

	public void menu4() {

		boolean b = false;
		do {
			title4();
			int menu4 = sc.nextInt();
			switch (menu4) {
			case 1:
			case 2:
			case 3:
			case 4:
				Activity act = new Activity();
				act.selectActivity(menu4);
				break;
			case 5:
				System.out.println("돌아가기");
				menu3();
				break;
			}
		} while (!b);
	}

	public void run() {
		menu1();
	}

}
