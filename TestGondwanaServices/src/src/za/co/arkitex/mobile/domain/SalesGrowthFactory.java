package za.co.arkitex.mobile.domain;

public class SalesGrowthFactory {

	private String previousYear;
	
	public String calcPreviousYear(String defaultYear) {
		int year = Integer.parseInt(defaultYear);
		int previous = year- 1;
		
		previousYear = "" + previous;
		return previousYear;
	}
	
	
	
}
