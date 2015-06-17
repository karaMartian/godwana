package za.co.arkitex.mobile.domain;

import java.util.ArrayList;

import za.co.arkitex.mobile.gondwana.exceptions.WrongStringLengthException;

public class YearFilter {

	private String year;
	private ArrayList<String> yearList;
	
	public String getYear() {
		return year;
	}
	public ArrayList<String> getYearList() {
		return yearList;
	}

	public void setYear(String year) {
		this.year = year;
	}


	public String validate(String calendar) {
		 if (calendar.length() == 4) {
			 setYear(calendar);	
			 return getYear().toString();
			 
		 } else {
			
			 try {
				 throw new WrongStringLengthException("Your string is " + calendar.length() + "\nYou need 4 characters");
			 } catch(WrongStringLengthException wslex) {
				 wslex.printStackTrace();
			 }
			 return "Invalid format";
			 
		 }
		
	}

	public void format(String calendar) {
		yearList = new ArrayList<String>();
		yearList.add("Jan " + calendar);
		yearList.add("Feb " + calendar);
		yearList.add("Mar " + calendar);
		yearList.add("Apr " + calendar);
		yearList.add("May " + calendar);
		yearList.add("Jun " + calendar);
		yearList.add("Jul " + calendar);
		yearList.add("Aug " + calendar);
		yearList.add("Sep " + calendar);
		yearList.add("Oct " + calendar);
		yearList.add("Nov " + calendar);
		yearList.add("Dec " + calendar);
	}
	
	public String getPreviousMonthMTD(String month) {
		String temp = "";
		for (int i = 0; i < yearList.size(); i++) {
			if (yearList.get(i).equalsIgnoreCase(month)) {
			//	System.out.println(yearList.get(i));
			//	System.out.println("Prev MTD " + yearList.get(i-1));
				temp = yearList.get(i-1);
			}
		}
		return temp;
	}
	
	public void  filter(String calendar) {
		validate(calendar);
		// to decide whether to format before validating?
		format(getYear());
	//	System.out.println(yearList);
	}

}
