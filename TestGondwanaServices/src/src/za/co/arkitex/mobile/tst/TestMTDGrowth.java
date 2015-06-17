package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.growth.GrowthMTD;

public class TestMTDGrowth {

	public static void main(String[] args) {
		GrowthMTD growth = new GrowthMTD(1603605.64, 1101073.92);
		System.out.println(growth.calculate());
		System.out.println(growth);
	}

}
