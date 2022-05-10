package tama;

import java.util.Scanner;

public class TamaRank {
	Scanner scan = new Scanner(System.in);
	Tama tama = new Tama();

	public void ranking() { // 게임이 끝날을 때 얻은 호감도 만큼 클리어 점수채점.
		if (Tama.like >= 10000) {
			System.out.println(TamaName.tamaName + "\r\n님의 호감도 계산 결과 S랭크입니다 축하드립니다!\r\n");
		} else if (Tama.like >= 9800) {
			System.out.println(TamaName.tamaName + "\r\n님의 호감도 계산 결과 A랭크입니다 다음번엔 S를 노리자구요!\r\n");
		} else if (Tama.like >= 8500) {
			System.out.println(TamaName.tamaName + "\r\n님의 호감도 계산 결과 B랭크입니다 좀더 집중해주세요!\r\n");
		} else if (Tama.like >= 7000) {
			System.out.println(TamaName.tamaName + "\r\n님의 호감도 계산 결과 C랭크입니다 수고하셨습니다.\r\n");
		} else if (Tama.like >= 5000) {
			System.out.println(TamaName.tamaName + "\r\n님의 호감도 계산 결과 D랭크 입니다 수고하셨습니다\r\n");
		} else if (Tama.like >= 1500) {
			System.out.println(TamaName.tamaName + "\r\n님의 호감도 게산 결과 F랭크 입니다. 다음번엔 잘 하실 수 있을 거에요! >.<\r\n");
		} else {
			System.out.println("\r\n다음에 다시 도전해주세요~ㅠ.ㅜ\r\n");
		}
	}
}
