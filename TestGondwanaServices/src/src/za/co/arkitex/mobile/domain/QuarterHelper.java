package za.co.arkitex.mobile.domain;

import java.util.ArrayList;

/**
 *
 * @author Luckson
 */
public class QuarterHelper {
    
    
    private ArrayList<String> quarters = new ArrayList<String>();
    private String previousMonth;
    private String currentMonth;
    
    public QuarterHelper() {
        
        quarters.add("Jan");
        quarters.add("Feb");
        quarters.add("Mar");
        quarters.add("Apr");
        quarters.add("May");
        quarters.add("Jun");
        quarters.add("Jul");
        quarters.add("Aug");
        quarters.add("Sep");
        quarters.add("Oct");
        quarters.add("Nov");
        quarters.add("Dec");
    }
    
    public void calculatePreviousMonth(String currentQuarter) {
        if (currentQuarter.substring(0, 2).equalsIgnoreCase("q1")) {
            setCurrentMonth("Mar " +  currentQuarter.substring(3, 7));
            setPreviousMonth("Feb " + currentQuarter.substring(3, 7));
            
        } else if (currentQuarter.substring(0, 2).equalsIgnoreCase("q2")) {
            setCurrentMonth("Jun " + currentQuarter.substring(3, 7));
            setPreviousMonth("May " + currentQuarter.substring(3, 7));
            
        } else if (currentQuarter.substring(0, 2).equalsIgnoreCase("q3")) {
            setCurrentMonth("Sep " + currentQuarter.substring(3, 7));
            setPreviousMonth("Aug " + currentQuarter.substring(3, 7));
            
        } else if (currentQuarter.substring(0, 2).equalsIgnoreCase("q4")) {
            setCurrentMonth("Dec " + currentQuarter.substring(3, 7));
            setPreviousMonth("Nov " + currentQuarter.substring(3, 7));
        }
    }

    public String getPreviousMonth() {
        return previousMonth;
    }

    public void setPreviousMonth(String previousMonth) {
        this.previousMonth = previousMonth;
    }

    public String getCurrentMonth() {
        return currentMonth;
    }

    public void setCurrentMonth(String currentMonth) {
        this.currentMonth = currentMonth;
    }
    
    
}
