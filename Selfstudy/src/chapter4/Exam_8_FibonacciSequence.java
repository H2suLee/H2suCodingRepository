package chapter4;

public class Exam_8_FibonacciSequence {
	public static void main(String[] args) {
		// 1, 2, 3, 5, 8, 13, 21, 33, 54
		// 피보내치 수열 만들기. while 활용, value < 50
		int num1 = 1;
		int num2 = 2;
		int num3 = 0;
		while (num3 < 50) {
			num3 = num1 + num2;
			System.out.println(num1 + "," + num2 + "," + num3);
			num1 = num2;
			num2 = num3;
		}

	}

}
