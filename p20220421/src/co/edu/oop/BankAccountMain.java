package co.edu.oop;

import java.util.Scanner;

public class BankAccountMain {
	public static void main(String[] args) {
		
		// 메인 클래스
		// - 인스턴스는 1개만 생성, 인자 3개를 가지도록 생성
		// - 스캐너를 이용하여 예금, 출금, 잔액 확인
		// - 반복문을 이용하여 1. 예금 2. 출금 3. 잔액 확인 4. 종료
		
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("계좌번호를 입력하세요 > ");
		String accountNo = sc.nextLine();
		
		System.out.println("예금주명을 입력하세요 >");
		String accountHolder = sc.nextLine();
		
		System.out.println("잔액을 입력하세요 >");
		int balance = Integer.parseInt(sc.nextLine());
		
		BankAccount case1 = new BankAccount(accountNo, accountHolder, balance);
	
		boolean flag = true;
		while(flag) {
			System.out.println("예금액을 입력하세요 >");
			int plus = sc.nextInt();
			case1.setBalance(plus);
			System.out.println(plus+"원을 입금합니다.");
				
			System.out.println("출금액을 입력하세요 >");
			int minus = sc.nextInt();
			System.out.println(minus+"원을 출금합니다.");
			
//			case1.checkbalance();
			
			flag =false;
			
		
		}
		
		
		
		
		
		
		
		
		
		
	}
}
