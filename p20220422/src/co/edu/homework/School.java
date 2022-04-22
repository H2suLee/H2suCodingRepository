package co.edu.homework;
// 부모
public class School {
	
//	-숙제
	// 학생 관리 프로그램 구현.
			// 관리 해야 할 학생 수 입력 후 학생 수만큼 정보 입력.
			// 학생 정보 : 학번, 이름, 국어, 수학, 영어
			// 학생 번호 입력 시, 학생의 기본 정보 및 평균 출력.

			// 추가 문제, 학생 번호 입력시, 추가적으로 평균으로 등수 출력 기능. 난이도 높아서 구현 제외
			// 조건 1) class를 이용하여 학생을 등록.
			// 조건 2) class에서 학생의 기본 정보 및 평균을 출력하는 메소드 사용.
	//필드
	// 학생 정보 : 학번, 이름, 국어, 수학, 영어
		int studentNo;
		String studentName;
		int kor;
		int eng;
		int math;
		
		
		// 생성자 
		public School() {
			
		}
		public School(int studentNo, String studentName, int kor, int eng, int math) {
			super();
			this.studentNo = studentNo;
			this.studentName = studentName;
			this.kor = kor;
			this.eng = eng;
			this.math = math;
		}
		

		
		
	// 메소드
		
	

}
