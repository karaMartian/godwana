package za.co.arkitex.mobile.tst;

public class TestConvert {

	public static void main(String[] args) {

		double d = 0.16697325121767065;
		String s = Double.toString(d);
		String s2 = s.substring(2);
		
		double d2 = Double.parseDouble(s2.substring(0, 4));
		String s3 = String.format("%.2f", d2);
		System.out.println(s3);	
		
		int x = (int) d2;
		System.out.println(x);
	}

}
