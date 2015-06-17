package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import za.co.arkitex.mobile.domain.growth.GrowthConstantsV2;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;

public class SalesGrowthQueryV2 {


	private ArrayList<SalesGrowth> growthList;
	
	
	public ArrayList<SalesGrowth> getGrowthList() {
		return growthList;
	}

	public SalesGrowth[] queryDefault(String date, String brick) {
		
		Connection conn = DBAdapter.getConnection();
		GrowthConstantsV2 growthQuery = new GrowthConstantsV2();
		String sql = growthQuery.getDefaultSQL(date, brick);
		
//		System.out.println(sql);
		
		growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
			
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD_DEC_DEFAULT"));
				model.setTwoYearBackMTD(rs.getString("MTD_DEC_PREVIOUS"));
				model.setPreviousYearMonthMTD(rs.getString("MTD_PREVIOUS_MONTH"));	
				model.setPreviousYTD(rs.getString("YTD_DEFAULT"));
				model.setTwoYearYTD(rs.getString("YTD_PREVIOUS"));
				growthList.add(model);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
	//	System.out.println(growthList);
		return sg;
	}

	
	// quarter query
	public SalesGrowth[] queryQuarter(String date, String brick) {
		
		Connection conn = DBAdapter.getConnection();
		GrowthConstantsV2 growthQuery = new GrowthConstantsV2(); 
		String sql = growthQuery.getQuarterSQL(date, brick);
		
//		System.out.println(sql);
		
		growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD_DEC_DEFAULT"));
				model.setTwoYearBackMTD(rs.getString("MTD_DEC_PREVIOUS"));
				model.setPreviousYearMonthMTD(rs.getString("MTD_PREVIOUS_MONTH"));	
				model.setPreviousYTD(rs.getString("YTD_DEFAULT"));
				model.setTwoYearYTD(rs.getString("YTD_PREVIOUS"));
				growthList.add(model);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
	//	System.out.println(growthList);
		return sg;
	}
	
	
	// month query
	public SalesGrowth[] queryMonth(String date, String brick) {
		
		Connection conn = DBAdapter.getConnection();
		GrowthConstantsV2 growthQuery = new GrowthConstantsV2();
		String sql = growthQuery.getMonthSQL(date, brick);
		
		System.out.println(sql);
		
		growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD_DEC_DEFAULT"));
				model.setTwoYearBackMTD(rs.getString("MTD_DEC_PREVIOUS"));
				model.setPreviousYearMonthMTD(rs.getString("MTD_PREVIOUS_MONTH"));	
				model.setPreviousYTD(rs.getString("YTD_DEFAULT"));
				model.setTwoYearYTD(rs.getString("YTD_PREVIOUS"));
				growthList.add(model);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
	//	System.out.println(growthList);
		return sg;
	}

	public SalesGrowth[] queryProduct(String date, String product, String brick) {
		
		Connection conn = DBAdapter.getConnection();
		GrowthConstantsV2 growthQuery = new GrowthConstantsV2();
		String sql = growthQuery.getProductSQL(date, product, brick);
		
		System.out.println(sql);
		
		growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD_DEC_DEFAULT"));
				model.setTwoYearBackMTD(rs.getString("MTD_DEC_PREVIOUS"));
				model.setPreviousYearMonthMTD(rs.getString("MTD_PREVIOUS_MONTH"));	
				model.setPreviousYTD(rs.getString("YTD_DEFAULT"));
				model.setTwoYearYTD(rs.getString("YTD_PREVIOUS"));
				growthList.add(model);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
	//	System.out.println(growthList);
		return sg;
	}
	
	public SalesGrowth[] queryProductList(String date, String product, String brick) {
		
		Connection conn = DBAdapter.getConnection();
		GrowthConstantsV2 growthQuery = new GrowthConstantsV2();
		String sql = growthQuery.getProductListSQL(date, product, brick);
		
		System.out.println(sql);
		
		growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD_DEC_DEFAULT"));
				model.setTwoYearBackMTD(rs.getString("MTD_DEC_PREVIOUS"));
				model.setPreviousYearMonthMTD(rs.getString("MTD_PREVIOUS_MONTH"));	
				model.setPreviousYTD(rs.getString("YTD_DEFAULT"));
				model.setTwoYearYTD(rs.getString("YTD_PREVIOUS"));
				growthList.add(model);
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
	//	System.out.println(growthList);
		return sg;
	}

}
