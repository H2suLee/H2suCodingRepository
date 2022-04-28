package _220422_1;

import java.util.Scanner;

public class StudentExam {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Student[] std = null;
		Student[] rank = null;
		int menu;
		int studentNo;
		int studentCount;
		int count = 0;
		int putData = 0;
		Student temp = null; // ★

		while (true) {
			System.out.println("===============================================================");
			System.out.println("1. 학생 수 | 2. 학생 정보 입력 | 3. 학생 정보 출력 | 4. 순위 | 5. 종료");
			System.out.println("선택>");

			menu = Integer.parseInt(sc.nextLine());
			if (menu == 1) {
				System.out.println("학생 수>");
				studentCount = Integer.parseInt(sc.nextLine());
				std = new Student[studentCount];
				rank = new Student[studentCount];

			} else if (menu == 2) {
				for (int i = 0; i < std.length; i++) {

//					Student student = new Student();
//					// setter 이용 방법
//					System.out.println("학번>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setStudentNo(putData);
//					
//					System.out.println("이름>");
//					student.setStudentName(sc.nextLine());
//					
//					System.out.println("국어>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setKor(putData);
//					
//					System.out.println("영어>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setEng(putData);
//					
//					System.out.println("수학>");
//					putData =  Integer.parseInt(sc.nextLine());
//					student.setMath(putData);

					System.out.println("학번>");
					int no = Integer.parseInt(sc.nextLine());

					System.out.println("이름>");
					String name = sc.nextLine();

					System.out.println("국어>");
					int kor = Integer.parseInt(sc.nextLine());

					System.out.println("영어>");
					int eng = Integer.parseInt(sc.nextLine());

					System.out.println("수학>");
					int math = Integer.parseInt(sc.nextLine());

					Student student = new Student(no, name, kor, eng, math);
					
					std[i] = student;
					rank[i] = student;
					System.out.println("=====================================");
					
//					if (std.length - 1 != i) {
//						System.out.println("==============================================");
//					}

				}
			} else if (menu == 3) {
				System.out.println("학번 입력>");
				studentNo = Integer.parseInt(sc.nextLine());
//				여기서부터 이해 못함
//				for (Student student : std) {
//					if (student.getStudentNo() == studentNo) {
//						count = student.getInfo();
//					}
//				}
//				if (count == 0) {
//					System.out.println("해당 하는 학번이 없습니다.");
//				}
//				count = 0;
//
//			} else if (menu == 4) {
//				System.out.println("순위>");
//				//오름차순
//				for (int i = 0; i<rank.length-1; i++) {
//					for (int j = i+1; j<rank.length; j++) {
//						if(rank[i].getAvg() < rank[j].getAvg()) {
//							temp = rank[i];
//							rank[i] = rank[j];
//							rank[j] = temp;
//						}
//					}
//				}
//				
//				for(int i = 0; i<rank.length; i++) {
//					System.out.println((i+1) + "등> " + rank[i].studentName + ", 평균> " + rank[i].getAvg());
//				}
//				
			} else if (menu == 5) {
				System.out.println("프로그램 종료");
				break;
			}

		}

	}
	
// 다차원 배열	
}


