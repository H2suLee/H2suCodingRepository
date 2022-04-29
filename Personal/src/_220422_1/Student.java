package _220422_1;

public class Student {
	
	// 필드
	int no;
	String name;
	int kor;
	int math;
	int eng;

	// 생성자
	public Student() {
		
	}
	public Student(int no, String name, int kor, int math, int eng) {
		this.no = no;
		this.name = name;
		this.kor = kor;
		this.math = math;
		this.eng = eng;
	}

	// 메소드
	public void getInfo() {
		System.out.println("학번 > " + this.no);
		System.out.println("이름 > " + this.name);
		System.out.println("국어 > " + this.kor);
		System.out.println("수학 > " + this.math);
		System.out.println("영어 > " + this.eng);
	}
	
	public double avg() {
		return (this.kor + this.math + this.eng) / 3.0;
	}
	
	
	

}
