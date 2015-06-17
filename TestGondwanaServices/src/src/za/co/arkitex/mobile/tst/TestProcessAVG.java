package za.co.arkitex.mobile.tst;

import za.co.arkitex.mobile.domain.growth.BrandConstants;
import za.co.arkitex.mobile.domain.growth.ProcessAvg;

public class TestProcessAVG {

	public static void main(String[] args) {
		ProcessAvg.process(BrandConstants.getProductsSalesGrowth());
	}
}
