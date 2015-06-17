package za.co.arkitex.mobile.domain;


import za.co.arkitex.mobile.gondwana.exceptions.WrongStringLengthException;

public class MonthFilter  {

/*	enum ShortMonth {
		JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC
	};*/
	
	private String month;

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}
	
	public void validate(String calendar) {
		if (calendar.length() == 8) {
			setMonth(calendar);
			
		} else if (calendar.isEmpty()){
			String message = "Sorry could not validate because string is empty";
			
			try {
				
				throw new WrongStringLengthException(message);
			} catch(WrongStringLengthException wslex) {
				wslex.printStackTrace();
			}

		} else {
			String message = "Sorry could not validate because string is more than or less 8 characters long.";
			try {
				
				throw new WrongStringLengthException(message);
			} catch(WrongStringLengthException wslex) {
				wslex.printStackTrace();
			}
		}
		
	}

	public void filter(String calendar) {
		validate(calendar);
		//lets format ie. feb 2001 should be 2-2001
		
		System.out.println(getMonth()); 
/*		SalesValueQuery svq = new SalesValueQuery("0008",
												  "Product 6",
												  getMonth());
		svq.runQuery();*/
		

	}
	
}
