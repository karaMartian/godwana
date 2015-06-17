package za.co.arkitex.mobile.domain;

import java.util.ArrayList;

public class QuarterType {

	private QuarterCount qc;
	private ArrayList<String> quarter;
	
	public QuarterType(QuarterCount qc) {
		this.qc = qc;
		
		
	}
	
	public ArrayList<String> getQuarter() {
		return quarter;
	}

	public void setQuarter(ArrayList<String> quarter) {
		this.quarter = quarter;
	}

	public void validate(){
		quarter = new ArrayList<String>();
//		if (qc) {
//			 q = Quarter.Q1;
//		} else if (concat.equalsIgnoreCase("q2")) {
//			q = Quarter.Q2;
//		} else if (concat.equalsIgnoreCase("q3")) {
//			q = Quarter.Q3;
//		} else if (concat.equalsIgnoreCase("q4")){
//			q = Quarter.Q4;
//		}
		switch(qc) {
			
		case FIRST: 
			quarter.add("jan");
			quarter.add("feb");
			quarter.add("mar");
			break;
			
		case SECOND:
			quarter.add("apr");
			quarter.add("may");
			quarter.add("jun");
		
			break;
			
		case THIRD:
			quarter.add("jul");
			quarter.add("aug");
			quarter.add("sep");
			
			break;
			
		default:
			quarter.add("oct");
			quarter.add("nov");
			quarter.add("dec");
		}
	}

}
