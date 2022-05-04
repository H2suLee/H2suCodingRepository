package co.micol.dto;

// DTO 계층 간 데이터 교환을 위해 사용하는 객체

//import java.util.Date; // 시, 분 초가 중요할 때 (금융권 등)
import java.sql.Date; // 그렇지 않을 때

// vo: value object, 멤버 변수와 getter setter만 가지고 있는 객체

//학생 클래스
//
//학번 int
//이름 String
//전공 String
//주소 String
//전화번호 String
//생년월일 date

public class StudentVO {
	private String id;
	private String name;
	private String major;
	private String addr;
	private String tel;
	private Date birthday;

	
	// 생성자
	
	public StudentVO() {
		
	}
	
		// 생성자 오버로딩
	public StudentVO(String id, String name, String major, String addr, String tel, Date birthday) {
		super();
		this.id = id;
		this.name = name;
		this.major = major;
		this.addr = addr;
		this.tel = tel;
		this.birthday = birthday;
	}

	// gettersetter
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getMajor() {
		return major;
	}
	public String getAddr() {
		return addr;
	}
	public String getTel() {
		return tel;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	// 출력을 위해 toString 객체 오버라이드
	@Override
	public String toString() {
		System.out.print(this.id + " : ");
		System.out.print(this.name + " : ");
		System.out.print(this.major + " : ");
		System.out.print(this.addr + " : ");
		System.out.print(this.tel + " : ");
		System.out.println(this.birthday);
		return null;
	}
	
}
