package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.domain.SalesTrendData;
import za.co.arkitex.mobile.gondwana.db.AggregatedSalesValueQuery;

public class TestAggSalesValue {

	
	public static void main(String [] args) {
		AggregatedSalesValueQuery ag = new AggregatedSalesValueQuery();
		SalesTrendData[] data = ag.queryCommYear("0008", "2013");
		
		for (SalesTrendData s : data) {
			System.out.println(s);
		}
		
//		System.out.println(ag.getProductList());
//		System.out.println(ag.getCommList());
//		System.out.println(ag.getSalesList());
	}
}
