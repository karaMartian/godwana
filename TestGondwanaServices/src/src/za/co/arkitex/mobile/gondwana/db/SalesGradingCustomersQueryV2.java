package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

public class SalesGradingCustomersQueryV2 {
	private String productInject;

	public String getProductInject() {
		return productInject;
	}

	public void setProductInject(String productInject) {
		this.productInject = productInject;
	}
	
	public ProxySalesGrading[] getYearValues(String repId, String date) {

		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " c.Comm_Year = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";

		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();

		try {
			
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				String temp = nf.format(v);
				values.setValues(temp.replace('¤', 'R'));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];

		for(int i = 0; i < yearValues.size(); i++) {
				proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
			
		}
		
		System.out.println(proxyArray);
		
		return proxyArray;
	}
	
	public ProxySalesGrading[] getQuarterlyValues(String repId, String date) {

		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " c.Comm_Quater = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += " GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";

		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];


		for(int i = 0; i < yearValues.size(); i++) {
				proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
			
		}
		System.out.println(proxyArray);
		return proxyArray;
	}

	
	public ProxySalesGrading[] getMonthlyValues(String repId, String date) {
		
		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " c.Comm_Month = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";

		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];


		for(int i = 0; i < yearValues.size(); i++) {
				proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
			
		}
		System.out.println(proxyArray);
		return proxyArray;
	}
	
	public ProxySalesGrading[] getYearValuesByBrick(String repId, String date, String brick) {

		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating,";
		sql += "brick ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";  
		sql += " and   d.Brick = '";
		sql += brick;
		sql += "' WHERE  ";
		sql += " c.Comm_Year = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand, ";
		sql += " brick ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";

		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
	
		try {
			
			
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);
				
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];

		
		for(int i = 0; i < yearValues.size(); i++) {
				proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
			
		 }
		System.out.println(proxyArray);
		return proxyArray;
	}

	
	public ProxySalesGrading[] getQuarterlyValuesByBrick(String repId, String date, String brick) {
		
		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating,";
		sql += "brick ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " and   d.Brick = '";
		sql += brick;
		sql += "' WHERE  ";
		sql += " c.Comm_Quater = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += " GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand, ";
		sql += " brick ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";

		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
		
		try {
			
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];


		for(int i = 0; i < yearValues.size(); i++) {
				proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
			
		 }
		System.out.println(proxyArray);
		return proxyArray;
	}

	
	public ProxySalesGrading[] getMonthlyValuesByBrick(String repId, String date,  String brick) {

		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating,";
		sql += "brick ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " and   d.Brick = '";
		sql += brick;
		sql += "' WHERE  ";
		sql += " c.Comm_Month = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand, ";
		sql += " brick ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";

		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
	
		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];


		for(int i = 0; i < yearValues.size(); i++) {
				proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
			
		 }
		System.out.println(proxyArray);
		return proxyArray;
	}

	public ProxySalesGrading[] getYearValuesByBrand(String repId, String date, String brand) {

		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating,";
		sql += "brick ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  AND b.Brand='" + brand;
		sql += this.getProductInject();
		sql += "' INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " c.Comm_Year = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand, ";
		sql += " brick ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";
		
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();

		System.out.println("-->  " + sql);
		
		try {
			
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);		
			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
			ProxySalesGrading values = new ProxySalesGrading();
			Locale locSa = new Locale("za");
			NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
			float v = Float.parseFloat(rs.getString("SalesValues"));
			String temp = nf.format(v);
			values.setValues(temp.replace('¤', 'R'));
			values.setBrick(rs.getString("Brick"));
			values.setBrand(rs.getString("Brand"));
			values.setRating(rs.getString("Rating"));
			yearValues.add(values);
			
			// System.out.println(s);
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}

		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];


		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);

		}
		System.out.println(proxyArray);
		return proxyArray;
	}
	
	public ProxySalesGrading[] getQuarterlyValuesByBrand(String repId,  String date, String brand) {
		
		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating,";
		sql += "brick ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  AND b.Brand='" + brand;
		sql += "' INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " c.Comm_Year = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand, ";
		sql += " brick ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";
	
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
		
		try {
		
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrick(rs.getString("Brick"));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);
				
				// System.out.println(s);
			}
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];
		
		
		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
		
		}
		System.out.println(proxyArray);
		return proxyArray;
	}

	public ProxySalesGrading[] getMonthlyValuesByBrand(String repId, String date, String brand) {
	
		String sql = "	SELECT  ";
		sql += " ROUND( SUM(SalesValue), 0) AS 'SalesValues', ";
		sql += " b.Brand, ";
		sql += "rating,";
		sql += "brick ";
		sql += " FROM ";
		sql += " vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN  ";
		sql += " vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " a.ProductCode = b.ProductCode  AND b.Brand='" + brand;
		sql += "' INNER JOIN ";
		sql += " vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " CAST (a.TransactionDate AS DATE) = c.Date ";
		sql += " INNER JOIN ";
		sql += " vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "  a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " c.Comm_Year = '" + date + "'AND  a.Rep = '" + repId + "'";
		sql += "  GROUP BY  ";
		sql += " rating, ";
		sql += " b.Brand, ";
		sql += " brick ";
		sql += " ORDER BY  ";
		sql += " b.Brand	";
		
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
		
		try {

			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);	
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrick(rs.getString("Brick"));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);
	
			}
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];
		
		
		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
		
		}
		System.out.println(proxyArray);
		return proxyArray;
	}

	public ProxySalesGrading[] getYearValuesByRating(String repId, String date, String rating) {
		
		String sql = "	SELECT  ";
		sql += " 	ROUND( SUM(SalesValue), 0) AS 'SalesValues', "; 
		sql += " 	b.Brand, "; 
		sql += " 	rating, ";
		sql += " 	brick ";
		sql += " FROM  ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " 	a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " 	CAST (a.TransactionDate AS DATE) = c.Date  ";
		sql += " INNER JOIN ";
		sql += "   vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "    a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " 	c.Comm_Year = '" + date + "'  ";
		sql	+= " AND  ";
		sql += " 	a.Rep = '" + repId + "'  ";
		sql	+= " AND ";
		sql += " 	rating = '" + rating + "'"; 
		sql += " GROUP BY rating,	b.Brand,	brick  ORDER BY b.Brand ";
						
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();

		System.out.println(sql);
		try {	
		
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				String temp = nf.format(v);
				values.setValues(temp.replace('¤', 'R'));
				values.setBrick(rs.getString("Brick"));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				
				yearValues.add(values);
				
			}
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];
		
		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
		
		}

		System.out.println(proxyArray);
		return proxyArray;
	}


	public ProxySalesGrading[] getQuarterlyValuesByRating(String repId, String date,  String rating) {
		
		String sql = "	SELECT  ";
		sql += " 	ROUND( SUM(SalesValue), 0) AS 'SalesValues', "; 
		sql += " 	b.Brand, "; 
		sql += " 	rating, ";
		sql += " 	brick ";
		sql += " FROM  ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " 	a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " 	CAST (a.TransactionDate AS DATE) = c.Date  ";
		sql += " INNER JOIN ";
		sql += "   vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "    a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " 	c.Comm_Quater = ' " + date;
		sql += " '  AND  ";
		sql += " 	a.Rep = ' " + repId;
		sql += " '  AND ";
		sql += " 	rating = '" + rating + "'"; 
		sql += " GROUP BY rating,	b.Brand,	brick  ORDER BY b.Brand ";
		
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
		
		try {
				
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrick(rs.getString("Brick"));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);
			
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];
	
		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
		
		}
		System.out.println(proxyArray);
		return proxyArray;
	}

	public ProxySalesGrading[] getMonthlyValuesByRating(String repId, String date, String rating) {
			
		String sql = "	SELECT  ";
		sql += " 	ROUND( SUM(SalesValue), 0) AS 'SalesValues', "; 
		sql += " 	b.Brand, "; 
		sql += " 	rating, ";
		sql += " 	brick ";
		sql += " FROM  ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " 	a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " 	CAST (a.TransactionDate AS DATE) = c.Date  ";
		sql += " INNER JOIN ";
		sql += "   vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "    a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " 	c.Comm_Month = ' " + date;
		sql += " '  AND  ";
		sql += " 	a.Rep = ' " + repId;
		sql += " '  AND ";
		sql += " 	rating = '" + rating + "'"; 
		sql += " GROUP BY rating,	b.Brand,	brick  ORDER BY b.Brand ";
			
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();
	
		try {
		
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			//System.out.println(sql);
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				
				values.setValues(nf.format(v));
				values.setBrick(rs.getString("Brick"));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				yearValues.add(values);
				
				//System.out.println(s);
			}
			
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];
		
		
		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
		
		}
		System.out.println(proxyArray);
		return proxyArray;
	}

	public ProxySalesGrading[] getYearlySalesGradingByProductByRating(String repId, String date, String rating, String product) {
		
		String sql = "";
		sql += "	SELECT  ";
		sql += " 	ROUND( SUM(SalesValue), 0) AS 'SalesValues', "; 
		sql += " 	b.Brand, "; 
		sql += " 	rating, ";
		sql += " 	brick ";
		sql += " FROM  ";
		sql += " 	vw_CUBE_FACT_TT_Transactions a  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Products b  ";
		sql += " ON  ";
		sql += " 	a.ProductCode = b.ProductCode  ";
		sql += " INNER JOIN  ";
		sql += " 	vw_CUBE_Times c  ";
		sql += " ON  ";
		sql += " 	CAST (a.TransactionDate AS DATE) = c.Date  ";
		sql += " INNER JOIN ";
		sql += "   vw_CUBE_Customers d ";
		sql += " ON ";
		sql += "    a.CustomerCode = d.CustomerCode ";
		sql += " WHERE  ";
		sql += " 	c.Comm_Year = '" + date + "'  ";
		sql	+= " AND  b.Brand = '" + product + "' ";
		sql += " AND ";
		sql += " 	a.Rep = '" + repId + "'  ";
		sql	+= " AND ";
		sql += " 	rating = '" + rating + "'";
		sql += " ";
		sql += " GROUP BY rating,	b.Brand,	brick  ORDER BY b.Brand ";
						
		ArrayList<ProxySalesGrading> yearValues = new ArrayList<ProxySalesGrading>();

		System.out.println(sql);
		try {	
		
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			
			ResultSet rs = ps.executeQuery();
			
			while (rs.next()) {
				ProxySalesGrading values = new ProxySalesGrading();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("SalesValues"));
				String temp = nf.format(v);
				values.setValues(temp.replace('¤', 'R'));
				values.setBrick(rs.getString("Brick"));
				values.setBrand(rs.getString("Brand"));
				values.setRating(rs.getString("Rating"));
				
				yearValues.add(values);
				
			}
		
		} catch (SQLException sqle) {
			sqle.printStackTrace();
		
		} catch (Exception ex) {
			ex.printStackTrace();
		
		}
		
		ProxySalesGrading[] proxyArray = new ProxySalesGrading[yearValues.size()];
		
		for(int i = 0; i < yearValues.size(); i++) {
			proxyArray[i]= (ProxySalesGrading) yearValues.get(i);
		
		}

		System.out.println(proxyArray);
		return proxyArray;
	}


}
