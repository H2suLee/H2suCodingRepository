package com.yedam.java.ch13_02;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample2 {
	public static void main(String[] args) {
		Map<Student, Integer> map = new HashMap<>();
		
		map.put(new Student(1, "홍길동"), 95);
		map.put(new Student(1, "홍길동"), 95);
		
		System.out.println("총 Entry 수 : " + map.size()); // 동일한 정보를 넣었지만 서로 다른 객체로 인식함, new 연산자 덕분 // hashcode, equals 오버라이딩 하니 같은 객체로 인식함
	}

}
