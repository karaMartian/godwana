package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.SalesTrendData;
import za.co.arkitex.mobile.domain.TokenizeString;
import za.co.arkitex.mobile.gondwana.db.AggregatedSalesValueQueryV2;

public class MultiSelectTest {

	
	public static void main(String[] args) {
		TokenizeString token = new TokenizeString();
		token.processRawMaterial("Product 11/Product 14/Product 28/Product 7/Product 13");
		
		AggregatedSalesValueQueryV2 aggQuery  = new AggregatedSalesValueQueryV2();
		aggQuery.setProductInject(token.getProcessedSQL());
		
		aggQuery.queryCommYear("0008", "2013");
		
	}
}
