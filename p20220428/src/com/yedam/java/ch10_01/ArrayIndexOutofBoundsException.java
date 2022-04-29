package com.yedam.java.ch10_01;

public class ArrayIndexOutofBoundsException {
	public static void main(String[] args) {
//		String data1 = args[0];
//		String data2 = args[1];
//		System.out.println("args[0]"+ data1); // 여기서 실행 예외가 일어나서 이 밑 라인은 아예 실행되지도 않음
//		
//		System.out.println("args[1]"+ data2);
// 우클릭, run as, run configuration, argument, Program Arguments: "배열 인덱스" << 입력
		
		
		// 위 내용을 if문으로 처리할 수도 있음
		if(args.length == 2) {
			String data1 = args[0];
			String data2 = args[1];
			
			System.out.println("args[0]" + data1);
			System.out.println("args[1]" + data2);
			
		} else {
			System.out.println("매개변수를 2개 입력하세요.");
		}
		
	}
}
