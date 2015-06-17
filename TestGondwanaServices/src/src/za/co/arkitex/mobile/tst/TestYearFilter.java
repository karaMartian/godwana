package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.YearFilter;

public class TestYearFilter {

	public static void main(String[] args) {
		
		YearFilter year = new YearFilter();
		year.filter("2011");
		System.out.println(year.getPreviousMonthMTD("mar 2011"));
	}

}
