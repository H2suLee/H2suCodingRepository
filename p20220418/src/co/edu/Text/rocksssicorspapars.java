package co.edu.Text;

import java.util.Scanner;

public class rocksssicorspapars {

	public static void main(String[] args) {
		// scanner, random를 써서 사용자가 0이면 가위, 1이면 바위, 보는 2
		// 반복문은 쓰면 안됨
		// 컴퓨터와 가위, 바위, 보 해서 승리/패배 출력
		System.out.println("가위, 바위, 보");
		int computer = (int) (Math.random() * 3) + 1;
		Scanner sc = new Scanner(System.in);
		String me = sc.nextLine();

		if (computer == 1 && me.equals("가위")) {
			System.out.println("컴퓨터가 낸 거 : 가위");
			System.out.println("내가 낸 거 : 가위");
			System.out.println("결과 : 비김");
		} else if (computer == 1 && me.equals("바위")) {
			System.out.println("컴퓨터가 낸 거 : 가위");
			System.out.println("내가 낸 거 : 바위");
			System.out.println("결과 : 내가 이김");
		} else if (computer == 1 && me.equals("보")) {
			System.out.println("컴퓨터가 낸 거 : 가위");
			System.out.println("내가 낸 거 : 보");
			System.out.println("결과 : 내가 짐");
		} else if (computer == 2 && me.equals("가위")) {
			System.out.println("컴퓨터가 낸 거 : 바위");
			System.out.println("내가 낸 거 : 가위");
			System.out.println("결과 : 내가 짐");
		} else if (computer == 2 && me.equals("바위")) {
			System.out.println("컴퓨터가 낸 거 : 바위");
			System.out.println("내가 낸 거 : 바위");
			System.out.println("결과 : 비김");
		} else if (computer == 2 && me.equals("보")) {
			System.out.println("컴퓨터가 낸 거 : 바위");
			System.out.println("내가 낸 거 : 보");
			System.out.println("결과 : 내가 이김");
		} else if (computer == 3 && me.equals("가위")) {
			System.out.println("컴퓨터가 낸 거 : 보");
			System.out.println("내가 낸 거 : 가위");
			System.out.println("결과 : 내가 이김");
		} else if (computer == 3 && me.equals("바위")) {
			System.out.println("컴퓨터가 낸 거 : 보");
			System.out.println("내가 낸 거 : 바위");
			System.out.println("결과 : 내가 짐");
		} else {
			System.out.println("컴퓨터가 낸 거 : 보");
			System.out.println("내가 낸 거 : 보");
			System.out.println("결과 : 비김");
		}
	}
}
		