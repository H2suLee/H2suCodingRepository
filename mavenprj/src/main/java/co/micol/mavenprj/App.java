package co.micol.mavenprj;

import co.micol.mavenprj.sort.SelectSort;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		int[] arr = { 1, 6, 3, 5, 4, 2 };
		SelectSort selectSort = new SelectSort(); // 인스턴스 생성
		System.out.println("원시 데이터");
		for (int n : arr) {
			System.out.print(n + " ");
		}
		
		// 고전
		System.out.println("\n============");
		System.out.println("고전 선택 정렬 결과");

		selectSort.run(arr);
		
		// 보다 나은
		System.out.println("\n============");
		System.out.println("보다 나은선택 정렬 결과");

		selectSort.sort(arr);
		

	}
}
