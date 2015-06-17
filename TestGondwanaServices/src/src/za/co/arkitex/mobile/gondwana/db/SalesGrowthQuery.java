package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import za.co.arkitex.mobile.domain.growth.GrowthConstants;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;



public class SalesGrowthQuery {

	public SalesGrowth[] queryDefault(String date, String brick) {
		
		Connection conn = DBAdapter.getConnection();
		String sql = GrowthConstants.getDefaultSQL(date, brick);
		
//		System.out.println(sql);
		
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));	
				model.setPreviousYTD(rs.getString("YTD 2013"));
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				growthList.add(model);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
		System.out.println(growthList);
		return sg;
	}
	
	public SalesGrowth[] queryDefaultWithNappi() {
		
		Connection conn = DBAdapter.getConnection();
		String sql = GrowthConstants.getDefaultSQLWithNappi();
		
//		System.out.println(sql);
		
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));

				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));	
				model.setPreviousYTD(rs.getString("YTD 2013"));
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				
				growthList.add(model);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
		System.out.println(growthList);
		return sg;
	}

	public SalesGrowth[] queryDefaultWithOutRegion() {
		
		Connection conn = DBAdapter.getConnection();
		String sql = GrowthConstants.getDefaultSQLWithOutRegion();
		
//		System.out.println(sql);
		
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
		
				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));	
				model.setPreviousYTD(rs.getString("YTD 2013"));
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				
				growthList.add(model);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
		System.out.println(growthList);
		return sg;
	}


	public SalesGrowth[] queryPreferential() {
		
		Connection conn = DBAdapter.getConnection();
		String sql = GrowthConstants.getPreferentialSQL();
		
//		System.out.println(sql);
		
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();
//		HashMap<String, SalesGrowth> growthMap = new HashMap<String, SalesGrowth>();
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

	        SalesGrowth model = new SalesGrowth();
	        
			while (rs.next()) {
				
				model.setProduct(rs.getString("Brand"));
				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));	
				model.setPreviousYTD(rs.getString("YTD 2013"));
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				
		//		growthMap.put(rs.getString("Brand"), model);
				
				growthList.add(model);
						
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
		System.out.println(growthList);
//		System.out.println(growthMap);
		
		
		return sg;
	}


	public SalesGrowth[] query(String repId) {
		
		Connection conn = DBAdapter.getConnection();
		String sql = GrowthConstants.getRepSalesGrowthSQL(repId);
		
//		System.out.println(sql);
		
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
		
				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));	
				model.setPreviousYTD(rs.getString("YTD 2013"));
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				
				growthList.add(model);				
			}
		} catch (SQLException sqlex) {
			sqlex.printStackTrace();
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
		System.out.println(growthList);
		return sg;
	}
	
	public SalesGrowth[] queryProduct(String product) {
		Connection conn = DBAdapter.getConnection();
		String sql = GrowthConstants.getProductSalesGrowthSQL(product);
		
//		System.out.println(sql);
		
		ArrayList<SalesGrowth> growthList = new ArrayList<SalesGrowth>();

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				SalesGrowth model = new SalesGrowth();
				model.setProduct(rs.getString("Brand"));
				
				model.setOneYearBackMTD(rs.getString("MTD Dec 2013"));
				model.setTwoYearBackMTD(rs.getString("MTD Dec 2012"));
				model.setPreviousYearMonthMTD(rs.getString("MTD Nov 2013"));	
				model.setPreviousYTD(rs.getString("YTD 2013"));
				model.setTwoYearYTD(rs.getString("YTD 2012"));
				
				growthList.add(model);				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 

		SalesGrowth[] sg = new SalesGrowth[growthList.size()];
		sg = growthList.toArray(sg);
		
		System.out.println(growthList);
		return sg;

	}

	
}


