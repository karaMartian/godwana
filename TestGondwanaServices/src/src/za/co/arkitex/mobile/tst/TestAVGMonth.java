package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.growth.Average3Month;
import za.co.arkitex.mobile.domain.growth.BrandConstants;
import za.co.arkitex.mobile.domain.growth.ProcessAvg;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;

public class TestAVGMonth {

	public static void main(String[] args) {
		Average3Month avg = new Average3Month(1603605.64, 2095011.52);
		System.out.println(avg.calculate());
		System.out.println(avg);
		
//		for (SalesGrowth s : ProcessAvg.process(BrandConstants.getProductsSalesGrowth())) {
//			System.out.println(s);
//		}
		
		
	}

}
