package co.edu.homework;

import java.util.Scanner;

import co.edu.casting.Parent;

public class Main {
	public static void main(String[] args) {

		boolean run = true;
		int num = 0;
		Student[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("=============================================");
			System.out.println("1. 학생 수, 2. 학생 정보 입력, 3. 학생 정보 출력, 4. 종료");
			System.out.println("선택 > ");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				System.out.println("학생 수 > ");
				num = Integer.parseInt(sc.nextLine());
				scores = new Student[num];

				System.out.println(scores.length);
			}
			if (select == 2) {
				for(int i = 0; i< scores.length; i++) {
					System.out.println("학번 >");
					int a = Integer.parseInt(sc.nextLine());
					System.out.println("국어 >");
					int x = Integer.parseInt(sc.nextLine());
					System.out.println("영어 >");
					int y = Integer.parseInt(sc.nextLine());
					System.out.println("수학 >");
					int z = Integer.parseInt(sc.nextLine());
					scores[i] = {a, x, y, z};
					
					
					
//					Parent p2 = new Parent();
//					Parent p3 = new Parent();
//					Parent p4 = new Parent();
//
//					Parent[] parent = { p2, p3, p4 };
				}
			}
				System.out.println("");
			}
//			if (select == 2) {
//				for (int i = 0; i < scores.length; i++)
//					for (int j = 0; j < 4; j++) {
//						if (j == 0) {
//							System.out.println("학번 > ");
//							int a = Integer.parseInt(sc.nextLine());
//							 scores[i][j] = a;
//						} else if (j == 1) {
//							System.out.println("국어 > ");
//							int x = Integer.parseInt(sc.nextLine());
//							 scores[i][j] = x;
//						} else if (j == 2) {
//							System.out.println("수학 > ");
//							int y = Integer.parseInt(sc.nextLine());
//							 scores[i][j] = y;
//						} else if (j == 3) {
//							System.out.println("영어 > ");
//							int z = Integer.parseInt(sc.nextLine());
//							 scores[i][j] = z;
//						}
//
//					}
//
//				System.out.println("=============================================");
//
//			}
//		}
//		if(select == 3) {
//			System.out.println("학번 입력 >");
//			int aa = Integer.parseInt(sc.nextLine());
//			aa.studentNo
//			
//			
//		}

//			System.out.println("출금액 > ");
//			int minus = Integer.parseInt(sc.nextLine());
//			aaa.withdraw(minus);
//		} else if(select == 3) {
//			aaa.checkBalance();
//		} else {
//			System.out.println("종료합니다.");
//			break;
//		}

	}

}
