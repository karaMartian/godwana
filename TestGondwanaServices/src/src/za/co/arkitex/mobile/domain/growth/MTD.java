package za.co.arkitex.mobile.domain.growth;

public class MTD {

	private String mtd;
//	private double value;
	private String salesValue;
	
//	public MTD(String mtd, double value) {
//		this.mtd = mtd;
//		this.value = value;
//	}
//	
	public MTD(String mtd, String salesValue) {
		this.mtd = mtd;
		this.salesValue = salesValue;
	}
	
	public MTD(){}

	public String getMtd() {
		return mtd;
	}

	public void setMtd(String mtd) {
		this.mtd = mtd;
	}

//	public double getValue() {
//		return value;
//	}
//
//	public void setValue(double value) {
//		this.value = value;
//	}
	


	public void setSalesValue(String salesValue) {
		this.salesValue = salesValue;
	}

	public String toString() {
		
		return mtd + " " + salesValue;
	}
	
}
