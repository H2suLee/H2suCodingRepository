package co.edu.member;

public class Singleton {
	// 필드
	private static Singleton singLeton = new Singleton();
	// private는 싱글톤 클래스 내에서만 사용할 수 있도록 제한, 메인 클래스에서 사용 못함
	
	
	// 생성자
	// 싱글톤 내부에서만 사용할 수 있도록 private 을 통해 제한
	private Singleton() {
		
	}
	
	
	// 정적 메소드
	// 여기는 접근 제한자를 쓰지 않음
	// 
	static Singleton getInstance() {
		// 아래 if문은 예외처리를 위해 넣은 것, 안 넣어도 됨
		if(singLeton == null ) {
			singLeton = new Singleton();
		}
		return singLeton;
	}

}
