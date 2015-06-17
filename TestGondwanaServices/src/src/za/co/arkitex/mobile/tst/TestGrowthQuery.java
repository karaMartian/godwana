package za.co.arkitex.mobile.tst;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import za.co.arkitex.mobile.domain.growth.GrowthConstants;
import za.co.arkitex.mobile.domain.growth.MashBrands;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;
import za.co.arkitex.mobile.gondwana.db.DBAdapter;

public class TestGrowthQuery {
	
	public void queryPreferential() {
		
		Connection conn = DBAdapter.getConnection();
		//String sql = GrowthConstants.getPreferentialSQL();
		 
		String sql = GrowthConstants.getDefaultSQL("2013", "LEA GLEN +S - 4924");
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
	        SalesGrowth model = null;
			while (rs.next()) {
			
				model = new SalesGrowth();	
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));	
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));
				model.setPreviousYTD(rs.getString("YTD 2013"));	
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				
				
		//		System.out.println(model);
				growthList.add(model);
				
			}
			
			for (int x = 0; x < growthList.size(); x++) {
				System.out.println(growthList.get(x));
			}
			
//			MashBrands mash = new MashBrands();
//			mash.crunchBrands(growthList);
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		


	}

	public static void main(String[] args) {
		new TestGrowthQuery().queryPreferential();
	}
}
