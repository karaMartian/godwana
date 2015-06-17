package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.domain.TokenizeString;
import za.co.arkitex.mobile.gondwana.db.FilterSalesValueQuery;

public class TestInjectSQL {

	public static void main(String[] args) {
	
		 TokenizeString token = new TokenizeString();
		 String raw = "Product 11/Product 14/Product 28/Product 7";
		 token.processRawMaterial(raw);
		 
		 
		 
		 FilterSalesValueQuery query = new FilterSalesValueQuery();
//		 query.setInjectSQL(token.getProcessedSQL());
		 query.queryCommYear("0008", "2013");	
	}

}
