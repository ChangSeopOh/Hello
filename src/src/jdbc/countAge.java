package jdbc;

import java.util.Calendar;

public class countAge {
	public static void main(String[] args) {
		int year = 1999;
		
		Calendar today = Calendar.getInstance();
		
		int thisYear = today.get(Calendar.YEAR);
		
		System.out.println(thisYear);
		year = (thisYear-year)+1;
		System.out.println(year);
	}
}
