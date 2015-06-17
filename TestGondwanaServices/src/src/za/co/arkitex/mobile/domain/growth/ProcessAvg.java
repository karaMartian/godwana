package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

public class ProcessAvg {

	public static ArrayList<SalesGrowth> process(ArrayList<SalesGrowth> raw) {
		
		for (int i = 0; i < raw.size(); i++) {
			Average3Month avg = new Average3Month(
					Double.parseDouble(raw.get(i).getOneYearBackMTD()),
					Double.parseDouble(raw.get(i).getPreviousYearMonthMTD()));
			avg.calculate();
			
			
			raw.get(i).setAvg(avg.toString());
			
			System.out.println("Average :" +raw.get(i));
			System.out.println(avg);
		}
		
		return raw;
	}
}
