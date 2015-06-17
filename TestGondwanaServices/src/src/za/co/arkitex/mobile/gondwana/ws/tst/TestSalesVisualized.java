package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.gondwana.db.SalesVisualizedQuery;

public class TestSalesVisualized {

	public static void main(String[] args) {
		SalesVisualizedQuery qry = new SalesVisualizedQuery();
		qry.queryCommYear("0008", "2013");
	}
}
