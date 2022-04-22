package chapter4;

import java.util.Scanner;

public class Exam_6_Banking {
	public static void main(String[] args) {
		// p161
		// while문과 Scanner를 이용해서 키보드로 입력된 데이터로 예금, 출금, 조회, 종료 기능을 제공하는 프로그램을 만들어 보세요.

		Scanner sc = new Scanner(System.in);
		boolean run = true;
		int balance = 0;
		while (run) {

			System.out.println("================================");
			System.out.println("1. 예금, 2. 출금, 3. 잔고, 4. 종료");
			System.out.println("================================");
			System.out.println("선택 >");
			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				System.out.println("예금액 >");
				int deposit = Integer.parseInt(sc.nextLine());
				balance += deposit;
			}
			if (select == 2) {
				System.out.println("출금액 >");
				int withdraw = Integer.parseInt(sc.nextLine());
				if (withdraw > balance) {
					System.out.println("잔고가 부족합니다.");
				} else {
					balance -= withdraw; // 이 부분 놓침. else문에 넣어야 할 걸 자꾸 그냥 입력해서 잔고 마이너스로 떴음
				}
			}
			if (select == 3) {
				System.out.println("잔고 > " + balance);
			}
			if (select == 4) {
				System.out.println("프로그램 종료");
				run = false;
			}
		}

	}

}
