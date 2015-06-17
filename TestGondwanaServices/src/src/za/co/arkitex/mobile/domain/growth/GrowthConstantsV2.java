package za.co.arkitex.mobile.domain.growth;

import za.co.arkitex.mobile.domain.MonthHelper;
import za.co.arkitex.mobile.domain.QuarterHelper;
import za.co.arkitex.mobile.domain.SalesGrowthFactory;
import za.co.arkitex.mobile.domain.YearFilter;

public class GrowthConstantsV2 {

	
	private static GrowthLabelName growthLabelName;

	public static GrowthLabelName getGrowthLabelName() {
		return growthLabelName;
	}



	public static String getDefaultSQL(String date, String brick) {
		String sql = "";
		sql += " SELECT  DISTINCT "; // 1st QUERY
		sql += " 	b.Brand, ";  
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";       
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// default year 
		String tempDefaultYear = "dec " + date;
		sql += " 	d.Comm_Month = '"+ tempDefaultYear + "' "; 
//		System.out.println("MTD Default :"  + tempDefaultYear);
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
//		sql += " c.Brick = '"+ brick +  "' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; // 2nd QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM "; 
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";      
		// use factory to get previous year
		SalesGrowthFactory factory = new SalesGrowthFactory();
		String prevcal = factory.calcPreviousYear(date);
		String tempPrevYear = "dec " + prevcal;
//		sql += " 	d.Comm_Month = 'Dec 2012' "; 
		sql += " 	d.Comm_Month = '" + tempPrevYear + "' ";
//		System.out.println("MTD DEC prev " +  tempPrevYear);
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; // 3rd QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM (SalesValue) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";     
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// use factory to get prev mtd month
		YearFilter year = new YearFilter();
		year.filter(date);
		String tempPrevMonth = year.getPreviousMonthMTD(tempDefaultYear);
//		sql += " 	d.Comm_Month = 'Nov 2013' "; 
		sql += " 	d.Comm_Month = '" + tempPrevMonth + "' "; 
//		System.out.println("MTD Prev month: " + tempPrevMonth);
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT    DISTINCT "; // 4th QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM (SalesValue) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";            
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d "; 
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";       
		// Default year
		sql += " 	d.Comm_Year = '" + date + "' "; 
//		System.out.println("Default YTD " + date);
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT    DISTINCT "; // 5th QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";           
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE) = d.Date ";
		sql += " WHERE ";       
		// Previous year
		SalesGrowthFactory factory2 = new SalesGrowthFactory();
		String tempPrevYTDYear = factory2.calcPreviousYear(date);
//		sql += " 	d.Comm_Year = '2012' ";
		sql += " 	d.Comm_Year = '" + tempPrevYTDYear + "' ";	
//		System.out.println("Prev YTD " + tempPrevYTDYear);
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		// lets create an object for our label
		growthLabelName = new GrowthLabelName();
		growthLabelName.setMtdDefault(tempDefaultYear);
		growthLabelName.setMtdPrevious(tempPrevYear);
		growthLabelName.setPreviousMonthMTD(tempPrevMonth);
		growthLabelName.setYtdDefault(date);
		growthLabelName.setYtdPrevious(tempPrevYTDYear);
		
		return sql;
		

	}
	

	
	// Get Sales Growth for quarter
	public static String getQuarterSQL(String date, String brick){
		
		String sql = "";
		sql += " SELECT  DISTINCT "; // 1st QUERY
		sql += " 	b.Brand, ";  
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";       
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// default year 
		QuarterHelper qHelper  = new QuarterHelper();
		qHelper.calculatePreviousMonth(date);
		System.out.println("Last Month of Quarter : " + qHelper.getCurrentMonth());
		sql += " 	d.Comm_Month = '" + qHelper.getCurrentMonth()  + "'"; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
//		sql += " c.Brick = '"+ brick +  "' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		 // 2nd QUERY
		sql += " UNION ";
		sql += " SELECT   DISTINCT ";
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM "; 
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";      
		// use factory to get previous year
		
		SalesGrowthFactory factory = new SalesGrowthFactory();		
		String prevMtd = qHelper.getCurrentMonth().substring(0, 3) + " " + factory.calcPreviousYear(date.substring(3, 7));
		System.out.println("Prev Year Mtd " + prevMtd);		
		sql += " 	d.Comm_Month = '"+ prevMtd + "' "; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		// 3rd QUERY
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; 
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM (SalesValue) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";     
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";    
		// previous month MTD
		String prevMtdMonth = qHelper.getPreviousMonth().substring(0, 3) + " " + date.substring(3, 7);
		System.out.println("Previous Month MTD " + prevMtdMonth);
		sql += " 	d.Comm_Month = '" + prevMtdMonth + "'"; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		
		// 4th QUERY
		sql += " SELECT    DISTINCT "; 
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM (SalesValue) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";            
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d "; 
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";       
		// Default year
		sql += " 	d.Comm_Year = '" + date.substring(3, 7) + "'";
		System.out.println("Default Year " + date.substring(3, 7));
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		
		// 5th QUERY
		sql += " SELECT    DISTINCT "; 
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";           
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE) = d.Date ";
		sql += " WHERE ";       
		// Previous year
	
		sql += " d.Comm_Year = '" + factory.calcPreviousYear(date.substring(3, 7))  + "'";
		System.out.println("Previous Year YTD " + factory.calcPreviousYear(date.substring(3, 7)));
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		System.out.println("Quarter SQL: " + sql);
		
		// lets create an object for our label
		growthLabelName = new GrowthLabelName();
		growthLabelName.setMtdDefault(qHelper.getCurrentMonth());
		growthLabelName.setMtdPrevious(prevMtd);
		growthLabelName.setPreviousMonthMTD(prevMtdMonth);
		growthLabelName.setYtdDefault(date.substring(3, 7));
		growthLabelName.setYtdPrevious(factory.calcPreviousYear(date.substring(3, 7)));

		return sql;
		
	}

	
	// get Sales growth for month
	// todo: refactor 
	public static String getMonthSQL(String date, String brick){
		
		String sql = "";
		sql += " SELECT  DISTINCT "; // 1st QUERY
		sql += " 	b.Brand, ";  
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";       
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// default year 
		System.out.println("Default Month " + date);
		
		sql += " 	d.Comm_Month = '" + date  + "'"; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
//		sql += " c.Brick = '"+ brick +  "' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		 // 2nd QUERY
		sql += " UNION ";
		sql += " SELECT   DISTINCT ";
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM "; 
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";      
		// use factory to get previous year

		
		SalesGrowthFactory factory = new SalesGrowthFactory();		
		String prevMtd = date.substring(0, 3) + " " + factory.calcPreviousYear(date.substring(4, 8));
		System.out.println("Prev MTD Year " + prevMtd);
		
		sql += " 	d.Comm_Month = '"+ prevMtd + "' "; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		// 3rd QUERY
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; 
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM (SalesValue) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";     
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";    
		// previous month MTD
		MonthHelper qHelper  = new MonthHelper();
		qHelper.calculatePreviousMonth(date);
		String prevMtdMonth = qHelper.getPreviousMonth().substring(0, 3) + " " + date.substring(4, 8);
		System.out.println("Previous Month MTD " + prevMtdMonth);
		
		sql += " 	d.Comm_Month = '" + prevMtdMonth + "'"; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		
		// 4th QUERY
		sql += " SELECT    DISTINCT "; 
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM (SalesValue) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";            
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d "; 
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";       
		// Default year
		sql += " 	d.Comm_Year = '" + date.substring(4, 8) + "'";
		System.out.println("Default Year " + date.substring(4,8));
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		
		// 5th QUERY
		sql += " SELECT    DISTINCT "; 
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";           
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE) = d.Date ";
		sql += " WHERE ";       
		// Previous year
	
		sql += " d.Comm_Year = '" + factory.calcPreviousYear(date.substring(4, 8))  + "'";
		System.out.println("Previous Year YTD " + factory.calcPreviousYear(date.substring(4, 8)));
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		System.out.println("Month SQL: " + sql);
		
		// lets create an object for our label
		growthLabelName = new GrowthLabelName();
		growthLabelName.setMtdDefault(date);
		growthLabelName.setMtdPrevious(prevMtd);
		growthLabelName.setPreviousMonthMTD(prevMtdMonth);
		growthLabelName.setYtdDefault(date.substring(4,8));
		growthLabelName.setYtdPrevious(factory.calcPreviousYear(date.substring(4, 8)));

		return sql;
	}

	
	public static String getProductSQL(String date, String product, String brick){
		String sql = "";
		sql += " SELECT  DISTINCT "; // 1st QUERY
		sql += " 	b.Brand, ";  
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";       
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// default year 
		String tempDefaultYear = "dec " + date;
		sql += " 	d.Comm_Month = '"+ tempDefaultYear + "' "; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
//		sql += " c.Brick = '"+ brick +  "' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; // 2nd QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM "; 
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";      
		// use factory to get previous year
		SalesGrowthFactory factory = new SalesGrowthFactory();
		String prevcal = factory.calcPreviousYear(date);
		String tempPrevYear = "dec " + prevcal;
//		sql += " 	d.Comm_Month = 'Dec 2012' "; 
		sql += " 	d.Comm_Month = '" + tempPrevYear + "' ";
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; // 3rd QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM (SalesValue) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";     
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// use factory to get prev mtd month
		YearFilter year = new YearFilter();
		year.filter(date);
		String tempPrevMonth = year.getPreviousMonthMTD(tempDefaultYear);
//		sql += " 	d.Comm_Month = 'Nov 2013' "; 
		sql += " 	d.Comm_Month = '" + tempPrevMonth + "' "; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT    DISTINCT "; // 4th QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM (SalesValue) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";            
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d "; 
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";       
		// Default year
		sql += " 	d.Comm_Year = '" + date + "' "; 
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT    DISTINCT "; // 5th QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";           
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE) = d.Date ";
		sql += " WHERE ";       
		// Previous year
		SalesGrowthFactory factory2 = new SalesGrowthFactory();
		String tempPrevYTDYear = factory2.calcPreviousYear(date);
//		sql += " 	d.Comm_Year = '2012' ";
		sql += " 	d.Comm_Year = '" + tempPrevYTDYear + "' ";	
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		
		// lets create an object for our label
		growthLabelName = new GrowthLabelName();
		growthLabelName.setMtdDefault(tempDefaultYear);
		growthLabelName.setMtdPrevious(tempPrevYear);
		growthLabelName.setPreviousMonthMTD(tempPrevMonth);
		growthLabelName.setYtdDefault(date);
		growthLabelName.setYtdPrevious(tempPrevYTDYear);
		
		
		return sql;
		
	}

	public static String getProductListSQL(String date, String product, String brick){
		String sql = "";
		sql += " SELECT  DISTINCT "; // 1st QUERY
		sql += " 	b.Brand, ";  
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";       
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// default year 
		String tempDefaultYear = "dec " + date;
		sql += " 	d.Comm_Month = '"+ tempDefaultYear + "' "; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
//		sql += " c.Brick = '"+ brick +  "' ";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; // 2nd QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM "; 
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";      
		// use factory to get previous year
		SalesGrowthFactory factory = new SalesGrowthFactory();
		String prevcal = factory.calcPreviousYear(date);
		String tempPrevYear = "dec " + prevcal;
//		sql += " 	d.Comm_Month = 'Dec 2012' "; 
		sql += " 	d.Comm_Month = '" + tempPrevYear + "' ";
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT   DISTINCT "; // 3rd QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM (SalesValue) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";     
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";     
		// use factory to get prev mtd month
		YearFilter year = new YearFilter();
		year.filter(date);
		String tempPrevMonth = year.getPreviousMonthMTD(tempDefaultYear);
//		sql += " 	d.Comm_Month = 'Nov 2013' "; 
		sql += " 	d.Comm_Month = '" + tempPrevMonth + "' "; 
		sql += " AND ";
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT    DISTINCT "; // 4th QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM (SalesValue) AS 'YTD_DEFAULT', ";
		sql += " 	SUM(0) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";            
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d "; 
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE)   = d.Date ";
		sql += " WHERE ";       
		// Default year
		sql += " 	d.Comm_Year = '" + date + "' "; 
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		sql += " UNION ";
		sql += " SELECT    DISTINCT "; // 5th QUERY
		sql += " 	b.Brand, ";
		sql += " 	SUM(0) AS 'MTD_DEC_DEFAULT', ";
		sql += " 	SUM(0) AS 'MTD_DEC_PREVIOUS', ";
		sql += " 	SUM(0) AS 'MTD_PREVIOUS_MONTH', ";
		sql += " 	SUM(0) AS 'YTD_DEFAULT', ";
		sql += " 	SUM (SalesValue) AS 'YTD_PREVIOUS' ";
		sql += " FROM ";           
		sql += " 	vw_CUBE_FACT_TT_Transactions a ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Products b ";
		sql += " ON ";
		sql += " 	a.ProductCode = b.ProductCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Customers c ";
		sql += " ON ";
		sql += " 	a.CustomerCode = c.CustomerCode ";
		sql += " INNER JOIN ";
		sql += " 	vw_CUBE_Times d ";
		sql += " ON ";
		sql += " 	CAST (a.TransactionDate AS DATE) = d.Date ";
		sql += " WHERE ";       
		// Previous year
		SalesGrowthFactory factory2 = new SalesGrowthFactory();
		String tempPrevYTDYear = factory2.calcPreviousYear(date);
//		sql += " 	d.Comm_Year = '2012' ";
		sql += " 	d.Comm_Year = '" + tempPrevYTDYear + "' ";	
		sql += " AND "; 
		sql += " 	c.Brick = 'LEA GLEN +S - 4924' ";
		sql += " AND ";
		sql += " 	b.Brand = '" + product + "'";
		sql += " GROUP BY ";
		sql += " 	b.Brand ";
		
		
		// lets create an object for our label
		growthLabelName = new GrowthLabelName();
		growthLabelName.setMtdDefault(tempDefaultYear);
		growthLabelName.setMtdPrevious(tempPrevYear);
		growthLabelName.setPreviousMonthMTD(tempPrevMonth);
		growthLabelName.setYtdDefault(date);
		growthLabelName.setYtdPrevious(tempPrevYTDYear);
		
		
		return sql;
		
	}

}

/*SELECT  DISTINCT
(b.Brand),  
SUM (SalesValue) AS 'MTD_DEC_DEFAULT',
SUM(0) AS 'MTD_DEC_PREVIOUS',
SUM(0) AS 'MTD_PREVIOUS_MONTH',
SUM(0) AS 'YTD_DEFAULT',
SUM(0) AS 'YTD_PREVIOUS'
FROM            
vw_CUBE_FACT_TT_Transactions a
INNER JOIN
vw_CUBE_Products b
ON 
a.ProductCode = b.ProductCode
INNER JOIN
vw_CUBE_Customers c 
ON
a.CustomerCode = c.CustomerCode
INNER JOIN
vw_CUBE_Times d 
ON
CAST (a.TransactionDate AS DATE)   = d.Date
WHERE        
d.Comm_Month = 'dec 2013'
AND 
c.Brick = 'LEA GLEN +S - 4924'
GROUP BY
b.Brand
UNION
SELECT   DISTINCT
(b.Brand),
SUM(0) AS 'MTD_DEC_DEFAULT',
SUM (SalesValue) AS 'MTD_DEC_PREVIOUS',
SUM(0) AS 'MTD_PREVIOUS_MONTH',
SUM(0) AS 'YTD_DEFAULT',
SUM(0) AS 'YTD_PREVIOUS'
FROM            
vw_CUBE_FACT_TT_Transactions a
INNER JOIN
vw_CUBE_Products b
ON 
a.ProductCode = b.ProductCode
INNER JOIN
vw_CUBE_Customers c 
ON
a.CustomerCode = c.CustomerCode
INNER JOIN
vw_CUBE_Times d 
ON
CAST (a.TransactionDate AS DATE)   = d.Date
WHERE        
d.Comm_Month = 'Dec 2012'

AND 
c.Brick = 'LEA GLEN +S - 4924'
GROUP BY
b.Brand
UNION 
SELECT   DISTINCT
(b.Brand),
SUM(0) AS 'MTD_DEC_DEFAULT',
SUM(0) AS 'MTD_DEC_PREVIOUS',
SUM (SalesValue) AS 'MTD_PREVIOUS_MONTH',
SUM(0) AS 'YTD_DEFAULT',
SUM(0) AS 'YTD_PREVIOUS'
FROM            
vw_CUBE_FACT_TT_Transactions a
INNER JOIN
vw_CUBE_Products b
ON 
a.ProductCode = b.ProductCode
INNER JOIN
vw_CUBE_Customers c 
ON
a.CustomerCode = c.CustomerCode
INNER JOIN
vw_CUBE_Times d 
ON
CAST (a.TransactionDate AS DATE)   = d.Date
WHERE        
d.Comm_Month = 'Nov 2013'
AND 
c.Brick = 'LEA GLEN +S - 4924'
GROUP BY
b.Brand
UNION
SELECT    DISTINCT
(b.Brand),
SUM(0) AS 'MTD_DEC_DEFAULT',
SUM(0) AS 'MTD_DEC_PREVIOUS',
SUM(0) AS 'MTD_PREVIOUS_MONTH',
SUM (SalesValue) AS 'YTD_DEFAULT',
SUM(0) AS 'YTD_PREVIOUS'
FROM            
vw_CUBE_FACT_TT_Transactions a
INNER JOIN
vw_CUBE_Products b
ON 
a.ProductCode = b.ProductCode
INNER JOIN
vw_CUBE_Customers c 
ON
a.CustomerCode = c.CustomerCode
INNER JOIN
vw_CUBE_Times d 
ON
CAST (a.TransactionDate AS DATE)   = d.Date
WHERE        
d.Comm_Year = '2013'
AND 
c.Brick = 'LEA GLEN +S - 4924'
GROUP BY
b.Brand
UNION
SELECT    DISTINCT
b.Brand,
SUM(0) AS 'MTD_DEC_DEFAULT',
SUM(0) AS 'MTD_DEC_PREVIOUS',
SUM(0) AS 'MTD_PREVIOUS_MONTH',
SUM(0) AS 'YTD_DEFAULT',
SUM (SalesValue) AS 'YTD_PREVIOUS'
FROM            
vw_CUBE_FACT_TT_Transactions a
INNER JOIN
vw_CUBE_Products b
ON 
a.ProductCode = b.ProductCode
INNER JOIN
vw_CUBE_Customers c 
ON
a.CustomerCode = c.CustomerCode
INNER JOIN
vw_CUBE_Times d 
ON
CAST (a.TransactionDate AS DATE)   = d.Date
WHERE        
d.Comm_Year = '2012'
AND 
c.Brick = 'LEA GLEN +S - 4924'
GROUP BY
b.Brand*/
