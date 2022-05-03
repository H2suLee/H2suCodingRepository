package p20220503_LHS;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Member member;
		Scanner sc = new Scanner(System.in);

		Payment payment = null; // 얘 구현해야 하는데

		System.out.println("전월 실적 >>");
		int record = Integer.parseInt(sc.nextLine());
		member = new Member(record);
		member.showMemberInfo();

		if (member.getMemberShip(record) == 1) {
			payment = new VIPCard();
		} else if (member.getMemberShip(record) == 2) {
			payment = new GreenCard();
		}
		System.out.println("=== 등급에 따른 카드 사용시 결제 예상 금액 ===");
		System.out.println("사용할 금액 >>");

		int price = Integer.parseInt(sc.nextLine()); // 금액 입력
		int result = 0;
		System.out.println("결제 방법: 1. 오프라인, 2. 온라인, 3. 간편 결제");
		int menu = Integer.parseInt(sc.nextLine()); // 결제 방법 선택
		switch (menu) {
		case 1:
			result = payment.offline(price);
			System.out.println("결제 예상 금액: " + result);
			break;
		case 2:
			result = payment.online(price);
			System.out.println("결제 예상 금액: " + result);
			break;
		case 3:
			result = payment.simple(price);
			System.out.println("결제 예상 금액: " + result);
			break;
		}

		payment.showCardInfo();

	}
}
