package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.PeriodFormatter;

public class TestPeriodFormatter {

	public static void main(String[] args) {
		PeriodFormatter pf = new PeriodFormatter("dec 2013");
		System.out.println(pf.getNextMonth());

	}

}
