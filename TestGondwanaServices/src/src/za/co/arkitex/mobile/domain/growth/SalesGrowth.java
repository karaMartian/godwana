package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

public class SalesGrowth implements Comparable<SalesGrowth>{

	private String product;	
	private String twoYearBackMTD;
	private String oneYearBackMTD;
	private String previousYearMonthMTD;
	private String previousYTD;
	private String twoYearYTD;
	private String avg;
	private String growthMTD;
	private String growthYTD;
	
	
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getTwoYearBackMTD() {
		return twoYearBackMTD;
	}
	public void setTwoYearBackMTD(String twoYearBackMTD) {
		this.twoYearBackMTD = twoYearBackMTD;
	}
	public String getOneYearBackMTD() {
		return oneYearBackMTD;
	}
	public void setOneYearBackMTD(String oneYearBackMTD) {
		this.oneYearBackMTD = oneYearBackMTD;
	}
	public String getPreviousYearMonthMTD() {
		return previousYearMonthMTD;
	}
	public void setPreviousYearMonthMTD(String previousYearMonthMTD) {
		this.previousYearMonthMTD = previousYearMonthMTD;
	}
	public String getPreviousYTD() {
		return previousYTD;
	}
	public void setPreviousYTD(String previousYTD) {
		this.previousYTD = previousYTD;
	}
	public String getTwoYearYTD() {
		return twoYearYTD;
	}
	public void setTwoYearYTD(String twoYearYTD) {
		this.twoYearYTD = twoYearYTD;
	}

	
	public String getAvg() {
		return avg;
	}
	public void setAvg(String avg) {
		this.avg = avg;
	}
	public String getGrowthMTD() {
		return growthMTD;
	}
	public void setGrowthMTD(String growthMTD) {
		this.growthMTD = growthMTD;
	}
	public String getGrowthYTD() {
		return growthYTD;
	}
	public void setGrowthYTD(String growthYTD) {
		this.growthYTD = growthYTD;
	}
	
	public String toString() {
		return  	product 					+ " " + 
					oneYearBackMTD				+ " " + 
					twoYearBackMTD				+ " " + 
					previousYearMonthMTD		+ " " + 
					avg							+ " " +
					previousYTD					+ " " + 
					twoYearYTD					+ " " +
					growthMTD					+ " " +
					growthYTD;
				
	}
	
    @Override
    public int compareTo(SalesGrowth s) {
        return product.compareTo(s.getProduct());
    }
    
    @Override
    public boolean equals(Object aSalesGrowth) {
        SalesGrowth s = (SalesGrowth) aSalesGrowth;
        return getProduct().equals(s.getProduct());
    }
    
    @Override
    public int hashCode() {
        return product.hashCode();
    }

}
