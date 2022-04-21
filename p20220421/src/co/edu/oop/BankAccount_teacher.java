package co.edu.oop;

public class BankAccount_teacher {
	//계좌 번호, 예금주, 잔액
	//필드
	String accountNo;
	String name;
	int balance;

	//생성자
	public BankAccount_teacher(String accountNo, String name, int balance) {
		this.accountNo = accountNo;
		this.name = name;
		this.balance = balance;
	}
	
	//메소드
//	1. 예금을 할 수 있는 메소드
//	2. 출금을 할 수 있는 메소드
//	3. 현재 잔액을 확인 할 수 있는 메소드
	void deposit(int money) {
		this.balance += money;
		System.out.println("계좌 번호>" + this.accountNo);
		System.out.println("예금 주>" + this.name);
		System.out.println("예금 후 잔액>" + this.balance);
	}
	void withDraw(int money) {
		this.balance -= money;
		System.out.println("계좌 번호>" + this.accountNo);
		System.out.println("예금 주>" + this.name);
		System.out.println("출금 후 잔액>" + this.balance);
		
	}
	int nowMoney() {
		return balance;
	}
	
	
}
