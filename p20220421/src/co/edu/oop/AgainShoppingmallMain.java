package co.edu.oop;

import java.util.Scanner;

public class AgainShoppingmallMain {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 번호를 입력하세요 > ");
		int no = Integer.parseInt(sc.nextLine());
		
		System.out.println("주문자 ID를 입력하세요 > ");
		String id = sc.nextLine();
		
		System.out.println("주문자 이름을 입력하세요 > ");
		String name = sc.nextLine();

		System.out.println("상품 번호를 입력하세요 > ");
		int goodNo = Integer.parseInt(sc.nextLine());
		
		System.out.println("주소를 입력하세요 > ");
		String addr = sc.nextLine();
		
		AgainShoppingmall info1 = new AgainShoppingmall(no, id, name, goodNo, addr);
		
		info1.getInfo();	
		
		
	}

}
