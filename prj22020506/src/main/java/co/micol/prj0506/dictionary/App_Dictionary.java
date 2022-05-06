package co.micol.prj0506.dictionary;

import java.util.Scanner;

public class App_Dictionary {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DictionaryService dic = new DictionaryService();
		
		boolean b = false;
		while(!b) {
			System.out.println("번역할 단어를 입력하세요");
			String input = sc.nextLine();
			dic.selectWord(input);
			System.out.println("====================");
		}
	}

}
