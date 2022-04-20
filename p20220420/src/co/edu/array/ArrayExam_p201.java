package co.edu.array;

import java.util.Scanner;

public class ArrayExam_p201 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("--------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수 입력 | 3. 점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------");
			System.out.println("선택 >");

			int selectNo = Integer.parseInt(sc.nextLine());
			// switch문
			if (selectNo == 1) {
				System.out.println("학생수 >");
				studentNum = sc.nextInt(); // 배열 크기로 할 정수 입력
				scores = new int[studentNum]; // 입력한 정수가 배열 크기가 됨
				sc.nextLine(); // 이 라인 없이 run 하면 numberformat뭐시기 오류가 뜸. 
				// 위 라인 없이 parseInt 메소드 사용하는 방법도 있음

			} else if (selectNo == 2) { //int score = sc.nextInt();, scores[i] = score << 은 왜 안되나?
				for (int i = 0; i < scores.length; i++) { // 각 칸에 숫자 담기 0번째 칸 = 1
					System.out.println("scores[" + i + "] >");
					scores[i] = sc.nextInt();
				}
				sc.nextLine();
			} else if (selectNo == 3) { 

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}
			} else if (selectNo == 4) {
				//
				int sum = 0;
				int max = 0;
				for (int i = 0; i < scores.length; i++) {
					if (scores[i] > max) {
						max = scores[i];
					}
					sum += scores[i];
				}

				System.out.println("최대값: " + max);

				System.out.println("총점 : " + sum);

				System.out.println("평균 점수 : " + (double) (sum / scores.length));

			} else if (selectNo == 5) {
				System.out.println("프로그램을 종료합니다.");
				run = false;
			}
		}
	}
}

//System.out.println("프로그램 종료");

//			else if(selectNo == 4) {
//
//				int max = 0;
//				for (int i = 0; i < scores.length; i++) {
//					if (max < scores[i]) {
//						max = scores[i];
//					}
//				}
//				System.out.println("최대값: " + max);
//				
//				int sum = 0;
//				 for(int i = 0; i < scores.length; i++) { 
//					 sum += scores[i]; }
//				 }
//				 System.out.println("총점 : " + sum); 
//				 
//				System.out.println("평균 점수 : " + (double) (sum/scores.length));

//			} else if(selectNo == 5) {
//				run = false;
//			}
//		}
//
//	System.out.println("프로그램 종료");

//}
//}
