package za.co.arkitex.mobile.gondwana.ws.tst;

import java.util.ArrayList;

import za.co.arkitex.mobile.domain.CustomerLocation;
import za.co.arkitex.mobile.gondwana.db.CustomerCoordinatesQuery;

public class TestCustomerLocation {

	public static void main(String[] args) {
		CustomerCoordinatesQuery query = new CustomerCoordinatesQuery(); 
		
		for (CustomerLocation c: query.queryCustomerLocation("0008"))
		System.out.println(c);

	}

}
