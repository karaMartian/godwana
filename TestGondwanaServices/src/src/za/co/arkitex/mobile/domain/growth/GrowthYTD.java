package za.co.arkitex.mobile.domain.growth;

public class GrowthYTD {

	private double firstParameter; // column 1
	private double secondParameter; // column 2
	private double result;
	
	public GrowthYTD(double firstParameter, double secondParameter) {
		this.firstParameter = firstParameter;
		this.secondParameter = secondParameter;
		
	}
	
	public GrowthYTD() {}

	public double getFirstParameter() {
		return firstParameter;
	}

	public void setFirstParameter(double firstParameter) {
		this.firstParameter = firstParameter;
	}

	public double getSecondParameter() {
		return secondParameter;
	}

	public void setSecondParameter(double secondParameter) {
		this.secondParameter = secondParameter;
	}
	
	public double getResult() {
		return result;
	}
	
	
	public double calculate() {
		
		result = 100 * ((firstParameter - secondParameter) / firstParameter);
		return result;
	}
	
	public String toString() {
		
		String s = String.format("%,.2f", result);
		if (s.equalsIgnoreCase("NaN")) {
			s = "0";
			return s;
		} else if (s.equalsIgnoreCase("-Infinity")) {
			s = "0";
			return s;
			
		} else {
			return s;
			
		}
 		
	}
}

// (column(6) - column(7)) / column(6) growth ytd