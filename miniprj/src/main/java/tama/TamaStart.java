package tama;

import java.util.Scanner;

public class TamaStart {
	Scanner scan = new Scanner(System.in);
	TamaName name = new TamaName();

	public void start() { // 다마고치가 처음 실행될 때 기본적인 인터페이스 창 출력.
		System.out.print("■■■■■■■■■■■■■■■■■■■■■■\r\n" + "\t▶간바레 다마고치◀ \r\n" + "\n" + "\t조장 : 박보근\r\n"
				+ "\t조원 : 정지민, 오희재\r\n" + "■■■■■■■■■■■■■■■■■■■■■■\r\n" + "\r\n");
	}

	public void menuSelect() { // 시작메뉴 출력과 값을 입력 받아 메뉴선택.
		int inputNum;
		do {
			System.out.print("========================\n" + "1. 게임 시작\n" + "2. 설명\n" + "========================\n"
					+ "메뉴 번호 입력 : \r\n"); // 메뉴 출력.
			inputNum = scan.nextInt(); // inputNum에 값을 입력받는다.
			switch (inputNum) { // 선택한 메뉴를 실행한다.
			case 2:
				explain(); // explain 메소드 실행.
				break;
			case 1:
				break;
			default:
				break;
			}
		} while (inputNum != 1); // 입력받은값이 '1(게임시작)' 이 아닐경우 계속 메뉴선택.
	}

	public void explain() {
		int inputNum;
		do {
			System.out.println("▶원하시는 항목을 선택해주세요");
			System.out.println("\r\n(1.호감도) (2.퀴즈) (3.행위) (4.Password) (5.나가기)\r\n");
			inputNum = scan.nextInt();
			switch (inputNum) {
			case 5:
				break;
			case 4:
				text4();
				break;
			case 3:
				text3();
				break;
			case 2:
				text2();
				break;
			case 1:
				text1();
				break;
			default:
				break;
			}
		} while (inputNum != 5);
	}

	public void text1() {
		System.out.println("→호감도는 간바레 다마고치 게임과 아주 밀접한 관계이며 호감도가 -50미만이 될경우 게임오버입니다\r\n"
				+ "또한 게임 클리어시 호감도의 점수를 반영하여 랭킹 등급을 매기는 시스템이므로 게임시 호감도를 체크하면서 해주시길 바랍니다\r\n"
				+ "호감도는 게임내의 다양한 시스템을 통해 얻을 수 있습니다.   ");
	}

	public void text2() {
		System.out.println("→간바레 다마고치는 각 행위를 할때마다 날짜 카운터가 증가하며 일정수치까지 차면 나이가 증가합니다\r\n"
				+ "나이가 증가할 때 마다 각각의 퀴즈가 등장하는데 현재 J2반의 전공 문제로 되어있기에 열심히 공부하셨다면 맞출 수 있을 겁니다.\r\n"
				+ "정답을 맞출 경우에는 호감도가 대폭 상승하며 오답일 경우에는 그에 따른 페널티도 부여됩니다 .");
	}

	public void text3() {
		System.out.println("→간바레 다마고치에서  할수있는 행위는 '논다', '먹다', '씻는다', '운동한다','미니게임' 5가지가 있습니다.\r\n"
				+ "각 행위를 할때마다 간바레 다마고치의 호감도가 상승합니다.\r\n" + "카운터가 일정치만큼 증가 했을경우 알림문이 뜨며 더이상 행위를 하여도 호감도가 증가하지 않습니다.\r\n"
				+ "한 행위를 하면 실행한 행위의 카운터는 증가하지만 다른 행위의 카운터는 감소합니다.\r\n"
				+ "일정치 이상 카운터가 감소하게 되면 어떤 행위의 카운터가 부족한지 알려줍니다.\r\n" + "경고를 한 뒤 카운터가 감소하게 된다면 그때부턴 호감도가 감소합니다."
				+ "이중 '미니게임'은 할 수 있는 횟수가 게임상의 '아침','점심','저녁'마다 한번씩으로 한정되어있습니다.");
	}

	public void text4() {
		System.out.println("\r\n\r\n→'Password'는 게임내의 히든 엔딩으로 게임을 진행하며 암호에 대한 힌트를 얻을 수 있습니다.\r\n\r\n");
	}
}
