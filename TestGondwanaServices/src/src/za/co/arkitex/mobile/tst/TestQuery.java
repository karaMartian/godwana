package za.co.arkitex.mobile.tst;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import za.co.arkitex.mobile.gondwana.db.DBAdapter;

public class TestQuery {

	public static void main(String[] args) {
		TestQuery tq = new TestQuery();
		tq.testBrandsQuery();
//		tq.testSalesValueQuery();
	}
	
	public void testBrandsQuery() {
		Connection conn = DBAdapter.getConnection();
		
		// get brand
/*		SELECT distinct
		 b.Brand
		FROM 
			vw_CUBE_FACT_TT_Transactions a
		INNER JOIN 
		    vw_CUBE_Products b
		ON 
		    a.ProductCode = b.ProductCode
		WHERE 
			a.TransactionDate >= '2013-01-26'		
		AND
			a.TransactionDate <= '2013-06-25'
		AND 
			a.Rep = '0008'*/
		
		String sql = "";
		sql += " SELECT distinct ";
		sql += " 	b.Brand ";
		sql += " FROM ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " WHERE ";
		sql += " 	a.TransactionDate >= '2013-01-26' ";
		sql += " AND ";
		sql += " 	a.TransactionDate <= '2013-06-25' ";
		sql += " AND ";
		sql += " 	a.Rep = '0008' ";
		
		ArrayList<String> brandsList = new ArrayList<String>();
		
		try {
			Statement stmt = conn.createStatement();
//			System.out.println(sql);
			
			ResultSet rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				brandsList.add(rs.getString("Brand"));
			//	System.out.println(rs.getString("Brand"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} /*finally {
			try {
				stmt.close();
				rs.close();
				
			} catch (SQLException sqlex) {
				sqlex.printStackTrace();
			}
		}*/
		System.out.println(brandsList);		
	}
	
	public void testSalesValueQuery() {
		
		Connection conn = DBAdapter.getConnection();
		 
	    String query = "SELECT ROUND(SUM(SalesValue), 0) AS 'SalesValue' "
	    		+ 		"FROM vw_CUBE_FACT_TT_Transactions a"
	    		+		"  INNER JOIN "
	    		+		"vw_CUBE_Products b "
	    		+		"ON "
	            +		" a.ProductCode = b.ProductCode "
	            +		" WHERE a.TransactionDate >= '2011-12-29' "
	    		+		" AND "
	    		+		" a.TransactionDate <= '2012-01-25' "
	    		+		" AND "
	    		+		" a.Rep = '0008' "
	    		+		" AND "
	    		+		" b.Brand = 'Product 6' ";
		    
		try {
			Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(query);
	        while(rs.next()) {

	        	System.out.print(rs.getString("SalesValue") + "  ");
	        	System.out.println();
	        }
	
		} catch (SQLException sqle) {
			sqle.printStackTrace();
	  
	                   
		} catch (Exception ex) {
			ex.printStackTrace();
	                  	
		}		
	}
}
