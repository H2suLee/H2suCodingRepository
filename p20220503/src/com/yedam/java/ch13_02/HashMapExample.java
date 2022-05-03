package com.yedam.java.ch13_02;
// p573
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		map.put("신용권", 85);
		map.put("홍길동", 90);
		map.put("동장군", 80);
		map.put("홍길동", 95); // "홍길동" 키가 같기 때문에 제일 마지막에 저장한값으로 대체
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println("\t홍길동 : " + map.get("홍길동")); // 키(이름)로 값(점수) 검색
		
		// 주로 Set을 사용해서 값을 꺼내 옴, 반복자를 이용하기 위해서 // 향포문 사용하면 set, iterator 사용할 필요 x
		Set<String> keySet = map.keySet();
		Iterator<String> keyIterator = keySet.iterator();
		
		while(keyIterator.hasNext()) {
			String key = keyIterator.next();
			int value = map.get(key);
			System.out.println("\t" + key + " : " + value); // 입력 순서와 무관하게 출력됨
		}
		
		map.remove("홍길동");
		System.out.println("총 Entry 수 : " + map.size());
		
		// 이번엔 map.Entry를 사용해서 출력
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
		
		// key를 이용해서 set을 썼을 때와 어떻게 다르냐면
		// while문에서 바로 key 와 value 값을 가지고 올 수 있다
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key = entry.getKey();
			Integer value = entry.getValue();
			System.out.println("\t" + key + " : " + value);
		}
		System.out.println();
	}
}
