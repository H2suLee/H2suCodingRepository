package co.edu.homework;

import java.util.Scanner;

import co.edu.casting.Parent;

public class Main {
	public static void main(String[] args) {
		// 변수 랭크 변수 카운트
		// rank 변수가 없으면 2번을 돌렸을 때 데이터가 계속 갱신이 되는 지?
		// menu4 변수 바꿔치기 : 두 개의 데이터 값 중에 큰 수 작은 수 비교
		
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
//					scores[i] = {a, x, y, z}; // ★컴파일 에러
					
				}
			}
				System.out.println("");
			}
//			if (select == 2) { 
			// 
			// ★다차원 배열로 풀어보려고 했는데
//				for (int i = 0; i < scores.length; i++)
//					for (int j = 0; j < 4; j++) {
//						if (j == 0) {
//							System.out.println("학번 > ");
//							int a = Integer.parseInt(sc.nextLine());
//							 scores[i][j] = a; // ★ 다차원 배열에 데이터를 입력하려니 다 에러나요 ㅠ
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
//			}
//			
//		} else {
//			System.out.println("종료합니다.");
//			break;
//		}

	}

}
