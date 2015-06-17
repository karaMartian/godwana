package za.co.arkitex.mobile.gondwana.db;

import java.io.Serializable;

public class ProxySalesGrading implements Serializable {
	
	private String brick;
	private String values;
	private String rating;
	private String brand;
	
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
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public String toString() {
		return brand + " " + values + " " + rating;
	}
	
}
