package za.co.arkitex.mobile.tst;

import java.util.HashMap;
import java.util.ArrayList;

public class TestHashMap {
	
	private HashMap<String, ArrayList<Integer>> collection = new HashMap<String, ArrayList<Integer>>();
	
	public static void main(String[] args) {
	
		TestHashMap tst = new TestHashMap();
		
		String brand1 = "Product 2";
		ArrayList<Integer> brand1SalesValue = new ArrayList<Integer>();
		brand1SalesValue.add(2000);
		brand1SalesValue.add(1200);
		brand1SalesValue.add(500);
		brand1SalesValue.add(700);
		brand1SalesValue.add(3500);
		brand1SalesValue.add(5000);
		brand1SalesValue.add(4900);
		brand1SalesValue.add(6000);
		brand1SalesValue.add(9000);
		brand1SalesValue.add(12000);
		brand1SalesValue.add(6500);
		brand1SalesValue.add(13000);
		
		
		String brand2 = "Product 6";
		ArrayList<Integer> brand2SalesValue = new ArrayList<Integer>();
		brand2SalesValue.add(3000);
		brand2SalesValue.add(2500);
		brand2SalesValue.add(1002);
		brand2SalesValue.add(2400);
		brand2SalesValue.add(700);
		brand2SalesValue.add(4100);
		brand2SalesValue.add(600);
		brand2SalesValue.add(1400);
		brand2SalesValue.add(5400);
		brand2SalesValue.add(1000);
		brand2SalesValue.add(1990);
		brand2SalesValue.add(300);
		
		
		
		
		tst.addToCollection(brand1, brand1SalesValue);
		tst.addToCollection(brand2, brand2SalesValue);
		
		System.out.println(tst.getCollection());
	}

	public HashMap<String, ArrayList<Integer>> getCollection() {
		return collection;
	}
	
	public void addToCollection(String brandName, ArrayList<Integer> salesValues) {
		collection.put(brandName, salesValues);
		
	}
	
	

}
