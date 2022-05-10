package co.micol.miniprj.draft2_1;

import java.io.IOException;

public class Activity {

	int num;

	public void selectActivity(int num) {
		// 잠
		switch (num) {
		case 1:
			System.out.println(Puppy.p[0].name + "가 잠을 잡니다.");
			runPause();
			System.out.println("쿨쿨zz");
			State.happy += 10;
			State.clean -= 10;
			State.hp += 50;
			State.hunger -= 20;
			runPause();
			System.out.println("잘 잤다");
			break;
		case 2:
			System.out.println(Puppy.p[0].name + "가 식사를 합니다.");
			runPause();
			System.out.println("냠냠");
//			pause();
//			System.out.println("쩝쩝");
			State.happy += 10;
			State.clean -= 10;
			State.hp -= 10;
			State.hunger += 50;
			runPause();
			System.out.println("잘 먹었다");
			break;
		case 3:
			if (State.hp < 50) {
				System.out.println("산책을 가기엔 " + Puppy.p[0].name + "가 너무 피곤해요");
				System.out.println(Puppy.p[0].name + "를 재워주세요");

			} else if (State.hunger < 50) {
				System.out.println("산책을 가기엔 " + Puppy.p[0].name + "가 너무 배고파요");
				System.out.println(Puppy.p[0].name + "에게 밥을 주세요");
			} else {
				System.out.println(Puppy.p[0].name + "가 산책을 합니다.");
				runPause();
				// 랜덤 환경 설정
				randomEnv();
			}
			break;
		case 4:
			System.out.println(Puppy.p[0].name + "가 목욕을 합니다.");
			pause();
			System.out.println("쓱싹쓱싹");
			State.happy -= 20;
			State.clean = 100;
			State.hp -= 20;
			State.hunger -= 20;
			runPause();
			System.out.println("잘 씻었다..");
			break;
		}
		pause();
//		State.stateTable();
	}
	
	public void randomEnv() {
		int env = (int)(Math.random()*4);
		switch(env) {
		case 0:
			System.out.println("앗.. 비가 오네요...");
			runPause();
			System.out.println(Puppy.p[0].userName + "님, 견주로써 산책 전에 날씨 체크도 안하시나요? 집으로 돌아가세요" );
			runPause();
			System.out.println(Puppy.p[0].name + "의 행복도가 0이 되었습니다.");
			State.happy = 0;
			State.clean -= 50;
			State.hp -= 50;
			State.hunger -= 50;
			break;
		
		case 1:
			System.out.println("헉.. 무서운 강아지가 다가오고 있어요!!");
			runPause();
			System.out.println("겁많은 강아지 " + Puppy.p[0].name + "가 집으로 가자고 하네요 ㅠㅠ");
			runPause();
			System.out.println(Puppy.p[0].name + "의 전체 상태가 50프로 감소했습니다.");
			State.happy -= 50;
			State.clean -= 50;
			State.hp -= 50;
			State.hunger -= 50;
			break;
			
		case 2:
			System.out.println(Puppy.p[0].name + "의 절친 강아지인 복덩이를 만났어요!");
			runPause();
			System.out.println(Puppy.p[0].name + "와 복덩이가 신나게 놀아요");
			runPause();
			System.out.println(Puppy.p[0].name + "의 행복도가 정점을 찍었어요");
			State.happy = 100;
			State.clean -= 50;
			State.hp = 0;
			State.hunger -= 50;
			break;
		case 3:
			System.out.println("무난하게 산책을 했어요!");
			State.happy += 50;
			State.clean -= 50;
			State.hp = 0;
			State.hunger -= 50;
			break;
			
		}
	}
	
	public static void runPause() {
		pause();
		System.out.println(" ");
		pause();
	}
	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
