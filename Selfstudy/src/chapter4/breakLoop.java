package chapter4;

public class breakLoop {
	public static void main(String[] args) {
		// break문
		// 반복문의 실행을 중지할 때 씀. switch, for, while문 실행 중지 가능
		
		// 1~6 중 랜덤으로 값을 추출하여 주사위를 굴리다가 6이 나오면 탈출하기
		
		while(true) {
			int dice = (int) (Math.random() * 6 ) + 1;
			System.out.println("주사위의 값은: " + dice);
			if(dice == 6) {
				System.out.println("탈출!");
				break;
			}
		}
		System.out.println("프로그램 종료");
		
		// 위 문제를 switch문으로
		boolean flag = true;
		
		while(flag) {
			int num = (int) (Math.random()*6) + 1;
			switch(num) {
			case 1:
				System.out.println("1이 나왔습니다.");
				break;
			case 2:
				System.out.println("2이 나왔습니다.");
				break;
			case 3:
				System.out.println("3이 나왔습니다.");
				break;
			case 4:
				System.out.println("4이 나왔습니다.");
				break;
			case 5:
				System.out.println("5이 나왔습니다.");
				break;
			default:
				System.out.println("6이 나왔습니다. 탈출!");
				flag = false;
				break;
						
			}
		}
		System.out.println("프로그램 종료");
			

	}
}
