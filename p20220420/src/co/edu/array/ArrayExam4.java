package co.edu.array;

public class ArrayExam4 {
	public static void main(String[] args) {

		int[][] ary = { { 1, 2 }, { 2, 3 }, { 3, 4 }, { 4, 5 }, { 5, 6 } };

		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.print(ary[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------");

		// 2차원 배열 -> 배열 안에 배열이 존대
		int[][] ary1 = new int[5][3];
		int num = 1;
		
		// 2차원 배열 입력만
		for (int i = 0; i < ary1.length; i++) {
			// ary1.length = 행 개수 (=5)
			for (int j = 0; j < ary1[i].length; j++) {
				// ary1[i].length = 열 개수 (=5)
				ary1[i][j] += num;
				num++;
			}

		}
		System.out.println("---------------");

		// 2차원 배열 출력만
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				System.out.print(ary1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println("---------------");
		
		// 2차원 배열 입력 출력 동시에
		for (int i = 0; i < ary1.length; i++) {
			// ary1.length = 행 개수 (=5)
			for (int j = 0; j < ary1[i].length; j++) {
				// ary1[i].length = 열 개수 (=5)
				ary1[i][j] += num;
				num++;
				System.out.print(ary1[i][j] + " ");

			}
			System.out.println();

		}
		
		
		

	}
}
