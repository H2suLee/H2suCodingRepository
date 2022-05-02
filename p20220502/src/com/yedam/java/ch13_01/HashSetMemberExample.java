package com.yedam.java.ch13_01;

import java.util.HashSet;
import java.util.Set;

public class HashSetMemberExample {
	
	public static void main(String[] args) {
		Set<Member> set = new HashSet<>();
		
		set.add(new Member("홍길동", 30));
		set.add(new Member("홍길동", 30)); 
		
		System.out.println("총 객체 수 : " + set.size());
		// hashset, equals 오버라이드 전 객체 수 2, hashset equals 오버라이드 후 객체 수 1
	}
	
	// 중복 안 되는 거 고치기
	

	
	

}
