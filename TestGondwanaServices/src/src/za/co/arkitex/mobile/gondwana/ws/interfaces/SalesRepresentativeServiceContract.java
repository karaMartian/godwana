package za.co.arkitex.mobile.gondwana.ws.interfaces;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

import za.co.arkitex.mobile.domain.CustomerLocation;
import za.co.arkitex.mobile.domain.ProductSalesValue;
import za.co.arkitex.mobile.domain.Rep;
import za.co.arkitex.mobile.domain.SalesTrendData;
import za.co.arkitex.mobile.domain.SalesVisualizedModel;
import za.co.arkitex.mobile.domain.growth.CompiledModel;
import za.co.arkitex.mobile.domain.growth.GrowthLabelName;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;
import za.co.arkitex.mobile.gondwana.db.ProxyCustomer;
import za.co.arkitex.mobile.gondwana.db.ProxySalesGrading;

@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC) 
public interface SalesRepresentativeServiceContract {

	@WebMethod
	public boolean aunthenticate(
            @WebParam(name="imei", targetNamespace="http://mobile.arkitex.com/")
            String imei);
	
	@WebMethod 
	public Rep authorize(
			@WebParam(name="imei", targetNamespace="http://mobile.arkitex.com/")
			String imei
			);
	
	@WebMethod 
	public boolean validateUser(
			@WebParam(name="username", targetNamespace="http://mobile.arkitex.com/")
			String username,
			@WebParam(name="password", targetNamespace="http://mobile.arkitex.com/")
			String password
			);
	
	@WebMethod
	public String getRepIdForUser(
			@WebParam(name="username", targetNamespace="http://mobile.arkitex.com/")
			String username);
	
	@WebMethod
	public String[] getDateFilter(
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	
	
	@WebMethod
	public String[] getBrandsByDate(
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId, 
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	
	@WebMethod
	public  ProductSalesValue[] getSalesTrendDataByProduct(
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="product", targetNamespace="http://mobile.arkitex.com/")
			String product,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	
	// to refactor this we need good collection to hold my elements. 
	
	@WebMethod
	public SalesTrendData[] getSalesTrendData(
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	
	@WebMethod
	public SalesTrendData[] getSalesTrendDataForFilters(	
			@WebParam(name="products", targetNamespace="http://mobile.arkitex.com/")
			String products,
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	
	@WebMethod
	public ProxyCustomer[] getMyTop25Customers(			
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	
	@WebMethod
	public ProxyCustomer[] getMyTop25CustomersByBrick(
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date,
			@WebParam(name="brick", targetNamespace="http://mobile.arkitex.com/")
			String brick
			);
	
	@WebMethod
	public String[] getMyTop25CustomersBrick(
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date
			);
	
	@WebMethod
	public SalesVisualizedModel[] getMySalesVisualized(			
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="date", targetNamespace="http://mobile.arkitex.com/")
			String date);
	

	@WebMethod
	public CustomerLocation[] getCustomerLocation(
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId
			);
	
	
	@WebMethod
	public CustomerLocation[] getCustomerLocationWithRating (
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="rating", targetNamespace="http://mobile.arkitex.com/")
			String rating
			);
	
	@WebMethod
	public CustomerLocation[] getCustomerLocationWithRatingAndRange (
			@WebParam(name="repId", targetNamespace="http://mobile.arkitex.com/")
			String repId,
			@WebParam(name="rating", targetNamespace="http://mobile.arkitex.com/")
			String rating,
			@WebParam(name="range", targetNamespace="http://mobile.arkitex.com/")
			String range
			
			);

	
	@WebMethod 
	public ProxySalesGrading[] getYearlySalesGradeByProductByRating(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "rating", targetNamespace = "http://mobile.arkitex.com/") 
			String rating,
			@WebParam(name = "product", targetNamespace = "http://mobile.arkitex.com/") 
			String product
			);
	
	@WebMethod 
	public ProxySalesGrading[] getSalesGradingByYear(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date			
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByQuarter(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByMonth(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date
			);
	
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByBrickByYear(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brick", targetNamespace = "http://mobile.arkitex.com/") 
			String brick
			);
	
	@WebMethod 
	public ProxySalesGrading[] getSalesGradingByBrickByQuarter(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brick", targetNamespace = "http://mobile.arkitex.com/") 
			String brick
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByBrickByMonth(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brick", targetNamespace = "http://mobile.arkitex.com/") 
			String brick
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByYearByBrand(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brand", targetNamespace = "http://mobile.arkitex.com/") 
			String brand
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByYearByBrandForFilter(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brand", targetNamespace = "http://mobile.arkitex.com/") 
			String brand
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByQuarterByBrand(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brand", targetNamespace = "http://mobile.arkitex.com/") 
			String brand
			
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByMonthByBrand(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "brand", targetNamespace = "http://mobile.arkitex.com/") 
			String brand
			);
	
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByRatingByYear(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "rating", targetNamespace = "http://mobile.arkitex.com/") 
			String rating
			);
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByRatingByQuarter(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "rating", targetNamespace = "http://mobile.arkitex.com/") 
			String rating
			);
	
	
	@WebMethod
	public ProxySalesGrading[] getSalesGradingByRatingByMonth(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date,
			@WebParam(name = "rating", targetNamespace = "http://mobile.arkitex.com/") 
			String rating
			);
	

	
	@WebMethod
	public String[] getDBFilterForQuarter();
	
	@WebMethod 
	public String[] getRefinedQuarterFilter(
			@WebParam(name = "year", targetNamespace = "http://mobile.arkitex.com/") 
			String year);
	@WebMethod
	public String[] getDBFilterForBrand(
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date);
	
	@WebMethod
	public String[] getDBFilterForRating();
	
	@WebMethod
	public String[] getDBFilterForBrick();
	
	public String[] getDBFilterForRepId();
	
	
	@WebMethod
	public String[] getDBFilterForYear();
	
	@WebMethod
	public String[] getDBFilterForMonth();
	
	
	@WebMethod
	public String[] getRefinedMonthFilter(
			@WebParam(name = "year", targetNamespace = "http://mobile.arkitex.com/") 
			String year);
	
//	@WebMethod
//	public SalesGrowth[] getSalesGrowth();
	@WebMethod
	public CompiledModel[] getSalesGrowth(
			@WebParam(name = "year", targetNamespace = "http://mobile.arkitex.com/") 
			String date);
	
	@WebMethod
	public SalesGrowth[] getSalesGrowthWithNappi();
	
	@WebMethod
	public SalesGrowth[] getSalesGrowthWithOutRegion();
	
	@WebMethod
	public SalesGrowth[] getSalesGrowthPreferential();
	
	@WebMethod
	public SalesGrowth[] getRepSalesGrowth(			
			@WebParam(name = "repId", targetNamespace = "http://mobile.arkitex.com/") 
			String repId);
	
	
	
	@WebMethod
	public CompiledModel[] getProductSalesGrowth(			
			@WebParam(name = "product", targetNamespace = "http://mobile.arkitex.com/") 
			String product,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date);
	
	@WebMethod
	public CompiledModel[] getSalesGrowthProductList(			
			@WebParam(name = "product", targetNamespace = "http://mobile.arkitex.com/") 
			String products,
			@WebParam(name = "date", targetNamespace = "http://mobile.arkitex.com/") 
			String date);
	
	
	@WebMethod 
	public GrowthLabelName getSalesGrowthHeading();
	
	
	
}
