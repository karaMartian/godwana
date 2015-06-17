package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Top25CustomerBrickQuery {

	public  String[] getTop25Brick(String repId, String date) {
		
		String sql = "";
		sql += " SELECT DISTINCT TOP 25 ";
		sql += " c.Brick ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt ";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += "	INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " c.CustomerCode = tt.CustomerCode "; 
		sql += " WHERE "; 
		sql += " tt.Rep = '" + repId +"' ";
		sql += " and tm.Comm_Year = '" + date +"' ";					
		sql += " GROUP BY ";
		sql += " Brick ";
		
		
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
	
}



/*SELECT DISTINCT TOP 25
	c.Brick 
FROM vw_CUBE_FACT_TT_Transactions as  tt
	INNER JOIN vw_CUBE_Times tm
ON tm.Date = tt.TransactionDate
	INNER JOIN vw_CUBE_Customers c
ON
	c.CustomerCode = tt.CustomerCode 
WHERE 
 tt.Rep ='0008' and tm.Comm_Year='2012' 
GROUP BY
	 Brick

;*/