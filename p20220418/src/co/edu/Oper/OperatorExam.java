package co.edu.Oper;

public class OperatorExam {

	public static void main(String[] args) {
		// 3장. 연산자와 연산식
		// 이항연산자
		// + - * / %
		// / : 몫, % : 나머지
		// 10000초 -> 10000초 / (60*60) = 시간
		//		   -> 10000초 / 60 = 분
		// 		   -> 10000초 % 60 = 초
		int hour = 10000/(60*60); // 초 -> 시간
		int min = 10000/60; // 초 -> 분
		int sec = 10000%60; // 남은 초 계산, 근데 왜 계산기 값이랑 값이 다르지??
				
		System.out.println(hour);
		System.out.println(min);
		System.out.println(sec);
		System.out.println();
		
		// 증감연산자
		int i = 0;
		// i = i+1; // 대입 연산자
		// i += 1; // 윗줄이랑 아랫줄이랑 같은 내용
		// i++; // 증감 연산자, i = i + 1 이랑 같은 내용
		// i = i - 2 -> i -= 2
		System.out.println(i); // 0
		i++;
		System.out.println(i); // 1
		++i;
		System.out.println(i); // 2
		System.out.println(++i); // 3
		System.out.println(i++); // 3
		System.out.println(i); // 4
		
		// a = 1, b = 1 d이라고 가정
		// i = i + j++ : (1+1) +1 (i랑 j를 더한 뒤 ++(+1) 수행)
		// i = i + ++j : 1 + (1+1) (++j를 수행한 뒤 앞의 i를 더함)
		
	}

}
