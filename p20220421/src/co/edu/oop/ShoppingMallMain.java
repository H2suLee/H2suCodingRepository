package co.edu.oop;

import java.util.Scanner;

public class ShoppingMallMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("주문 번호 입력 > ");
		int orderNum = Integer.parseInt(sc.nextLine());
		System.out.println("주문자 아이디 입력 > ");
		String userID  = sc.nextLine();
		System.out.println("주문자 이름 입력 > ");
		String userName = sc.nextLine();
		System.out.println("주문 번호 입력 > ");
		int goodsNum = Integer.parseInt(sc.nextLine());
		System.out.println("주소 입력 > ");
		String addr = (sc.nextLine());
		
		ShoppingMall info1 = new ShoppingMall(orderNum, userID, userName, goodsNum, addr);
		info1.getInfo();
		
		
	}
}

