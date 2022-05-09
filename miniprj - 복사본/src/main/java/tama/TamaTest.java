package tama;

public class TamaTest {
	
	public static void main(String[] args) {
		Tama tama = new Tama();
		TamaName name = new TamaName();
		TamaStart start = new TamaStart();
		TamaAction action = new TamaAction();
		TamaCounter counter = new TamaCounter();
		TamaRank rank = new TamaRank();
		TamaEnd end = new TamaEnd();
		do {
			start.start();			// 시작.
			start.menuSelect();		// 메뉴선택.
			tama.Set();				// 값 초기화.
			name.naming();
			do {
				tama.infoprint();
				action.action();			// 행동 선택.
				counter.actCount();			// 카운트 처리.
				counter.dayCount();			// 날짜 처리.
				counter.ageCount();			// 나이 처리.
				counter.warning();				// 알림문 출력.*/
			}while(Tama.like > -10 && Tama.inputNum != 5 && Tama.age != 10 );	// 호감도가 '-10'미만이거나 사용자가 게임을 종료했을 경우.
			rank.ranking();			// 점수 채점.
			end.end();
			end.reStart();			// 재시작 선택.*/
		}while(Tama.inputNum != 2);	// 종료.
		System.out.println("종료");	
	}

}
