package chapter4;

public class forLoop {
	public static void main(String[] args) {
		// p148
		// for은 반복 횟수를 알고 있을 때, 조건을 먼저 검사하고 싶을 때
		// 실행 흐름
//			for(초기화식;조건식;증감식) {
//				조건이 true일 경우 실행문 반복
//			}

		// 1부터 10까지 출력
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("----------------------");

		// 1부터 100가지의 합
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}

		System.out.println(sum);
		System.out.println("----------------------");

		// 중첩 for문
		// 구구단 2단 출력
		System.out.println("구구단 2단\n");
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {

				i = j * 2;
				System.out.println("2 *" + j + "=" + i);
			}
		}

		// 구구단 출력
		for (int i = 2; i <= 9; i++) {
			System.out.println("**" + i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i * j));
			}

		}
		System.out.println("----------------------");

		// 1~100 사이에서 3의 배수 구하기
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				System.out.println(i);
			}
		}
		System.out.println("----------------------");

		// 1~50의 홀수 짝수 구분하기
		for (int i = 1; i <= 50; i++) {
			if (i % 2 == 1) {
				System.out.println("홀수: " + i);
			} else {
				System.out.println("짝수: " + i);
			}
		}
		System.out.println("----------------------");

	}
}
