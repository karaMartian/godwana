package za.co.arkitex.mobile.domain;

import java.util.ArrayList;


public class SalesTrendData {
	
	private String brandName;
//	private Double[] monthlySalesValues;
	private ArrayList<Double> monthlySalesValues;
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public ArrayList<Double> getMonthlySalesValues() {
		return monthlySalesValues;
	}
	public void setMonthlySalesValues(ArrayList<Double> monthlySalesValues) {
		this.monthlySalesValues = monthlySalesValues;
	}
	
	
	public String toString() {
//		ArrayList<Double> temp = new ArrayList<Double>();
//		for (int i = 0; i < monthlySalesValues.length; i++) {
//			temp.add(monthlySalesValues[i]);
//			
//		}
		
//		return brandName + " " + temp;
		return brandName + " " + monthlySalesValues;
	}
	
	

}
