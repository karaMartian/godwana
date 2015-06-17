package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import za.co.arkitex.mobile.domain.SalesTrendData;

public class AggregatedSalesValueQueryV2 {
	private String repId;
	private String date;
	private String productInject;
	
	// have to refactor 
	private ArrayList<String> salesList;
	private ArrayList<String> productList;
	private ArrayList<String> commList;
	
	
	public ArrayList<SalesTrendData> queryCommMonth(String repId, String date){
		
		String sql = "";
		sql += " SELECT ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " 	c.Comm_Month, ";
		sql += " b.Brand ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN";
		sql += "  vw_CUBE_Products b ";
		sql += " ON ";
		sql += " a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c ";
		sql += " ON ";
		sql += " CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " c.Comm_Month = '"+ date + "'";
		sql += this.getProductInject();
		sql += " ) AND ";
		sql += " a.Rep = '" + repId + "' ";
		sql += " GROUP BY";
		sql += " c.Comm_Month, b.Brand ";
		
		Connection conn = DBAdapter.getConnection();
		ArrayList<SalesTrendData>  data = new ArrayList<SalesTrendData>();
		
		System.out.println("Month Filter: ->" + sql);
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
			String brandName = "";
			int i = 0;
			int j = 0;
			ArrayList<Double> monthlySalesValues = new ArrayList<Double>();
			while (rs.next()) {
				if (brandName.equalsIgnoreCase("")){
					monthlySalesValues.add(rs.getDouble("SalesValues"));
					brandName = rs.getString("Brand");
					i++;
					continue;
				}
				
				if (brandName.equalsIgnoreCase(rs.getString("Brand"))) {
					monthlySalesValues.add(rs.getDouble("SalesValues"));
					i++;
				} else{
					i = 0;	
		
					SalesTrendData salesTrendData = new SalesTrendData();
					salesTrendData.setBrandName(brandName);
					salesTrendData.setMonthlySalesValues(monthlySalesValues);
					data.add(j,salesTrendData);
					monthlySalesValues = new ArrayList<Double>();
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
					j++;
				}				
				brandName = rs.getString("Brand");		
				
			}
		
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		System.out.println(data);
		return data;
	}

	
	public ArrayList<SalesTrendData> queryCommQuarter(String repId, String date) {
		
		String sql = "";
		sql += " SELECT ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " 	c.Comm_Month, ";
		sql += " b.Brand ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN";
		sql += "  vw_CUBE_Products b ";
		sql += " ON ";
		sql += " a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c ";
		sql += " ON ";
		sql += " CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " c.Comm_Quarter = '"+ date + "'";
		sql += this.getProductInject();
		sql += " ) AND ";
		sql += " a.Rep = '" + repId + "' ";
		sql += " GROUP BY";
		sql += " c.Comm_Month, b.Brand ";
		
		Connection conn = DBAdapter.getConnection();
		
		ArrayList<SalesTrendData>  data = new ArrayList<SalesTrendData>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
			String brandName = "";

			ArrayList<Double> monthlySalesValues = new ArrayList<Double>();
			while (rs.next()) {
				if (brandName.equalsIgnoreCase("")){
					
//					monthlySalesValues.add(rs.getDouble("SalesValues"));
					brandName = rs.getString("Brand");

//					continue;
				}
				
				if (brandName.equalsIgnoreCase(rs.getString("Brand"))) {
					monthlySalesValues.add(rs.getDouble("SalesValues"));

				} else {
					SalesTrendData trends = new SalesTrendData();
					trends.setBrandName(brandName);
					trends.setMonthlySalesValues(monthlySalesValues);

					data.add(trends);
					monthlySalesValues = new ArrayList<Double>();
		
					monthlySalesValues.add(rs.getDouble("SalesValues"));

				}				
				brandName = rs.getString("Brand");		
				
			}
			
			SalesTrendData trends = new SalesTrendData();
			trends.setBrandName(brandName);
			trends.setMonthlySalesValues(monthlySalesValues);

			data.add(trends);

		
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		System.out.println(data);
		return data;

	}
	
	public ArrayList<SalesTrendData>  queryCommYear(String repId, String date){
	
		String sql = "";
		sql += " SELECT ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " CAST (c.Comm_Month AS DATE) AS 'Comm_Month', ";
		sql += " b.Brand ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN";
		sql += "  vw_CUBE_Products b ";
		sql += " ON ";
		sql += " a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c ";
		sql += " ON ";
		sql += " CAST (a.TransactionDate AS DATE)   = c.Date ";
		sql += " WHERE ";
		sql += " c.Comm_Year = '"+ date + "'";
		sql += this.getProductInject();
		sql += ") AND ";
		sql += " a.Rep = '" + repId + "' ";
		sql += " GROUP BY";
		sql += " c.Comm_Month, b.Brand ";
		sql += " ORDER BY";
		sql += " b.Brand, Comm_Month";
		
		System.out.println("Advanced SQL: " + sql);
		Connection conn = DBAdapter.getConnection();

		ArrayList<SalesTrendData>  data = new ArrayList<SalesTrendData>();
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
			String brandName = "";

			ArrayList<Double> monthlySalesValues = new ArrayList<Double>();
			while (rs.next()) {
				if (brandName.equalsIgnoreCase("")){
					
//					monthlySalesValues.add(rs.getDouble("SalesValues"));
					brandName = rs.getString("Brand");

//					continue;
				}
				
				if (brandName.equalsIgnoreCase(rs.getString("Brand"))) {
					monthlySalesValues.add(rs.getDouble("SalesValues"));

				} else {
					SalesTrendData trends = new SalesTrendData();
					trends.setBrandName(brandName);
					trends.setMonthlySalesValues(monthlySalesValues);

					data.add(trends);
					monthlySalesValues = new ArrayList<Double>();
		
					monthlySalesValues.add(rs.getDouble("SalesValues"));

				}				
				brandName = rs.getString("Brand");		
				
			}
			
			SalesTrendData trends = new SalesTrendData();
			trends.setBrandName(brandName);
			trends.setMonthlySalesValues(monthlySalesValues);

			data.add(trends);

		
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
	
		for (SalesTrendData d : data) {
			System.out.println(d);
		}
		System.out.println("Collection Length " + data.size());	
		return data;
	}

	public ArrayList<String> getSalesList() {
		return salesList;
	}

	public ArrayList<String> getProductList() {
		return productList;
	}

	public ArrayList<String> getCommList() {
		return commList;
	}

	public String getProductInject() {
		return productInject;
	}

	public void setProductInject(String productInject) {
		this.productInject = productInject;
	}
	
	

}
