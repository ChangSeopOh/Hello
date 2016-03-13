package API;

import java.util.Scanner;

public class CalendarTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Year : "); int year = sc.nextInt();
		System.out.print("Month : "); int month = sc.nextInt();
		
		MyCalendar mycalendar = new MyCalendar();
		mycalendar.viewMonth(year, month);
	}
}

