package test;

import java.util.Calendar;

public class Interview9 {

	public static void main(String[] args) {

		int days = 0;

		Calendar cal = Calendar.getInstance();
		cal.set(2017, 9, 1);

		while (cal.get(Calendar.MONTH) == 9) {
			int dayOfWeek = cal.get(Calendar.DAY_OF_WEEK);
			if (dayOfWeek == Calendar.SATURDAY || dayOfWeek == Calendar.SUNDAY) {
				days++;

			}

			cal.add(Calendar.DAY_OF_YEAR, 1);
		}
		System.out.println(days);
	}
}
