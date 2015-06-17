package za.co.arkitex.mobile.domain.growth;

public class YTD {

	private String ytd;
//	private double value;
	private String salesValue;
	
//	public YTD(String ytd, double value) {
//		this.ytd = ytd;
//		this.value = value;
//	}
//	
	public YTD(String ytd, String salesValue) {
		this.ytd = ytd;
		this.salesValue = salesValue;
	}
	public YTD() {}

	public String getYtd() {
		return ytd;
	}

	public void setYtd(String ytd) {
		this.ytd = ytd;
	}

//	public double getValue() {
//		return value;
//	}
//
//	public void setValue(double value) {
//		this.value = value;
//	}
//	
	public String getSalesValue() {
		return salesValue;
	}

	public void setSalesValue(String salesValue) {
		this.salesValue = salesValue;
	}

	public String toString() {
		return ytd + " " + salesValue;
	}
}
