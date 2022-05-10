package co.micol.miniprj.draft;

import java.util.Scanner;

public class Menu {

	Puppy puppy = new Puppy();
	PuppySub sub = new PuppySub();
	PuppyState state;

	Scanner sc = new Scanner(System.in);

	private void title1() {
		System.out.println("---------------------------------");
		System.out.println("   1. 게임 시작         2. 게임 설명  ");
		System.out.println("---------------------------------");
	}

	private void title2() {
		System.out.println("---------------------------------");
		System.out.println("   1. 강아지 등록하기");
		System.out.println("   2. 등록한 강아지 확인하기");
		System.out.println("   3. 강아지 선택하기"); // 선택한 강아지로 메뉴 3
		System.out.println("   4. 돌아가기");
		System.out.println("---------------------------------");
	}

	private void title3() {
		System.out.println("---------------------------------");

		System.out.println("1. 상태 확인하기");
		System.out.println("2. 활동하기");
		System.out.println("3. 하루 끝내기");
		System.out.println("4. 돌아가기");

	}

	private void title4() { // 활동하기
		System.out.println("---------------------------------");

		System.out.println("1. 잠");
		System.out.println("2. 식사");
		System.out.println("3. 산책");
		System.out.println("4. 목욕");
		System.out.println("5. 돌아가기");

	}

	private void title5() { // 하루 끝내기
		System.out.println("---------------------------------");
		System.out.println("1. 종료"); // 상태에 따라 하루 요약하기
		System.out.println("2. 처음으로 돌아가기");
	}

	private void menu1() {
		boolean run = true;
		do {
			title1();
			System.out.println("선택");
			int select = Integer.parseInt(sc.next());
			switch (select) {
			case 1: // 게임 시작
				menu2();
				break;
			case 2: // 게임 설명
				Explain ex = new Explain();
				ex.text1();
				break;
			default:
				break;
			}
		} while (!run);
	}

	private void menu2() { //
		boolean run = true;
		do {
			title2();
			System.out.println("선택");
			int menu2 = sc.nextInt();
			switch (menu2) {
			case 1: // 강아지 등록
				System.out.println("강아지 등록하기");
				sub.register();
				System.out.println("선택");
				menu3();
				break;
			case 2: // 강아지 등록 확인
				System.out.println("강아지 등록확인하기");
				sub.printList();
				break;
			case 3: // 강아지 선택
				System.out.println("강아지 선택, 생성하기");
				
				break;
			case 4: // 돌아가기
				menu1();
			default:
				break;
			}
		} while (true);

	}

	private void menu3() { // 매개 변수
		boolean run = true;
		do {
			title3();
			int menu3 = sc.nextInt();
			switch (menu3) {
			case 1: // 상태 확인
				state.set();
				state.stateTable();
				break;
			case 2: // 활동
				title4();
				int num3 = sc.nextInt();
				break;
			case 3: // 하루 끝
				Ending end;
				int num = sc.nextInt();
				switch (num) {
				case 1: // 종료
					break;
				case 2: // 돌아가기
					break;
				}
				break;
			case 4:
				menu2();
			default:
				System.out.println("메뉴 잘못");
				break;
			}
		} while (true);
	}

	public void menu4() {

		boolean run = true;
		do {
			title4();
			int menu4 = sc.nextInt();
			switch (menu4) {
			case 1:
				System.out.println("잠");
				break;
			case 2:
				System.out.println("식사");

				break;
			case 3:
				System.out.println("산책");

				break;
			case 4:
				System.out.println("목욕");

				break;
			case 5:
				System.out.println("돌아가기");
				menu2();
				break;
			}
		} while (true);
	}

	public void run() {
		menu1();
	}

}
