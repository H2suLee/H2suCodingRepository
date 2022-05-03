package p20220503_LHS;

public class GreenCard implements Payment {
	// 필드
	String name;
	String grade;
	double saleRatio;
	int point;
	double pointRatio;

	public GreenCard() {

	}

	@Override
	public int offline(int price) {
		this.name = "VIPCard";
		this.saleRatio = Payment.OFFLINE_PAYMENT_RATIO;
		this.pointRatio = 0.05;
		getPoint(price);
		return (int) (price * (1 - this.saleRatio));
	}

	@Override
	public int online(int price) {
		this.name = "VIPCard";
		this.saleRatio = Payment.ONLINE_PAYMENT_RATIO;
		this.pointRatio = 0.05;
		getPoint(price);
		return (int) (price * (1 - this.saleRatio));
	}

	@Override
	public int simple(int price) {
		this.name = "VIPCard";
		this.saleRatio = Payment.SIMPLE_PAYMENT_RATIO;
		this.pointRatio = 0.05;
		getPoint(price);
		return (int) (price * (1 - this.saleRatio));
	}

	@Override
	public void showCardInfo() {
		System.out.println("====== 카드 정보 ======");
		System.out.println("카드명 : " + this.name);
		System.out.println("적용 등급 : "); // 적용 등급 불러오기
		System.out.println("할인율 : " + this.saleRatio);
		System.out.println("포인트 적립율 : " + this.pointRatio);
		System.out.println("적립 포인트 : " + this.point);
	}

	public void getPoint(int price) {
		this.point = (int) (price * this.pointRatio);
	}
}
