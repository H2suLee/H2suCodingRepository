package co.edu.oop;

public class StudentManagingMain {
	public static void main(String[] args) {
		StudentManaging stud1 = new StudentManaging();
		
		stud1.studID = 2022123;
		stud1.name = "이희수";
		stud1.scoreKor = 90;
		stud1.scoreMath = 80;
		stud1.scoreEng = 100;
		
		
		stud1.getInfo();
		
		double avg = stud1.avg(90, 80, 100);
		System.out.println("점수 평균 : " + avg);
		
	}
}
