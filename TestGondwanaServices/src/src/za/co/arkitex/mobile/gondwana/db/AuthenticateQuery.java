package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import za.co.arkitex.mobile.domain.Rep;

public class AuthenticateQuery {

	private String imei;
	private boolean isVerified;
	private String repIdentification;
	private String repName;
	
	
	public String getImei() {
		return imei;
	}

	public void setImei(String imei) {
		this.imei = imei;
	}
		
	public String getRepIdentification() {
		return repIdentification;
	}

	public void setRepIdentification(String repIdentification) {
		this.repIdentification = repIdentification;
	}

	public String getRepName() {
		return repName;
	}

	public void setRepName(String repName) {
		this.repName = repName;
	}

	public boolean aunthenticate(String imei) {
		
		Connection conn = DBAdapter.getConnection();
		String sql = "";
		sql += " SELECT ";
	    sql += " 	repId, ";
		sql += " 	username ";
		sql += " FROM "; 
		sql += " 	device_owner ";
		sql += " WHERE ";
		sql += " 	IMEI = '" + imei + "'";
		
//		System.out.println(sql);
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();

           if (rs.next()){
        	   repIdentification = rs.getString("repId");
            	repName = rs.getString("username");
   
            	isVerified = true;
            	
               	System.out.println(isVerified);
//   				System.out.println(repIdentification);
//   				System.out.println(repName);
   				
               return isVerified;
           } else {
                    
        	   isVerified = false;
               System.out.println(isVerified);
               return isVerified;                   
           }

		} catch (Exception ex) {
			ex.printStackTrace();
            isVerified = false;
            System.out.println(isVerified);
            return isVerified;
		}
		
		
	}

	
	public Rep auntheticateRep(String imei) {
		
		Connection conn = DBAdapter.getConnection();
		String sql = "";
		sql += " SELECT ";
	    sql += " 	repId, ";
		sql += " 	username ";
		sql += " FROM "; 
		sql += " 	device_owner ";
		sql += " WHERE ";
		sql += " 	IMEI = '" + imei + "'";
		
//		System.out.println(sql);
		
		
		try {
			PreparedStatement ps = conn.prepareStatement(sql);
	        ResultSet rs = ps.executeQuery();
	        Rep rep = new Rep();
           if (rs.next()){
        	   rep.setId(rs.getString("repId"));
        	   rep.setName(rs.getString("username"));
   
            	isVerified = true;
            	
               	System.out.println(isVerified);
//   				System.out.println(rep);

   				
               return rep;
           } else {
                    
        	   isVerified = false;
               System.out.println(isVerified);
               return null;                   
           }

		} catch (Exception ex) {
			ex.printStackTrace();
            isVerified = false;
            System.out.println(isVerified);
            return null;
		}
				
		
	}
}
/*
SELECT
repId,
[username]
FROM 
device_owner
WHERE 
IMEI ='358904053464104'*/
