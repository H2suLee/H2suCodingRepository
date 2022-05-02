package com.yedam.java.ch13_01;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("java");
		list.add("JDBC");
		list.add("Servlet/JSP");
		list.add(2, "Database");
		list.add("iBATIS");
		
		
		int size = list.size();
		System.out.println("총 객체 수: " + size);
		System.out.println();
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.get(4));
		
		// for문으로
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		
		// 향상된 for문으로
		for(String str : list) {
			System.out.println(str);
		}
		System.out.println();
		
		// 삭제
		// ArrayList에선 중간에 비는 인덱스가 없다
		
		list.remove(2); // Database 삭제됨, Servlet/JSP와 iBATTIS가 당겨오면서 각 2, 3칸에 들어감
		list.remove(2); // Servlet/JSP가 삭제됨, iBATTIS가 당겨오면서 2칸에 들어감
		list.remove("iBATIS"); // 2칸 사라짐
		
		for(int i = 0; i<list.size(); i++) {
			String str = list.get(i);
			System.out.println(i+ " : " + str);
		}
		
	}
}
