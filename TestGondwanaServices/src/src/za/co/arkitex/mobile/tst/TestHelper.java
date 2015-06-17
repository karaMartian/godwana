package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.MonthHelper;

public class TestHelper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        MonthHelper helper = new MonthHelper();
        helper.calculatePreviousMonth("NoV");
        System.out.println("Previous month: " + helper.getPreviousMonth());
	}

}
