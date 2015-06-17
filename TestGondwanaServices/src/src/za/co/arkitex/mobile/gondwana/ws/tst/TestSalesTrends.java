package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.gondwana.db.SalesValueQuery;

public class TestSalesTrends {

	public static void main(String[] args) {
		SalesValueQuery trends = new SalesValueQuery("0008", "product 11", "2013");
		trends.queryCommYear();
	//	System.out.println(trends.getSalesValuesList());

	}

}
