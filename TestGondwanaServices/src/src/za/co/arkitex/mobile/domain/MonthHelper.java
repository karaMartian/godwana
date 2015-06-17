package za.co.arkitex.mobile.domain;

import java.util.ArrayList;

/**
 *
 * @author Luckson
 */
public class MonthHelper {
    
    
    private ArrayList<String> calendar = new ArrayList<String>();
    private String previousMonth;
    
    public MonthHelper() {
        calendar.add("Jan");
        calendar.add("Feb");
        calendar.add("Mar");
        calendar.add("Apr");
        calendar.add("May");
        calendar.add("Jun");
        calendar.add("Jul");
        calendar.add("Aug");
        calendar.add("Sep");
        calendar.add("Oct");
        calendar.add("Nov");
        calendar.add("Dec");
        
    }
    
    public void calculatePreviousMonth(String currentMonth) {

        if (currentMonth.substring(0, 3).equalsIgnoreCase("Jan")) {
            setPreviousMonth("Dec " + currentMonth.substring(4, 8));
   
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Feb")) {
            setPreviousMonth("Jan " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Mar")) {
            setPreviousMonth("Feb " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Apr")) {
            setPreviousMonth("Mar " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("May")) {
            setPreviousMonth("Apr " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Jun")) {
            setPreviousMonth("May " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Jul")) {
            setPreviousMonth("Jun " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Aug")) {
            
            setPreviousMonth("Jul " + currentMonth.substring(4, 8));
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Sep")) {
            setPreviousMonth("Aug " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Oct")) {
            setPreviousMonth("Sep " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Nov")) {
            setPreviousMonth("Oct " + currentMonth.substring(4, 8));
            
        } else if (currentMonth.substring(0, 3).equalsIgnoreCase("Dec")) {
            setPreviousMonth("Nov " + currentMonth.substring(4, 8));
            
        }
        

    }

    public String getPreviousMonth() {
        return previousMonth;
    }

    public void setPreviousMonth(String previousMonth) {
        this.previousMonth = previousMonth;
    }
   
}
