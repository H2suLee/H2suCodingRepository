package co.micol.miniprj.draft;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {
	
	public static void main(String[] args) {
		Date date = new Date();
		System.out.println(date.toString());
		SimpleDateFormat simple = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(simple.format(date));
	}

}
