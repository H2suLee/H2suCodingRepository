package co.edu.oop;

public class AgainShoppingmall {
	// 쇼핑몰 주문
	// 1. 필드에 대한 정보를 출력하는 메소드
	// 2. 생성자를 통한 데이터 저장
	// 3. Scanner를 이용해서 데이터 저장
	
	// 필드
	// 주문 번호, 주문자 아이디, 주문자 이름, 주문 상품 번호, 배송 주소
	
	int no;
	String id;
	String name;
	int goodNo;
	String addr;

	// 생성자
	public AgainShoppingmall(int no, String id, String name, int goodNo, String addr) {
		super();
		this.no = no;
		this.id = id;
		this.name = name;
		this.goodNo = goodNo;
		this.addr = addr;
	}
	
	
	// 메소드
	void getInfo() {
		System.out.println("주문번호 > " + no);
		System.out.println("주문 ID > " + no);
		System.out.println("주문자 이름 > " + no);
		System.out.println("상품번호 > " + no);
		System.out.println("배송 주소 > " + no);
	}
}
