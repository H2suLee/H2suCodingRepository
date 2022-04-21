package practice;

public class BankAccout {
	
	// 필드
	String acNo;
	String name;
	int balance;
	
	// 생성자

	public BankAccout(String acNo, String name, int balance) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}
	
	// 메소드
	// 1) 예금하는 메소드
	void deposit(int plus) {
		this.balance += plus;
		System.out.println("입금액: " + plus);
		System.out.println("계좌 잔액: " + balance);
		System.out.println("계좌 번호: " + acNo);
		System.out.println("예금주: " + name);
	}
	
	// 2) 출금하는 메소드
	void withdraw(int minus) {
		this.balance -= minus;
		System.out.println("입금액: " + minus);
		System.out.println("계좌 잔액: " + balance);
		System.out.println("계좌 번호: " + acNo);
		System.out.println("예금주: " + name);
	}
	
	// 3) 잔액 확인하는 메소드
	void checkbalance() {
		System.out.println("계좌 잔액: " + this.balance);
	}

}
