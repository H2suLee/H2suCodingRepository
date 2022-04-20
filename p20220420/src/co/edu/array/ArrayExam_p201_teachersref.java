package co.edu.array;

import java.util.Scanner;

public class ArrayExam_p201_teachersref {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);

		while (run) {
			System.out.println("-----------------------------------------------");
			// 1. 학생 수 => 배열 크기 설정
			// 2. 점수 입력 => 배열 데이터 입력
			// 3. 점수 리스트 => 배열 데이터 출력
			// 4. 분석 => 최대값, 평균 구하기
			// 5. 종료 => 반복문 종료
			System.out.println("1.학생 수 | 2.점수 입력 | 3.점수 리스트 | 4. 분석 | 5. 종료");
			System.out.println("-----------------------------------------------");
			System.out.println("선택>");

			int selectNo = Integer.parseInt(sc.nextLine());

			// switch
			if (selectNo == 1) {

				System.out.println("학생수>");

				studentNum = sc.nextInt();

				scores = new int[studentNum];

				sc.nextLine();

			} else if (selectNo == 2) {

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = sc.nextInt();
				}
				sc.nextLine();

			} else if (selectNo == 3) {

				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]> " + scores[i]);
				}

			} else if (selectNo == 4) {
				int sum = 0;
				int max = 0;
				for (int i = 0; i < scores.length; i++) {

					max = max < scores[i] ? scores[i] : max;

					if (max < scores[i]) {
						max = scores[i];
					}
					sum += scores[i];
				}
				System.out.println("최고 점수 : " + max);
				System.out.printf("평균 점수 : %.2f\n", (double) sum / scores.length);
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("end of prog");
	}
}
