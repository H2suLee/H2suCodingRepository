package tama;

import java.util.Scanner;

public class TamaName {
	Scanner scan = new Scanner(System.in);
	static String tamaName;
	
	public void naming() {			// 다마고치의 이름을 입력받음.
		System.out.print("▶간바레 다마고치의 이름은 무엇으로 할까요?\n입력 : \n");
		tamaName = scan.next();		// tamaName변수에 이름 입력.
		System.out.println("\r\n▶환영합니다! "+tamaName+"님\r\n");
	}
}
