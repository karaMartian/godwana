package za.co.arkitex.mobile.tst;

public class FormatMonth {

	public static void main(String[] args) {
		
		String month = "feb 2014";
		String correctFormat = month.substring(0, 3);
		String year = month.substring(4, 8);
		System.out.println(correctFormat);
		System.out.println(year);
		System.out.println(year + "-" + correctFormat);
	}
}
