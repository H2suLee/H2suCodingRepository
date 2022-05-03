package p20220503_LHS;

// 인터페이스 

public interface Payment {
	public static final double OFFLINE_PAYMENT_RATIO = 0.01;
	public static final double ONLINE_PAYMENT_RATIO = 0.03;
	public static final double SIMPLE_PAYMENT_RATIO = 0.05;

	public int offline(int price);

	public int online(int price);

	public int simple(int price);

	public void showCardInfo();

}
