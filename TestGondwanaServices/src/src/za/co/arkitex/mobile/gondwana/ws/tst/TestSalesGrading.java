package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.gondwana.db.SalesGradingCustomersQuery;
import za.co.arkitex.mobile.gondwana.db.SalesVisualizedQuery;

public class TestSalesGrading {

	public static void main(String[] args) {
		SalesGradingCustomersQuery qry = new SalesGradingCustomersQuery();

		qry.getYearValues("0022", "2012");
	}
}
