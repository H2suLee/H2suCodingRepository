package chapter4;

import java.util.Scanner;

public class Exam_2_RockScissorPaper {
	public static void main(String[] args) {
		// scanner, random를 써서 사용자가 0이면 가위, 1이면 바위, 보는 2
		// 반복문은 쓰면 안됨
		// 컴퓨터와 가위(0), 바위(1), 보(2) 해서 승리/패배 출력
		System.out.println("가위, 바위, 보, 시작!");

		// if문으로
		int computer = (int) (Math.random() * 2);
		Scanner sc = new Scanner(System.in);
		String user = sc.nextLine();
		if (computer == 0) {
			System.out.println("컴퓨터: 가위");
			if (user.equals("가위")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 비겼습니다.");
			}
			if (user.equals("바위")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 사용자 승리!");
			}
			if (user.equals("보")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 컴퓨터 승리!");
			}
		}

		if (computer == 1) {
			System.out.println("컴퓨터: 바위");
			if (user.equals("가위")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 컴퓨터 승리!");
			}
			if (user.equals("바위")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 비겼습니다.");
			}
			if (user.equals("보")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 사용자 승리!");
			}
		}

		if (computer == 2) {
			System.out.println("컴퓨터: 보");
			if (user.equals("가위")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 사용자 승리!");
			}
			if (user.equals("바위")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 컴퓨터 승리!");
			}
			if (user.equals("보")) {
				System.out.println("사용자: " + user);
				System.out.println("결과: 비겼습니다.");
			}
		}

		// 스위치 문으로
		System.out.println("다시 시작!");

		int computer2 = (int) (Math.random() * 2);
		int user2 = sc.nextInt();

		switch (computer2) {
		case 0:
			System.out.println("컴퓨터: " + computer2);
			if (computer2 == user2) {
				System.out.println("사용자: " + user2);
				System.out.println("결과: 비김");
			}
			if (user2 == 1) {
				System.out.println("사용자: " + user2);
				System.out.println("사용자 승리");
			}
			if (user2 == 2) {
				System.out.println("사용자: " + user2);
				System.out.println("컴퓨터 승리");
			}
			break;
		case 1:
			System.out.println("컴퓨터: " + computer2);
			if (computer2 == user2) {
				System.out.println("사용자: " + user2);
				System.out.println("결과: 비김");
			}
			if (user2 == 0) {
				System.out.println("사용자: " + user2);
				System.out.println("컴퓨터 승리");
			}
			if (user2 == 2) {
				System.out.println("사용자: " + user2);
				System.out.println("사용자 승리");
			}
			break;
		case 2:
			System.out.println("컴퓨터: " + computer2);
			if (computer2 == user2) {
				System.out.println("사용자: " + user2);
				System.out.println("결과: 비김");
			}
			if (user2 == 1) {
				System.out.println("사용자: " + user2);
				System.out.println("컴퓨터 승리");
			}
			if (user2 == 0) {
				System.out.println("사용자: " + user2);
				System.out.println("사용자 승리");
			}
			break;

		}

	}

}
