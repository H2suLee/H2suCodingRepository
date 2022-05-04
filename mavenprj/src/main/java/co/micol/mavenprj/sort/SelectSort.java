package co.micol.mavenprj.sort;

public class SelectSort {

	// 선택정렬 오름차순 (고전적인)
	public void run(int[] arr) {
		for (int i = 0; i < arr.length; i++) { // arr.length-1 해도 됨, 회전 수만 올라가고 자기 자신을 스스로 비교하는 격
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) { // i번째 요소가 j번째 요소가 작아야 됨, 이 조건이 true 라면 i와 j 서로 자리 바꿔야
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}

		for (int n : arr) {
			System.out.print(n + " ");
		}
	}
	// 선택정렬 오름차순(보다 나은) 스왑 타임 줄이기 위해
	public void sort(int[] arr) {
		int min;
		for(int i = 0; i < arr.length; i++) {
			min = i;
			for(int j = i; j < arr.length; j++) {
				if(arr[min] > arr[j]) {
					min = j;
				}
			}
			if(min != i) { // 현재 요소보다 작은 값을 가지는 요소와 한 번만 교환
				int temp = arr[i];
				arr[i] = arr[min];
				arr[min] = temp;
			}
		}
		for (int n : arr) {
			System.out.print(n + " ");
		}
		
	}
	
	
} // -> 메인 클래스에서 이 메소드를 출력하여 구현해 보기

