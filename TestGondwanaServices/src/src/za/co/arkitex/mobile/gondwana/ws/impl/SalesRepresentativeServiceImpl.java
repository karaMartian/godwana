package za.co.arkitex.mobile.gondwana.ws.impl;

import java.util.ArrayList;
import java.util.Date;

import javax.jws.WebResult;
import javax.jws.WebService;

import za.co.arkitex.mobile.domain.CustomerLocation;
import za.co.arkitex.mobile.domain.MonthFilter;
import za.co.arkitex.mobile.domain.ProductSalesValue;
import za.co.arkitex.mobile.domain.QuarterFilter;
import za.co.arkitex.mobile.domain.Rep;
import za.co.arkitex.mobile.domain.SalesTrendData;
import za.co.arkitex.mobile.domain.SalesVisualizedModel;
import za.co.arkitex.mobile.domain.SortMonth;
import za.co.arkitex.mobile.domain.TokenizeString;
import za.co.arkitex.mobile.domain.YearFilter;
import za.co.arkitex.mobile.domain.growth.CompiledModel;
import za.co.arkitex.mobile.domain.growth.GrowthConstantsV2;
import za.co.arkitex.mobile.domain.growth.MashBrands;
import za.co.arkitex.mobile.domain.growth.ProcessGrowthV2;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;
import za.co.arkitex.mobile.gondwana.db.AggregatedSalesValueQuery;
import za.co.arkitex.mobile.gondwana.db.AggregatedSalesValueQueryV2;
import za.co.arkitex.mobile.gondwana.db.AuthenticateQuery;
import za.co.arkitex.mobile.gondwana.db.BrandQuery;
import za.co.arkitex.mobile.gondwana.db.CustomerCoordinatesQuery;
import za.co.arkitex.mobile.gondwana.db.FilterQuery;
import za.co.arkitex.mobile.gondwana.db.ProxyCustomer;
import za.co.arkitex.mobile.gondwana.db.ProxySalesGrading;
import za.co.arkitex.mobile.gondwana.db.SalesGradingCustomersQuery;
import za.co.arkitex.mobile.gondwana.db.SalesGradingCustomersQueryV2;
import za.co.arkitex.mobile.gondwana.db.SalesGrowthQuery;
import za.co.arkitex.mobile.gondwana.db.SalesValueQuery;
import za.co.arkitex.mobile.gondwana.db.SalesVisualizedQuery;
import za.co.arkitex.mobile.gondwana.db.Top25CustomerBrickQuery;
import za.co.arkitex.mobile.gondwana.db.Top25CustomersQuery;
import za.co.arkitex.mobile.gondwana.db.ValidateUser;
import za.co.arkitex.mobile.gondwana.exceptions.WrongStringLengthException;
import za.co.arkitex.mobile.domain.growth.GrowthLabelName;
import za.co.arkitex.mobile.gondwana.ws.interfaces.SalesRepresentativeServiceContract;

@WebService(endpointInterface = "za.co.arkitex.mobile.gondwana.ws.interfaces.SalesRepresentativeServiceContract",
			name="SalesRepresentativeDataFilterService")
public class SalesRepresentativeServiceImpl implements
		SalesRepresentativeServiceContract {

	private static final CustomerLocation[] CustomerLocation = null;
	private ArrayList<String> brandList;
	private ArrayList<Integer> salesList;
	private ArrayList<CustomerLocation> customerMapList;
	
	
	@Override
	@WebResult(name="aunthenticate", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public boolean aunthenticate(String imei) {
		boolean aunthenticatated  = false;
		AuthenticateQuery query = new AuthenticateQuery();
//		query.aunthenticate("358904053464104");
		
		aunthenticatated = query.aunthenticate(imei);
		
		System.out.println(aunthenticatated);
		
		return aunthenticatated;
	}
	
	@Override
	@WebResult(name="authorize", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public Rep authorize(String imei) {
		AuthenticateQuery query = new AuthenticateQuery();
		Rep rep = query.auntheticateRep(imei);
		System.out.println(rep);
		System.out.println(new Date());
		
		return rep;
	}
	@Override
	@WebResult(name="getDateFilter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDateFilter(String date) {
		if (date.length() == 8) {
			// call month filter
			MonthFilter month = new MonthFilter();
			month.filter(date);
			// lack of better wording
			String[] response = new String[1];
			response[0] = month.getMonth();
			return response;
			
		} else if (date.length() == 7) {
			// call quarter filter
			QuarterFilter quarter = new QuarterFilter();
			quarter.filter(date);
			// lack of better wording
			String[] response = new String[3];
			
			response = quarter.getMonthList().toArray(response);
			return response;
		} else if (date.length() == 4) {
			// call year filter
			YearFilter year = new YearFilter();
			year.filter(date);
			
			// lack of better wording
			String[] response = new String[11];
			response = year.getYearList().toArray(response);
			
			return response;
			
		} else {

			 try {
				 throw new WrongStringLengthException("Your string is " + date.length() + "\nYou need 4 characters");
			 } catch(WrongStringLengthException wslex) {
				 wslex.printStackTrace();
			 }
			return null;
		}


	}

	@Override
	@WebResult(name="getBrandsByDate", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getBrandsByDate(String repId, String date) {
		BrandQuery query;
		// fetch for year
		 if (date.length() == 4) {
			 query = new BrandQuery();
			 query.queryCommYear(repId, date);
			 
			 System.out.println(query.getBrandsList());
			 String[] response = new String[query.getBrandsList().size()];
				
			 // lets add brands to our brands list.
			 brandList = new ArrayList<String>();
			 brandList = query.getBrandsList();
//				System.out.println("Local Brands:" + brandList);
				
			return   response = query.getBrandsList().toArray(response);
				
		 } else if (date.length() == 7) {
			// fetch for quarter
			 query = new BrandQuery();
			 query.queryCommQuarter(repId, date);
			 
			 System.out.println(query.getBrandsList());
			 String[] response = new String[query.getBrandsList().size()];
				
			 // lets add brands to our brands list.
			 brandList = new ArrayList<String>();
			 brandList = query.getBrandsList();
//				System.out.println("Local Brands:" + brandList);
				
			return   response = query.getBrandsList().toArray(response);			 
			 
		 } else if (date.length() == 8) {
			// fetch for month
			 query = new BrandQuery();
			 query.queryCommMonth(repId, date);
			 
			 System.out.println(query.getBrandsList());
			 String[] response = new String[query.getBrandsList().size()];
				
			 // lets add brands to our brands list.
			 brandList = new ArrayList<String>();
			 brandList = query.getBrandsList();
//				System.out.println("Local Brands:" + brandList);
				
			return   response = query.getBrandsList().toArray(response);
		 } else {
			 return null;
		 }
		


	}

	@Override
//	@WebResult(name="getBrandsByDate", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProductSalesValue[] getSalesTrendDataByProduct(String repId, String product, String date) {
		SalesValueQuery query;
		
		ArrayList<ProductSalesValue> list;
//		if (date.length() == 4) {
			// fetch for year
			query = new SalesValueQuery(repId, product, date);
			list = query.queryCommYear();
		
			ProductSalesValue[] response = new ProductSalesValue[list.size()];
			response = list.toArray(response);
			
			return response;
	//	}

		
	}

	// all brands and sales values
	@Override
	@WebResult(name="getSalesTrendData", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public SalesTrendData[] getSalesTrendData(String repId, String date) {
		
		AggregatedSalesValueQuery aggQuery;
		

		SalesTrendData[] salesTrendData;
		// year
		if (date.length() == 4) {
			aggQuery = new AggregatedSalesValueQuery();
			salesTrendData =  aggQuery.queryCommYear(repId, date);
			
			
			return salesTrendData;
		// quarter
		}  else if (date.length() == 7) {
			
			aggQuery = new AggregatedSalesValueQuery();
			salesTrendData = aggQuery.queryCommQuarter(repId, date);
			

			return salesTrendData;
		// month
		} else if (date.length() == 8) {
			aggQuery = new AggregatedSalesValueQuery();
			
			salesTrendData = aggQuery.queryCommMonth(repId, date);
			
			return salesTrendData;
	
		} else {
			return null;
		}
 	
			
	}

	@Override
	public ProxyCustomer[] getMyTop25CustomersByBrick(String repId, String date, String brick) {
		Top25CustomersQuery query = new Top25CustomersQuery(repId, date, brick);
		query.queryBrick();
		//BELLVILLE +S - 2361
		
		ProxyCustomer[] response = new ProxyCustomer[query.getCustomerValuesList().size()];
		
		response = query.getCustomerValuesList().toArray(response);
		return response;
	}
	
	@Override
	public ProxyCustomer[] getMyTop25Customers(String repId, String date) {
		Top25CustomersQuery query;
		
		if (date.length() == 4) {
			// year
			query = new Top25CustomersQuery(repId, date);
			query.queryCommYear();
			
			ProxyCustomer[] response = new ProxyCustomer[query.getCustomerValuesList().size()];
			
			response = query.getCustomerValuesList().toArray(response);
			return response;
			
		} else if (date.length() == 7) {
			// quarter
			query = new Top25CustomersQuery(repId, date);
			query.queryCommQuarter();
			
			ProxyCustomer[] response = new ProxyCustomer[query.getCustomerValuesList().size()];
			
			response = query.getCustomerValuesList().toArray(response);
			return response;
			
		} else if (date.length() == 8) {
			 // month
			query = new Top25CustomersQuery(repId, date);
			query.queryCommMonth();
			
			ProxyCustomer[] response = new ProxyCustomer[query.getCustomerValuesList().size()];
			
			response = query.getCustomerValuesList().toArray(response);
			return response;

		} else {
			return null;
		}
			
		
	}

	@Override
	@WebResult(name="getMyTop25CustomersBrick", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getMyTop25CustomersBrick(String repId, String date) {
		
		Top25CustomerBrickQuery query = new Top25CustomerBrickQuery();
		String[] response = query.getTop25Brick(repId, date);
		
		return response;
	}
	
	@Override
	public SalesVisualizedModel[] getMySalesVisualized(String repId, String date) {
		
		if (date.length() == 4) {
			SalesVisualizedQuery query = new SalesVisualizedQuery();
			
			ArrayList<SalesVisualizedModel> modelList = query.queryCommYear(repId, date);
			
			SalesVisualizedModel[] response = new SalesVisualizedModel[modelList.size()];
			
			response = modelList.toArray(response);
			
			return response;
		} else if (date.length() == 7) {
			SalesVisualizedQuery query = new SalesVisualizedQuery();
			
			ArrayList<SalesVisualizedModel> modelList = query.queryCommQuarter(repId, date);
			
			SalesVisualizedModel[] response = new SalesVisualizedModel[modelList.size()];
			
			response = modelList.toArray(response);
			
			return response;
			
		} else if (date.length() == 8) {
			SalesVisualizedQuery query = new SalesVisualizedQuery();
			
			ArrayList<SalesVisualizedModel> modelList = query.queryCommMonth(repId, date);
			
			SalesVisualizedModel[] response = new SalesVisualizedModel[modelList.size()];
			
			response = modelList.toArray(response);
			
			return response;
		} else {
			return null;
		}

	}

	@Override
	@WebResult(name="getCustomerLocation", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public CustomerLocation[] getCustomerLocation(String repId) {
		
		customerMapList = new ArrayList<CustomerLocation>();
		CustomerCoordinatesQuery query = new CustomerCoordinatesQuery(); 
		
		customerMapList = query.queryCustomerLocation(repId);
		
		CustomerLocation[] response = new CustomerLocation[customerMapList.size()];
		
		response = customerMapList.toArray(response);
		System.out.println(customerMapList);
		
		return response;
	}

	@Override
	@WebResult(name="getCustomerLocationWithRating", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public CustomerLocation[] getCustomerLocationWithRating(String repId, String rating) {
		customerMapList = new ArrayList<CustomerLocation>();
		CustomerCoordinatesQuery query = new CustomerCoordinatesQuery(); 
		
		customerMapList = query.queryCustomerLocation(repId, rating);
		
		CustomerLocation[] response = new CustomerLocation[customerMapList.size()];
		
		response = customerMapList.toArray(response);
		System.out.println(customerMapList);
		
		return response;
	}

	@Override
	@WebResult(name="getCustomerLocationWithRatingAndRange", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public CustomerLocation[] getCustomerLocationWithRatingAndRange(String repId, String rating,
			String range) {
		customerMapList = new ArrayList<CustomerLocation>();
		CustomerCoordinatesQuery query = new CustomerCoordinatesQuery(); 
		
		customerMapList = query.queryCustomerLocation(repId, rating, range);
		
		CustomerLocation[] response = new CustomerLocation[customerMapList.size()];
		
		response = customerMapList.toArray(response);
		System.out.println(customerMapList);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByYear", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByYear(String repId, String date) {
		
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getYearValues(repId, date);
		
		System.out.println(response);
		
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByQuarter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByQuarter(String repId,
			String date) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getQuarterlyValues(repId,date);
		
		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByMonth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByMonth(String repId, String date) {
	
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getMonthlyValues(repId,date);
		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByBrickByYear", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByBrickByYear(String repId,
			String date, String brick) {
	
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getYearValuesByBrick(repId,date,brick);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByBrickByQuarter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByBrickByQuarter(String repId,
			String date, String brick) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getQuarterlyValuesByBrick(repId,date,brick);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByBrickByMonth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByBrickByMonth(String repId,
			String date, String brick) {
		
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getMonthlyValuesByBrick(repId, date, brick);
		

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByYearByBrand", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByYearByBrand(String repId, String date, String brand) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getYearValuesByBrand(repId, date, brand);

		System.out.println(response);
		
		return response;
	}
	
	@Override
	@WebResult(name="getSalesGradingByYearByBrandForFilter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByYearByBrandForFilter(String repId, String date, String brand) {
		TokenizeString token = new TokenizeString();
		token.processRawMaterial(brand);
		System.out.println("Product #--> " + brand);
		
		SalesGradingCustomersQueryV2 query  = new SalesGradingCustomersQueryV2();
		query.setProductInject(token.getProcessedSQL());
		
		ProxySalesGrading[] response = query.getYearValuesByBrand(repId, date, brand);

		System.out.println(response);
		
		return response;
	}
	
	@Override
	@WebResult(name="getSalesGradingByQuarterByBrand", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByQuarterByBrand(String repId,
			String date, String brand) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getQuarterlyValuesByBrand(repId, date, brand);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByMonthByBrand", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByMonthByBrand(String repId,
			String date, String brand) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getMonthlyValuesByBrand(repId, date, brand);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByRatingByYear", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByRatingByYear(String repId, String date, String rating) {
		
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getYearValuesByRating(repId, date, rating);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByRatingByQuarter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByRatingByQuarter(String repId,
			String date, String rating) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getQuarterlyValuesByRating(repId, date, rating);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGradingByRatingByMonth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getSalesGradingByRatingByMonth(String repId,
			String date, String rating) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getMonthlyValuesByRating(repId, date, rating);

		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getDBFilterForQuarter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForQuarter() {
		FilterQuery query = new FilterQuery();
		String[] response = query.filerByQuater();
		
		System.out.println(response);
		return response;
	}

	@Override
	@WebResult(name="getDBFilterForBrand", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForBrand(String repId, String date) {
		FilterQuery query = new FilterQuery();
		String[] response = query.filterByBrand(repId, date);
		
		System.out.println(response);
		return response;
	}

	@Override
	@WebResult(name="getDBFilterForRating", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForRating() {
		FilterQuery query = new FilterQuery();
		String[] response = query.filerRating();
		
		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getDBFilterForBrick", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForBrick() {
		FilterQuery query = new FilterQuery();
		String[] response = query.filerBrick();
		
		System.out.println(response);
		return response;
	}

	@Override
	@WebResult(name="getDBFilterForRepId", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForRepId() {
		FilterQuery query = new FilterQuery();
		String[] response = query.filerRepID();
		
		System.out.println(response);
		
		return response;
		
	}

	@Override
	@WebResult(name="getDBFilterForYear", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForYear() {
		FilterQuery query = new FilterQuery();
		String[] response = query.filerByYear();
		
		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getDBFilterForMonth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getDBFilterForMonth() {
		FilterQuery query = new FilterQuery();
		String[] response = query.filerByMonth();
		
		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGrowth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public CompiledModel[] getSalesGrowth(String date) {
		
		if (date.length() == 4) {
			ArrayList<CompiledModel> temp = ProcessGrowthV2.process(MashBrands.getDefaultSalesGrowth(date));
			
			CompiledModel[] response = new CompiledModel[temp.size()];
			response = temp.toArray(response);
			
			return response;
		} else if (date.length() == 7) {
			ArrayList<CompiledModel> temp = ProcessGrowthV2.process(MashBrands.getQuarterSalesGrowth(date));
			
			CompiledModel[] response = new CompiledModel[temp.size()];
			response = temp.toArray(response);
			
			return response;
			
		}	else if (date.length() == 8){
		
			
			ArrayList<CompiledModel> temp = ProcessGrowthV2.process(MashBrands.getMonthSalesGrowth(date));
			
			CompiledModel[] response = new CompiledModel[temp.size()];
			response = temp.toArray(response);
			
			return response;
		} else {
			return null;
		}
		
	}

	
	@Override
	@WebResult(name="getSalesGrowthWithNappi", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public SalesGrowth[] getSalesGrowthWithNappi() {
		SalesGrowthQuery query = new SalesGrowthQuery();
		SalesGrowth[] response =  query.queryDefaultWithNappi();
		
		return response;
	}

	@Override
	@WebResult(name="getRepSalesGrowth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public SalesGrowth[] getRepSalesGrowth(String repId) {
	
		SalesGrowthQuery query = new SalesGrowthQuery();
		SalesGrowth[] response =  query.query(repId);
		
		return response;
	}

	@Override
	@WebResult(name="getProductSalesGrowth", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public CompiledModel[] getProductSalesGrowth(String product, String date) {
		ArrayList<CompiledModel> temp = ProcessGrowthV2.process(MashBrands.getProductSalesGrowth(date, product));
		
		CompiledModel[] response = new CompiledModel[temp.size()];
		response = temp.toArray(response);
		
		return response;
	}
	
	
	@Override
	@WebResult(name="getSalesGrowthProductList", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public CompiledModel[] getSalesGrowthProductList(String products, String date) {
		ArrayList<CompiledModel> temp = ProcessGrowthV2.process(MashBrands.getSalesGrowthProductList(date, products));
		
		CompiledModel[] response = new CompiledModel[temp.size()];
		response = temp.toArray(response);
		
		return response;
	}
	
	
	@Override
	@WebResult(name="getSalesGrowthWithOutRegion", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public SalesGrowth[] getSalesGrowthWithOutRegion() {
		SalesGrowthQuery query = new SalesGrowthQuery();
		SalesGrowth[] response =  query.queryDefaultWithOutRegion();
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGrowthPreferential", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public SalesGrowth[] getSalesGrowthPreferential() {
		SalesGrowthQuery query = new SalesGrowthQuery();
		SalesGrowth[] response =  query.queryPreferential();
		
		return response;
	}

	@Override
	@WebResult(name="getSalesGrowthHeading", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public GrowthLabelName getSalesGrowthHeading() {
		
		return GrowthConstantsV2.getGrowthLabelName();
	}


	@Override
	@WebResult(name="getYearlySalesGradeByProductByRating", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public ProxySalesGrading[] getYearlySalesGradeByProductByRating(
			String repId, String date, String rating, String product) {
		SalesGradingCustomersQuery query  = new SalesGradingCustomersQuery();
		ProxySalesGrading[] response = query.getYearlySalesGradingByProductByRating(repId, date, rating, product);

		System.out.println(response);
		
		return response;

	}

	@Override
	@WebResult(name="getRefinedQuarterFilter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getRefinedQuarterFilter(String year) {
		FilterQuery query = new FilterQuery();
		String[] response = query.refinedQuarterFilter(year);
		
		System.out.println(response);
		
		return response;
	}

	@Override
	@WebResult(name="getRefinedMonthFilter", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public String[] getRefinedMonthFilter(String year) {
		FilterQuery query = new FilterQuery();
		String[] response = query.refinedMonthFilter(year);
		
		System.out.println(response);
		
		return response;
	}

	@Override
	public boolean validateUser(String username, String password) {
		ValidateUser user = new ValidateUser();
		boolean response = user.verify(username, password);
		return response;
	}

	@Override
	public String getRepIdForUser(String username) {
		
		ValidateUser user = new ValidateUser();
		String response = user.getRepId(username);
		
		return response;
	}

	@Override
	@WebResult(name="getSalesTrendDataForFilters", targetNamespace="http://gondwana.mobile.arkitex.com/")
	public SalesTrendData[] getSalesTrendDataForFilters(String products, String repId, String date) {
		AggregatedSalesValueQueryV2 aggQuery;
		

		SalesTrendData[] response;
		// year
		if (date.length() == 4) {
			System.out.println("Print Products: -->" + products);
			TokenizeString token = new TokenizeString();
//			token.processRawMaterial("Product 11/Product 14/Product 28/Product 7/Product 13");
			token.processRawMaterial(products);
			
			aggQuery = new AggregatedSalesValueQueryV2();
			aggQuery.setProductInject(token.getProcessedSQL());
			ArrayList<SalesTrendData> temp = aggQuery.queryCommYear(repId, date);
			response = new SalesTrendData[temp.size()];
			response = temp.toArray(response);
			
			return response;
		// quarter
		}  else if (date.length() == 7) {
			System.out.println("Print Products: -->" + products);
			TokenizeString token = new TokenizeString();
//			token.processRawMaterial("Product 11/Product 14/Product 28/Product 7/Product 13");
			token.processRawMaterial(products);
			
			aggQuery = new AggregatedSalesValueQueryV2();
			aggQuery.setProductInject(token.getProcessedSQL());
			ArrayList<SalesTrendData> temp = aggQuery.queryCommQuarter(repId, date);
			response = new SalesTrendData[temp.size()];
			response = temp.toArray(response);
			
			return response;
		// month
		} else if (date.length() == 8) {
			TokenizeString token = new TokenizeString();
//			token.processRawMaterial("Product 11/Product 14/Product 28/Product 7/Product 13");
			token.processRawMaterial(products);
			
			aggQuery = new AggregatedSalesValueQueryV2();
			aggQuery.setProductInject(token.getProcessedSQL());
			ArrayList<SalesTrendData> temp = aggQuery.queryCommMonth(repId, date);
			response = new SalesTrendData[temp.size()];
			response = temp.toArray(response);
			
			return response;
	
		} else {
			return null;
		}
 	

	}



}
