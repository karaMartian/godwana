package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.gondwana.db.SalesGrowthQuery;

public class TestRepSalesGrowth {

	public static void main(String[] args) {
		SalesGrowthQuery sg = new SalesGrowthQuery();
		System.out.println(sg.query("0008"));
	}

}
