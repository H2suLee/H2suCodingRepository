package co.micol.miniprj.draft;

import java.util.Scanner;

public class Explain {

	// >>> 다음
	// >>> 스킵
	// >>> 돌아가기
	
	Scanner sc = new Scanner(System.in);
	
	public void text1() {
		System.out.println("설명 1");
		move();
		do {
			sc.nextLine();
			text2();
			break;
			
		}while(true);
	}

	public void text2() {
		
	}

	public void text3() {
		
	}

	public void text4() {
		
	}

	public void text5() {
		
	}
	
	public void move() {
		System.out.println("계속하려면 Enter키를 누르세요");
	}

}
