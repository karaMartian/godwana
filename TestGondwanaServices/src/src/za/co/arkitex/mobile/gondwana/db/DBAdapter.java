package za.co.arkitex.mobile.gondwana.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DBAdapter {
	
	private final static Logger log = LoggerFactory.getLogger(DBAdapter.class);
	private static Connection conn = null;
	
	public static Connection getConnection() {
		Properties prop = new Properties();
		FileInputStream inputstream = null;
		 
		try {
			inputstream = new FileInputStream("config.properties");
			prop.load(inputstream);
			
			String url = prop.getProperty("dbUrl");
			String username = prop.getProperty("dbUsername");
			String pwd = prop.getProperty("dbPassword");
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
			
			if (!url.isEmpty() && !username.isEmpty() && !pwd.isEmpty()) {
				conn = DriverManager.getConnection(url,username, pwd);
				log.info("DB Connection successful..");
			}
		} catch (SQLException e) {	
			e.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if (inputstream != null) {
				try {
					inputstream.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		return conn;
	}
}

