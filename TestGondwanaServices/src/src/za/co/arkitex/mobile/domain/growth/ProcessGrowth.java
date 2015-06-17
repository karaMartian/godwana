package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

public class ProcessGrowth {

	public static ArrayList<SalesGrowth> process(ArrayList<SalesGrowth> raw) {
		
		for (int i = 0; i < raw.size(); i++) {
			// Avg 3 months
			Average3Month avg = new Average3Month(
					Double.parseDouble(raw.get(i).getOneYearBackMTD()),
					Double.parseDouble(raw.get(i).getPreviousYearMonthMTD()));
			avg.calculate();
			raw.get(i).setAvg(avg.toString());
			
			// Growth MTD
			GrowthMTD growthMTD = new GrowthMTD(
					Double.parseDouble(raw.get(i).getOneYearBackMTD()),
					Double.parseDouble(raw.get(i).getTwoYearBackMTD()));
			growthMTD.calculate();
			raw.get(i).setGrowthMTD(growthMTD.toString());
			
			// Growth YTD
			GrowthYTD growthYTD = new GrowthYTD(
					Double.parseDouble(raw.get(i).getPreviousYTD()),
					Double.parseDouble(raw.get(i).getTwoYearYTD()));
			
			growthYTD.calculate();
			
			raw.get(i).setGrowthYTD(growthYTD.toString());
		// format decimal
//			String fonemtd = String.format("%,.2f", raw.get(i).getOneYearBackMTD());
//			String ftwomtd = String.format("%,.2f", raw.get(i).getTwoYearBackMTD());
//			String fnovmtd = String.format("%,.2f", raw.get(i).getPreviousYearMonthMTD());
//			String fytd 	= String.format("%,2.f", raw.get(i).getPreviousYTD());
//			String fytd2 	= String.format("%,.2f", raw.get(i).getTwoYearYTD());
//			
//			
//			raw.get(i).setOneYearBackMTD(fonemtd);
//			raw.get(i).setTwoYearBackMTD(ftwomtd);
//			raw.get(i).setPreviousYearMonthMTD(fnovmtd);
//			raw.get(i).setPreviousYTD(fytd);
//			raw.get(i).setTwoYearYTD(fytd2);
		}
		
		return raw;
		
	}
}
