 package co.edu.oop;

import java.util.Scanner;

public class AgainBAMain {
	public static void main(String[] args) {
		// 메인 클래스
		// - 인스턴스는 1개만 생성, 인자 3개를 가지도록 생성
		// - 스캐너를 이용하여 예금, 출금, 잔액 확인
		// - 반복문을 이용하여 1. 예금 2. 출금 3. 잔액 확인 4. 종료

		Scanner sc = new Scanner(System.in);
		AgainBA aaa = new AgainBA("123-456", "이희수", 1000000);
		
	
		
		while (true) {
			System.out.println("1. 예금, 2. 출금, 3. 잔액 확인, 4. 종료");
			System.out.println("선택 > ");
			int select = Integer.parseInt(sc.nextLine());
			if (select == 1) {
				System.out.println("예금액 > ");
				int plus = Integer.parseInt(sc.nextLine());
				aaa.deposit(plus);
			} else if(select == 2) {
				System.out.println("출금액 > ");
				int minus = Integer.parseInt(sc.nextLine());
				aaa.withdraw(minus);
			} else if(select == 3) {
				aaa.checkBalance();
			} else {
				System.out.println("종료합니다.");
				break;
			}

		}
	}
}
