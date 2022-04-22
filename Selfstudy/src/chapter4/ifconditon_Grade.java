package chapter4;

import java.util.Scanner;

public class ifconditon_Grade {

	public static void main(String[] args) {
		// 학점 측정 프로그램. 콘솔창에 점수를 입력하면 학점으로 변환해 주는 프로그램
		// 콘솔창에 입력한 점수를 데이터로 받는 과정 선행 필요
		// Scanner, Nextint() 메소드 사용해 보기
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요.");
		int value = sc.nextInt();
		System.out.println(value);

		System.out.println("--------------------------------");

		System.out.println("1~5 사이의 숫자를 입력하세요.");
		int value2 = sc.nextInt();

		if (value2 == 1) {
			System.out.println("숫자 1을 입력하셨습니다.");
		} else if (value2 == 2) {
			System.out.println("숫자 2를 입력하셨습니다.");
		} else if (value2 == 3) {
			System.out.println("숫자 3을 입력하셨습니다.");
		} else if (value2 == 4) {
			System.out.println("숫자 4를 입력하셨습니다.");
		} else if (value2 == 5) {
			System.out.println("숫자 5를 입력하셨습니다.");
		} else {
			System.out.println("1~5 사이의 숫자를 입력해 주세요.");
		}

		System.out.println("--------------------------------");
		// 학점 측정 프로그램
		System.out.println("점수를 입력하세요.");
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("A학점");
		} else if (score >= 80) {
			System.out.println("B학점");
		} else if (score >= 70) {
			System.out.println("C학점");
		} else if (score >= 60) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점, 공부하세요!");
		}

	}

}
