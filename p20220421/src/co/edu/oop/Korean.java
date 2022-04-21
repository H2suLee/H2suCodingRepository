package co.edu.oop;

public class Korean {
	// 필드
	String nation = "대한민국";
	String name;
	String ssn;
	
	// 생성자
	// 생성자 오버로딩
	public Korean(String n, String s) {
		this.name = n;
		this.ssn = s;
	}
	public Korean(String n, String s, String p) {
		this.nation = n;
		this.name = s;
		this.ssn = p;
	}
	
	// 메소드
	void getInfo() { // return이 필요없는 애들이 void
		System.out.println("국적: " + nation);
		System.out.println("이름: " + name);
		System.out.println("주민번호: " + ssn);
		return; // 그래도 넣을 수는 있음. 이때 리턴의 기능은 메소드 강제 종료
	}
	
	
}
