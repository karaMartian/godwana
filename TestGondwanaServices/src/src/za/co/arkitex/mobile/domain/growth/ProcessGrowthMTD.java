package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

public class ProcessGrowthMTD {

	public static ArrayList<SalesGrowth> process(ArrayList<SalesGrowth> raw) {
		
		for (int i = 0; i < raw.size(); i++) {
			GrowthMTD growthMTD = new GrowthMTD(
					Double.parseDouble(raw.get(i).getOneYearBackMTD()),
					Double.parseDouble(raw.get(i).getTwoYearBackMTD()));
			growthMTD.calculate();
			raw.get(i).setGrowthMTD(growthMTD.toString());
			
			System.out.println("Growth MTD :" + raw.get(i));
			System.out.println(growthMTD);
		}
		return raw;
	}
}
