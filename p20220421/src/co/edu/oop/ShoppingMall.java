package co.edu.oop;

public class ShoppingMall {
	// 쇼핑몰 주문
	// 1. 필드에 대한 정보를 출력하는 메소드
	// 2. 생성자를 통한 데이터 저장
	// 3. Scanner를 이용해서 데이터 저장
	
	// 필드
	// 주문 번호, 주문자 아이디, 주문자 이름, 주문 상품 번호, 배송 주소
	
	int orderNum;
	String userID;
	String userName;
	int goodsNum;
	String addr;	
	
	// 생성자
	// 3. 마우스 우클릭 > Source > Generate Constructor Using fields 누르면 자동 생성 가능함
	public ShoppingMall(int a, String b, String c, int d, String e) {
		this.orderNum = a;
		this.userID = b;
		this.userName = c;
		this.goodsNum = d;
		this.addr = e;
	}
	

	// 메소드
	// 1.
	void getInfo() {
		System.out.println("주문 번호 > " + orderNum);
		System.out.println("주문자 ID > " + userID);
		System.out.println("주문자 이름 > " + userName);
		System.out.println("주문 상품 번호 > " + goodsNum);
		System.out.println("배송주소 > " + addr);
	}

}
