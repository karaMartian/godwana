package za.co.arkitex.mobile.domain;

public class ProductSalesValue {

	private String name;
	private String month;
	private String value;
	
	public ProductSalesValue(String name, String month, String value) {
		this.name = name;
		this.month = month;
		this.value = value;
	}
	public ProductSalesValue(){
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMonth() {
		return month;
	}

	public void setMonth(String month) {
		this.month = month;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public String toString() {
		return name + " " + month + " " + value; 
	}
}
