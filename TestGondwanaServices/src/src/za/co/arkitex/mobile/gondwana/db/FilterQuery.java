package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class FilterQuery {

	// filter by  month
	public String[] filerByYear() {

		String sql = " SELECT Distinct Comm_Year FROM vw_CUBE_Times ";
		String[] defaultvalues = new String [0];

		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Comm_Year"));
				
			}

			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;
	}
	

	// filter by  month
	public String[] filerByMonth() {

		String sql = " SELECT Distinct Comm_Month  FROM vw_CUBE_Times ";
		String[] defaultvalues = new String [0];

		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Comm_Month"));
				
			}
			
			
			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;
	}
	
	
	public String[] refinedMonthFilter(String year) {
	
		ArrayList<String> monthList = new ArrayList<String>();
		monthList.add("Jan " + year);
		monthList.add("Feb " + year);
		monthList.add("Mar " + year);
		monthList.add("Apr " + year);
		monthList.add("May " + year);
		monthList.add("Jun " + year);
		monthList.add("Jul " + year);
		monthList.add("Aug " + year);
		monthList.add("Sep " + year);
		monthList.add("Oct " + year);
		monthList.add("Nov " + year);
		monthList.add("Dec " + year);
		
		String[] response = new String[monthList.size()];
		response = monthList.toArray(response);
		return response;
		/*	
		String sql = "SELECT Distinct Comm_Month  FROM vw_CUBE_Times WHERE Comm_Month LIKE '%"+ year +"' ";

		ArrayList<String> monthList = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();			
			ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {
				
				monthList.add(rs.getString("Comm_Month"));

			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		
	

		System.out.println(monthList);
		
		
		String[] response = new String[monthList.size()];
		response = monthList.toArray(response);
		return response;*/
		
		
		
	}
	
	// filter by  Quater
	public String[] filerByQuater() {

		String sql = " SELECT  Distinct Comm_Quarter FROM vw_CUBE_Times ORDER BY Comm_Quarter";
		String[] defaultvalues = new String [0];
		
		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Comm_Quarter"));
				
			}
			
			
			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;
	}
	
	// refined quarter
	public String[] refinedQuarterFilter(String year) {

		String sql = "SELECT  Distinct Comm_Quarter FROM vw_CUBE_Times WHERE Comm_Quarter LIKE '%" + year +"' ";
		String[] defaultvalues = new String [0];
		
		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Comm_Quarter"));
				
			}
			
			
			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;

	}
	
				// filter by Brand
	public String[] filterByBrand(String repId, String date) {

		String sql = "";
		sql += " SELECT DISTINCT ";	
		sql += " 	b.Brand ";  		
		sql += " FROM ";  		
		sql += "	vw_CUBE_FACT_TT_Transactions a "; 	
		sql += " INNER JOIN ";  		
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";  		
		sql += " 	a.ProductCode = b.ProductCode "; 	
		sql += " INNER JOIN ";  		
		sql += " 	vw_CUBE_Times c "; 	
		sql += " ON "; 		
		sql += " 	CAST (a.TransactionDate AS DATE)   = c.Date ";  	
		sql += " WHERE "; 		
		sql += "	c.Comm_Year = '"+ date + "'"; 	
		sql += " AND ";
		sql += " 	a.Rep = '"+ repId + "' "; 	
		sql += " GROUP BY "; 		
		sql += " 	c.Comm_Month, b.Brand ";
		
		String[] defaultvalues = new String [0];

		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Brand"));
				
			}
			
			
			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;
	}
	
	// filter by Rating
	public String[] filerRating() {

		String sql = "SELECT Distinct Rating  FROM vw_CUBE_Rating";
		String[] defaultvalues = new String [0];

		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Rating"));
				
			}
			
			
			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;
	}
	
	// filter by Brick
	public String[] filerBrick() {

		String sql = "SELECT Distinct Brick FROM vw_CUBE_Customers";
		String[] defaultvalues = new String [0];

		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Brick"));
				
			}
			
			
			String[] values = new String[allValues.size()];


			for(int i = 0; i < allValues.size(); i++) {
				values[i]= (String) allValues.get(i);
				
			 }

			
			return values;
		} catch (SQLException sqle) {
			sqle.printStackTrace();

		}
		return defaultvalues;
	}
	
	
	// filter by RepID
	public String[] filerRepID() {

		String sql = "SELECT DISTINCT  Rep FROM vw_CUBE_FACT_TT_Transactions";
		String[] defaultvalues = new String [0];
		ArrayList<String> allValues = new ArrayList<String>();
		try {
			Connection conn = DBAdapter.getConnection();
			Statement stmt = conn.createStatement();
			
			 ResultSet rs = stmt.executeQuery(sql);

			while (rs.next()) {

				allValues.add(rs.getString("Rep"));
							
						}
						
						
						String[] values = new String[allValues.size()];


						for(int i = 0; i < allValues.size(); i++) {
							values[i]= (String) allValues.get(i);
							
						 }

						
						return values;
					} catch (SQLException sqle) {
						sqle.printStackTrace();

					}
					return defaultvalues;
				}
}
