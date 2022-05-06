package co.micol.prj0506.dictionary;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// key값과 value 값을 사용하는 맵 으로 단어 만들어 놓기

// 번역할 단어를 입력하세요
// god 입력
// 신, 예수 출력
// map 입력
// 지도 출력

public class DictionaryService {

	private WordVO word;
	private List<WordVO> dic = new ArrayList<>();
	Scanner sc = new Scanner(System.in);

	private void dataSet() {
		word = new WordVO("water", "물");
		dic.add(word);

		word = new WordVO("coffee", "커피");
		dic.add(word);

		word = new WordVO("airpod", "에어팟");
		dic.add(word);

		word = new WordVO("notepad", "수첩");
		dic.add(word);

		word = new WordVO("monitor", "모니터");
		dic.add(word);
	}

	public void selectWord(String input) {
		dataSet();
		for (WordVO word : dic) {
			if (word.getEng().equals(input))
				word.toString();
			break;
		}
	}

}
