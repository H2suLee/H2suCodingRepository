package practice;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BankAccout aaa = new BankAccout("123-456", "이희수", 1000000);

		while (true) {

			System.out.println("1. 예금, 2. 출금, 3. 잔액 확인, 4.종료");
			System.out.println("선택 >");
			int select = Integer.parseInt(sc.nextLine());

			if (select == 1) {
				System.out.println("입금액을 입력하세요: ");
				int plus = Integer.parseInt(sc.nextLine());
				aaa.deposit(plus);
			} else if (select == 2) {
				System.out.println("출금액을 입력하세요: ");
				int minus = Integer.parseInt(sc.nextLine());
				aaa.withdraw(minus);
			} else if (select == 3) {
				aaa.checkbalance();
			} else {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}

}
