package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

public class ProcessGrowthYTD {

	public static ArrayList<SalesGrowth> process(ArrayList<SalesGrowth> raw) {
		
		for (int i = 0; i < raw.size(); i ++) {
			
			GrowthYTD growthYTD = new GrowthYTD(
					Double.parseDouble(raw.get(i).getPreviousYTD()),
					Double.parseDouble(raw.get(i).getTwoYearYTD()));
			
			growthYTD.calculate();
			
			raw.get(i).setGrowthYTD(growthYTD.toString());
			
			System.out.println("Growth YTD : " + raw.get(i) );
			System.out.println(growthYTD);
		}
		
		return raw;
	}
}
