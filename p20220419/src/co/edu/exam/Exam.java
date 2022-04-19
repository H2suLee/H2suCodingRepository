package co.edu.exam;

import java.util.Scanner;

public class Exam {
	public static void main(String[] args) {
//		// 1. 화씨 -> 섭씨
		Scanner sc = new Scanner(System.in); // 데이터 받을 준비
//		System.out.println("화씨를 입력하세요.");
//		int c_temp = sc.nextInt(); // 방법 ①
//		double f_temp = 5 / 9.0 * (c_temp - 32); // 방법②, 근데 5 / 9하면 안 되고 5 / 9.0, 하나라도 실수로 넣어야 double로 됨
//		System.out.printf("%.2f\n", 5 / 9.0 * (c_temp - 32));
//		System.out.printf("%.2f\n", f_temp);
//
		// 2. 가위(0) 바위(1) 보(2)
		System.out.println("가위(0), 바위(1), 보(2)");
		int user = sc.nextInt();
		int random = (int) (Math.random() * 3); // 랜덤으로 나올 수 있는 값은 0~2

		switch (user) {
		case 0:
			if (random == 1) {
				System.out.println("졌습니다.");
			} else if (random == 2) {
				System.out.println("이겼습니다.");
			} else {
				System.out.println("비겼습니다.");
			}
			break;

		case 1:// 이하 동일
		case 2:
		}
//
//		// 3. 학점 관리 프로그램
//		System.out.println("점수를 입력하세요.");
//		int point = sc.nextInt();
//		// 100~90, 89~80, 79~70
//		switch (point / 10) {
//		case 10:
//		case 9:
//			System.out.println("A학점");
//			break;
//		case 8:
//			System.out.println("B학점");
//			break;
//		case 7:
//			System.out.println("C학점");
//			break;
//		}
	}
}
