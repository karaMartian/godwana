package za.co.arkitex.mobile.domain;

public class CustomerLocation {

	private String name;
	private String rating;
	private String latitude;
	private String longitude;
	private String reportingBlock;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	public String getReportingBlock() {
		return reportingBlock;
	}
	public void setReportingBlock(String reportingBlock) {
		this.reportingBlock = reportingBlock;
	}
	public String toString() {
		return name + " " + rating + " " + latitude + " " + longitude + " " + reportingBlock;
	}
}
