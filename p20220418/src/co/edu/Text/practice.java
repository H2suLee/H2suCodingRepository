package co.edu.Text;

import java.util.Scanner;

public class practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("온도를 입력하세요.");
		double F = sc.nextInt();
		double C = (5 / 9.0 * (F - 32.0));
		System.out.printf("화씨로 : " + "%.2f\n", C);
	}
}
