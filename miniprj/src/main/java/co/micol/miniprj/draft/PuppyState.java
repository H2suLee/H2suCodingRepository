package co.micol.miniprj.draft;

public class PuppyState {
	
	// 필드: 체력 행복 비만도 청결도 피로도
	static int hp;
	static int happy;
	static int obesity;
	static int clean;
	static int tiresome;
	String o = "□", x = "■";
	
	// 초기값
	public void set() {
		this.hp = 50;
		this.happy = 50;
		this.obesity = 30;
		this.clean = 50;
		this.tiresome = 20;
	}
	
	public void stateTable() {	
		set();
		// 현재 다마고치의 상태를 수치로표현.
		System.out.print("건강 : ");			// 심심한 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (hp / 10 >= i) {			// cplay의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cplay의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("행복 : ");			// 배고픈 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (happy / 10 >= i) {			// cfeed의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cfeed의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("비만도 : ");			// 깨끗한 정도를 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (obesity / 10 >= i) {		// cshower의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// cshower의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("청결도 : ");			// 운동량을 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (clean / 10 >= i) {		// chealth의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// chealth의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
		System.out.print("피로도 : ");			// 운동량을 나타내는 표.
		for (int i = 1; i <= 10; i++) {		// 반복문을 '10' 번 수행.(특수문자 10개)
			if (clean / 10 >= i) {		// chealth의 값의 자리수의 갯수 따라 특수문자 출력.
				System.out.print(x);		// chealth의 값을 10으로 나눈 몫이 i 보다 크거나 같으면 "■"을 출력.
			} else
				System.out.print(o);		// 그렇지 않으면 "□"을 출력.
		}
		System.out.println();
	}

}
