package p20220503_LHS;

public class VIPCard implements Payment {
	// 필드
	String name; // 카드명
	String grade; // 적용 등급
	double saleRatio; // 할인율
	int point; // 적립 포인트
	double pointRatio; // 포인트 적립율

	public VIPCard() {

	}

	@Override
	public int offline(int price) { // 8900
		this.name = "VIPCard";
		this.saleRatio = 0.1;
		this.pointRatio = 0.03;
		getPoint(price);
		return (int) (price * (1 - (this.saleRatio + Payment.OFFLINE_PAYMENT_RATIO)));
	}

	@Override
	public int online(int price) {
		this.name = "VIPCard";
		this.saleRatio = 0.1;
		this.pointRatio = 0.03;
		getPoint(price);
		return (int) (price * (1 - (this.saleRatio + Payment.ONLINE_PAYMENT_RATIO)));
	}

	@Override
	public int simple(int price) { // 0
		this.name = "VIPCard";
		this.saleRatio = 0.1;
		this.pointRatio = 0.03;
		getPoint(price);
		return (int) (price * (1 - (this.saleRatio + Payment.SIMPLE_PAYMENT_RATIO)));
	}

	@Override
	public void showCardInfo() {
		System.out.println("====== 카드 정보 ======");
		System.out.println("카드명 : " + this.name);
			if(this.name.equals("VIPCard")) { // 멤버 클래스에 있는 필드 메소드 어케 불러오지?
				this.grade = "GOLD";
			} else {
				this.grade = "SILVER";
			}
		System.out.println("적용 등급 : " + this.grade); 
		System.out.println("할인율 : " + this.saleRatio);
		System.out.println("포인트 적립율 : " + this.pointRatio);
		System.out.println("적립 포인트 : " + this.point);
		System.out.println("===================="); 
	}

	public void getPoint(int price) {
		this.point = (int) (price * this.pointRatio);

	}

}
