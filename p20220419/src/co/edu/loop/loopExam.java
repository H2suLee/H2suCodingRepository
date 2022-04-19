package co.edu.loop;

public class loopExam {

	public static void main(String[] args) {
//		// 반복문 p150
//		int sum = 0;
//		sum += 1;
//		sum += 2;
//		sum += 3;
//		sum += 4;
//		sum += 5;
//		System.out.println("1~5의 합: " + sum);
//		
//		// 위 내용을 아래와 같이 반복문으로 간단하게 표현
//		// 1부터 5까지의 합을 만들어 보는 프로그램
//		int sum2 = 0;
//		for(int i = 1; i <= 5; i++) {
//			sum2 += i; // sum2 = sum2 + i
//			// 1stloop) i = 1, 0 = 0 + 1
//			// 2) 1 = 1 + 2
//			// 3) 3 = 3 + 3
//			// 4) 6 = 6 + 4
//			// 5) 10 = 10 + 5, 최종적으로 sum이 15가 됨
//		System.out.println(i);
//		System.out.println(sum2);
//		
		// 구구단 2단 만들어보기
//		for (int j = 1; j <= 9; j++) {
//			System.out.println("2단 : 2*" + j + "=" + (2 * j));
//		}
//		
		// 1~100 사이에서 3의 배수를 구하기
//		for(int i = 1; i<=100; i++) {
//			if(i%3==0) {
//				System.out.println("3의 배수 : " + i);
//			} 
//			if(i%2==0) {
//				System.out.println("2의 배수 : " + i);
//			}
//		}
//		
		// 홀수짝수 구하기
//		for (int i = 1; i <= 100; i++) {
//			if (i % 2 == 1) {
//				System.out.println("홀수 : " + i);
////			} else if (i % 2 == 0) { // 아니면 밑에 처럼 else만써도 됨
////				System.out.println("짝수 : " + i);
//			} else
//				System.out.println("짝수 : " + i);
//
//		}

		// 중첩 for문을 사용하여 구구단 만들기
//		for (int i = 1; i <= 9; i++) {
//			System.out.println(i + "단");
//			for (int j = 1; j <= 9; j++) {
//				System.out.println(i + "*" + j + "=" + (i * j));
//			}
//		}
		// 별찍기 i는 줄 넘버, j는 * 갯수(?)
		// *
		// **
		// ***
		// ****
		// *****
		for (int i = 1; i < 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 별찍기 i는 줄 넘버, j는 *갯수(?)
		// *****
		// ****
		// ***
		// **
		// *
		for (int i = 1; i < 6; i++) {
			for (int j = 5; j >= i; j--) {
				System.out.print("*");
			}
			System.out.println();
		}

		// 별찍기 i는 줄 넘버, j는 *갯수(?)
		// *
		// **
		// ***
		// ****
		// *****

		for (int k = 4; k >= 0; k--) {
			for (int j = 0; j < 5; j++) {
				if (k > j)
					System.out.print(" ");
				else
					System.out.print("*");
			}
			System.out.println();
		}

		// 별찍기 i는 줄 넘버, j는 *갯수(?)
		// *
		// ***
		// *****

		// *****
		// ***
		// *

	}
}
