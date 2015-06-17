package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;

import za.co.arkitex.mobile.domain.SalesTrendData;
/**
 * 
 * @author Kony
 *	This class is not really different from AggregatedSalesValueQuery except for "regex".
 */
public class FilterSalesValueQuery {
	private String repId;
	private String date;
	
	
	// have to refactor 
	private ArrayList<String> salesList;
	private ArrayList<String> productList;
	private ArrayList<String> commList;
	
	private String injectSQL; 
	
	public String getInjectSQL() {
		return injectSQL;
	}

	public void setInjectSQL(String injectSQL) {
		this.injectSQL = injectSQL;
	}

	public SalesTrendData[] queryCommMonth(String repId, String date){
		
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
		sql += " AND ";
		sql += " a.Rep = '" + repId + "' ";
		sql += " GROUP BY";
		sql += " c.Comm_Month, b.Brand ";
		
		Connection conn = DBAdapter.getConnection();
		HashMap<String, Double[]> chartDataMap = new HashMap<String,Double[]>();
		
		SalesTrendData[] data  = new SalesTrendData[10];
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
			String brandName = "";
			int i = 0;
			int j = 0;
			ArrayList<Double> monthlySalesValues = new ArrayList<Double>(); 
			
			while (rs.next()) {
				if (brandName.equalsIgnoreCase("")){
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					brandName = rs.getString("Brand");
					i++;
					continue;
				}
				
				if (brandName.equalsIgnoreCase(rs.getString("Brand"))) {
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
				} else{
					i = 0;	
			//		chartDataMap.put(brandName, monthlySalesValues);
					SalesTrendData salesTrendData = new SalesTrendData();
					salesTrendData.setBrandName(brandName);
					salesTrendData.setMonthlySalesValues(monthlySalesValues);
					data[j] = salesTrendData;
					
					monthlySalesValues = new ArrayList<Double>(); 
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
					j++;
				}				
				brandName = rs.getString("Brand");		
				
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return data;
		
	}
	
	public SalesTrendData[] queryCommQuarter(String repId, String date) {
		
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
		sql += " AND ";
		sql += " a.Rep = '" + repId + "' ";
		sql += " GROUP BY";
		sql += " c.Comm_Month, b.Brand ";
		
		Connection conn = DBAdapter.getConnection();
		
		HashMap<String, Double[]> chartDataMap = new HashMap<String,Double[]>();
		
		SalesTrendData[] data  = new SalesTrendData[10];
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
			String brandName = "";
			int i = 0;
			int j = 0;
			ArrayList<Double> monthlySalesValues = new ArrayList<Double>(); 
			
			while (rs.next()) {
				if (brandName.equalsIgnoreCase("")){
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					brandName = rs.getString("Brand");
					i++;
					continue;
				}
				
				if (brandName.equalsIgnoreCase(rs.getString("Brand"))) {
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
				} else{
					i = 0;	
			//		chartDataMap.put(brandName, monthlySalesValues);
					SalesTrendData salesTrendData = new SalesTrendData();
					salesTrendData.setBrandName(brandName);
					salesTrendData.setMonthlySalesValues(monthlySalesValues);
					data[j] = salesTrendData;
					
					monthlySalesValues = new ArrayList<Double>(); 
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
					j++;
				}				
				brandName = rs.getString("Brand");		
				
			}
				
		} catch (Exception ex) {
			ex.printStackTrace();
		} 
		return data;
	}
	
	public SalesTrendData[]  queryCommYear(String repId, String date){
	
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
		sql += " AND ";
		sql += " a.Rep = '" + repId + "' ";
//		sql += injectSQL;
		sql += " AND b.Brand = 'Product 11' OR b.Brand = 'Product 14' OR b.Brand = 'Product 28' OR b.Brand = 'Product 7' ";
		sql += " GROUP BY";
		sql += " c.Comm_Month, b.Brand ";
		sql += " ORDER BY";
		sql += " b.Brand, Comm_Month";
		
		System.out.println(sql);
		
		
		Connection conn = DBAdapter.getConnection();
//		
//		salesList = new ArrayList<String>();
//		productList = new ArrayList<String>();
//		commList = new ArrayList<String>();
		
		HashMap<String, Double[]> chartDataMap = new HashMap<String,Double[]>();
		
		SalesTrendData[] data  = new SalesTrendData[10];

		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        
			String brandName = "";
			int i = 0;
			int j = 0;
			ArrayList<Double> monthlySalesValues = new ArrayList<Double>(); 
			
			while (rs.next()) {
				if (brandName.equalsIgnoreCase("")){
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					brandName = rs.getString("Brand");
					i++;
					continue;
				}
				
				if (brandName.equalsIgnoreCase(rs.getString("Brand"))) {
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
				} else{
					i = 0;	
			//		chartDataMap.put(brandName, monthlySalesValues);
					SalesTrendData salesTrendData = new SalesTrendData();
					salesTrendData.setBrandName(brandName);
					salesTrendData.setMonthlySalesValues(monthlySalesValues);
					data[j] = salesTrendData;
					
					monthlySalesValues = new ArrayList<Double>(); 
//					monthlySalesValues[i] = rs.getDouble("SalesValues");
					monthlySalesValues.add(i, rs.getDouble("SalesValues"));
					i++;
					j++;
				}				
				brandName = rs.getString("Brand");		
				
			}

		} catch (Exception ex) {
			ex.printStackTrace();
		} 
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

}


/*SELECT 
ROUND( SUM(SalesValue), 0) AS 'SalesValues',
c.Comm_Month,
b.Brand
FROM 
vw_CUBE_FACT_TT_Transactions a
INNER JOIN 
vw_CUBE_Products b
ON 
a.ProductCode = b.ProductCode
INNER JOIN
vw_CUBE_Times c 
ON 
CAST (a.TransactionDate AS DATE)   = c.Date
WHERE 
c.Comm_Year = '2013'
AND 
a.Rep = '0008'
GROUP BY
c.Comm_Month, b.Brand
*/