package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.gondwana.db.ProxyCustomer;
import za.co.arkitex.mobile.gondwana.db.Top25CustomersQuery;

public class TestMyTop25Customers {

	public static void main(String[] args) {
		Top25CustomersQuery  top = new Top25CustomersQuery("0008","jan 2013");
		top.queryCommMonth();;
	
//		for (ProxyCustomer c: top.getCustomerValuesList()) {
//			System.out.println(c);
//		}
		
	}
}
