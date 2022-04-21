package co.edu.oop;

public class AgainBA {

	// 은행 계좌 실습
	// 1. 필드: 계좌번호, 예금주, 잔액
	String acNo;
	String name;
	int balance;
	
	// 2. 생성자
	// 위 매개 변수 3개를 가지는 생성자
	public AgainBA(String acNo, String name, int balance) {
		super();
		this.acNo = acNo;
		this.name = name;
		this.balance = balance;
	}
	
	// 3. 메소드
	void getInfo() {
		System.out.println("계좌번호 >" + acNo);
		System.out.println("예금주 >" + name );
		System.out.println("잔액 >" + balance);
		
	}
	// 1) 예금을 할 수 있는 메소드
	void deposit(int plus) {
		this.balance += plus;
		System.out.println("입금액 : " + plus);
		System.out.println("잔액 : " + this.balance);
		System.out.println("예금주 : " + this.name);
		System.out.println("계좌번호 : " + this.acNo);
		
	}
	
	// 2) 출금을 할 수 있는 메소드
	void withdraw(int minus) {
		this.balance -= minus;
		System.out.println("입금액 : " + minus);
		System.out.println("잔액 : " + this.balance);
		System.out.println("예금주 : " + this.name);
		System.out.println("계좌번호 : " + this.acNo);
		
	}
	
	// 3) 현재 잔액을 확인할 수 있는 메소드
	void checkBalance() {
		System.out.println("현재 잔액은 " + this.balance + "입니다.");
	}
}
