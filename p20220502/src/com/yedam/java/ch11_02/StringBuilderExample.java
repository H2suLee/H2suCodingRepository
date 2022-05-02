package com.yedam.java.ch11_02;

public class StringBuilderExample {

	public static void main(String[] args) {

		// String을 너무 많이 초기화하는 것은 안 좋음
		// 그래야 될 때 Stringbuilder

		StringBuffer sb = new StringBuffer();

		// 문자열을 끝에 추가 append
		sb.append("Java ");
		sb.append("Program Study");
		System.out.println(sb.toString()); // Stringbuilder 출력할 때 to String을 씀

		// 해당 인덱스에 값을 삽입하기 insert
		sb.insert(4, "2");
		System.out.println(sb.toString()); //

		// 해당 인덱스 위치의 값을 변경하기
		sb.setCharAt(4, '6'); // 작은 따옴표 주의
		System.out.println(sb.toString());

		// 해당 인덱스부터 지정한 인덱스 전까지 지정해서 대체
		sb.replace(6, 13, "Book"); // 6~13전까지 "Book"으로 대체
		System.out.println(sb.toString());

		// 시작 인덱스부터 지정한 인덱스 전까지 삭제
		sb.delete(4, 5);
		System.out.println(sb.toString());

		int length = sb.length();
		System.out.println("총 문자 수 : " + length);

		// 최종적으로 연산이 끝났으면 String에 값을 반환해 주어야 함
		// 안 그러면 String builder는 연산을 계속 함
		String result = sb.toString();
//		sb.delete(0, 4);
		System.out.println(result);
//		System.out.println(sb.toString()); // result에 값을 반환한 이후 stringbuilder를 이용해서 delete 메소드를 사용하면 작동함, result에는 영향 없음

	}

}
