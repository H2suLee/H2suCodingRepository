package _20220429_Teachers;

public abstract class Calculator {

	protected double[] numList;	//입력받은 숫자 저장하는 배열
	protected int numCount;		//입력받은 숫자 갯수
	
	protected Calculator() {
		init();
	}
	
	public static void printCalType() {
		System.out.println("=========================");
		System.out.println(" 1.일반 계산기 | 2.공학 계산기 ");
		System.out.println("=========================");
	}
	
	public static Calculator getCalType(int selected) {
		Calculator cal = null;
		switch(selected) {
		case 1:
			cal = new GeneralCalculator();
			break;
		case 2:
			cal = new EngineeringCalculator();
			break;
		default:
			System.out.println("계산기 종류를 잘못 선택하셨습니다.");
		}
		
		return cal;
		
	}
	
	// 메뉴출력
	public void printMenu() {
		System.out.println("=======================================");
		System.out.println(" I | P | D | + | - | * | / | % | 0 | Q ");
		System.out.println("=======================================");
	};

	// 값 초기화
	public abstract void init();

	// 값 입력받기
	public abstract void setInputNum(double num);

	// 출력기능
	public abstract void print();

	// 더하기
	public abstract void plus();

	// 빼기
	public abstract void subtract();

	// 곱하기
	public abstract void multiply();

	// 나누기
	public abstract void division();

	// 나머지
	public abstract void remain();

	// 지우기
	public abstract void delete();
}
