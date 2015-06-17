package za.co.arkitex.mobile.domain;

public class PeriodFormatter {
	
	private String month;
	private String nextMonth;
	private Truncate chop;
	private Concatenate concat;
	
	// provide a comm month 
	public PeriodFormatter(String month) {
		// lets validate first that our month is acceptable: 8 chars
		if (month.length() == 8) {
			this.month = month;
			chop = new Truncate(month);
			chop.chop();
			setMonth(chop.getResult());
		} else {
			System.out.println("Please refer to manual.\nProvide a qualified month example 'nov 1990'\nYou need 8 chars");
		}
	}
	
	public void setNextMonth(String nextMonth) {
		this.nextMonth = nextMonth;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	// pass only 3 chars.
	public String getNextMonth() {
		
		if (month.equalsIgnoreCase("jan")){
			nextMonth = "feb";
//			System.out.println("Next Month is: " + nextMonth);
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("feb")) {
			nextMonth = "mar";	
//			System.out.println("Next Month is: " + nextMonth);
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();		
			
		} else if (month.equalsIgnoreCase("mar")) {
			nextMonth = "apr";
//			System.out.println("Next Month is: " + nextMonth);
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("apr")) {
			nextMonth = "may";
//			System.out.println("Next Month is: " + nextMonth);
		
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("may")) {
			nextMonth = "jun";
//			System.out.println("Next Month is: " + nextMonth);
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("jun")) {
			nextMonth = "jul";
//			System.out.println("Next Month is: " + nextMonth);
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("jul")) {
			nextMonth = "aug";
//			System.out.println("Next Month is: " + nextMonth);
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("aug")) {
			nextMonth = "sep";
//			System.out.println("Next Month is:" + nextMonth);
		
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("sep")) {
			nextMonth = "oct";
//			System.out.println("Next Month is: " + nextMonth);
		
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("oct")) {
//			System.out.println("Next Month is Nov");
			nextMonth = "nov";
			
			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("nov")) {
			nextMonth = "dec";
//			System.out.println("Next Month is " + nextMonth);

			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(nextMonth, chop.getEndPoint());
//			System.out.println("Fully Qualified next comm month is: " + concat.getResult());
		
			return concat.getResult();
			
		} else if (month.equalsIgnoreCase("dec")){
			// dec, for now let not return next month jan. just return the same month
//			System.out.println("Month is " + month);

			// lets append the year, to have a fully qualified comm month
			concat = new Concatenate(month, chop.getEndPoint());
//			System.out.println("Fully Qualified comm month is: " + concat.getResult());
		
			return concat.getResult();
			
			
		} else {
			System.out.println("Please refer to manual.\nCould not process your request");
			return "Invalid request";
		}		
	}


}
