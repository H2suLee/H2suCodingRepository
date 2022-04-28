package _220427_2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		// 스캐너 준비
		Scanner sc = new Scanner(System.in);

		// while 문으로 종료 전까지 돌리기
		boolean run = true;
		int x = 0;
		int y = 0;
		boolean isExecuted = false;
		while (run) {

			System.out.println("===============================================================");
			System.out.println("input  |  +  |  -  |  *  |  /  |  ?  |  exit");
			System.out.println("메뉴 선택 > ");
			String select = sc.nextLine();
// input			
			if (select.equals("input")) {
				System.out.println("첫번째 숫자 입력 >");
				x = Integer.parseInt(sc.nextLine());

				System.out.println("두번째 숫자 입력 >");
				y = Integer.parseInt(sc.nextLine());

				isExecuted = true;
// exit				
			} else if (select.equals("exit")) {
				System.out.println("프로그램 종료");
				run = false;
// input이 잘 되어서 isExecuted가 true 값으로 도출 되었을 때 +, -, *, /, ? 실행 (switch문)				
			} else if (isExecuted) {
				switch (select) {
				case "+":
					if (x == 0 && y == 0) {
						System.out.println("숫자를 입력하지 않았습니다.");
					} else {
						System.out.println(x + "+" + y + "=" + (x + y));
					}
					break;
				case "-":
					System.out.println(x + "-" + y + "=" + (x - y));
					break;
				case "*":
					System.out.println(x + "*" + y + "=" + (x * y));
					break;
				case "/":
					System.out.println(x + "/" + y + "=" + ((double) x / y));
					break;
				case "?":
					if (x > y) {
						System.out.printf("큰 값 %d, 작은 값 %d\n", x, y);
					} else if (x < y) {
						System.out.printf("큰 값 %d, 작은 값 %d\n", y, x);
					} else {
						System.out.println("두 값의 크기가 같습니다.");
					}
					break;
// input은 잘 했는데 메뉴 선택 이상한 걸로 했을 경우 처리					
				default:
					System.out.println("+, -, *, /, ? 중 하나를 정확히 입력하세요.");
				}
// input exit 말고 이외의 것을 입력한 경우 처리
			} else {
				System.out.println("메뉴를 정확히 입력해 주세요");
			}

// 내 코드			
/*			switch (select) {
			case "input":
				System.out.println("첫번째 숫자 입력 >");
				x = Integer.parseInt(sc.nextLine());

				System.out.println("두번째 숫자 입력 >");
				y = Integer.parseInt(sc.nextLine());
				break;

			case "+":
				if (x == 0 && y == 0) { // 0을 입력받을 경우 오류처리 안 됨
					System.out.println("숫자를 입력하지 않았습니다.");
				} else {
					System.out.println(x + "+" + y + "=" + (x + y));
				}
				break;
			case "-":
				System.out.println(x + "-" + y + "=" + (x - y));
				break;
			case "*":
				System.out.println(x + "*" + y + "=" + (x * y));
				break;
			case "/":
				System.out.println(x + "/" + y + "=" + ((double) x / y));
				break;
			case "?":
				if (x > y) {
					System.out.printf("큰 값 %d, 작은 값 %d\n", x, y);
				} else if (x < y) {
					System.out.printf("큰 값 %d, 작은 값 %d\n", y, x);
				} else {
					System.out.println("두 값의 크기가 같습니다.");
				}
				break;
			case "exit":
				System.out.println("프로그램 종료");
				run = false;
				break;
			default:
				System.out.println("메뉴 중 하나를 정확히 입력하세요.");

			} */

		}

	}

}
