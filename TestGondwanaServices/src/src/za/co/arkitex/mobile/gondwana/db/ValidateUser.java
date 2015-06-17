package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ValidateUser {
	
	private boolean registered = false;
	
	public boolean verify(String username, String password) {
         String sql = "SELECT username, password ";
         sql += " FROM users WHERE username = '" + username + "'";
         sql += " AND password = '" + password + "'"; 
         
         try { 
        	Connection conn = DBAdapter.getConnection();
 			PreparedStatement ps = conn.prepareStatement(sql);

 			ResultSet rs = ps.executeQuery();

            while(rs.next()) {
                	
            	 if (rs.getString("username").equals(username) && rs.getString("password").equals(password) ) {
                     registered = true;
               //      System.out.println(registered);
            	 }
            }
            
            return registered;
         } catch (SQLException sqlex) {
             sqlex.printStackTrace();
             registered = false;
             System.out.println(registered);
             return registered;
         } catch (Exception ex) {
             ex.printStackTrace();
             registered = false;
             System.out.println(registered);
             return registered;
         }
     }

	public String getRepId(String username) {
		String sql = "SELECT repId FROM users WHERE username ='" + username + "'";
		String repId = "";
		
		try {
        	Connection conn = DBAdapter.getConnection();
 			PreparedStatement ps = conn.prepareStatement(sql);

 			ResultSet rs = ps.executeQuery();
 			
 			while(rs.next()) {
 				repId = rs.getString("repId");
 				System.out.println(repId);
 				
 			}
			
			
		} catch (SQLException sqlx) {
			sqlx.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		
		return repId;
	}
	
	
}
