package _20220502;

import java.util.Scanner;

public class StringGameExample {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean run = true;

		// 게임 초기화는 while문 바깥에
		// while문 안에다가 해 버리면 메뉴가 출력될 때마다 정답이 달라짐
		StringGame game = new StringGame();
		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");
			System.out.println("선택 >>");
			int menu = Integer.parseInt(sc.nextLine()); // nextInt 써보기, 나 nextInt썼을때 먼가 이상했었음..

			switch (menu) {
			case 1:
				game.setCharData();
				break;
			case 2:
				game.setStrData();
				break;
			case 3:
				game.showCharData();
				break;
			case 4:
				game.init();
				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("메뉴를 잘못 입력하셨습니다.");

			}
		}
	}

}
