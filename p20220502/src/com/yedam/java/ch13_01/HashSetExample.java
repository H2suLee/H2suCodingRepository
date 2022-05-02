package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
	public static void main(String[] args) {
		// String은 hashset와 equals가 모두 Override 된 클래스
		
		Set<String> set = new HashSet<String>();
		
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		set.add("Java"); // 중복 값 허용 x, 값이 들어가지 못 했음
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		// 반복자를 사용하여 set에 들은 값 출력
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println("\t" + str);
		}
		
		set.remove("JDBC");
		set.remove("iBATIS");
		System.out.println("총 객체 수 : " + set.size());
		
		for(String str : set) {
			System.out.println("\t" + str);
		}
		
		// 다 날려버리기
		set.clear();
		if(set.isEmpty()) {
			System.out.println("비어 있음.");
		}
		
	}

}
