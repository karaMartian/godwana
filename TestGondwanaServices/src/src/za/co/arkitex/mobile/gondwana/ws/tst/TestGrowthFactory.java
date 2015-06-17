package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.domain.SalesGrowthFactory;

public class TestGrowthFactory {

	public static void main(String[] args) {
		SalesGrowthFactory factory = new SalesGrowthFactory();
		
		System.out.println(factory.calcPreviousYear("1990"));

	}

}
