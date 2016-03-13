package API;

import java.util.Calendar;

public class MyCalendar {
	public void viewMonth(int year, int month) {

		Calendar cal = Calendar.getInstance(); // ��ǻ�� �ð� �ҷ���
		cal.set(year, (month - 1), 1); // �ڹٴ� 0�� 1���̶� -1�� �ؾ� �˾Ƹ���

		int week = cal.get(Calendar.DAY_OF_WEEK); // ������ ������ ������
		int endDay = cal.getActualMaximum(Calendar.DATE);

		System.out.println(year + "��" + month + "��");
		System.out.println("---------------------");
		System.out.println("�� �� ȭ �� �� �� ��");
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
