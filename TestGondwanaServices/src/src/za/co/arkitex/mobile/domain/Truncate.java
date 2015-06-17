package za.co.arkitex.mobile.domain;

public class Truncate {

	
	private String point;
	private String result;
	private String endpoint;
	
	public Truncate(String point) {
		this.point = point;
	
	}
	
	public void chop() {
		result = point.substring(0, 3);
		endpoint = point.substring(4, 8);
	//	System.out.println(result);
		
	}
	
	public String getResult() {return result;}
	
	public String getEndPoint() {return endpoint;}
}
