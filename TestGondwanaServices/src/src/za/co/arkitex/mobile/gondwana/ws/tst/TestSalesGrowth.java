package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.gondwana.db.SalesGrowthQuery;
import za.co.arkitex.mobile.gondwana.db.SalesGrowthQueryV2;

public class TestSalesGrowth {

	public static void main(String[] args) {
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryMonth("apr 2013", "LEA GLEN +S - 4924");
	}
}
