package za.co.arkitex.mobile.gondwana.db;

public class ProxyCustomer {
	
	private String brick;
	private String values;
	private String name;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	public String getBrick() {
		return brick;
	}

	public void setBrick(String brick) {
		this.brick = brick;
	}

	public String getValues() {
		return values;
	}

	public void setValues(String values) {
		this.values = values;
	}

	public String toString() {
		return name + "- " + values;
	}
}
