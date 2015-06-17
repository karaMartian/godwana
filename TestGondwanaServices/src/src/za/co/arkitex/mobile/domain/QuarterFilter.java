package za.co.arkitex.mobile.domain;

import java.util.ArrayList;

import za.co.arkitex.mobile.gondwana.exceptions.QuarterFilterException;
import za.co.arkitex.mobile.gondwana.exceptions.WrongStringLengthException;

public class QuarterFilter {

	private String quarter;
	private ArrayList<String> monthList;
	private Quarter q;

	public ArrayList<String> getMonthList() {
		return monthList;
	}

	public String getQuarter() {
		return quarter;
	}

	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}

	public void  validate(String calendar) {
		if (calendar.length() == 7) {
			setQuarter(calendar);
			
		} else {
			String message = "You supplied " + calendar.length() + " character(s)";
			try {
				throw new WrongStringLengthException(message);
			} catch(WrongStringLengthException wslex) {
				wslex.printStackTrace();
			}
		
		}
		
	}


	public void format(String calendar) {
		
		monthList = new ArrayList<String>();
		
		String concat = calendar.substring(0, 2);
		String year = calendar.substring(3, 7);
	
		if (concat.trim().equalsIgnoreCase("q1")) {
			 q = Quarter.Q1;
		} else if (concat.equalsIgnoreCase("q2")) {
			q = Quarter.Q2;
		} else if (concat.equalsIgnoreCase("q3")) {
			q = Quarter.Q3;
		} else if (concat.equalsIgnoreCase("q4")){
			q = Quarter.Q4;
		} else {
			try {
				throw new QuarterFilterException();
			} catch(QuarterFilterException qfex) {
				qfex.printStackTrace();
			}
		}
		// lets switch our Quarter enum.
		switch (q) {
			case Q1 :
				monthList.add("jan " + year);
				monthList.add("feb " + year);
				monthList.add( "mar " + year);
				
				break;
				
			case Q2 :
				monthList.add("apr " + year);
				monthList.add("may " + year);
				monthList.add("jun " + year);

				break;
				
			case Q3 :
				monthList.add("jul " + year);
				monthList.add("aug " + year);
				monthList.add("sep " + year);	

				
				break;
				
			default :
				monthList.add("oct " + year);
				monthList.add("nov " + year);
				monthList.add("dec " + year);

		}
		
	}


	public void filter(String calendar) {
		validate(calendar);
		format(getQuarter());		
//		for (String s: getMonthList())
//			System.out.println(s);
		System.out.println(getMonthList());
		
	}
}
