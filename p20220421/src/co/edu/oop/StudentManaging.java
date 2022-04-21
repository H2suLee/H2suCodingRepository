package co.edu.oop;

public class StudentManaging {


	
//	숙제
//	1명의 학생 관리 프로그램
//	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
//
//	// 기본 생성자를 통해 데이터 입력
//
//	// 메소드
//	1. 학생의 기본 정보 출력(학번, 이름, 국어, 수학, 영어)
//
//	2. 국영수 점수 평균 출력
	
	// 필드
	int studID;
	String name;
	int scoreKor;
	int scoreMath;
	int scoreEng;
	
	// 생성자
	public StudentManaging() {
		
	}
	
	// 메소드
		// 1) 학생 기본 정보 출력
	void getInfo() {
		System.out.println("학번 > " + studID);
		System.out.println("이름 > " + name);
		System.out.println("국어 점수 > " + scoreKor);
		System.out.println("수학 점수 > " + scoreMath);
		System.out.println("영어 점수 > " + scoreEng);
		
	}
	
		// 2) 국영수 평균
	
	double avg(int scoreKor, int scoreMath, int scoreEng) {
		double result = (double) (scoreKor + scoreMath + scoreEng)/3;
		return result;
		
	}
	
}
