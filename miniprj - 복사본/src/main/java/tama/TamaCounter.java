package tama;

public class TamaCounter {

	TamaQuiz quiz = new TamaQuiz();
	
	public void actCount() { 				// 한 행위를 하면 다른 행위들은 카운터 감소
		switch (Tama.inputNum) {
		case 4:								// '운동한다'의 행위 제외한 나머지 카운터 감소와 시간이 '1'증가.
			Tama.cplay -= 2;
			Tama.cfeed -= 8;
			Tama.cshower -= 10; Tama.time += 1.0; 
			break; 							
		case 3:								// '씻다'의 행위 제외한 나머지 카운터 감소와 시간이 '2'증가.
			Tama.cplay -= 2;
			Tama.cfeed -= 4;
			Tama.chealth -= 2; Tama.time += 2.0; 
			break; 							
		case 2:								// '먹다'의 행위 제외한 나머지 카운터 감소와 시간이 '1.8'증가.
			Tama.cplay -= 2;
			Tama.cshower -= 5;
			Tama.chealth -= 5; Tama.time += 1.8; 
			break; 							
		case 1:								// '논다'의 행위 제외한 나머지 카운터 감소와 시간이 '0.3'증가.
			Tama.cfeed -= 5;
			Tama.cshower -= 5;
			Tama.chealth -= 2; Tama.time += 0.3; 
			break;							
		}
	}
	public void dayCount() {	// Tama.time(시간)이 '24'이상이 될경우 Tama.Dday(날짜)가 '1' 증가.
		if (Tama.time >= 24) {		// Tama.time이 '24'이상일 경우
			Tama.Dday += 1;			// 날짜가 '1' 증가.
			Tama.dCount += 1;		// 날짜카운터가 '1' 증가.
			Tama.time -= 24;			// 시간이 '24' 감소.(다음날이 될때 그 전날의 흘려간 시간이 넘어온다. ex)23에 1.3시간만큼 흐르면 날짜가 1증가하고 시간은 0.3)
			Tama.chanceTime = 0;		// chanceTama.time에 '0'을 입력.
			Tama.cplay -= 10;		// Tama.cplay가 '10'만큼 감소.
			Tama.cfeed -= 20;		// Tama.cfeed가 '20'만큼 감소.
			Tama.cshower -= 10;		// Tama.cshower가 '10'만큼 감소.
			Tama.chealth -= 15;		// Tama.chealth가 '15'만큼 감소.
		}
	}
	public void ageCount() {			// Tama.dCount(날짜카운트)가 '12'가 되면 Tama.age(나이)가 '1' 증가.
		if (Tama.dCount % 7 == 0) {			// Tama.dCount가 '7'로 나누어 떨어질 일 경우
			Tama.dCount = 1;					// Tama.dCount가 '0'로 초기화.
			Tama.age +=1;					// Tama.age가 '1' 증가.
			switch(Tama.age) {				// Tama.age가 증가함에 따라 퀴즈실행.
			case 1: quiz.quiz1(); break;
			case 2: quiz.quiz2(); break;
			case 3: quiz.quiz3(); break;
			case 4: quiz.quiz4(); break;
			case 5: quiz.quiz5(); break;
			case 6: quiz.quiz6(); break;
			case 7: quiz.quiz7(); break;
			case 8: quiz.quiz8(); break;
			case 9: quiz.quiz9(); break;
			case 10: quiz.quiz10(); break;
			}
		}
	}
	public void warning() { 			// 각 행위의 카운터에 따라 알림문 출력 또는 호감도 감소.
		if (Tama.cplay < 10) { 						// Tama.cplay가 '10'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님이 외로워 하고있어요!");
			Tama.like -= 3;							// Tama.like '3' 감소.
		} else if (Tama.cplay < 40)					// Tama.cplay가 '40'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님이 심심해 하고있어요!");

		if (Tama.cfeed < 10) { 						// Tama.cfeed가 '10'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님이 굶주리고 있어요!");
			Tama.like -= 10;							// Tama.like '10' 감소.
		} else if (Tama.cfeed < 30)					// Tama.cfeed가 '30'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님이 배고파 합니다!");

		if (Tama.cshower < 20) { 					// Tama.cshower가 '20'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님이 더러워졌어요!");
			Tama.like -= 14;							// Tama.like '14' 감소.
		} else if (Tama.cshower < 50)				// schower가 '50'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님이 지저분 해졌어요!");	

		if (Tama.chealth < 10) { 					// Tama.chealth가 '10'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님 운동좀 해야겠어요!");
			Tama.like -= 6;							// Tama.like '6' 감소.
		} else if (Tama.chealth < 40)				// Tama.chealth가 '40'미만일 경우.
			System.out.print("(〃´-`〃)\r\n"+TamaName.tamaName+"님의 몸이 뻐근합니다.");
		System.out.println();
	}
	
}
