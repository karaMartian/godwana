package za.co.arkitex.mobile.domain;

public class Concatenate {

	private String firstPoint;
	private String endPoint;
	private String result;
	
	public Concatenate(String firstPoint, String endPoint) {
		this.firstPoint = firstPoint;
		this.endPoint = endPoint;
		process();
	}
	
	public void process() {
		result = firstPoint + " " + endPoint;
//		System.out.println(result);
	}
	
	public String getResult() {return result;}
	
}
