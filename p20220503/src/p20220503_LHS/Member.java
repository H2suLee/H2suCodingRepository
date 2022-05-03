package p20220503_LHS;

public class Member {
	// 필드
	Payment payment;
	public final int GRADE_STANDARD = 1000000;
	public int record;
	public String grade;
	
	// 생성자
	public Member(int record) {
		super();
		this.record = record;
	}
	
	// 메소드
	
	public void showMemberInfo() {
		
		getMemberShip(record);
		System.out.println("현재 실적은 " + this.record + "이며, 회원등급은 " + this.grade + "입니다.");
		
	}
	

	public int getMemberShip(int record) {
		if(record>=this.GRADE_STANDARD) {
//			Payment payment = new VIPCard();
			this.grade = "GOLD";
			return 1;
		} else {
//			Payment payment = new GreenCard();
			this.grade = "Silver";
			return 2;
		}
	}

}
