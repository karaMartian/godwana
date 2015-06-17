package za.co.arkitex.mobile.gondwana.ws.tst;

import za.co.arkitex.mobile.gondwana.db.FilterQuery;

public class TestFilter {

	public static void main(String[] args) {
		FilterQuery query = new FilterQuery();
		
		for (String s: query.filerByQuater())
		System.out.println(s);

	}

}
