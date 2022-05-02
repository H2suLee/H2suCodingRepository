package com.yedam.java.ch11_04;

import java.util.Calendar;

public class CalanderClassExample {
	public static void main(String[] args) {

		// Calendar 클래스는 추상 클래스로, new 연산자를 사용해서 인스턴스를 생성할 수 없다.
		// Calendar 클래스의 정적 메소드인 getInstance()메소드를 이용하면 현재 운영 체제에 설정되어있는 시간대를 기준으로 한
		// Calendar 하위 객체를 얻을 수 있다.

		Calendar now = Calendar.getInstance(); // new 연산자 사용 불가, 무조건 하나의 인스턴스를 공유함

		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH) + 1; // 0이 1월
		int day = now.get(Calendar.DAY_OF_MONTH);
		int week = now.get(Calendar.DAY_OF_WEEK);
		String strWeek = null;
		switch (week) {
		case Calendar.MONDAY:
			strWeek = "월";
			break;
		case Calendar.TUESDAY:
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY:
			strWeek = "수";
			break;
		case Calendar.THURSDAY:
			strWeek = "목";
			break;
		case Calendar.FRIDAY:
			strWeek = "금";
			break;
		case Calendar.SATURDAY:
			strWeek = "토";
			break;
		case Calendar.SUNDAY:
			strWeek = "일";
			break;
		}
		int amPm = now.get(Calendar.AM_PM);
		String strAmPm = null;
		if (amPm == Calendar.AM) {
			strAmPm = "오전";
		} else {
			strAmPm = "오후";
		}

		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);

		System.out.print(year + "년 ");
		System.out.print(month + "월 ");
		System.out.print(day + "일 ");
		System.out.print(strWeek + "요일 ");
		System.out.print(strAmPm + " ");
		System.out.print(hour + "시 ");
		System.out.print(minute + "분 ");
		System.out.print(second + "초 ");

	}
}
