package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.util.ArrayList;

import za.co.arkitex.mobile.domain.CustomerLocation;

public class CustomerCoordinatesQuery {

	private String repId;
	private String rating;
	private String range;
	private ArrayList<CustomerLocation> customerList;
	
	
	public String getRepId() {
		return repId;
	}

	public void setRepId(String repId) {
		this.repId = repId;
	}


	
	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public ArrayList<CustomerLocation> getCustomerList() {
		return customerList;
	}

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public ArrayList<CustomerLocation> queryCustomerLocation(String repId) {
		Connection conn = DBAdapter.getConnection();
		
		String sql = "";
		sql +=  " SELECT Distinct TOP 25 "; 
		sql +=  " 	b.CustomerDescription,	";
		sql +=  " 	Rating ";
		sql +=  " 	,b.lat ";
		sql +=  " 	,b.long ,";
		sql +=  " 	b.Reporting_Block";
		sql +=  " FROM ";
		sql +=  " 	vw_CUBE_FACT_TT_Transactions a ";
		sql +=  " INNER JOIN ";
		sql +=  "	vw_CUBE_Customers b ";
		sql +=  " ON ";
		sql +=  "	a.CustomerCode = b.CustomerCode ";
		sql +=  " WHERE ";
		sql +=  " 	Rep = '"+ repId +"' ";		
		
//		System.out.println(sql);
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
			
			customerList = new ArrayList<CustomerLocation>();

			while (rs.next()) {
				CustomerLocation customer = new CustomerLocation();
				customer.setName(rs.getString("CustomerDescription"));
				customer.setRating(rs.getString("Rating"));
				customer.setLatitude(rs.getString("lat"));
				customer.setLongitude(rs.getString("long"));
				customer.setReportingBlock(rs.getString("Reporting_Block"));
				
				customerList.add(customer);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return customerList;
		
	}
	
	public ArrayList<CustomerLocation> queryCustomerLocation(String repId, String rate) {
		Connection conn = DBAdapter.getConnection();
		
		String sql = "";
		sql +=  " SELECT Distinct TOP 25 "; 
		sql +=  " 	b.CustomerDescription,	";
		sql +=  "	Rating ";
		sql +=  "	,b.lat ";
		sql +=  "	,b.long ";
		sql +=  " FROM ";
		sql +=  "	vw_CUBE_FACT_TT_Transactions a ";
		sql +=  " INNER JOIN ";
		sql +=  "	vw_CUBE_Customers b ";
		sql +=  " ON ";
		sql +=  " 	a.CustomerCode = b.CustomerCode ";
		sql +=  " WHERE ";
		sql +=  "	Rep = '"+ repId +"' ";		
		sql +=  " AND ";
		sql +=  "	a.Rating = '" + rate +"'";
		
		System.out.println(sql);
		
		try {
			
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
			
			customerList = new ArrayList<CustomerLocation>();

			while (rs.next()) {
				CustomerLocation customer = new CustomerLocation();
				customer.setName(rs.getString("CustomerDescription"));
				customer.setRating(rs.getString("Rating"));
				customer.setLatitude(rs.getString("lat"));
				customer.setLongitude(rs.getString("long"));
				
				customerList.add(customer);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return customerList;

	}
	
	public ArrayList<CustomerLocation> queryCustomerLocation(String repId, String rate, String range) {
		Connection conn = DBAdapter.getConnection();
		
		String sql = "";
		sql +=  "SELECT Distinct TOP "; 
		sql +=  range;
		sql +=  " b.CustomerDescription, ";
		sql +=  "Rating ";
		sql +=  ",b.lat ";
		sql +=  ",b.long ";
		sql +=  "FROM ";
		sql +=  "vw_CUBE_FACT_TT_Transactions a ";
		sql +=  "INNER JOIN ";
		sql +=  "vw_CUBE_Customers b ";
		sql +=  "ON ";
		sql +=   "a.CustomerCode = b.CustomerCode ";
		sql +=   "WHERE ";
		sql +=  "Rep = '"+ repId +"' ";		
		sql +=  "AND ";
		sql +=  "a.Rating = '" + rate +"'";
		
		System.out.println(sql);
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
			
			customerList = new ArrayList<CustomerLocation>();

			while (rs.next()) {
				CustomerLocation customer = new CustomerLocation();
				customer.setName(rs.getString("CustomerDescription"));
				customer.setRating(rs.getString("Rating"));
				customer.setLatitude(rs.getString("lat"));
				customer.setLongitude(rs.getString("long"));
				
				customerList.add(customer);
				
			}
			
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		
		return customerList;

	}
}
/*
SELECT 
	b.CustomerDescription,	
    Rating,
	b.lat,
	b.long
FROM 
	vw_CUBE_FACT_TT_Transactions a
INNER JOIN
	vw_CUBE_Customers b
ON 
	a.CustomerCode = b.CustomerCode
WHERE
	Rep = '0008'
*/
/*
SELECT TOP 100
	b.CustomerDescription,	
    Rating,
	b.lat,
	b.long
FROM 
	vw_CUBE_FACT_TT_Transactions a
INNER JOIN
	vw_CUBE_Customers b
ON 
	a.CustomerCode = b.CustomerCode
WHERE
	Rep = '0008'
*/

