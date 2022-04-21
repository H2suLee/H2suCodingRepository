package co.edu.oop;

import java.util.Scanner;

public class BankAccountMain_teacher {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount_teacher ab = new BankAccount_teacher("258-7845-9963", "홍길동", 1000000);
		
		int menu =0;
		int money = 0;
		while(true) {
			System.out.println("1. 예금, 2.출금, 3. 잔액 확인, 4.종료");
			System.out.println("선택>");
			menu = Integer.parseInt(sc.nextLine());
			
			if(menu==1) {
				System.out.println("예금액>");
				money = Integer.parseInt(sc.nextLine());
				ab.deposit(money);			
			}else if(menu==2) {
				System.out.println("출금액>");
				money = Integer.parseInt(sc.nextLine());
				ab.withDraw(money);
			}else if(menu==3) {
				System.out.println("잔액>");
				System.out.println( ab.nowMoney()+"원 입니다.");
			}else if(menu==4) {
				System.out.println("프로그램 종료");
				break;
			}
			
		}
	}

}
