
package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

public class ProcessGrowthV2 {

	public static ArrayList<CompiledModel> process(ArrayList<CompiledModel> raw) {
		
		for (int i = 0; i < raw.size(); i++) {
			// Avg 3 months
			String temp_avgmtd = "";
			
			if (raw.get(i).getOneYearBackMTD() == null) {
				raw.get(i).setOneYearBackMTD("0.00");
			}
			
			if (raw.get(i).getPreviousYearMonthMTD() == null) {
				raw.get(i).setPreviousYearMonthMTD("0.00");
			}
			
			Average3Month avg = new Average3Month(
					Double.parseDouble(raw.get(i).getOneYearBackMTD()),
					Double.parseDouble(raw.get(i).getPreviousYearMonthMTD()));
			avg.calculate();
			raw.get(i).setAvg(avg.toString());
			
			
			
			// Growth MTD
			if (raw.get(i).getOneYearBackMTD() == null) {
				raw.get(i).setOneYearBackMTD("0.00");
			}
			
			if (raw.get(i).getTwoYearBackMTD() == null) {
				raw.get(i).setTwoYearBackMTD("0.00");
			}
			GrowthMTD growthMTD = new GrowthMTD(
					Double.parseDouble(raw.get(i).getOneYearBackMTD()),
					Double.parseDouble(raw.get(i).getTwoYearBackMTD()));
			growthMTD.calculate();
			
			if (growthMTD.toString().trim().equalsIgnoreCase("-infinity")) {
				
				raw.get(i).setGrowthMTD("0");
			} else {
				raw.get(i).setGrowthMTD(growthMTD.toString());	
			}
		//	raw.get(i).setGrowthMTD(growthMTD.toString());
			
			// Growth YTD
				
			if (raw.get(i).getPreviousYTD() == null) {
				raw.get(i).setPreviousYTD("0.00");
			}
			
			if (raw.get(i).getTwoYearYTD() == null) {
				raw.get(i).setTwoYearYTD("0.00");
			}
			GrowthYTD growthYTD = new GrowthYTD(
					Double.parseDouble(raw.get(i).getPreviousYTD()),
					Double.parseDouble(raw.get(i).getTwoYearYTD()));
			
			growthYTD.calculate();	
			
			if (growthYTD.toString().trim().equalsIgnoreCase("-infinity")) {
				raw.get(i).setGrowthYTD("0");
			} else {
				raw.get(i).setGrowthYTD(growthYTD.toString());
			}
		//	raw.get(i).setGrowthYTD(growthYTD.toString());
			
		// format decimal
			double oneYearValue = Double.parseDouble(raw.get(i).getOneYearBackMTD());
			double twoYearValue = Double.parseDouble(raw.get(i).getTwoYearBackMTD());
			double novValue = Double.parseDouble(raw.get(i).getPreviousYearMonthMTD());
			double ytdValue = Double.parseDouble(raw.get(i).getPreviousYTD());
			double ytdValue2 = Double.parseDouble(raw.get(i).getTwoYearYTD());
			
			String fonemtd = String.format("%, d", Math.round(oneYearValue));
			String ftwomtd = String.format("%, d", Math.round(twoYearValue));
			String fnovmtd = String.format("%, d", Math.round(novValue));
			String fytd    = String.format("%, d", Math.round(ytdValue));
			String fytd2   = String.format("%, d", Math.round(ytdValue2));
			
			raw.get(i).setOneYearBackMTD(fonemtd);
			raw.get(i).setTwoYearBackMTD(ftwomtd);
			raw.get(i).setPreviousYearMonthMTD(fnovmtd);
			raw.get(i).setPreviousYTD(fytd);
			raw.get(i).setTwoYearYTD(fytd2);
		}
		
		return raw;
		
	}
}
