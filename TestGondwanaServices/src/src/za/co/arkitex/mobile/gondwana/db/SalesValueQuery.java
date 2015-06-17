package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import za.co.arkitex.mobile.domain.ProductSalesValue;


public class SalesValueQuery {


	private String repId;
	private String brand;
	private String date;

	private ArrayList<Integer> salesValuesList = new ArrayList<Integer>();
//	private ArrayList<String> yearList = new ArrayList<String>();
	private HashMap<String, ArrayList<Integer>> mapValues = new HashMap<String, ArrayList<Integer>>();
	
	private ArrayList<ProductSalesValue> productList;
	
	public SalesValueQuery(String repId, String brand, String date) {
		this.repId = repId;
		this.brand = brand;
		this.date = date;
	}
	public SalesValueQuery(){}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	// fetch sales value for a month
	public void queryCommMonth(){
		String sql = "";
		sql += " SELECT ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " c.Comm_Month ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b ";
		sql += " ON ";
	    sql += " a.ProductCode = b.ProductCode ";
	    sql += " INNER JOIN ";
	    sql += " vw_CUBE_Times c ";
	    sql += " ON ";
		sql += " CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " c.Comm_Month = '" + date + "' ";
		sql += " AND ";
		sql += " a.Rep = '" + repId +"' ";
		sql += " AND ";
		sql += " b.Brand = '"+ brand +"' ";
		sql += " GROUP BY ";
		sql += " c.Comm_Month ";
		
		ProductSalesValue productSalesValue = new ProductSalesValue();
		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
	        ResultSet rs = ps.executeQuery();
//	        System.out.println(sql);
	        
	        while(rs.next()) {
	     //   	System.out.println(rs.getString("Comm_Month"));
	        	double sales = Double.parseDouble(rs.getString("SalesValues"));
	        	
	        	String s = String.format("%.0f", sales);
	       // 	System.out.println(s);
	        	productSalesValue.setName(brand);
	        	productSalesValue.setMonth(rs.getString("Comm_Month"));
	        	productSalesValue.setValue(rs.getString("SalesValues"));
	        }
	
		} catch (SQLException sqle) {
			sqle.printStackTrace();
	  
	                   
		} catch (Exception ex) {
			ex.printStackTrace();
	                  	
		}		


				
	}
	
	public void queryCommQuarter() {
	
		String sql = "";
		sql += " SELECT ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " c.Comm_Month ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b ";
		sql += " ON ";
	    sql += " a.ProductCode = b.ProductCode ";
	    sql += " INNER JOIN ";
	    sql += " vw_CUBE_Times c ";
	    sql += " ON ";
		sql += " CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " c.Comm_Quarter = '" + date + "' ";
		sql += " AND ";
		sql += " a.Rep = '" + repId +"' ";
		sql += " AND ";
		sql += " b.Brand = '"+ brand +"' ";
		sql += " GROUP BY ";
		sql += " c.Comm_Month ";
	
		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
	        ResultSet rs = ps.executeQuery();
//	        System.out.println(sql);
	        ProductSalesValue productSalesValue = new ProductSalesValue();
	        while(rs.next()) {
	        	
	     //   	System.out.println( rs.getString("Comm_Month"));
	        	double sales = Double.parseDouble(rs.getString("SalesValues"));
	        	
	        	String s = String.format("%.0f", sales);
	   //     	System.out.println(s);
	        	
	        	productSalesValue.setName(brand);
	        	productSalesValue.setMonth(rs.getString("Comm_Month"));
	        	productSalesValue.setValue(rs.getString("SalesValues"));
	        }
	
		} catch (SQLException sqle) {
			sqle.printStackTrace();
	  
	                   
		} catch (Exception ex) {
			ex.printStackTrace();
	                  	
		}		
	}
	
	public ArrayList<ProductSalesValue> queryCommYear(){
		
		String sql = "";
		sql += " SELECT ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " c.Comm_Month ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b ";
		sql += " ON ";
	    sql += " a.ProductCode = b.ProductCode ";
	    sql += " INNER JOIN ";
	    sql += " vw_CUBE_Times c ";
	    sql += " ON ";
		sql += " CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " c.Comm_Year = '" + date + "' ";
		sql += " AND ";
		sql += " a.Rep = '" + repId +"' ";
		sql += " AND ";
		sql += " b.Brand = '"+ brand +"' ";
		sql += " GROUP BY ";
		sql += " c.Comm_Month ";
	
		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
	        ResultSet rs = ps.executeQuery();
	        
//	        System.out.println(sql);
	        productList = new ArrayList<ProductSalesValue>();
	        
	        while(rs.next()) {
	        	ProductSalesValue productSalesValue = new ProductSalesValue();
	        	productSalesValue.setName(brand);
	        	productSalesValue.setMonth(rs.getString("Comm_Month"));
	        	productSalesValue.setValue(rs.getString("SalesValues"));
	        	   
	        	productList.add(productSalesValue);
	        	
	        }
	
		} catch (SQLException sqle) {
			sqle.printStackTrace();
	  
	                   
		} catch (Exception ex) {
			ex.printStackTrace();
	                  	
		}		
//		addToMap();
		System.out.println(productList);
		return productList;
	}
	

	public ArrayList<Integer> getSalesValuesList() {
		return salesValuesList;
	}	
	
	public void addToMap() {
		mapValues.put(brand, getSalesValuesList());
	}

	public HashMap<String, ArrayList<Integer>> getMapValues() {
		return mapValues;
	}
}
