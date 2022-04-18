package co.edu.Text;

import java.util.Scanner;

public class grademanagingprg {

	public static void main(String[] args) {
		// switch문만 사용해서 출력하기
		// 100점부터 90점 : A
		// 89점~80점 : B
		// 79점~70점 : C
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하세요.");
		int grade = sc.nextInt();
	
		switch (grade) {
		case 100:
		case 90:
			System.out.println("A");
			break;
		case 89:
		case 80:
			System.out.println("B");
			break;
		case 79:
		case 70:
			System.out.println("C");
			break;
		default:
			System.out.println("미달");
			break;
		}
	}

}
