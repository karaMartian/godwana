package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.growth.GrowthYTD;

public class TestYTDGrowth {

	public static void main(String[] args) {
		GrowthYTD growth = new GrowthYTD(36718984.36, 30587896.16);
		System.out.println(growth.calculate());
		System.out.println(growth);
	}

}
