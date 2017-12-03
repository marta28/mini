package test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Interview8 {
	static final DateFormat format = new SimpleDateFormat("yyyy-MM-dd");

	public static void main(String[] args) throws ParseException {

		Date today = Calendar.getInstance().getTime();
		String today1 = format.format(today);
		String date2 = "2018-11-10";
		long zwraca = diffr(today1, date2);
		System.out.println(zwraca);
		
		
		
		
	}

	public static long diffr(String date1, String date2) throws ParseException {

		Date date11 = format.parse(date1);
		Date date12 = format.parse(date2);

		long diff = date12.getTime() - date11.getTime();

		return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

	}
	
}
