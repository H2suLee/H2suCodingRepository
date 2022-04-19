package co.edu.array;

public class ArrayExam {

	public static void main(String[] args) {
		int score = 1;
		int score2 = 2;
		int score3 = 3;
		int score4 = 4;
		int score5 = 5;
		
		// 배열 선언하는 방법
		int[] ary = new int[5];  
		int[] ary1 = {1,2,3,4,5};
		System.out.println("a[4] : " + ary1[4]);
		System.out.println("배열의 크기 : " + ary1.length);
		
		// ary1에 있는 값들 다 더해보기
		int sum = 0;
		for(int i=0; i<ary1.length; i++) { // ary1.length = 배열의 크기(칸 수)
			sum += ary1[i];
		}
		System.out.println("총합 : " + sum);
		
		//p180
		int[] scores = {83, 90, 87};
		
		System.out.println(scores[0] + " " + scores[1] + " " + scores[2]);
		
		int sum1 = 0;
		for(int i = 0; i<3; i++) {
			sum1 += scores[i];
		}
		System.out.println("총합 : " + sum1);
		double avg = (double) sum1/3; 
//		double avg = sum1/3; // 일케만 하면 소수점 아래 값이 안나옴, double로 강제 변환 해 줘야 소수점 이하 값 불러와 짐
		System.out.println("평균 : " + avg);
		
		// 최대값 최소값 배열 이용해서 다시 구하기
		int[] ary2 = {5, 3, 2, 8, 1};
		int max = 0;
		int min = ary2[0];

		for(int i = 0; i<ary2.length; i++) {
			if(max < ary2[i]) {
				max = ary2[i];
			}
			if(min > ary2[i]) {
				min = ary2[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
		
	}

}
