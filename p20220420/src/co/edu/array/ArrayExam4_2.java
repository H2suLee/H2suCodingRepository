package co.edu.array;

public class ArrayExam4_2 {

	public static void main(String[] args) {
		// 배열 바꾸기
		int[][] ary1 = new int[5][5];
		int num = 1;
		// 입력
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				ary1[i][j] += num;
				num++;
			}
		}

		// 출력 1)
		for (int i = 0; i < ary1.length; i++) {
			for (int j = 0; j < ary1[i].length; j++) {
				System.out.print(ary1[j][i] + " ");
			}
			System.out.println();
		}

		// 출력 2)
		// 1 2 3 4 5
		// 10 9 8 7 6
		// 11 12 13 14 15
		// 20 19 18 17 16
		// 21 22 23 24 25

	}

}
