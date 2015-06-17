package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.Period;

public class Test {

	public static void main(String[] args) {
	
		Test tst = new Test();
		tst.repeat();

	}
	
	public void repeat() {
		
		Period m = Period.MONTHLY;
		Period q = Period.QUARTERLY;
		Period y = Period.YEARLY;
		
		switch(y) {
			
			case MONTHLY:
				for (int countm = 0; countm < 1; countm++) {
					System.out.println("Count month : " + countm);
				}
				break;
				
			case QUARTERLY:
				for (int countq = 0; countq < 3; countq++) {
					
					System.out.println("Count quarter: " + countq);
				}
				
				break;
				
			default:
				// YEARLY
				for (int county = 0; county < 12; county++) {
					System.out.println("Count year: " + county);
				}
		}
	}

}
