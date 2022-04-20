package co.edu.array;

public class ArrayExam3 {
	public static void main(String[] args) {
		// 1. 1~100가지 데이터를 넣은 배열에서 3의 배수만 출력

		// 2. 위에서 만든 배열에서 짝수만 출력

		int ary[] = new int[100];

		for (int i = 0; i < ary.length; i++) { // 각 칸에 숫자 담기 0번째 칸 = 1
			ary[i] = i + 1; // ary[i-1] = i; 랑 같다
		}
		System.out.println("ary2[1]칸에 있는 값: " + ary[1]);

		// 3의 배수 구하기 방법 ①
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] % 3 == 0) {
				if (ary[i] % 2 == 0) {
					System.out.println("★3의 배수 중 짝수: " + ary[i]);
				}
				System.out.println("3의 배수: " + ary[i]);
			}
		}
		// 3의 배수 구하기 방법 ②
		for (int i = 0; i < ary.length; i++) {
			if (ary[i] % 3 == 0 && ary[i] % 2 == 0) {
				System.out.println(ary[i]);
			}

		}
		
		

	}
}
