package co.edu.oop;

public class BankAccount {
	
	// 은행 계좌 실습
	String accountNo;
	String accountHolder;
	int balance;

	// 2. 생성자
	// 위 매개 변수 3개를 가지는 생성자
	public BankAccount(String accountNo, String accountHolder, int balance) {
		super();
		this.accountNo = accountNo;
		this.accountHolder = accountHolder;
		this.balance = balance;
	}
		
	
	// 3. 메소드
	// 1) 예금을 할 수 있는 메소드
		
	void setBalance(int plus) {
		balance =+ plus;
	}
	
	// 2) 출금을 할 수 있는 메소드
	void setBalance2(int minus) {
		balance -= minus;
	}
	// 3) 현재 잔액을 확인할 수 있는 메소드
//	 checkbalance() {
//		System.out.println("현재 잔액: " + balance);


	public void deposit(int money) {
		// TODO Auto-generated method stub
		
	}

	// 메인 클래스
	// - 인스턴스는 1개만 생성, 인자 3개를 가지도록 생성
	// - 스캐너를 이용하여 예금, 출금, 잔액 확인
	// - 반복문을 이용하여 1. 예금 2. 출금 3. 잔액 확인 4. 종료

}

