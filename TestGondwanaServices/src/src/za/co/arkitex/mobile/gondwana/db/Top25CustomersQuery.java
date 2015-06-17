package za.co.arkitex.mobile.gondwana.db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;


public class Top25CustomersQuery {

	private String repId;
	private String date;
	private String brick;
	
	private ArrayList<ProxyCustomer> customerValuesList;
	
	public Top25CustomersQuery(String repId, String date) {
		this.repId = repId;
		this.date = date;
		
	}
	
	public Top25CustomersQuery(String repId, String date, String brick) {
		this.repId = repId;
		this.date = date;
		this.brick = brick;
		
	}
	public ArrayList<ProxyCustomer> getCustomerValuesList() {
		return customerValuesList;
	}

	public void queryCommMonth() {
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = '" + repId + "' and tm.Comm_Month = '" + date + "'";
		sql += " GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC";
		
//		System.out.println(sql);
		customerValuesList = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
	
			while (rs.next()) {
		
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("Total_Sales"));
				String temp = nf.format(v);
				System.out.println(temp.replace('¤', 'R'));				
				System.out.println(rs.getString("CustomerName"));
				System.out.println(rs.getString("Brick"));

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}


	}
	
	public void queryCommQuarter() {
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = '" + repId + "' and tm.Comm_Quarter = '" + date + "'";
		sql += " GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC";
		
		customerValuesList = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxyCustomer values = new ProxyCustomer();
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("Total_Sales"));
				String temp = nf.format(v);
				values.setValues(temp.replace('¤', 'R'));
				values.setName(rs.getString("CustomerName"));
				values.setBrick(rs.getString("Brick"));

				customerValuesList.add(values);

			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		
	}
	
	public void queryCommYear() {
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = '" + repId + "' and tm.Comm_Year = '" + date + "'";
		sql += " GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC;";

		customerValuesList = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxyCustomer proxyCustomer = new ProxyCustomer();		
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Math.round(Float.parseFloat(rs.getString("Total_Sales")));
				String temp = nf.format(v);
				proxyCustomer.setValues(temp.replace('¤', 'R'));
				proxyCustomer.setName(rs.getString("CustomerName"));
				proxyCustomer.setBrick(rs.getString("Brick"));

				customerValuesList.add(proxyCustomer);


			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}


	}


	public void queryBrick() {
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = '" + repId + "' and tm.Comm_Year = '" + date + "' and c.Brick = '"+  brick + "'";
		sql += " GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC;";

		customerValuesList = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxyCustomer proxyCustomer = new ProxyCustomer();		
				Locale locSa = new Locale("za");
				NumberFormat nf = NumberFormat.getCurrencyInstance(locSa);
				float v = Float.parseFloat(rs.getString("Total_Sales"));
				String temp = nf.format(v);
				proxyCustomer.setValues(temp.replace('¤', 'R'));
				proxyCustomer.setName(rs.getString("CustomerName"));
				proxyCustomer.setBrick(rs.getString("Brick"));

				customerValuesList.add(proxyCustomer);


			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}


	}

	
	/*	
	public ArrayList<ProxyCustomer> getQuaterValues(String salesRepId,
			String quater) {
		// TODO Auto-generated method stub
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = " + salesRepId + " and tm.Comm_Quarter = " + quater;
		sql += "' GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC";
		
		
		ArrayList<ProxyCustomer> yearValues = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxyCustomer values = new ProxyCustomer();
				// System.out.println( rs.getString("Comm_Month"));
				double sales = Double.parseDouble(rs.getString("Total_Sales"));
				values.setValues(sales);
				values.setDescription(rs.getString("CustomerName"));
				values.setBrick(rs.getString("Brick"));
				String s = String.format("%.0f", sales);
				Integer salesValue = Integer.parseInt(s);

				yearValues.add(values);

				// System.out.println(s);
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return yearValues;

	}

	@Override
	public ArrayList<ProxyCustomer> getMonthValues(String salesRepId,
			String month) {
		// TODO Auto-generated method stub
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = '" + salesRepId + "' and tm.Comm_Month = '" + month;
		sql += "' GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC";
		
		System.out.println(sql);

		ArrayList<ProxyCustomer> yearValues = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxyCustomer values = new ProxyCustomer();
		
				double sales = Double.parseDouble(rs.getString("Total_Sales"));
				values.setValues(sales);
				values.setDescription(rs.getString("CustomerName"));
				values.setBrick(rs.getString("Brick"));
				String s = String.format("%.0f", sales);
				Integer salesValue = Integer.parseInt(s);

				yearValues.add(values);

				// System.out.println(s);
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return yearValues;
	}

	@Override
	public ArrayList<ProxyCustomer> getYearValues(String salesRepId,
			String year) {
		// TODO Auto-generated method stub
		String sql = " SELECT DISTINCT TOP 25 ";
		sql += "c.CustomerName ,";
		sql += "c.Brick, ";
		sql += "ROUND  (sum(tt.SalesValue), 0)  AS Total_Sales ";
		sql += " FROM vw_CUBE_FACT_TT_Transactions as  tt";
		sql += " INNER JOIN vw_CUBE_Times tm ";
		sql += " ON tm.Date = tt.TransactionDate ";
		sql += " INNER JOIN vw_CUBE_Customers c ";
		sql += " ON ";
		sql += "c.CustomerCode = tt.CustomerCode";
		sql += " WHERE ";
		sql += "tt.Rep = " + salesRepId + " and tm.Comm_Year = " + year;
		sql += "' GROUP BY";
		sql += " CustomerName, Brick";
		sql += " ORDER BY";
		sql += " Total_Sales DESC";

		ArrayList<ProxyCustomer> customerValuesList = new ArrayList<ProxyCustomer>();

		try {
			Connection conn = DBAdapter.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);

			ResultSet rs = ps.executeQuery();
			// System.out.println(sql);
			while (rs.next()) {
				ProxyCustomer customerValues = new ProxyCustomer();
				// System.out.println( rs.getString("Comm_Month"));
				double sales = Double.parseDouble(rs.getString("Total_Sales"));
				customerValues.setValues(sales);
				customerValues.setDescription(rs.getString("CustomerName"));
				customerValues.setBrick(rs.getString("Brick"));
				String s = String.format("%.0f", sales);
				Integer salesValue = Integer.parseInt(s);

				customerValuesList.add(customerValues);

				// System.out.println(s);
			}

		} catch (SQLException sqle) {
			sqle.printStackTrace();

		} catch (Exception ex) {
			ex.printStackTrace();

		}

		return customerValuesList;
	}
*/
}