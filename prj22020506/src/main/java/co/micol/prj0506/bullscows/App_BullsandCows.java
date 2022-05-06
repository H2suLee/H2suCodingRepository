package co.micol.prj0506.bullscows;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// 중복값 없이 랜덤값 3개 출력
// 

public class App_BullsandCows {
	public static void main(String[] args) {
		int random = (int) (Math.random() * 4) + 1;
		List<String> game = new ArrayList<String>();

		switch (random) {
		case 1:
			game = new ArrayList<String>();
			game.add("O"); // toLowercase?
			game.add("r");
			game.add("a");
			game.add("n");
			game.add("g");
			game.add("e");
			System.out.println(game.size());

			break;
		case 2:
			game = new ArrayList<String>();
			game.add("G");
			game.add("a");
			game.add("m");
			game.add("e");
			System.out.println(game.size());

			break;

		case 3:
			game = new ArrayList<String>();
			game.add("P");
			game.add("h");
			game.add("o");
			game.add("n");
			game.add("e");
			System.out.println(game.size());

			break;
		case 4:
			game = new ArrayList<String>();
			game.add("S");
			game.add("m");
			game.add("a");
			game.add("r");
			game.add("t");
			System.out.println(game.size());

			break;
		}
		System.out.println(random);

		Scanner sc = new Scanner(System.in);
		int menu;
		boolean run = true;

		List<String> input = new ArrayList<String>();

		int count = 0; // 입력 횟수
		String str;
		String word;

		while (run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");
			System.out.println("선택 >>");
			menu = Integer.parseInt(sc.nextLine());

			if (menu == 1) {
				System.out.println("입력 값 >>");
				str = sc.nextLine();
				// (word.charAt(i).equals(game.get(i))) 이거 해결 못해서 String에서 Char로 타입 다 바꿈
				// generic 클래스, 변수 다 바꾸고 charValue = sc.next().charAt(0)까지 했지만 메뉴 1에서
				// NumberFormat 에러가 자꾸 나서
				// 다시 스트링 클래스로 다 바꾸고 3번 메뉴 조건은 valueOf로 해결함
				if (game.contains(str)) {
					if (input.size() < game.size()) {
						++count;
						System.out.println("문자열을 구성하는 문자입니다.");
						input.add(str);
					} else if (input.size() >= game.size()) {
						System.out.println("문자열을 구성하는 문자를 다 입력하셨습니다.");
//						return;
					}
				} else {
					System.out.println("문자열을 구성하는 문자가 아닙니다.");
//					--count; // 이거 넣으면 입력된 수도 뺌(3번에 for문 돌 때 영향)
				}
				System.out.println(input.size());

			} else if (menu == 2) {
				// 객체 수 만큼 루핑
				for (String str2 : input) {
					System.out.print(str2 + " ");
				}
				System.out.println();
				System.out.println("입력 값 >>");

				word = sc.nextLine();
				for (int i = 0; i < game.size(); i++) {
					if (String.valueOf(word.charAt(i)).equals(game.get(i))) {
						System.out.print("O" + " ");
					} else {
						System.out.print("X" + " ");
					}
				}

				if (word.equals(String.valueOf(game))) { // word.equals(game) 도 안됨
					System.out.println("정답입니다.");
				} else {
					System.out.println("정답이 아닙니다.");
				}

				System.out.println();
			} else if (menu == 3) {
				System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
				for (int i = 0; i < count; i++) {
					System.out.print(input.get(i) + " ");
				}
				System.out.println();
			} else if (menu == 4) {
				game = new ArrayList<String>();
				random = (int) (Math.random() * 4) + 1; // switch문으로 어떻게 다시 가지
				input = new ArrayList<String>();
			} else if (menu == 5) {
				run = false;
				System.out.println("프로그램을 종료합니다.");
			}

		}

	}

}
