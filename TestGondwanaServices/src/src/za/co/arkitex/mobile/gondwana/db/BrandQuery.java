package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

public class BrandQuery {
	
	private String date;
	private String salesRepId;
	private ArrayList<String> brandsList;
	
	public ArrayList<String> getBrandsList() {
		return brandsList;
	}

	public String getSalesRepId() {
		return salesRepId;
	}
	public void setSalesRepId(String salesRepId) {
		this.salesRepId = salesRepId;
	}
	
	
	// fetch brands for comm month
	public void queryCommMonth(String repId, String date) {
		Connection conn = DBAdapter.getConnection();
		
		String sql = "";
		sql += " SELECT DISTINCT ";
		sql += " 	b.Brand ";
		sql += " FROM ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON "; 
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times c ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " 	c.Comm_Month = '" + date + "'";
		sql += " AND ";
		sql += " a.Rep = '"+ repId +"'";
		sql += " GROUP BY ";
		sql += " c.Comm_Month, b.Brand ";
		
		brandsList = new ArrayList<String>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				brandsList.add(rs.getString("Brand"));

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
	
	// fetch brands for comm quarter
	public void queryCommQuarter(String repId, String date) {
		Connection conn = DBAdapter.getConnection();
		String sql = "";
		sql += " SELECT DISTINCT ";
		sql += " 	b.Brand ";
		sql += " FROM ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times c "; 
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";									
		sql += " 	c.Comm_Quarter = '" + date + "' ";
		sql += " AND ";
		sql += " a.Rep = '" + repId + "'";
		sql += " GROUP BY ";
		sql += " c.Comm_Month, b.Brand ";
		
		brandsList = new ArrayList<String>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				brandsList.add(rs.getString("Brand"));
			//	System.out.println(rs.getString("Brand"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
	
	
	// fetch brands for comm year
	public void queryCommYear(String repId, String date) {
		System.out.println("Date: --->  " + date);
		Connection conn = DBAdapter.getConnection();
		String sql = "";
		sql += " SELECT DISTINCT ";
		sql += " 	b.Brand ";
		sql += " 	FROM  ";
		sql += " 		vw_CUBE_FACT_TT_Transactions a ";
		sql += " 	INNER JOIN ";
		sql += " 		vw_CUBE_Products b ";
		sql += " 	ON ";
		sql += " 		a.ProductCode = b.ProductCode ";
		sql += " 	INNER JOIN ";
		sql += " 		vw_CUBE_Times c ";
		sql += " 	ON ";
		sql += " 		CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " 	WHERE ";
		sql += " 		c.Comm_Year = '" + date +"'";
		sql += " 	AND ";
		sql += " 		a.Rep = '" + repId + "'";
		sql += " 	GROUP BY ";
		sql += " 		c.Comm_Month, b.Brand ";
		
		brandsList = new ArrayList<String>();
		
		System.out.println(sql);
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
			
	        ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				brandsList.add(rs.getString("Brand"));

			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	}
}
