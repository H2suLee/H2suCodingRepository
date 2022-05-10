package co.micol.miniprj.draft2_1;

public class State {

	public static int happy; // 행복
	public static int clean; // 청결도
	public static int hp; // 피로도 낮을 수록 피곤
	public static int hunger; // 허기 낮을 수록 허기
	


	public static void initState() {

		happy = 50;
		clean = 50;
		hp = 50;
		hunger = 50;
	}
	
	// 리스트 향상된 for문.. map, hasNext, next() 암튼 궁리해 보기
	public static void stateTable() {
		System.out.println(Puppy.p[0].name + "의 현재 상태입니다.");
		String o = "□", x = "■";
		System.out.print("행복 : ");			
		for (int i = 1; i <= 10; i++) {		
			if (happy / 10 >= i) {			
				System.out.print(x);		
			} else
				System.out.print(o);		
		}
		System.out.println();
		System.out.print("청결도 : ");			// 배고픈 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (clean / 10 >= i) {			// cfeed의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cfeed의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("피로 : ");			// 깨끗한 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (hp / 10 >= i) {		// cshower의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cshower의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("허기 : ");			// 운동량을 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (hunger / 10 >= i) {		// chealth의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// chealth의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
	}
}
