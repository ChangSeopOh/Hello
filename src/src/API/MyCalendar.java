package API;

import java.util.Calendar;

public class MyCalendar {
	public void viewMonth(int year, int month) {

		Calendar cal = Calendar.getInstance(); // 컴퓨터 시간 불러옴
		cal.set(year, (month - 1), 1); // 자바는 0이 1월이라서 -1을 해야 알아먹음

		int week = cal.get(Calendar.DAY_OF_WEEK); // 일주일 단위로 끊어줌
		int endDay = cal.getActualMaximum(Calendar.DATE);

		System.out.println(year + "년" + month + "월");
		System.out.println("---------------------");
		System.out.println("일 월 화 수 목 금 토");
		System.out.println("---------------------");

		for (int sp = 1; sp < week; sp++) {
			System.out.print("   ");
		}

		for (int d = 1, w = week; d <= endDay; d++, w++) {
			System.out.print(d < 10 ? " " + d + " " : d + " ");
			if (w % 7 == 0)
				System.out.println();

		}

	}

}
