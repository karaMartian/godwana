package za.co.arkitex.mobile.tst;

import java.text.DateFormat;
import java.util.Date;

public class FormatDate {

	public static void main(String[] args) {
		Date d = new Date();
		DateFormat df = DateFormat.getDateInstance(DateFormat.SHORT);
//		System.out.println(df.format(d));
		
		String reverse = df.format(d);
		String month = reverse.substring(0, 1);
		String year = reverse.substring(5, 7);
		String date = reverse.substring(3, 4);
		
		System.out.println(reverse);
		System.out.println(year);
		System.out.println(month);
		System.out.println(date);
		
		String full = year;
		full += "-" + month;
		full += "-" + date;
		
		System.out.println(full);

	}

}
