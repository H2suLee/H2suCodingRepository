package co.edu.oop;

public class Student {
	 // 필드, 학생들의 정보를 담아두는 곳, 객체의 데이터가 저장되는 곳
	String name;
	int age;
	int kor;
	int eng;
	int math;
	
	// 생성자(★제일 중요), 객체를 만들기 위해 필요한 구문, 객체 생성시 초기화 담당
	public Student() {
		
	}
	
	// 메소드, 기능, 객체의 동작에 해당하는 실행 블록
	void getInfo() {
		System.out.println("학생의 이름: " + name + "\n 나이: " + age);
	}

}
