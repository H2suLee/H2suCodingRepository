package chapter4;

public class ifcondition_Dice {
	public static void main(String[] args) {
		// p140 주사위의 번호 뽑기
		// 그 전에 ** Math.random 메소드 알고 가기
		// Math.random()은 디폴트로 0.0 <= x < 1.0 에서 랜덤값 추출, 따라서 추출된 값은 double 타입임.
		// 0.0 <= x < 6.0 사이의 값을 얻기 위해선 Math.random() * 6
		// 주사위 뽑기에서 0이라는 데이터 필요 없음. 1~6 중에서 추출하기 위해서는 Math.random() * 6 + 1 -> 1.0 <= x
		// < 7.0
		// 그리고 정수값을 뽑아야하므로 (int) 를 넣어 강제 타입 변환 -> (int) (Math.random()*6)+1

		int dice = (int) (Math.random() * 6) + 1;
		if (dice == 1) {
			System.out.println("1번이 나왔습니다.");
		} else if (dice == 2) {
			System.out.println("2번이 나왔습니다.");
		} else if (dice == 3) {
			System.out.println("3번이 나왔습니다.");
		} else if (dice == 4) {
			System.out.println("4번이 나왔습니다.");
		} else if (dice == 5) {
			System.out.println("5번이 나왔습니다.");
		} else {
			System.out.println("6번이 나왔습니다.");
		}

		System.out.println("------------------------");
		
		// Math.random으로 로또 번호 추첨
		// ★중복 배제 조건 거는 법 알아보기
		int lottery1 = (int) (Math.random() * 45) + 1;
		System.out.println("로또 번호1:" + lottery1);

		int lottery2 = (int) (Math.random() * 45) + 1;
		System.out.println("로또 번호2:" + lottery2);

		int lottery3 = (int) (Math.random() * 45) + 1;
		System.out.println("로또 번호3:" + lottery3);

		int lottery4 = (int) (Math.random() * 45) + 1;
		System.out.println("로또 번호4:" + lottery4);

		int lottery5 = (int) (Math.random() * 45) + 1;
		System.out.println("로또 번호5:" + lottery5);

		int lottery6 = (int) (Math.random() * 45) + 1;
		System.out.println("로또 보너스 번호:" + lottery6);
		System.out.println("------------------------");
		
		// 반복문, 조건문 사용하여 Dice 응용 문제, 컴퓨터 혼자 1부터 6까지 돌리다가 6이 나오면 탈출시키기
		while(true) {
			int num = (int) (Math.random()*6) +1;
			if(num == 1) {
				System.out.println("주사위의 숫자는 : "+num);
			} else if(num == 2) {
				System.out.println("주사위의 숫자는 : "+num);
			} else if(num == 3) {
				System.out.println("주사위의 숫자는 : "+num);
			} else if(num == 4) {
				System.out.println("주사위의 숫자는 : "+num);
			} else if(num == 5) {
				System.out.println("주사위의 숫자는 : "+num);
			} else {
				System.out.println("주사위의 숫자는 6, 탈출!");
				break;
			}
			
		}
		

	}
}
