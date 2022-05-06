package co.micol.prj0506.lotto;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {
	Scanner sc = new Scanner(System.in);
	
	public void lottoRun(int choice) {
		Random random = new Random();
		int[][] game = new int[choice][6];

		for (int i = 0; i < choice; i++) {
			for (int j = 0; j < 6; j++) {
				game[i][j] = random.nextInt(44) + 1;
				if (j != 0) {
					for (int k = 0; k < j; k++) {
						if (game[i][k] == game[i][j]) {
							j--;
						}
					}
				}
			} // 한 게임 종료
			Arrays.sort(game[i]); // 1차원 배열만 넣을 수 잇다 // 2차원 배열은 못 늫음
		} // 전체 게임 종료
		toPrint(game); // 출력하는 메소드
	}

	private void toPrint(int[][] game) {
		int line = 1;
		System.out.println("=============================");
		for (int[] num : game) { // 1차원 배열 -> 한 행만 출력
			for (int n : num) { // 그 행의 데이터를 출력
				System.out.printf("%3d", n);
			}
			if (line % 5 == 0) { // 출력된 라인수가 5인지 비교
				System.out.println();
				System.out.println();
				line = 1; // 라인 수 초기화
			} else {
				line++;
				System.out.println();
			}
		}
		System.out.println("============================");
		System.out.println("게임 금액은 " + (game.length * 1000) + "원 입니다.");
		System.out.println("============================");
		
		
	}
	
	public void run() {
		menu();
	}

	private void menu() {
		boolean b = false;
		do {
			System.out.println("게임수를 입력하세요. [종료]는 0을 입력하세요.");
			int choice = sc.nextInt();
			switch(choice) {
			case 0: 
				b = true;
				sc.close();
				System.out.println("게임을 종료합니다.");
				break;
			default:
					lottoRun(choice);
					break;
			
			}
		} while(!b);
		
	}

}
