package za.co.arkitex.mobile.domain;

import java.util.Comparator;

public class SortMonth implements Comparator<SortMonth> {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    
    public boolean equals(SortMonth aMonth) {
       SortMonth s= (SortMonth) aMonth;
       return getName().equals(s.getName());
    }

    @Override
    public int hashCode() {
        if (name.substring(0, 3).equals("Jan")) {
            return 0;
        } else if (name.substring(0, 3).equals("Feb")) {
            return 1;
        } else if (name.substring(0, 3).equals("Mar")) {
            return 2;
        } else if (name.substring(0, 3).equals("Apr")) {
            return 3;
        } else if (name.substring(0, 3).equals("May")) {
            return 4;
        } else if (name.substring(0, 3).equals("Jun")) {
            return 5;
        } else if (name.substring(0, 3).equals("Jul")) {
            return 6;
        } else if (name.substring(0, 3).equals("Aug")) {
            return 7;
        } else if (name.substring(0, 3).equals("Sep")) {
            return 8;
        } else if (name.substring(0, 3).equals("Oct")) {
            return 9;
        } else if (name.substring(0, 3).equals("Nov")) {
            return 10;
        } else {
            return 11;
        }
        
    }
    
    public String toString() {
        return name;
    }
    
    @Override
    public int compare(SortMonth one, SortMonth two) {

    	return one.getName().compareTo(two.getName());
    }
    
    
}
