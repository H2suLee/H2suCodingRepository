package co.edu.extend;

// 자식 클래스

public class CellPhoneDMB extends CellPhone {
	// 필드
	
	public int channel;
	
	// 생성자
	public CellPhoneDMB(String model, String color, int channel) {
//		this.model = model;
//		this.color = color;
		super(model,color); // 위에 두 줄 쓰는 대신에 super로 부모의 기본 생성자 호출
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 : " + channel + "Dmb 시작");
		super.powerOn(); // 부모 클래스에서 정의한 메소드를 자식 클래스에서 사용하고 싶을 때 일케 쓰면 됨
	}

	void turnOffDmb() {
		System.out.println("Dmb 종료");
	}
	
	// 메소드 재정의 p317~
	// 부모 클래스에서 정의한 메소드를 불러와서 자식 클래스의 입맛대로 바꾸고 싶을 때
	@Override
	void powerOn() {
		System.out.println("자식 클래스에서 전원을 켭니다.");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
