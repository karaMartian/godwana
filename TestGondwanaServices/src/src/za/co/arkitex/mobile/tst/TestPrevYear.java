package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.SalesGrowthFactory;

public class TestPrevYear {

	public static void main(String[] args) {
		SalesGrowthFactory factory = new SalesGrowthFactory();
		
		System.out.println("Prev year " + factory.calcPreviousYear("2013") );
	}

}
