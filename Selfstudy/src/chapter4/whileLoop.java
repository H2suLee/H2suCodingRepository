package chapter4;

public class whileLoop {

	public static void main(String[] args) {
		// while문
		// for문이 정해진 횟수만큼 반복한다면, while문은 조건식이 true인 경우에 계속 반복함. 조건식이 false가 되면 반복 행위를
		// 멈추고 while문 종료
		// 실행 흐름
//		while(조건식) {
//			조건식이 true일 경우 실행문 반복
//		}

		// 1부터 10까지 출력
		int i = 1;
		while (i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("================");
		// 1부터 10까지의 합
		int j = 1;
		int sum = 0;
		while (j <= 10) {
			sum += j;
			j++;
		}
		System.out.println(sum);
		System.out.println("================");
		
	}

}
