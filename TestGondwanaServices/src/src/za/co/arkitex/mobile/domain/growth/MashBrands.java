package za.co.arkitex.mobile.domain.growth;

import java.util.ArrayList;

import za.co.arkitex.mobile.gondwana.db.SalesGrowthQueryV2;


public class MashBrands {

	private static ArrayList<CompiledModel> compiledModels;

	// default year
	public static ArrayList<CompiledModel> getDefaultSalesGrowth(String date) {
		
		
		
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryDefault(date, "LEA GLEN +S - 4924");
		
		ArrayList <SalesGrowth> salesGrowths01 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths02 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths03 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths04 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths05 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths06 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths07 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths08 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths09 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths10 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths11 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths12 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths13 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths14 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths15 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths16 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths17 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths18 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths19 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths20 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths21 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths22 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths23 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths24 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths25 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths26 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths27 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths28 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths29 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths30 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths31 = new ArrayList <SalesGrowth>();

		// lets separate the products
		for (int i = 0; i < query.getGrowthList().size(); i++) {
			//System.out.println(s);
			if (query.getGrowthList().get(i).getProduct().equals("Product 1")) {
				salesGrowths01.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 2")) {
				salesGrowths02.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 3")) {
				salesGrowths03.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 4")) {
				salesGrowths04.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 5")) {
				salesGrowths05.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 6")) {
				salesGrowths06.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 7")) {
				salesGrowths07.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 8")) {
				salesGrowths08.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 9")) {
				salesGrowths09.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 10")) {
				salesGrowths10.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 11")) {
				salesGrowths11.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 12")) {
				salesGrowths12.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 13")) {
				salesGrowths13.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 14")) {
				salesGrowths14.add(query.getGrowthList().get(i));

			} else if (query.getGrowthList().get(i).getProduct().equals("Product 15")) {
				salesGrowths15.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 16")) {
				salesGrowths16.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 17")) {
				salesGrowths17.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 18")) {
				salesGrowths18.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 19")) {
				salesGrowths19.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 20")) {
				salesGrowths20.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 21")) {
				salesGrowths21.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 22")) {
				salesGrowths22.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 23")) {
				salesGrowths23.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 24")) {
				salesGrowths24.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 25")) {
				salesGrowths25.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 26")) {
				salesGrowths26.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 27")) {
				salesGrowths27.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 28")) {
				salesGrowths28.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 29")) {
				salesGrowths29.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 30")) {
				salesGrowths30.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Unknown Brand")) {
				salesGrowths31.add(query.getGrowthList().get(i));
			} 
		
			
			
			
		}
		
		
		
		// a list of compiled product list
		compiledModels = new ArrayList<CompiledModel>();
		
		
		CompiledModel model01 = new CompiledModel();
		model01.setProduct("Product 1");
		for(int i = 0; i < salesGrowths01.size(); i++){
			if (!salesGrowths01.get(i).getOneYearBackMTD().equals("0.0000")) {
				model01.setOneYearBackMTD(salesGrowths01.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths01.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model01.setPreviousYearMonthMTD(salesGrowths01.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYTD().equals("0.0000")) {
				model01.setPreviousYTD(salesGrowths01.get(i).getPreviousYTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearYTD().equals("0.0000")) {
				model01.setTwoYearYTD(salesGrowths01.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model02 = new CompiledModel();
		model02.setProduct("Product 2");
		for(int i = 0; i < salesGrowths02.size(); i++){
			if (!salesGrowths02.get(i).getOneYearBackMTD().equals("0.0000")) {
				model02.setOneYearBackMTD(salesGrowths02.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model02.setTwoYearBackMTD(salesGrowths02.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model02.setPreviousYearMonthMTD(salesGrowths02.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYTD().equals("0.0000")) {
				model02.setPreviousYTD(salesGrowths02.get(i).getPreviousYTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearYTD().equals("0.0000")) {
				model02.setTwoYearYTD(salesGrowths02.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model03 = new CompiledModel();
		model03.setProduct("Product 3");
		for(int i = 0; i < salesGrowths03.size(); i++){
			if (!salesGrowths03.get(i).getOneYearBackMTD().equals("0.0000")) {
				model03.setOneYearBackMTD(salesGrowths03.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model03.setTwoYearBackMTD(salesGrowths03.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model03.setPreviousYearMonthMTD(salesGrowths03.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYTD().equals("0.0000")) {
				model03.setPreviousYTD(salesGrowths03.get(i).getPreviousYTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearYTD().equals("0.0000")) {
				model03.setTwoYearYTD(salesGrowths03.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model04 = new CompiledModel();
		model04.setProduct("Product 4");
		for(int i = 0; i < salesGrowths04.size(); i++){
			if (!salesGrowths04.get(i).getOneYearBackMTD().equals("0.0000")) {
				model04.setOneYearBackMTD(salesGrowths04.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model04.setTwoYearBackMTD(salesGrowths04.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model04.setPreviousYearMonthMTD(salesGrowths04.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYTD().equals("0.0000")) {
				model04.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearYTD().equals("0.0000")) {
				model04.setTwoYearYTD(salesGrowths04.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model05 = new CompiledModel();
		model05.setProduct("Product 5");
		for(int i = 0; i < salesGrowths05.size(); i++){
			if (!salesGrowths05.get(i).getOneYearBackMTD().equals("0.0000")) {
				model05.setOneYearBackMTD(salesGrowths05.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model05.setTwoYearBackMTD(salesGrowths05.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model05.setPreviousYearMonthMTD(salesGrowths05.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYTD().equals("0.0000")) {
				model05.setPreviousYTD(salesGrowths05.get(i).getPreviousYTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearYTD().equals("0.0000")) {
				model05.setTwoYearYTD(salesGrowths05.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model06 = new CompiledModel();
		model06.setProduct("Product 6");
		for(int i = 0; i < salesGrowths06.size(); i++){
			if (!salesGrowths06.get(i).getOneYearBackMTD().equals("0.0000")) {
				model06.setOneYearBackMTD(salesGrowths06.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model06.setTwoYearBackMTD(salesGrowths06.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model06.setPreviousYearMonthMTD(salesGrowths06.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYTD().equals("0.0000")) {
				model06.setPreviousYTD(salesGrowths06.get(i).getPreviousYTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearYTD().equals("0.0000")) {
				model06.setTwoYearYTD(salesGrowths06.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model07 = new CompiledModel();
		model07.setProduct("Product 7");
		for(int i = 0; i < salesGrowths07.size(); i++){
			if (!salesGrowths07.get(i).getOneYearBackMTD().equals("0.0000")) {
				model07.setOneYearBackMTD(salesGrowths07.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model07.setTwoYearBackMTD(salesGrowths07.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model07.setPreviousYearMonthMTD(salesGrowths07.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYTD().equals("0.0000")) {
				model07.setPreviousYTD(salesGrowths07.get(i).getPreviousYTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearYTD().equals("0.0000")) {
				model07.setTwoYearYTD(salesGrowths07.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model08 = new CompiledModel();
		model08.setProduct("Product 8");
		for(int i = 0; i < salesGrowths08.size(); i++){
			if (!salesGrowths08.get(i).getOneYearBackMTD().equals("0.0000")) {
				model08.setOneYearBackMTD(salesGrowths08.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model08.setTwoYearBackMTD(salesGrowths08.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model08.setPreviousYearMonthMTD(salesGrowths08.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYTD().equals("0.0000")) {
				model08.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearYTD().equals("0.0000")) {
				model08.setTwoYearYTD(salesGrowths08.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model09 = new CompiledModel();
		model09.setProduct("Product 9");
		for(int i = 0; i < salesGrowths09.size(); i++){
			if (!salesGrowths09.get(i).getOneYearBackMTD().equals("0.0000")) {
				model09.setOneYearBackMTD(salesGrowths09.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model09.setTwoYearBackMTD(salesGrowths09.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model09.setPreviousYearMonthMTD(salesGrowths09.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYTD().equals("0.0000")) {
				model09.setPreviousYTD(salesGrowths09.get(i).getPreviousYTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearYTD().equals("0.0000")) {
				model09.setTwoYearYTD(salesGrowths09.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model10 = new CompiledModel();
		model10.setProduct("Product 10");
		for(int i = 0; i < salesGrowths10.size(); i++){
			if (!salesGrowths10.get(i).getOneYearBackMTD().equals("0.0000")) {
				model10.setOneYearBackMTD(salesGrowths10.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model10.setTwoYearBackMTD(salesGrowths10.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model10.setPreviousYearMonthMTD(salesGrowths10.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYTD().equals("0.0000")) {
				model10.setPreviousYTD(salesGrowths10.get(i).getPreviousYTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearYTD().equals("0.0000")) {
				model10.setTwoYearYTD(salesGrowths10.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model11 = new CompiledModel();
		model11.setProduct("Product 11");
		for(int i = 0; i < salesGrowths11.size(); i++){
			if (!salesGrowths11.get(i).getOneYearBackMTD().equals("0.0000")) {
				model11.setOneYearBackMTD(salesGrowths11.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model11.setTwoYearBackMTD(salesGrowths11.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model11.setPreviousYearMonthMTD(salesGrowths11.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYTD().equals("0.0000")) {
				model11.setPreviousYTD(salesGrowths11.get(i).getPreviousYTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearYTD().equals("0.0000")) {
				model11.setTwoYearYTD(salesGrowths11.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model12 = new CompiledModel();
		model12.setProduct("Product 12");
		for(int i = 0; i < salesGrowths12.size(); i++){
			if (!salesGrowths12.get(i).getOneYearBackMTD().equals("0.0000")) {
				model12.setOneYearBackMTD(salesGrowths12.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths12.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model12.setPreviousYearMonthMTD(salesGrowths12.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYTD().equals("0.0000")) {
				model12.setPreviousYTD(salesGrowths12.get(i).getPreviousYTD());
				
			} else if (!salesGrowths12.get(i).getTwoYearYTD().equals("0.0000")) {
				model12.setTwoYearYTD(salesGrowths12.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model13 = new CompiledModel();
		model13.setProduct("Product 13");
		for(int i = 0; i < salesGrowths13.size(); i++){
			if (!salesGrowths13.get(i).getOneYearBackMTD().equals("0.0000")) {
				model13.setOneYearBackMTD(salesGrowths13.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model13.setTwoYearBackMTD(salesGrowths13.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model13.setPreviousYearMonthMTD(salesGrowths13.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYTD().equals("0.0000")) {
				model13.setPreviousYTD(salesGrowths13.get(i).getPreviousYTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearYTD().equals("0.0000")) {
				model13.setTwoYearYTD(salesGrowths13.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model14 = new CompiledModel();
		model14.setProduct("Product 14");
		for(int i = 0; i < salesGrowths14.size(); i++){
			if (!salesGrowths14.get(i).getOneYearBackMTD().equals("0.0000")) {
				model14.setOneYearBackMTD(salesGrowths14.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model14.setTwoYearBackMTD(salesGrowths14.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model14.setPreviousYearMonthMTD(salesGrowths14.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths14.get(i).getPreviousYTD().equals("0.0000")) {
				model14.setPreviousYTD(salesGrowths14.get(i).getPreviousYTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearYTD().equals("0.0000")) {
				model14.setTwoYearYTD(salesGrowths14.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model15 = new CompiledModel();
		model15.setProduct("Product 15");
		for(int i = 0; i < salesGrowths15.size(); i++){
			if (!salesGrowths15.get(i).getOneYearBackMTD().equals("0.0000")) {
				model15.setOneYearBackMTD(salesGrowths15.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model15.setTwoYearBackMTD(salesGrowths15.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model15.setPreviousYearMonthMTD(salesGrowths15.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYTD().equals("0.0000")) {
				model15.setPreviousYTD(salesGrowths15.get(i).getPreviousYTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearYTD().equals("0.0000")) {
				model15.setTwoYearYTD(salesGrowths15.get(i).getTwoYearYTD());
			}
		}
		
		// model 16
		CompiledModel model16 = new CompiledModel();
		model16.setProduct("Product 16");
		for(int i = 0; i < salesGrowths16.size(); i++){
			if (!salesGrowths16.get(i).getOneYearBackMTD().equals("0.0000")) {
				model16.setOneYearBackMTD(salesGrowths16.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model16.setTwoYearBackMTD(salesGrowths16.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model16.setPreviousYearMonthMTD(salesGrowths16.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYTD().equals("0.0000")) {
				model16.setPreviousYTD(salesGrowths16.get(i).getPreviousYTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearYTD().equals("0.0000")) {
				model16.setTwoYearYTD(salesGrowths16.get(i).getTwoYearYTD());
			}
		}
		
		CompiledModel model17 = new CompiledModel();
		model17.setProduct("Product 17");
		for(int i = 0; i < salesGrowths17.size(); i++){
			if (!salesGrowths17.get(i).getOneYearBackMTD().equals("0.0000")) {
				model17.setOneYearBackMTD(salesGrowths17.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model17.setTwoYearBackMTD(salesGrowths17.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model17.setPreviousYearMonthMTD(salesGrowths17.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYTD().equals("0.0000")) {
				model17.setPreviousYTD(salesGrowths17.get(i).getPreviousYTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearYTD().equals("0.0000")) {
				model17.setTwoYearYTD(salesGrowths17.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model18 = new CompiledModel();
		model18.setProduct("Product 18");
		for(int i = 0; i < salesGrowths18.size(); i++){
			if (!salesGrowths18.get(i).getOneYearBackMTD().equals("0.0000")) {
				model18.setOneYearBackMTD(salesGrowths18.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model18.setTwoYearBackMTD(salesGrowths18.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model18.setPreviousYearMonthMTD(salesGrowths18.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYTD().equals("0.0000")) {
				model18.setPreviousYTD(salesGrowths18.get(i).getPreviousYTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearYTD().equals("0.0000")) {
				model18.setTwoYearYTD(salesGrowths18.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model19 = new CompiledModel();
		model19.setProduct("Product 19");
		for(int i = 0; i < salesGrowths19.size(); i++){
			if (!salesGrowths19.get(i).getOneYearBackMTD().equals("0.0000")) {
				model19.setOneYearBackMTD(salesGrowths19.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model19.setTwoYearBackMTD(salesGrowths19.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model19.setPreviousYearMonthMTD(salesGrowths19.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYTD().equals("0.0000")) {
				model19.setPreviousYTD(salesGrowths19.get(i).getPreviousYTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearYTD().equals("0.0000")) {
				model19.setTwoYearYTD(salesGrowths19.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model20 = new CompiledModel();
		model20.setProduct("Product 20");
		for(int i = 0; i < salesGrowths20.size(); i++){
			if (!salesGrowths20.get(i).getOneYearBackMTD().equals("0.0000")) {
				model20.setOneYearBackMTD(salesGrowths20.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model20.setTwoYearBackMTD(salesGrowths20.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model20.setPreviousYearMonthMTD(salesGrowths20.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYTD().equals("0.0000")) {
				model20.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearYTD().equals("0.0000")) {
				model20.setTwoYearYTD(salesGrowths20.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model21 = new CompiledModel();
		model21.setProduct("Product 21");
		for(int i = 0; i < salesGrowths21.size(); i++){
			if (!salesGrowths21.get(i).getOneYearBackMTD().equals("0.0000")) {
				model21.setOneYearBackMTD(salesGrowths21.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model21.setTwoYearBackMTD(salesGrowths21.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model21.setPreviousYearMonthMTD(salesGrowths21.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYTD().equals("0.0000")) {
				model21.setPreviousYTD(salesGrowths21.get(i).getPreviousYTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearYTD().equals("0.0000")) {
				model21.setTwoYearYTD(salesGrowths21.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model22 = new CompiledModel();
		model22.setProduct("Product 22");
		for(int i = 0; i < salesGrowths22.size(); i++){
			if (!salesGrowths22.get(i).getOneYearBackMTD().equals("0.0000")) {
				model22.setOneYearBackMTD(salesGrowths22.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model22.setTwoYearBackMTD(salesGrowths22.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model22.setPreviousYearMonthMTD(salesGrowths22.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYTD().equals("0.0000")) {
				model22.setPreviousYTD(salesGrowths22.get(i).getPreviousYTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearYTD().equals("0.0000")) {
				model22.setTwoYearYTD(salesGrowths22.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model23 = new CompiledModel();
		model23.setProduct("Product 23");
		for(int i = 0; i < salesGrowths23.size(); i++){
			if (!salesGrowths23.get(i).getOneYearBackMTD().equals("0.0000")) {
				model23.setOneYearBackMTD(salesGrowths23.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model23.setTwoYearBackMTD(salesGrowths23.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model23.setPreviousYearMonthMTD(salesGrowths23.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYTD().equals("0.0000")) {
				model23.setPreviousYTD(salesGrowths23.get(i).getPreviousYTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearYTD().equals("0.0000")) {
				model23.setTwoYearYTD(salesGrowths23.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model24 = new CompiledModel();
		model24.setProduct("Product 24");
		for(int i = 0; i < salesGrowths24.size(); i++){
			if (!salesGrowths24.get(i).getOneYearBackMTD().equals("0.0000")) {
				model24.setOneYearBackMTD(salesGrowths24.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model24.setTwoYearBackMTD(salesGrowths24.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model24.setPreviousYearMonthMTD(salesGrowths24.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYTD().equals("0.0000")) {
				model24.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearYTD().equals("0.0000")) {
				model24.setTwoYearYTD(salesGrowths24.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model25 = new CompiledModel();
		model25.setProduct("Product 25");
		for(int i = 0; i < salesGrowths25.size(); i++){
			if (!salesGrowths25.get(i).getOneYearBackMTD().equals("0.0000")) {
				model25.setOneYearBackMTD(salesGrowths25.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model25.setTwoYearBackMTD(salesGrowths25.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model25.setPreviousYearMonthMTD(salesGrowths25.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYTD().equals("0.0000")) {
				model25.setPreviousYTD(salesGrowths25.get(i).getPreviousYTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearYTD().equals("0.0000")) {
				model25.setTwoYearYTD(salesGrowths25.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model26 = new CompiledModel();
		model26.setProduct("Product 26");
		for(int i = 0; i < salesGrowths26.size(); i++){
			if (!salesGrowths26.get(i).getOneYearBackMTD().equals("0.0000")) {
				model26.setOneYearBackMTD(salesGrowths26.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model26.setTwoYearBackMTD(salesGrowths26.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model26.setPreviousYearMonthMTD(salesGrowths26.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYTD().equals("0.0000")) {
				model26.setPreviousYTD(salesGrowths26.get(i).getPreviousYTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearYTD().equals("0.0000")) {
				model26.setTwoYearYTD(salesGrowths26.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model27 = new CompiledModel();
		model27.setProduct("Product 27");
		for(int i = 0; i < salesGrowths27.size(); i++){
			if (!salesGrowths27.get(i).getOneYearBackMTD().equals("0.0000")) {
				model27.setOneYearBackMTD(salesGrowths27.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model27.setTwoYearBackMTD(salesGrowths27.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model27.setPreviousYearMonthMTD(salesGrowths27.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYTD().equals("0.0000")) {
				model27.setPreviousYTD(salesGrowths27.get(i).getPreviousYTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearYTD().equals("0.0000")) {
				model27.setTwoYearYTD(salesGrowths27.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model28 = new CompiledModel();
		model28.setProduct("Product 28");
		for(int i = 0; i < salesGrowths28.size(); i++){
			if (!salesGrowths28.get(i).getOneYearBackMTD().equals("0.0000")) {
				model28.setOneYearBackMTD(salesGrowths28.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model28.setTwoYearBackMTD(salesGrowths28.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model28.setPreviousYearMonthMTD(salesGrowths28.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYTD().equals("0.0000")) {
				model28.setPreviousYTD(salesGrowths28.get(i).getPreviousYTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearYTD().equals("0.0000")) {
				model28.setTwoYearYTD(salesGrowths28.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model29 = new CompiledModel();
		model29.setProduct("Product 29");
		for(int i = 0; i < salesGrowths29.size(); i++){
			if (!salesGrowths29.get(i).getOneYearBackMTD().equals("0.0000")) {
				model29.setOneYearBackMTD(salesGrowths29.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model29.setTwoYearBackMTD(salesGrowths29.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model29.setPreviousYearMonthMTD(salesGrowths29.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYTD().equals("0.0000")) {
				model29.setPreviousYTD(salesGrowths29.get(i).getPreviousYTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearYTD().equals("0.0000")) {
				model29.setTwoYearYTD(salesGrowths29.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model30 = new CompiledModel();
		model30.setProduct("Product 30");
		for(int i = 0; i < salesGrowths30.size(); i++){
			if (!salesGrowths30.get(i).getOneYearBackMTD().equals("0.0000")) {
				model30.setOneYearBackMTD(salesGrowths30.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model30.setTwoYearBackMTD(salesGrowths30.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model30.setPreviousYearMonthMTD(salesGrowths30.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYTD().equals("0.0000")) {
				model30.setPreviousYTD(salesGrowths30.get(i).getPreviousYTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearYTD().equals("0.0000")) {
				model30.setTwoYearYTD(salesGrowths30.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model31 = new CompiledModel();
		model31.setProduct("Unknown Brand");
		for(int i = 0; i < salesGrowths31.size(); i++){
			if (!salesGrowths31.get(i).getOneYearBackMTD().equals("0.0000")) {
				model31.setOneYearBackMTD(salesGrowths31.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model31.setTwoYearBackMTD(salesGrowths31.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model31.setPreviousYearMonthMTD(salesGrowths31.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYTD().equals("0.0000")) {
				model31.setPreviousYTD(salesGrowths31.get(i).getPreviousYTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearYTD().equals("0.0000")) {
				model31.setTwoYearYTD(salesGrowths31.get(i).getTwoYearYTD());
			}
		}
	
		
		
		// lets add to the compiled model list
		compiledModels.add(model01);
		compiledModels.add(model02);
		compiledModels.add(model03);
		compiledModels.add(model04);
		compiledModels.add(model05);
		compiledModels.add(model06);
		compiledModels.add(model07);
		compiledModels.add(model08);
		compiledModels.add(model09);
		compiledModels.add(model10);
		compiledModels.add(model11);
		compiledModels.add(model12);
		compiledModels.add(model13);
		compiledModels.add(model14);
		compiledModels.add(model15);
		compiledModels.add(model16);
		compiledModels.add(model17);
		compiledModels.add(model18);
		compiledModels.add(model19);
		compiledModels.add(model20);
		compiledModels.add(model21);
		compiledModels.add(model22);
		compiledModels.add(model23);
		compiledModels.add(model24);
		compiledModels.add(model25);
		compiledModels.add(model26);
		compiledModels.add(model27);
		compiledModels.add(model28);
		compiledModels.add(model29);
		compiledModels.add(model30);
		compiledModels.add(model31);
		//  lets return the compiled list
		System.out.println(compiledModels);
		return compiledModels;
	}
	
	
	// month 
	public static ArrayList<CompiledModel> getMonthSalesGrowth(String date) {
		
		
		
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryMonth(date, "LEA GLEN +S - 4924");
		
		ArrayList <SalesGrowth> salesGrowths01 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths02 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths03 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths04 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths05 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths06 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths07 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths08 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths09 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths10 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths11 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths12 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths13 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths14 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths15 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths16 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths17 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths18 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths19 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths20 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths21 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths22 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths23 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths24 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths25 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths26 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths27 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths28 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths29 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths30 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths31 = new ArrayList <SalesGrowth>();

		// lets separate the products
		for (int i = 0; i < query.getGrowthList().size(); i++) {
			//System.out.println(s);
			if (query.getGrowthList().get(i).getProduct().equals("Product 1")) {
				salesGrowths01.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 2")) {
				salesGrowths02.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 3")) {
				salesGrowths03.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 4")) {
				salesGrowths04.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 5")) {
				salesGrowths05.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 6")) {
				salesGrowths06.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 7")) {
				salesGrowths07.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 8")) {
				salesGrowths08.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 9")) {
				salesGrowths09.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 10")) {
				salesGrowths10.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 11")) {
				salesGrowths11.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 12")) {
				salesGrowths12.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 13")) {
				salesGrowths13.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 14")) {
				salesGrowths14.add(query.getGrowthList().get(i));

			} else if (query.getGrowthList().get(i).getProduct().equals("Product 15")) {
				salesGrowths15.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 16")) {
				salesGrowths16.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 17")) {
				salesGrowths17.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 18")) {
				salesGrowths18.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 19")) {
				salesGrowths19.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 20")) {
				salesGrowths20.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 21")) {
				salesGrowths21.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 22")) {
				salesGrowths22.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 23")) {
				salesGrowths23.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 24")) {
				salesGrowths24.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 25")) {
				salesGrowths25.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 26")) {
				salesGrowths26.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 27")) {
				salesGrowths27.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 28")) {
				salesGrowths28.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 29")) {
				salesGrowths29.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 30")) {
				salesGrowths30.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Unknown Brand")) {
				salesGrowths31.add(query.getGrowthList().get(i));
			} 
		
			
			
			
		}
		
		
		
		// a list of compiled product list
		compiledModels = new ArrayList<CompiledModel>();
		
		
		CompiledModel model01 = new CompiledModel();
		model01.setProduct("Product 1");
		for(int i = 0; i < salesGrowths01.size(); i++){
			if (!salesGrowths01.get(i).getOneYearBackMTD().equals("0.0000")) {
				model01.setOneYearBackMTD(salesGrowths01.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths01.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model01.setPreviousYearMonthMTD(salesGrowths01.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYTD().equals("0.0000")) {
				model01.setPreviousYTD(salesGrowths01.get(i).getPreviousYTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearYTD().equals("0.0000")) {
				model01.setTwoYearYTD(salesGrowths01.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model02 = new CompiledModel();
		model02.setProduct("Product 2");
		for(int i = 0; i < salesGrowths02.size(); i++){
			if (!salesGrowths02.get(i).getOneYearBackMTD().equals("0.0000")) {
				model02.setOneYearBackMTD(salesGrowths02.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model02.setTwoYearBackMTD(salesGrowths02.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model02.setPreviousYearMonthMTD(salesGrowths02.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYTD().equals("0.0000")) {
				model02.setPreviousYTD(salesGrowths02.get(i).getPreviousYTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearYTD().equals("0.0000")) {
				model02.setTwoYearYTD(salesGrowths02.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model03 = new CompiledModel();
		model03.setProduct("Product 3");
		for(int i = 0; i < salesGrowths03.size(); i++){
			if (!salesGrowths03.get(i).getOneYearBackMTD().equals("0.0000")) {
				model03.setOneYearBackMTD(salesGrowths03.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model03.setTwoYearBackMTD(salesGrowths03.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model03.setPreviousYearMonthMTD(salesGrowths03.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYTD().equals("0.0000")) {
				model03.setPreviousYTD(salesGrowths03.get(i).getPreviousYTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearYTD().equals("0.0000")) {
				model03.setTwoYearYTD(salesGrowths03.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model04 = new CompiledModel();
		model04.setProduct("Product 4");
		for(int i = 0; i < salesGrowths04.size(); i++){
			if (!salesGrowths04.get(i).getOneYearBackMTD().equals("0.0000")) {
				model04.setOneYearBackMTD(salesGrowths04.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model04.setTwoYearBackMTD(salesGrowths04.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model04.setPreviousYearMonthMTD(salesGrowths04.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYTD().equals("0.0000")) {
				model04.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearYTD().equals("0.0000")) {
				model04.setTwoYearYTD(salesGrowths04.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model05 = new CompiledModel();
		model05.setProduct("Product 5");
		for(int i = 0; i < salesGrowths05.size(); i++){
			if (!salesGrowths05.get(i).getOneYearBackMTD().equals("0.0000")) {
				model05.setOneYearBackMTD(salesGrowths05.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model05.setTwoYearBackMTD(salesGrowths05.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model05.setPreviousYearMonthMTD(salesGrowths05.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYTD().equals("0.0000")) {
				model05.setPreviousYTD(salesGrowths05.get(i).getPreviousYTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearYTD().equals("0.0000")) {
				model05.setTwoYearYTD(salesGrowths05.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model06 = new CompiledModel();
		model06.setProduct("Product 6");
		for(int i = 0; i < salesGrowths06.size(); i++){
			if (!salesGrowths06.get(i).getOneYearBackMTD().equals("0.0000")) {
				model06.setOneYearBackMTD(salesGrowths06.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model06.setTwoYearBackMTD(salesGrowths06.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model06.setPreviousYearMonthMTD(salesGrowths06.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYTD().equals("0.0000")) {
				model06.setPreviousYTD(salesGrowths06.get(i).getPreviousYTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearYTD().equals("0.0000")) {
				model06.setTwoYearYTD(salesGrowths06.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model07 = new CompiledModel();
		model07.setProduct("Product 7");
		for(int i = 0; i < salesGrowths07.size(); i++){
			if (!salesGrowths07.get(i).getOneYearBackMTD().equals("0.0000")) {
				model07.setOneYearBackMTD(salesGrowths07.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model07.setTwoYearBackMTD(salesGrowths07.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model07.setPreviousYearMonthMTD(salesGrowths07.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYTD().equals("0.0000")) {
				model07.setPreviousYTD(salesGrowths07.get(i).getPreviousYTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearYTD().equals("0.0000")) {
				model07.setTwoYearYTD(salesGrowths07.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model08 = new CompiledModel();
		model08.setProduct("Product 8");
		for(int i = 0; i < salesGrowths08.size(); i++){
			if (!salesGrowths08.get(i).getOneYearBackMTD().equals("0.0000")) {
				model08.setOneYearBackMTD(salesGrowths08.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model08.setTwoYearBackMTD(salesGrowths08.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model08.setPreviousYearMonthMTD(salesGrowths08.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYTD().equals("0.0000")) {
				model08.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearYTD().equals("0.0000")) {
				model08.setTwoYearYTD(salesGrowths08.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model09 = new CompiledModel();
		model09.setProduct("Product 9");
		for(int i = 0; i < salesGrowths09.size(); i++){
			if (!salesGrowths09.get(i).getOneYearBackMTD().equals("0.0000")) {
				model09.setOneYearBackMTD(salesGrowths09.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model09.setTwoYearBackMTD(salesGrowths09.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model09.setPreviousYearMonthMTD(salesGrowths09.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYTD().equals("0.0000")) {
				model09.setPreviousYTD(salesGrowths09.get(i).getPreviousYTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearYTD().equals("0.0000")) {
				model09.setTwoYearYTD(salesGrowths09.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model10 = new CompiledModel();
		model10.setProduct("Product 10");
		for(int i = 0; i < salesGrowths10.size(); i++){
			if (!salesGrowths10.get(i).getOneYearBackMTD().equals("0.0000")) {
				model10.setOneYearBackMTD(salesGrowths10.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model10.setTwoYearBackMTD(salesGrowths10.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model10.setPreviousYearMonthMTD(salesGrowths10.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYTD().equals("0.0000")) {
				model10.setPreviousYTD(salesGrowths10.get(i).getPreviousYTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearYTD().equals("0.0000")) {
				model10.setTwoYearYTD(salesGrowths10.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model11 = new CompiledModel();
		model11.setProduct("Product 11");
		for(int i = 0; i < salesGrowths11.size(); i++){
			if (!salesGrowths11.get(i).getOneYearBackMTD().equals("0.0000")) {
				model11.setOneYearBackMTD(salesGrowths11.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model11.setTwoYearBackMTD(salesGrowths11.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model11.setPreviousYearMonthMTD(salesGrowths11.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYTD().equals("0.0000")) {
				model11.setPreviousYTD(salesGrowths11.get(i).getPreviousYTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearYTD().equals("0.0000")) {
				model11.setTwoYearYTD(salesGrowths11.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model12 = new CompiledModel();
		model12.setProduct("Product 12");
		for(int i = 0; i < salesGrowths12.size(); i++){
			if (!salesGrowths12.get(i).getOneYearBackMTD().equals("0.0000")) {
				model12.setOneYearBackMTD(salesGrowths12.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths12.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model12.setPreviousYearMonthMTD(salesGrowths12.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYTD().equals("0.0000")) {
				model12.setPreviousYTD(salesGrowths12.get(i).getPreviousYTD());
				
			} else if (!salesGrowths12.get(i).getTwoYearYTD().equals("0.0000")) {
				model12.setTwoYearYTD(salesGrowths12.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model13 = new CompiledModel();
		model13.setProduct("Product 13");
		for(int i = 0; i < salesGrowths13.size(); i++){
			if (!salesGrowths13.get(i).getOneYearBackMTD().equals("0.0000")) {
				model13.setOneYearBackMTD(salesGrowths13.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model13.setTwoYearBackMTD(salesGrowths13.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model13.setPreviousYearMonthMTD(salesGrowths13.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYTD().equals("0.0000")) {
				model13.setPreviousYTD(salesGrowths13.get(i).getPreviousYTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearYTD().equals("0.0000")) {
				model13.setTwoYearYTD(salesGrowths13.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model14 = new CompiledModel();
		model14.setProduct("Product 14");
		for(int i = 0; i < salesGrowths14.size(); i++){
			if (!salesGrowths14.get(i).getOneYearBackMTD().equals("0.0000")) {
				model14.setOneYearBackMTD(salesGrowths14.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model14.setTwoYearBackMTD(salesGrowths14.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model14.setPreviousYearMonthMTD(salesGrowths14.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths14.get(i).getPreviousYTD().equals("0.0000")) {
				model14.setPreviousYTD(salesGrowths14.get(i).getPreviousYTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearYTD().equals("0.0000")) {
				model14.setTwoYearYTD(salesGrowths14.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model15 = new CompiledModel();
		model15.setProduct("Product 15");
		for(int i = 0; i < salesGrowths15.size(); i++){
			if (!salesGrowths15.get(i).getOneYearBackMTD().equals("0.0000")) {
				model15.setOneYearBackMTD(salesGrowths15.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model15.setTwoYearBackMTD(salesGrowths15.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model15.setPreviousYearMonthMTD(salesGrowths15.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYTD().equals("0.0000")) {
				model15.setPreviousYTD(salesGrowths15.get(i).getPreviousYTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearYTD().equals("0.0000")) {
				model15.setTwoYearYTD(salesGrowths15.get(i).getTwoYearYTD());
			}
		}
		
		// model 16
		CompiledModel model16 = new CompiledModel();
		model16.setProduct("Product 16");
		for(int i = 0; i < salesGrowths16.size(); i++){
			if (!salesGrowths16.get(i).getOneYearBackMTD().equals("0.0000")) {
				model16.setOneYearBackMTD(salesGrowths16.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model16.setTwoYearBackMTD(salesGrowths16.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model16.setPreviousYearMonthMTD(salesGrowths16.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYTD().equals("0.0000")) {
				model16.setPreviousYTD(salesGrowths16.get(i).getPreviousYTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearYTD().equals("0.0000")) {
				model16.setTwoYearYTD(salesGrowths16.get(i).getTwoYearYTD());
			}
		}
		
		CompiledModel model17 = new CompiledModel();
		model17.setProduct("Product 17");
		for(int i = 0; i < salesGrowths17.size(); i++){
			if (!salesGrowths17.get(i).getOneYearBackMTD().equals("0.0000")) {
				model17.setOneYearBackMTD(salesGrowths17.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model17.setTwoYearBackMTD(salesGrowths17.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model17.setPreviousYearMonthMTD(salesGrowths17.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYTD().equals("0.0000")) {
				model17.setPreviousYTD(salesGrowths17.get(i).getPreviousYTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearYTD().equals("0.0000")) {
				model17.setTwoYearYTD(salesGrowths17.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model18 = new CompiledModel();
		model18.setProduct("Product 18");
		for(int i = 0; i < salesGrowths18.size(); i++){
			if (!salesGrowths18.get(i).getOneYearBackMTD().equals("0.0000")) {
				model18.setOneYearBackMTD(salesGrowths18.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model18.setTwoYearBackMTD(salesGrowths18.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model18.setPreviousYearMonthMTD(salesGrowths18.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYTD().equals("0.0000")) {
				model18.setPreviousYTD(salesGrowths18.get(i).getPreviousYTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearYTD().equals("0.0000")) {
				model18.setTwoYearYTD(salesGrowths18.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model19 = new CompiledModel();
		model19.setProduct("Product 19");
		for(int i = 0; i < salesGrowths19.size(); i++){
			if (!salesGrowths19.get(i).getOneYearBackMTD().equals("0.0000")) {
				model19.setOneYearBackMTD(salesGrowths19.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model19.setTwoYearBackMTD(salesGrowths19.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model19.setPreviousYearMonthMTD(salesGrowths19.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYTD().equals("0.0000")) {
				model19.setPreviousYTD(salesGrowths19.get(i).getPreviousYTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearYTD().equals("0.0000")) {
				model19.setTwoYearYTD(salesGrowths19.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model20 = new CompiledModel();
		model20.setProduct("Product 20");
		for(int i = 0; i < salesGrowths20.size(); i++){
			if (!salesGrowths20.get(i).getOneYearBackMTD().equals("0.0000")) {
				model20.setOneYearBackMTD(salesGrowths20.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model20.setTwoYearBackMTD(salesGrowths20.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model20.setPreviousYearMonthMTD(salesGrowths20.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYTD().equals("0.0000")) {
				model20.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearYTD().equals("0.0000")) {
				model20.setTwoYearYTD(salesGrowths20.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model21 = new CompiledModel();
		model21.setProduct("Product 21");
		for(int i = 0; i < salesGrowths21.size(); i++){
			if (!salesGrowths21.get(i).getOneYearBackMTD().equals("0.0000")) {
				model21.setOneYearBackMTD(salesGrowths21.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model21.setTwoYearBackMTD(salesGrowths21.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model21.setPreviousYearMonthMTD(salesGrowths21.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYTD().equals("0.0000")) {
				model21.setPreviousYTD(salesGrowths21.get(i).getPreviousYTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearYTD().equals("0.0000")) {
				model21.setTwoYearYTD(salesGrowths21.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model22 = new CompiledModel();
		model22.setProduct("Product 22");
		for(int i = 0; i < salesGrowths22.size(); i++){
			if (!salesGrowths22.get(i).getOneYearBackMTD().equals("0.0000")) {
				model22.setOneYearBackMTD(salesGrowths22.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model22.setTwoYearBackMTD(salesGrowths22.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model22.setPreviousYearMonthMTD(salesGrowths22.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYTD().equals("0.0000")) {
				model22.setPreviousYTD(salesGrowths22.get(i).getPreviousYTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearYTD().equals("0.0000")) {
				model22.setTwoYearYTD(salesGrowths22.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model23 = new CompiledModel();
		model23.setProduct("Product 23");
		for(int i = 0; i < salesGrowths23.size(); i++){
			if (!salesGrowths23.get(i).getOneYearBackMTD().equals("0.0000")) {
				model23.setOneYearBackMTD(salesGrowths23.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model23.setTwoYearBackMTD(salesGrowths23.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model23.setPreviousYearMonthMTD(salesGrowths23.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYTD().equals("0.0000")) {
				model23.setPreviousYTD(salesGrowths23.get(i).getPreviousYTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearYTD().equals("0.0000")) {
				model23.setTwoYearYTD(salesGrowths23.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model24 = new CompiledModel();
		model24.setProduct("Product 24");
		for(int i = 0; i < salesGrowths24.size(); i++){
			if (!salesGrowths24.get(i).getOneYearBackMTD().equals("0.0000")) {
				model24.setOneYearBackMTD(salesGrowths24.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model24.setTwoYearBackMTD(salesGrowths24.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model24.setPreviousYearMonthMTD(salesGrowths24.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYTD().equals("0.0000")) {
				model24.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearYTD().equals("0.0000")) {
				model24.setTwoYearYTD(salesGrowths24.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model25 = new CompiledModel();
		model25.setProduct("Product 25");
		for(int i = 0; i < salesGrowths25.size(); i++){
			if (!salesGrowths25.get(i).getOneYearBackMTD().equals("0.0000")) {
				model25.setOneYearBackMTD(salesGrowths25.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model25.setTwoYearBackMTD(salesGrowths25.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model25.setPreviousYearMonthMTD(salesGrowths25.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYTD().equals("0.0000")) {
				model25.setPreviousYTD(salesGrowths25.get(i).getPreviousYTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearYTD().equals("0.0000")) {
				model25.setTwoYearYTD(salesGrowths25.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model26 = new CompiledModel();
		model26.setProduct("Product 26");
		for(int i = 0; i < salesGrowths26.size(); i++){
			if (!salesGrowths26.get(i).getOneYearBackMTD().equals("0.0000")) {
				model26.setOneYearBackMTD(salesGrowths26.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model26.setTwoYearBackMTD(salesGrowths26.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model26.setPreviousYearMonthMTD(salesGrowths26.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYTD().equals("0.0000")) {
				model26.setPreviousYTD(salesGrowths26.get(i).getPreviousYTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearYTD().equals("0.0000")) {
				model26.setTwoYearYTD(salesGrowths26.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model27 = new CompiledModel();
		model27.setProduct("Product 27");
		for(int i = 0; i < salesGrowths27.size(); i++){
			if (!salesGrowths27.get(i).getOneYearBackMTD().equals("0.0000")) {
				model27.setOneYearBackMTD(salesGrowths27.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model27.setTwoYearBackMTD(salesGrowths27.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model27.setPreviousYearMonthMTD(salesGrowths27.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYTD().equals("0.0000")) {
				model27.setPreviousYTD(salesGrowths27.get(i).getPreviousYTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearYTD().equals("0.0000")) {
				model27.setTwoYearYTD(salesGrowths27.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model28 = new CompiledModel();
		model28.setProduct("Product 28");
		for(int i = 0; i < salesGrowths28.size(); i++){
			if (!salesGrowths28.get(i).getOneYearBackMTD().equals("0.0000")) {
				model28.setOneYearBackMTD(salesGrowths28.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model28.setTwoYearBackMTD(salesGrowths28.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model28.setPreviousYearMonthMTD(salesGrowths28.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYTD().equals("0.0000")) {
				model28.setPreviousYTD(salesGrowths28.get(i).getPreviousYTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearYTD().equals("0.0000")) {
				model28.setTwoYearYTD(salesGrowths28.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model29 = new CompiledModel();
		model29.setProduct("Product 29");
		for(int i = 0; i < salesGrowths29.size(); i++){
			if (!salesGrowths29.get(i).getOneYearBackMTD().equals("0.0000")) {
				model29.setOneYearBackMTD(salesGrowths29.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model29.setTwoYearBackMTD(salesGrowths29.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model29.setPreviousYearMonthMTD(salesGrowths29.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYTD().equals("0.0000")) {
				model29.setPreviousYTD(salesGrowths29.get(i).getPreviousYTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearYTD().equals("0.0000")) {
				model29.setTwoYearYTD(salesGrowths29.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model30 = new CompiledModel();
		model30.setProduct("Product 30");
		for(int i = 0; i < salesGrowths30.size(); i++){
			if (!salesGrowths30.get(i).getOneYearBackMTD().equals("0.0000")) {
				model30.setOneYearBackMTD(salesGrowths30.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model30.setTwoYearBackMTD(salesGrowths30.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model30.setPreviousYearMonthMTD(salesGrowths30.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYTD().equals("0.0000")) {
				model30.setPreviousYTD(salesGrowths30.get(i).getPreviousYTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearYTD().equals("0.0000")) {
				model30.setTwoYearYTD(salesGrowths30.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model31 = new CompiledModel();
		model31.setProduct("Unknown Brand");
		for(int i = 0; i < salesGrowths31.size(); i++){
			if (!salesGrowths31.get(i).getOneYearBackMTD().equals("0.0000")) {
				model31.setOneYearBackMTD(salesGrowths31.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model31.setTwoYearBackMTD(salesGrowths31.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model31.setPreviousYearMonthMTD(salesGrowths31.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYTD().equals("0.0000")) {
				model31.setPreviousYTD(salesGrowths31.get(i).getPreviousYTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearYTD().equals("0.0000")) {
				model31.setTwoYearYTD(salesGrowths31.get(i).getTwoYearYTD());
			}
		}
	
		
		
		// lets add to the compiled model list
		compiledModels.add(model01);
		compiledModels.add(model02);
		compiledModels.add(model03);
		compiledModels.add(model04);
		compiledModels.add(model05);
		compiledModels.add(model06);
		compiledModels.add(model07);
		compiledModels.add(model08);
		compiledModels.add(model09);
		compiledModels.add(model10);
		compiledModels.add(model11);
		compiledModels.add(model12);
		compiledModels.add(model13);
		compiledModels.add(model14);
		compiledModels.add(model15);
		compiledModels.add(model16);
		compiledModels.add(model17);
		compiledModels.add(model18);
		compiledModels.add(model19);
		compiledModels.add(model20);
		compiledModels.add(model21);
		compiledModels.add(model22);
		compiledModels.add(model23);
		compiledModels.add(model24);
		compiledModels.add(model25);
		compiledModels.add(model26);
		compiledModels.add(model27);
		compiledModels.add(model28);
		compiledModels.add(model29);
		compiledModels.add(model30);
		compiledModels.add(model31);
		//  lets return the compiled list
		System.out.println(compiledModels);
		return compiledModels;
	}
	
	
	// quarter
	
	public static ArrayList<CompiledModel> getQuarterSalesGrowth(String date) {
		
		
		
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryQuarter(date, "LEA GLEN +S - 4924");
		
		ArrayList <SalesGrowth> salesGrowths01 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths02 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths03 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths04 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths05 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths06 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths07 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths08 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths09 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths10 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths11 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths12 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths13 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths14 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths15 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths16 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths17 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths18 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths19 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths20 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths21 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths22 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths23 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths24 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths25 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths26 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths27 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths28 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths29 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths30 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths31 = new ArrayList <SalesGrowth>();

		// lets separate the products
		for (int i = 0; i < query.getGrowthList().size(); i++) {
			//System.out.println(s);
			if (query.getGrowthList().get(i).getProduct().equals("Product 1")) {
				salesGrowths01.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 2")) {
				salesGrowths02.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 3")) {
				salesGrowths03.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 4")) {
				salesGrowths04.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 5")) {
				salesGrowths05.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 6")) {
				salesGrowths06.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 7")) {
				salesGrowths07.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 8")) {
				salesGrowths08.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 9")) {
				salesGrowths09.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 10")) {
				salesGrowths10.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 11")) {
				salesGrowths11.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 12")) {
				salesGrowths12.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 13")) {
				salesGrowths13.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 14")) {
				salesGrowths14.add(query.getGrowthList().get(i));

			} else if (query.getGrowthList().get(i).getProduct().equals("Product 15")) {
				salesGrowths15.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 16")) {
				salesGrowths16.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 17")) {
				salesGrowths17.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 18")) {
				salesGrowths18.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 19")) {
				salesGrowths19.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 20")) {
				salesGrowths20.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 21")) {
				salesGrowths21.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 22")) {
				salesGrowths22.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 23")) {
				salesGrowths23.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 24")) {
				salesGrowths24.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 25")) {
				salesGrowths25.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 26")) {
				salesGrowths26.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 27")) {
				salesGrowths27.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 28")) {
				salesGrowths28.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 29")) {
				salesGrowths29.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 30")) {
				salesGrowths30.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Unknown Brand")) {
				salesGrowths31.add(query.getGrowthList().get(i));
			} 
		
			
			
			
		}
		
		
		
		// a list of compiled product list
		compiledModels = new ArrayList<CompiledModel>();
		
		
		CompiledModel model01 = new CompiledModel();
		model01.setProduct("Product 1");
		for(int i = 0; i < salesGrowths01.size(); i++){
			if (!salesGrowths01.get(i).getOneYearBackMTD().equals("0.0000")) {
				model01.setOneYearBackMTD(salesGrowths01.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths01.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model01.setPreviousYearMonthMTD(salesGrowths01.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYTD().equals("0.0000")) {
				model01.setPreviousYTD(salesGrowths01.get(i).getPreviousYTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearYTD().equals("0.0000")) {
				model01.setTwoYearYTD(salesGrowths01.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model02 = new CompiledModel();
		model02.setProduct("Product 2");
		for(int i = 0; i < salesGrowths02.size(); i++){
			if (!salesGrowths02.get(i).getOneYearBackMTD().equals("0.0000")) {
				model02.setOneYearBackMTD(salesGrowths02.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model02.setTwoYearBackMTD(salesGrowths02.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model02.setPreviousYearMonthMTD(salesGrowths02.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYTD().equals("0.0000")) {
				model02.setPreviousYTD(salesGrowths02.get(i).getPreviousYTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearYTD().equals("0.0000")) {
				model02.setTwoYearYTD(salesGrowths02.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model03 = new CompiledModel();
		model03.setProduct("Product 3");
		for(int i = 0; i < salesGrowths03.size(); i++){
			if (!salesGrowths03.get(i).getOneYearBackMTD().equals("0.0000")) {
				model03.setOneYearBackMTD(salesGrowths03.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model03.setTwoYearBackMTD(salesGrowths03.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model03.setPreviousYearMonthMTD(salesGrowths03.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYTD().equals("0.0000")) {
				model03.setPreviousYTD(salesGrowths03.get(i).getPreviousYTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearYTD().equals("0.0000")) {
				model03.setTwoYearYTD(salesGrowths03.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model04 = new CompiledModel();
		model04.setProduct("Product 4");
		for(int i = 0; i < salesGrowths04.size(); i++){
			if (!salesGrowths04.get(i).getOneYearBackMTD().equals("0.0000")) {
				model04.setOneYearBackMTD(salesGrowths04.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model04.setTwoYearBackMTD(salesGrowths04.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model04.setPreviousYearMonthMTD(salesGrowths04.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYTD().equals("0.0000")) {
				model04.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearYTD().equals("0.0000")) {
				model04.setTwoYearYTD(salesGrowths04.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model05 = new CompiledModel();
		model05.setProduct("Product 5");
		for(int i = 0; i < salesGrowths05.size(); i++){
			if (!salesGrowths05.get(i).getOneYearBackMTD().equals("0.0000")) {
				model05.setOneYearBackMTD(salesGrowths05.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model05.setTwoYearBackMTD(salesGrowths05.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model05.setPreviousYearMonthMTD(salesGrowths05.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYTD().equals("0.0000")) {
				model05.setPreviousYTD(salesGrowths05.get(i).getPreviousYTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearYTD().equals("0.0000")) {
				model05.setTwoYearYTD(salesGrowths05.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model06 = new CompiledModel();
		model06.setProduct("Product 6");
		for(int i = 0; i < salesGrowths06.size(); i++){
			if (!salesGrowths06.get(i).getOneYearBackMTD().equals("0.0000")) {
				model06.setOneYearBackMTD(salesGrowths06.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model06.setTwoYearBackMTD(salesGrowths06.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model06.setPreviousYearMonthMTD(salesGrowths06.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYTD().equals("0.0000")) {
				model06.setPreviousYTD(salesGrowths06.get(i).getPreviousYTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearYTD().equals("0.0000")) {
				model06.setTwoYearYTD(salesGrowths06.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model07 = new CompiledModel();
		model07.setProduct("Product 7");
		for(int i = 0; i < salesGrowths07.size(); i++){
			if (!salesGrowths07.get(i).getOneYearBackMTD().equals("0.0000")) {
				model07.setOneYearBackMTD(salesGrowths07.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model07.setTwoYearBackMTD(salesGrowths07.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model07.setPreviousYearMonthMTD(salesGrowths07.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYTD().equals("0.0000")) {
				model07.setPreviousYTD(salesGrowths07.get(i).getPreviousYTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearYTD().equals("0.0000")) {
				model07.setTwoYearYTD(salesGrowths07.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model08 = new CompiledModel();
		model08.setProduct("Product 8");
		for(int i = 0; i < salesGrowths08.size(); i++){
			if (!salesGrowths08.get(i).getOneYearBackMTD().equals("0.0000")) {
				model08.setOneYearBackMTD(salesGrowths08.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model08.setTwoYearBackMTD(salesGrowths08.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model08.setPreviousYearMonthMTD(salesGrowths08.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYTD().equals("0.0000")) {
				model08.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearYTD().equals("0.0000")) {
				model08.setTwoYearYTD(salesGrowths08.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model09 = new CompiledModel();
		model09.setProduct("Product 9");
		for(int i = 0; i < salesGrowths09.size(); i++){
			if (!salesGrowths09.get(i).getOneYearBackMTD().equals("0.0000")) {
				model09.setOneYearBackMTD(salesGrowths09.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model09.setTwoYearBackMTD(salesGrowths09.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model09.setPreviousYearMonthMTD(salesGrowths09.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYTD().equals("0.0000")) {
				model09.setPreviousYTD(salesGrowths09.get(i).getPreviousYTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearYTD().equals("0.0000")) {
				model09.setTwoYearYTD(salesGrowths09.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model10 = new CompiledModel();
		model10.setProduct("Product 10");
		for(int i = 0; i < salesGrowths10.size(); i++){
			if (!salesGrowths10.get(i).getOneYearBackMTD().equals("0.0000")) {
				model10.setOneYearBackMTD(salesGrowths10.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model10.setTwoYearBackMTD(salesGrowths10.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model10.setPreviousYearMonthMTD(salesGrowths10.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYTD().equals("0.0000")) {
				model10.setPreviousYTD(salesGrowths10.get(i).getPreviousYTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearYTD().equals("0.0000")) {
				model10.setTwoYearYTD(salesGrowths10.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model11 = new CompiledModel();
		model11.setProduct("Product 11");
		for(int i = 0; i < salesGrowths11.size(); i++){
			if (!salesGrowths11.get(i).getOneYearBackMTD().equals("0.0000")) {
				model11.setOneYearBackMTD(salesGrowths11.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model11.setTwoYearBackMTD(salesGrowths11.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model11.setPreviousYearMonthMTD(salesGrowths11.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYTD().equals("0.0000")) {
				model11.setPreviousYTD(salesGrowths11.get(i).getPreviousYTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearYTD().equals("0.0000")) {
				model11.setTwoYearYTD(salesGrowths11.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model12 = new CompiledModel();
		model12.setProduct("Product 12");
		for(int i = 0; i < salesGrowths12.size(); i++){
			if (!salesGrowths12.get(i).getOneYearBackMTD().equals("0.0000")) {
				model12.setOneYearBackMTD(salesGrowths12.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths12.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model12.setPreviousYearMonthMTD(salesGrowths12.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYTD().equals("0.0000")) {
				model12.setPreviousYTD(salesGrowths12.get(i).getPreviousYTD());
				
			} else if (!salesGrowths12.get(i).getTwoYearYTD().equals("0.0000")) {
				model12.setTwoYearYTD(salesGrowths12.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model13 = new CompiledModel();
		model13.setProduct("Product 13");
		for(int i = 0; i < salesGrowths13.size(); i++){
			if (!salesGrowths13.get(i).getOneYearBackMTD().equals("0.0000")) {
				model13.setOneYearBackMTD(salesGrowths13.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model13.setTwoYearBackMTD(salesGrowths13.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model13.setPreviousYearMonthMTD(salesGrowths13.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYTD().equals("0.0000")) {
				model13.setPreviousYTD(salesGrowths13.get(i).getPreviousYTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearYTD().equals("0.0000")) {
				model13.setTwoYearYTD(salesGrowths13.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model14 = new CompiledModel();
		model14.setProduct("Product 14");
		for(int i = 0; i < salesGrowths14.size(); i++){
			if (!salesGrowths14.get(i).getOneYearBackMTD().equals("0.0000")) {
				model14.setOneYearBackMTD(salesGrowths14.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model14.setTwoYearBackMTD(salesGrowths14.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model14.setPreviousYearMonthMTD(salesGrowths14.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths14.get(i).getPreviousYTD().equals("0.0000")) {
				model14.setPreviousYTD(salesGrowths14.get(i).getPreviousYTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearYTD().equals("0.0000")) {
				model14.setTwoYearYTD(salesGrowths14.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model15 = new CompiledModel();
		model15.setProduct("Product 15");
		for(int i = 0; i < salesGrowths15.size(); i++){
			if (!salesGrowths15.get(i).getOneYearBackMTD().equals("0.0000")) {
				model15.setOneYearBackMTD(salesGrowths15.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model15.setTwoYearBackMTD(salesGrowths15.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model15.setPreviousYearMonthMTD(salesGrowths15.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYTD().equals("0.0000")) {
				model15.setPreviousYTD(salesGrowths15.get(i).getPreviousYTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearYTD().equals("0.0000")) {
				model15.setTwoYearYTD(salesGrowths15.get(i).getTwoYearYTD());
			}
		}
		
		// model 16
		CompiledModel model16 = new CompiledModel();
		model16.setProduct("Product 16");
		for(int i = 0; i < salesGrowths16.size(); i++){
			if (!salesGrowths16.get(i).getOneYearBackMTD().equals("0.0000")) {
				model16.setOneYearBackMTD(salesGrowths16.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model16.setTwoYearBackMTD(salesGrowths16.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model16.setPreviousYearMonthMTD(salesGrowths16.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYTD().equals("0.0000")) {
				model16.setPreviousYTD(salesGrowths16.get(i).getPreviousYTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearYTD().equals("0.0000")) {
				model16.setTwoYearYTD(salesGrowths16.get(i).getTwoYearYTD());
			}
		}
		
		CompiledModel model17 = new CompiledModel();
		model17.setProduct("Product 17");
		for(int i = 0; i < salesGrowths17.size(); i++){
			if (!salesGrowths17.get(i).getOneYearBackMTD().equals("0.0000")) {
				model17.setOneYearBackMTD(salesGrowths17.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model17.setTwoYearBackMTD(salesGrowths17.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model17.setPreviousYearMonthMTD(salesGrowths17.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYTD().equals("0.0000")) {
				model17.setPreviousYTD(salesGrowths17.get(i).getPreviousYTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearYTD().equals("0.0000")) {
				model17.setTwoYearYTD(salesGrowths17.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model18 = new CompiledModel();
		model18.setProduct("Product 18");
		for(int i = 0; i < salesGrowths18.size(); i++){
			if (!salesGrowths18.get(i).getOneYearBackMTD().equals("0.0000")) {
				model18.setOneYearBackMTD(salesGrowths18.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model18.setTwoYearBackMTD(salesGrowths18.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model18.setPreviousYearMonthMTD(salesGrowths18.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYTD().equals("0.0000")) {
				model18.setPreviousYTD(salesGrowths18.get(i).getPreviousYTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearYTD().equals("0.0000")) {
				model18.setTwoYearYTD(salesGrowths18.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model19 = new CompiledModel();
		model19.setProduct("Product 19");
		for(int i = 0; i < salesGrowths19.size(); i++){
			if (!salesGrowths19.get(i).getOneYearBackMTD().equals("0.0000")) {
				model19.setOneYearBackMTD(salesGrowths19.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model19.setTwoYearBackMTD(salesGrowths19.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model19.setPreviousYearMonthMTD(salesGrowths19.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYTD().equals("0.0000")) {
				model19.setPreviousYTD(salesGrowths19.get(i).getPreviousYTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearYTD().equals("0.0000")) {
				model19.setTwoYearYTD(salesGrowths19.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model20 = new CompiledModel();
		model20.setProduct("Product 20");
		for(int i = 0; i < salesGrowths20.size(); i++){
			if (!salesGrowths20.get(i).getOneYearBackMTD().equals("0.0000")) {
				model20.setOneYearBackMTD(salesGrowths20.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model20.setTwoYearBackMTD(salesGrowths20.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model20.setPreviousYearMonthMTD(salesGrowths20.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYTD().equals("0.0000")) {
				model20.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearYTD().equals("0.0000")) {
				model20.setTwoYearYTD(salesGrowths20.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model21 = new CompiledModel();
		model21.setProduct("Product 21");
		for(int i = 0; i < salesGrowths21.size(); i++){
			if (!salesGrowths21.get(i).getOneYearBackMTD().equals("0.0000")) {
				model21.setOneYearBackMTD(salesGrowths21.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model21.setTwoYearBackMTD(salesGrowths21.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model21.setPreviousYearMonthMTD(salesGrowths21.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYTD().equals("0.0000")) {
				model21.setPreviousYTD(salesGrowths21.get(i).getPreviousYTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearYTD().equals("0.0000")) {
				model21.setTwoYearYTD(salesGrowths21.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model22 = new CompiledModel();
		model22.setProduct("Product 22");
		for(int i = 0; i < salesGrowths22.size(); i++){
			if (!salesGrowths22.get(i).getOneYearBackMTD().equals("0.0000")) {
				model22.setOneYearBackMTD(salesGrowths22.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model22.setTwoYearBackMTD(salesGrowths22.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model22.setPreviousYearMonthMTD(salesGrowths22.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYTD().equals("0.0000")) {
				model22.setPreviousYTD(salesGrowths22.get(i).getPreviousYTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearYTD().equals("0.0000")) {
				model22.setTwoYearYTD(salesGrowths22.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model23 = new CompiledModel();
		model23.setProduct("Product 23");
		for(int i = 0; i < salesGrowths23.size(); i++){
			if (!salesGrowths23.get(i).getOneYearBackMTD().equals("0.0000")) {
				model23.setOneYearBackMTD(salesGrowths23.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model23.setTwoYearBackMTD(salesGrowths23.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model23.setPreviousYearMonthMTD(salesGrowths23.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYTD().equals("0.0000")) {
				model23.setPreviousYTD(salesGrowths23.get(i).getPreviousYTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearYTD().equals("0.0000")) {
				model23.setTwoYearYTD(salesGrowths23.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model24 = new CompiledModel();
		model24.setProduct("Product 24");
		for(int i = 0; i < salesGrowths24.size(); i++){
			if (!salesGrowths24.get(i).getOneYearBackMTD().equals("0.0000")) {
				model24.setOneYearBackMTD(salesGrowths24.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model24.setTwoYearBackMTD(salesGrowths24.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model24.setPreviousYearMonthMTD(salesGrowths24.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYTD().equals("0.0000")) {
				model24.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearYTD().equals("0.0000")) {
				model24.setTwoYearYTD(salesGrowths24.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model25 = new CompiledModel();
		model25.setProduct("Product 25");
		for(int i = 0; i < salesGrowths25.size(); i++){
			if (!salesGrowths25.get(i).getOneYearBackMTD().equals("0.0000")) {
				model25.setOneYearBackMTD(salesGrowths25.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model25.setTwoYearBackMTD(salesGrowths25.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model25.setPreviousYearMonthMTD(salesGrowths25.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYTD().equals("0.0000")) {
				model25.setPreviousYTD(salesGrowths25.get(i).getPreviousYTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearYTD().equals("0.0000")) {
				model25.setTwoYearYTD(salesGrowths25.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model26 = new CompiledModel();
		model26.setProduct("Product 26");
		for(int i = 0; i < salesGrowths26.size(); i++){
			if (!salesGrowths26.get(i).getOneYearBackMTD().equals("0.0000")) {
				model26.setOneYearBackMTD(salesGrowths26.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model26.setTwoYearBackMTD(salesGrowths26.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model26.setPreviousYearMonthMTD(salesGrowths26.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYTD().equals("0.0000")) {
				model26.setPreviousYTD(salesGrowths26.get(i).getPreviousYTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearYTD().equals("0.0000")) {
				model26.setTwoYearYTD(salesGrowths26.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model27 = new CompiledModel();
		model27.setProduct("Product 27");
		for(int i = 0; i < salesGrowths27.size(); i++){
			if (!salesGrowths27.get(i).getOneYearBackMTD().equals("0.0000")) {
				model27.setOneYearBackMTD(salesGrowths27.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model27.setTwoYearBackMTD(salesGrowths27.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model27.setPreviousYearMonthMTD(salesGrowths27.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYTD().equals("0.0000")) {
				model27.setPreviousYTD(salesGrowths27.get(i).getPreviousYTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearYTD().equals("0.0000")) {
				model27.setTwoYearYTD(salesGrowths27.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model28 = new CompiledModel();
		model28.setProduct("Product 28");
		for(int i = 0; i < salesGrowths28.size(); i++){
			if (!salesGrowths28.get(i).getOneYearBackMTD().equals("0.0000")) {
				model28.setOneYearBackMTD(salesGrowths28.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model28.setTwoYearBackMTD(salesGrowths28.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model28.setPreviousYearMonthMTD(salesGrowths28.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYTD().equals("0.0000")) {
				model28.setPreviousYTD(salesGrowths28.get(i).getPreviousYTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearYTD().equals("0.0000")) {
				model28.setTwoYearYTD(salesGrowths28.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model29 = new CompiledModel();
		model29.setProduct("Product 29");
		for(int i = 0; i < salesGrowths29.size(); i++){
			if (!salesGrowths29.get(i).getOneYearBackMTD().equals("0.0000")) {
				model29.setOneYearBackMTD(salesGrowths29.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model29.setTwoYearBackMTD(salesGrowths29.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model29.setPreviousYearMonthMTD(salesGrowths29.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYTD().equals("0.0000")) {
				model29.setPreviousYTD(salesGrowths29.get(i).getPreviousYTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearYTD().equals("0.0000")) {
				model29.setTwoYearYTD(salesGrowths29.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model30 = new CompiledModel();
		model30.setProduct("Product 30");
		for(int i = 0; i < salesGrowths30.size(); i++){
			if (!salesGrowths30.get(i).getOneYearBackMTD().equals("0.0000")) {
				model30.setOneYearBackMTD(salesGrowths30.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model30.setTwoYearBackMTD(salesGrowths30.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model30.setPreviousYearMonthMTD(salesGrowths30.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYTD().equals("0.0000")) {
				model30.setPreviousYTD(salesGrowths30.get(i).getPreviousYTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearYTD().equals("0.0000")) {
				model30.setTwoYearYTD(salesGrowths30.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model31 = new CompiledModel();
		model31.setProduct("Unknown Brand");
		for(int i = 0; i < salesGrowths31.size(); i++){
			if (!salesGrowths31.get(i).getOneYearBackMTD().equals("0.0000")) {
				model31.setOneYearBackMTD(salesGrowths31.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model31.setTwoYearBackMTD(salesGrowths31.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model31.setPreviousYearMonthMTD(salesGrowths31.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYTD().equals("0.0000")) {
				model31.setPreviousYTD(salesGrowths31.get(i).getPreviousYTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearYTD().equals("0.0000")) {
				model31.setTwoYearYTD(salesGrowths31.get(i).getTwoYearYTD());
			}
		}
	
		
		
		// lets add to the compiled model list
		compiledModels.add(model01);
		compiledModels.add(model02);
		compiledModels.add(model03);
		compiledModels.add(model04);
		compiledModels.add(model05);
		compiledModels.add(model06);
		compiledModels.add(model07);
		compiledModels.add(model08);
		compiledModels.add(model09);
		compiledModels.add(model10);
		compiledModels.add(model11);
		compiledModels.add(model12);
		compiledModels.add(model13);
		compiledModels.add(model14);
		compiledModels.add(model15);
		compiledModels.add(model16);
		compiledModels.add(model17);
		compiledModels.add(model18);
		compiledModels.add(model19);
		compiledModels.add(model20);
		compiledModels.add(model21);
		compiledModels.add(model22);
		compiledModels.add(model23);
		compiledModels.add(model24);
		compiledModels.add(model25);
		compiledModels.add(model26);
		compiledModels.add(model27);
		compiledModels.add(model28);
		compiledModels.add(model29);
		compiledModels.add(model30);
		compiledModels.add(model31);
		//  lets return the compiled list
		System.out.println(compiledModels);
		return compiledModels;
	}
	
	// product
	public static ArrayList<CompiledModel> getProductSalesGrowth(String date, String product) {
		
		
		
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryProduct(date, product, "LEA GLEN +S - 4924");
		
		ArrayList <SalesGrowth> salesGrowths01 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths02 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths03 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths04 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths05 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths06 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths07 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths08 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths09 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths10 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths11 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths12 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths13 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths14 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths15 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths16 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths17 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths18 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths19 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths20 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths21 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths22 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths23 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths24 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths25 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths26 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths27 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths28 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths29 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths30 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths31 = new ArrayList <SalesGrowth>();

		// lets separate the products
		for (int i = 0; i < query.getGrowthList().size(); i++) {
			//System.out.println(s);
			if (query.getGrowthList().get(i).getProduct().equals("Product 1")) {
				salesGrowths01.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 2")) {
				salesGrowths02.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 3")) {
				salesGrowths03.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 4")) {
				salesGrowths04.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 5")) {
				salesGrowths05.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 6")) {
				salesGrowths06.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 7")) {
				salesGrowths07.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 8")) {
				salesGrowths08.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 9")) {
				salesGrowths09.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 10")) {
				salesGrowths10.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 11")) {
				salesGrowths11.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 12")) {
				salesGrowths12.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 13")) {
				salesGrowths13.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 14")) {
				salesGrowths14.add(query.getGrowthList().get(i));

			} else if (query.getGrowthList().get(i).getProduct().equals("Product 15")) {
				salesGrowths15.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 16")) {
				salesGrowths16.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 17")) {
				salesGrowths17.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 18")) {
				salesGrowths18.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 19")) {
				salesGrowths19.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 20")) {
				salesGrowths20.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 21")) {
				salesGrowths21.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 22")) {
				salesGrowths22.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 23")) {
				salesGrowths23.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 24")) {
				salesGrowths24.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 25")) {
				salesGrowths25.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 26")) {
				salesGrowths26.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 27")) {
				salesGrowths27.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 28")) {
				salesGrowths28.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 29")) {
				salesGrowths29.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 30")) {
				salesGrowths30.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Unknown Brand")) {
				salesGrowths31.add(query.getGrowthList().get(i));
			} 
		
			
			
			
		}
		
		
		
		// a list of compiled product list
		compiledModels = new ArrayList<CompiledModel>();
		
		
		CompiledModel model01 = new CompiledModel();
		model01.setProduct("Product 1");
		for(int i = 0; i < salesGrowths01.size(); i++){
			if (!salesGrowths01.get(i).getOneYearBackMTD().equals("0.0000")) {
				model01.setOneYearBackMTD(salesGrowths01.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths01.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model01.setPreviousYearMonthMTD(salesGrowths01.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYTD().equals("0.0000")) {
				model01.setPreviousYTD(salesGrowths01.get(i).getPreviousYTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearYTD().equals("0.0000")) {
				model01.setTwoYearYTD(salesGrowths01.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model02 = new CompiledModel();
		model02.setProduct("Product 2");
		for(int i = 0; i < salesGrowths02.size(); i++){
			if (!salesGrowths02.get(i).getOneYearBackMTD().equals("0.0000")) {
				model02.setOneYearBackMTD(salesGrowths02.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model02.setTwoYearBackMTD(salesGrowths02.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model02.setPreviousYearMonthMTD(salesGrowths02.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYTD().equals("0.0000")) {
				model02.setPreviousYTD(salesGrowths02.get(i).getPreviousYTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearYTD().equals("0.0000")) {
				model02.setTwoYearYTD(salesGrowths02.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model03 = new CompiledModel();
		model03.setProduct("Product 3");
		for(int i = 0; i < salesGrowths03.size(); i++){
			if (!salesGrowths03.get(i).getOneYearBackMTD().equals("0.0000")) {
				model03.setOneYearBackMTD(salesGrowths03.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model03.setTwoYearBackMTD(salesGrowths03.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model03.setPreviousYearMonthMTD(salesGrowths03.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYTD().equals("0.0000")) {
				model03.setPreviousYTD(salesGrowths03.get(i).getPreviousYTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearYTD().equals("0.0000")) {
				model03.setTwoYearYTD(salesGrowths03.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model04 = new CompiledModel();
		model04.setProduct("Product 4");
		for(int i = 0; i < salesGrowths04.size(); i++){
			if (!salesGrowths04.get(i).getOneYearBackMTD().equals("0.0000")) {
				model04.setOneYearBackMTD(salesGrowths04.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model04.setTwoYearBackMTD(salesGrowths04.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model04.setPreviousYearMonthMTD(salesGrowths04.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYTD().equals("0.0000")) {
				model04.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearYTD().equals("0.0000")) {
				model04.setTwoYearYTD(salesGrowths04.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model05 = new CompiledModel();
		model05.setProduct("Product 5");
		for(int i = 0; i < salesGrowths05.size(); i++){
			if (!salesGrowths05.get(i).getOneYearBackMTD().equals("0.0000")) {
				model05.setOneYearBackMTD(salesGrowths05.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model05.setTwoYearBackMTD(salesGrowths05.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model05.setPreviousYearMonthMTD(salesGrowths05.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYTD().equals("0.0000")) {
				model05.setPreviousYTD(salesGrowths05.get(i).getPreviousYTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearYTD().equals("0.0000")) {
				model05.setTwoYearYTD(salesGrowths05.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model06 = new CompiledModel();
		model06.setProduct("Product 6");
		for(int i = 0; i < salesGrowths06.size(); i++){
			if (!salesGrowths06.get(i).getOneYearBackMTD().equals("0.0000")) {
				model06.setOneYearBackMTD(salesGrowths06.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model06.setTwoYearBackMTD(salesGrowths06.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model06.setPreviousYearMonthMTD(salesGrowths06.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYTD().equals("0.0000")) {
				model06.setPreviousYTD(salesGrowths06.get(i).getPreviousYTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearYTD().equals("0.0000")) {
				model06.setTwoYearYTD(salesGrowths06.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model07 = new CompiledModel();
		model07.setProduct("Product 7");
		for(int i = 0; i < salesGrowths07.size(); i++){
			if (!salesGrowths07.get(i).getOneYearBackMTD().equals("0.0000")) {
				model07.setOneYearBackMTD(salesGrowths07.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model07.setTwoYearBackMTD(salesGrowths07.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model07.setPreviousYearMonthMTD(salesGrowths07.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYTD().equals("0.0000")) {
				model07.setPreviousYTD(salesGrowths07.get(i).getPreviousYTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearYTD().equals("0.0000")) {
				model07.setTwoYearYTD(salesGrowths07.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model08 = new CompiledModel();
		model08.setProduct("Product 8");
		for(int i = 0; i < salesGrowths08.size(); i++){
			if (!salesGrowths08.get(i).getOneYearBackMTD().equals("0.0000")) {
				model08.setOneYearBackMTD(salesGrowths08.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model08.setTwoYearBackMTD(salesGrowths08.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model08.setPreviousYearMonthMTD(salesGrowths08.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYTD().equals("0.0000")) {
				model08.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearYTD().equals("0.0000")) {
				model08.setTwoYearYTD(salesGrowths08.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model09 = new CompiledModel();
		model09.setProduct("Product 9");
		for(int i = 0; i < salesGrowths09.size(); i++){
			if (!salesGrowths09.get(i).getOneYearBackMTD().equals("0.0000")) {
				model09.setOneYearBackMTD(salesGrowths09.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model09.setTwoYearBackMTD(salesGrowths09.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model09.setPreviousYearMonthMTD(salesGrowths09.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYTD().equals("0.0000")) {
				model09.setPreviousYTD(salesGrowths09.get(i).getPreviousYTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearYTD().equals("0.0000")) {
				model09.setTwoYearYTD(salesGrowths09.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model10 = new CompiledModel();
		model10.setProduct("Product 10");
		for(int i = 0; i < salesGrowths10.size(); i++){
			if (!salesGrowths10.get(i).getOneYearBackMTD().equals("0.0000")) {
				model10.setOneYearBackMTD(salesGrowths10.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model10.setTwoYearBackMTD(salesGrowths10.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model10.setPreviousYearMonthMTD(salesGrowths10.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYTD().equals("0.0000")) {
				model10.setPreviousYTD(salesGrowths10.get(i).getPreviousYTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearYTD().equals("0.0000")) {
				model10.setTwoYearYTD(salesGrowths10.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model11 = new CompiledModel();
		model11.setProduct("Product 11");
		for(int i = 0; i < salesGrowths11.size(); i++){
			if (!salesGrowths11.get(i).getOneYearBackMTD().equals("0.0000")) {
				model11.setOneYearBackMTD(salesGrowths11.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model11.setTwoYearBackMTD(salesGrowths11.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model11.setPreviousYearMonthMTD(salesGrowths11.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYTD().equals("0.0000")) {
				model11.setPreviousYTD(salesGrowths11.get(i).getPreviousYTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearYTD().equals("0.0000")) {
				model11.setTwoYearYTD(salesGrowths11.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model12 = new CompiledModel();
		model12.setProduct("Product 12");
		for(int i = 0; i < salesGrowths12.size(); i++){
			if (!salesGrowths12.get(i).getOneYearBackMTD().equals("0.0000")) {
				model12.setOneYearBackMTD(salesGrowths12.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths12.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model12.setPreviousYearMonthMTD(salesGrowths12.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYTD().equals("0.0000")) {
				model12.setPreviousYTD(salesGrowths12.get(i).getPreviousYTD());
				
			} else if (!salesGrowths12.get(i).getTwoYearYTD().equals("0.0000")) {
				model12.setTwoYearYTD(salesGrowths12.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model13 = new CompiledModel();
		model13.setProduct("Product 13");
		for(int i = 0; i < salesGrowths13.size(); i++){
			if (!salesGrowths13.get(i).getOneYearBackMTD().equals("0.0000")) {
				model13.setOneYearBackMTD(salesGrowths13.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model13.setTwoYearBackMTD(salesGrowths13.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model13.setPreviousYearMonthMTD(salesGrowths13.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYTD().equals("0.0000")) {
				model13.setPreviousYTD(salesGrowths13.get(i).getPreviousYTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearYTD().equals("0.0000")) {
				model13.setTwoYearYTD(salesGrowths13.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model14 = new CompiledModel();
		model14.setProduct("Product 14");
		for(int i = 0; i < salesGrowths14.size(); i++){
			if (!salesGrowths14.get(i).getOneYearBackMTD().equals("0.0000")) {
				model14.setOneYearBackMTD(salesGrowths14.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model14.setTwoYearBackMTD(salesGrowths14.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model14.setPreviousYearMonthMTD(salesGrowths14.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths14.get(i).getPreviousYTD().equals("0.0000")) {
				model14.setPreviousYTD(salesGrowths14.get(i).getPreviousYTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearYTD().equals("0.0000")) {
				model14.setTwoYearYTD(salesGrowths14.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model15 = new CompiledModel();
		model15.setProduct("Product 15");
		for(int i = 0; i < salesGrowths15.size(); i++){
			if (!salesGrowths15.get(i).getOneYearBackMTD().equals("0.0000")) {
				model15.setOneYearBackMTD(salesGrowths15.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model15.setTwoYearBackMTD(salesGrowths15.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model15.setPreviousYearMonthMTD(salesGrowths15.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYTD().equals("0.0000")) {
				model15.setPreviousYTD(salesGrowths15.get(i).getPreviousYTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearYTD().equals("0.0000")) {
				model15.setTwoYearYTD(salesGrowths15.get(i).getTwoYearYTD());
			}
		}
		
		// model 16
		CompiledModel model16 = new CompiledModel();
		model16.setProduct("Product 16");
		for(int i = 0; i < salesGrowths16.size(); i++){
			if (!salesGrowths16.get(i).getOneYearBackMTD().equals("0.0000")) {
				model16.setOneYearBackMTD(salesGrowths16.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model16.setTwoYearBackMTD(salesGrowths16.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model16.setPreviousYearMonthMTD(salesGrowths16.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYTD().equals("0.0000")) {
				model16.setPreviousYTD(salesGrowths16.get(i).getPreviousYTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearYTD().equals("0.0000")) {
				model16.setTwoYearYTD(salesGrowths16.get(i).getTwoYearYTD());
			}
		}
		
		CompiledModel model17 = new CompiledModel();
		model17.setProduct("Product 17");
		for(int i = 0; i < salesGrowths17.size(); i++){
			if (!salesGrowths17.get(i).getOneYearBackMTD().equals("0.0000")) {
				model17.setOneYearBackMTD(salesGrowths17.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model17.setTwoYearBackMTD(salesGrowths17.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model17.setPreviousYearMonthMTD(salesGrowths17.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYTD().equals("0.0000")) {
				model17.setPreviousYTD(salesGrowths17.get(i).getPreviousYTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearYTD().equals("0.0000")) {
				model17.setTwoYearYTD(salesGrowths17.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model18 = new CompiledModel();
		model18.setProduct("Product 18");
		for(int i = 0; i < salesGrowths18.size(); i++){
			if (!salesGrowths18.get(i).getOneYearBackMTD().equals("0.0000")) {
				model18.setOneYearBackMTD(salesGrowths18.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model18.setTwoYearBackMTD(salesGrowths18.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model18.setPreviousYearMonthMTD(salesGrowths18.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYTD().equals("0.0000")) {
				model18.setPreviousYTD(salesGrowths18.get(i).getPreviousYTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearYTD().equals("0.0000")) {
				model18.setTwoYearYTD(salesGrowths18.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model19 = new CompiledModel();
		model19.setProduct("Product 19");
		for(int i = 0; i < salesGrowths19.size(); i++){
			if (!salesGrowths19.get(i).getOneYearBackMTD().equals("0.0000")) {
				model19.setOneYearBackMTD(salesGrowths19.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model19.setTwoYearBackMTD(salesGrowths19.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model19.setPreviousYearMonthMTD(salesGrowths19.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYTD().equals("0.0000")) {
				model19.setPreviousYTD(salesGrowths19.get(i).getPreviousYTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearYTD().equals("0.0000")) {
				model19.setTwoYearYTD(salesGrowths19.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model20 = new CompiledModel();
		model20.setProduct("Product 20");
		for(int i = 0; i < salesGrowths20.size(); i++){
			if (!salesGrowths20.get(i).getOneYearBackMTD().equals("0.0000")) {
				model20.setOneYearBackMTD(salesGrowths20.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model20.setTwoYearBackMTD(salesGrowths20.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model20.setPreviousYearMonthMTD(salesGrowths20.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYTD().equals("0.0000")) {
				model20.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearYTD().equals("0.0000")) {
				model20.setTwoYearYTD(salesGrowths20.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model21 = new CompiledModel();
		model21.setProduct("Product 21");
		for(int i = 0; i < salesGrowths21.size(); i++){
			if (!salesGrowths21.get(i).getOneYearBackMTD().equals("0.0000")) {
				model21.setOneYearBackMTD(salesGrowths21.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model21.setTwoYearBackMTD(salesGrowths21.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model21.setPreviousYearMonthMTD(salesGrowths21.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYTD().equals("0.0000")) {
				model21.setPreviousYTD(salesGrowths21.get(i).getPreviousYTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearYTD().equals("0.0000")) {
				model21.setTwoYearYTD(salesGrowths21.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model22 = new CompiledModel();
		model22.setProduct("Product 22");
		for(int i = 0; i < salesGrowths22.size(); i++){
			if (!salesGrowths22.get(i).getOneYearBackMTD().equals("0.0000")) {
				model22.setOneYearBackMTD(salesGrowths22.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model22.setTwoYearBackMTD(salesGrowths22.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model22.setPreviousYearMonthMTD(salesGrowths22.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYTD().equals("0.0000")) {
				model22.setPreviousYTD(salesGrowths22.get(i).getPreviousYTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearYTD().equals("0.0000")) {
				model22.setTwoYearYTD(salesGrowths22.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model23 = new CompiledModel();
		model23.setProduct("Product 23");
		for(int i = 0; i < salesGrowths23.size(); i++){
			if (!salesGrowths23.get(i).getOneYearBackMTD().equals("0.0000")) {
				model23.setOneYearBackMTD(salesGrowths23.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model23.setTwoYearBackMTD(salesGrowths23.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model23.setPreviousYearMonthMTD(salesGrowths23.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYTD().equals("0.0000")) {
				model23.setPreviousYTD(salesGrowths23.get(i).getPreviousYTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearYTD().equals("0.0000")) {
				model23.setTwoYearYTD(salesGrowths23.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model24 = new CompiledModel();
		model24.setProduct("Product 24");
		for(int i = 0; i < salesGrowths24.size(); i++){
			if (!salesGrowths24.get(i).getOneYearBackMTD().equals("0.0000")) {
				model24.setOneYearBackMTD(salesGrowths24.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model24.setTwoYearBackMTD(salesGrowths24.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model24.setPreviousYearMonthMTD(salesGrowths24.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYTD().equals("0.0000")) {
				model24.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearYTD().equals("0.0000")) {
				model24.setTwoYearYTD(salesGrowths24.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model25 = new CompiledModel();
		model25.setProduct("Product 25");
		for(int i = 0; i < salesGrowths25.size(); i++){
			if (!salesGrowths25.get(i).getOneYearBackMTD().equals("0.0000")) {
				model25.setOneYearBackMTD(salesGrowths25.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model25.setTwoYearBackMTD(salesGrowths25.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model25.setPreviousYearMonthMTD(salesGrowths25.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYTD().equals("0.0000")) {
				model25.setPreviousYTD(salesGrowths25.get(i).getPreviousYTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearYTD().equals("0.0000")) {
				model25.setTwoYearYTD(salesGrowths25.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model26 = new CompiledModel();
		model26.setProduct("Product 26");
		for(int i = 0; i < salesGrowths26.size(); i++){
			if (!salesGrowths26.get(i).getOneYearBackMTD().equals("0.0000")) {
				model26.setOneYearBackMTD(salesGrowths26.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model26.setTwoYearBackMTD(salesGrowths26.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model26.setPreviousYearMonthMTD(salesGrowths26.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYTD().equals("0.0000")) {
				model26.setPreviousYTD(salesGrowths26.get(i).getPreviousYTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearYTD().equals("0.0000")) {
				model26.setTwoYearYTD(salesGrowths26.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model27 = new CompiledModel();
		model27.setProduct("Product 27");
		for(int i = 0; i < salesGrowths27.size(); i++){
			if (!salesGrowths27.get(i).getOneYearBackMTD().equals("0.0000")) {
				model27.setOneYearBackMTD(salesGrowths27.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model27.setTwoYearBackMTD(salesGrowths27.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model27.setPreviousYearMonthMTD(salesGrowths27.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYTD().equals("0.0000")) {
				model27.setPreviousYTD(salesGrowths27.get(i).getPreviousYTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearYTD().equals("0.0000")) {
				model27.setTwoYearYTD(salesGrowths27.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model28 = new CompiledModel();
		model28.setProduct("Product 28");
		for(int i = 0; i < salesGrowths28.size(); i++){
			if (!salesGrowths28.get(i).getOneYearBackMTD().equals("0.0000")) {
				model28.setOneYearBackMTD(salesGrowths28.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model28.setTwoYearBackMTD(salesGrowths28.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model28.setPreviousYearMonthMTD(salesGrowths28.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYTD().equals("0.0000")) {
				model28.setPreviousYTD(salesGrowths28.get(i).getPreviousYTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearYTD().equals("0.0000")) {
				model28.setTwoYearYTD(salesGrowths28.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model29 = new CompiledModel();
		model29.setProduct("Product 29");
		for(int i = 0; i < salesGrowths29.size(); i++){
			if (!salesGrowths29.get(i).getOneYearBackMTD().equals("0.0000")) {
				model29.setOneYearBackMTD(salesGrowths29.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model29.setTwoYearBackMTD(salesGrowths29.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model29.setPreviousYearMonthMTD(salesGrowths29.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYTD().equals("0.0000")) {
				model29.setPreviousYTD(salesGrowths29.get(i).getPreviousYTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearYTD().equals("0.0000")) {
				model29.setTwoYearYTD(salesGrowths29.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model30 = new CompiledModel();
		model30.setProduct("Product 30");
		for(int i = 0; i < salesGrowths30.size(); i++){
			if (!salesGrowths30.get(i).getOneYearBackMTD().equals("0.0000")) {
				model30.setOneYearBackMTD(salesGrowths30.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model30.setTwoYearBackMTD(salesGrowths30.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model30.setPreviousYearMonthMTD(salesGrowths30.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYTD().equals("0.0000")) {
				model30.setPreviousYTD(salesGrowths30.get(i).getPreviousYTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearYTD().equals("0.0000")) {
				model30.setTwoYearYTD(salesGrowths30.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model31 = new CompiledModel();
		model31.setProduct("Unknown Brand");
		for(int i = 0; i < salesGrowths31.size(); i++){
			if (!salesGrowths31.get(i).getOneYearBackMTD().equals("0.0000")) {
				model31.setOneYearBackMTD(salesGrowths31.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model31.setTwoYearBackMTD(salesGrowths31.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model31.setPreviousYearMonthMTD(salesGrowths31.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYTD().equals("0.0000")) {
				model31.setPreviousYTD(salesGrowths31.get(i).getPreviousYTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearYTD().equals("0.0000")) {
				model31.setTwoYearYTD(salesGrowths31.get(i).getTwoYearYTD());
			}
		}
	
		
		
		// lets add to the compiled model list
		compiledModels.add(model01);
		compiledModels.add(model02);
		compiledModels.add(model03);
		compiledModels.add(model04);
		compiledModels.add(model05);
		compiledModels.add(model06);
		compiledModels.add(model07);
		compiledModels.add(model08);
		compiledModels.add(model09);
		compiledModels.add(model10);
		compiledModels.add(model11);
		compiledModels.add(model12);
		compiledModels.add(model13);
		compiledModels.add(model14);
		compiledModels.add(model15);
		compiledModels.add(model16);
		compiledModels.add(model17);
		compiledModels.add(model18);
		compiledModels.add(model19);
		compiledModels.add(model20);
		compiledModels.add(model21);
		compiledModels.add(model22);
		compiledModels.add(model23);
		compiledModels.add(model24);
		compiledModels.add(model25);
		compiledModels.add(model26);
		compiledModels.add(model27);
		compiledModels.add(model28);
		compiledModels.add(model29);
		compiledModels.add(model30);
		compiledModels.add(model31);
		//  lets return the compiled list
//		System.out.println(compiledModels);
		
		
		//return compiledModels;
		ArrayList<CompiledModel> temp = new ArrayList<CompiledModel>();
		
		for (int i = 0; i < compiledModels.size(); i++) {
			if (compiledModels.get(i).getOneYearBackMTD() != null &&
				compiledModels.get(i).getTwoYearBackMTD() != null &&
				compiledModels.get(i).getPreviousYearMonthMTD() != null &&
				compiledModels.get(i).getPreviousYTD() != null &&
				compiledModels.get(i).getTwoYearYTD() != null 
					) {
				
				temp.add(compiledModels.get(i));
			}
		}
		return temp;
	}

	// product
	public static ArrayList<CompiledModel> getSalesGrowthProductList(String date, String product) {
		
		
		
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryProductList(date, product, "LEA GLEN +S - 4924");
		
		ArrayList <SalesGrowth> salesGrowths01 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths02 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths03 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths04 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths05 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths06 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths07 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths08 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths09 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths10 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths11 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths12 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths13 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths14 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths15 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths16 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths17 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths18 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths19 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths20 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths21 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths22 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths23 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths24 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths25 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths26 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths27 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths28 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths29 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths30 = new ArrayList <SalesGrowth>();
		ArrayList <SalesGrowth> salesGrowths31 = new ArrayList <SalesGrowth>();

		// lets separate the products
		for (int i = 0; i < query.getGrowthList().size(); i++) {
			//System.out.println(s);
			if (query.getGrowthList().get(i).getProduct().equals("Product 1")) {
				salesGrowths01.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 2")) {
				salesGrowths02.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 3")) {
				salesGrowths03.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 4")) {
				salesGrowths04.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 5")) {
				salesGrowths05.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 6")) {
				salesGrowths06.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 7")) {
				salesGrowths07.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 8")) {
				salesGrowths08.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 9")) {
				salesGrowths09.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 10")) {
				salesGrowths10.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 11")) {
				salesGrowths11.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 12")) {
				salesGrowths12.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 13")) {
				salesGrowths13.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 14")) {
				salesGrowths14.add(query.getGrowthList().get(i));

			} else if (query.getGrowthList().get(i).getProduct().equals("Product 15")) {
				salesGrowths15.add(query.getGrowthList().get(i));
				
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 16")) {
				salesGrowths16.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 17")) {
				salesGrowths17.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 18")) {
				salesGrowths18.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 19")) {
				salesGrowths19.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 20")) {
				salesGrowths20.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 21")) {
				salesGrowths21.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 22")) {
				salesGrowths22.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 23")) {
				salesGrowths23.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 24")) {
				salesGrowths24.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 25")) {
				salesGrowths25.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 26")) {
				salesGrowths26.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 27")) {
				salesGrowths27.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 28")) {
				salesGrowths28.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 29")) {
				salesGrowths29.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Product 30")) {
				salesGrowths30.add(query.getGrowthList().get(i));
			} else if (query.getGrowthList().get(i).getProduct().equals("Unknown Brand")) {
				salesGrowths31.add(query.getGrowthList().get(i));
			} 
		
			
			
			
		}
		
		
		
		// a list of compiled product list
		compiledModels = new ArrayList<CompiledModel>();
		
		
		CompiledModel model01 = new CompiledModel();
		model01.setProduct("Product 1");
		for(int i = 0; i < salesGrowths01.size(); i++){
			if (!salesGrowths01.get(i).getOneYearBackMTD().equals("0.0000")) {
				model01.setOneYearBackMTD(salesGrowths01.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths01.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model01.setPreviousYearMonthMTD(salesGrowths01.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYTD().equals("0.0000")) {
				model01.setPreviousYTD(salesGrowths01.get(i).getPreviousYTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearYTD().equals("0.0000")) {
				model01.setTwoYearYTD(salesGrowths01.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model02 = new CompiledModel();
		model02.setProduct("Product 2");
		for(int i = 0; i < salesGrowths02.size(); i++){
			if (!salesGrowths02.get(i).getOneYearBackMTD().equals("0.0000")) {
				model02.setOneYearBackMTD(salesGrowths02.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model02.setTwoYearBackMTD(salesGrowths02.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model02.setPreviousYearMonthMTD(salesGrowths02.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths02.get(i).getPreviousYTD().equals("0.0000")) {
				model02.setPreviousYTD(salesGrowths02.get(i).getPreviousYTD());
				
			} else if (!salesGrowths02.get(i).getTwoYearYTD().equals("0.0000")) {
				model02.setTwoYearYTD(salesGrowths02.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model03 = new CompiledModel();
		model03.setProduct("Product 3");
		for(int i = 0; i < salesGrowths03.size(); i++){
			if (!salesGrowths03.get(i).getOneYearBackMTD().equals("0.0000")) {
				model03.setOneYearBackMTD(salesGrowths03.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model03.setTwoYearBackMTD(salesGrowths03.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model03.setPreviousYearMonthMTD(salesGrowths03.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths03.get(i).getPreviousYTD().equals("0.0000")) {
				model03.setPreviousYTD(salesGrowths03.get(i).getPreviousYTD());
				
			} else if (!salesGrowths03.get(i).getTwoYearYTD().equals("0.0000")) {
				model03.setTwoYearYTD(salesGrowths03.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model04 = new CompiledModel();
		model04.setProduct("Product 4");
		for(int i = 0; i < salesGrowths04.size(); i++){
			if (!salesGrowths04.get(i).getOneYearBackMTD().equals("0.0000")) {
				model04.setOneYearBackMTD(salesGrowths04.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model04.setTwoYearBackMTD(salesGrowths04.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model04.setPreviousYearMonthMTD(salesGrowths04.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths04.get(i).getPreviousYTD().equals("0.0000")) {
				model04.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths04.get(i).getTwoYearYTD().equals("0.0000")) {
				model04.setTwoYearYTD(salesGrowths04.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model05 = new CompiledModel();
		model05.setProduct("Product 5");
		for(int i = 0; i < salesGrowths05.size(); i++){
			if (!salesGrowths05.get(i).getOneYearBackMTD().equals("0.0000")) {
				model05.setOneYearBackMTD(salesGrowths05.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model05.setTwoYearBackMTD(salesGrowths05.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model05.setPreviousYearMonthMTD(salesGrowths05.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths05.get(i).getPreviousYTD().equals("0.0000")) {
				model05.setPreviousYTD(salesGrowths05.get(i).getPreviousYTD());
				
			} else if (!salesGrowths05.get(i).getTwoYearYTD().equals("0.0000")) {
				model05.setTwoYearYTD(salesGrowths05.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model06 = new CompiledModel();
		model06.setProduct("Product 6");
		for(int i = 0; i < salesGrowths06.size(); i++){
			if (!salesGrowths06.get(i).getOneYearBackMTD().equals("0.0000")) {
				model06.setOneYearBackMTD(salesGrowths06.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model06.setTwoYearBackMTD(salesGrowths06.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model06.setPreviousYearMonthMTD(salesGrowths06.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths06.get(i).getPreviousYTD().equals("0.0000")) {
				model06.setPreviousYTD(salesGrowths06.get(i).getPreviousYTD());
				
			} else if (!salesGrowths06.get(i).getTwoYearYTD().equals("0.0000")) {
				model06.setTwoYearYTD(salesGrowths06.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model07 = new CompiledModel();
		model07.setProduct("Product 7");
		for(int i = 0; i < salesGrowths07.size(); i++){
			if (!salesGrowths07.get(i).getOneYearBackMTD().equals("0.0000")) {
				model07.setOneYearBackMTD(salesGrowths07.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model07.setTwoYearBackMTD(salesGrowths07.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model07.setPreviousYearMonthMTD(salesGrowths07.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths07.get(i).getPreviousYTD().equals("0.0000")) {
				model07.setPreviousYTD(salesGrowths07.get(i).getPreviousYTD());
				
			} else if (!salesGrowths07.get(i).getTwoYearYTD().equals("0.0000")) {
				model07.setTwoYearYTD(salesGrowths07.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model08 = new CompiledModel();
		model08.setProduct("Product 8");
		for(int i = 0; i < salesGrowths08.size(); i++){
			if (!salesGrowths08.get(i).getOneYearBackMTD().equals("0.0000")) {
				model08.setOneYearBackMTD(salesGrowths08.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model08.setTwoYearBackMTD(salesGrowths08.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model08.setPreviousYearMonthMTD(salesGrowths08.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths08.get(i).getPreviousYTD().equals("0.0000")) {
				model08.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths08.get(i).getTwoYearYTD().equals("0.0000")) {
				model08.setTwoYearYTD(salesGrowths08.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model09 = new CompiledModel();
		model09.setProduct("Product 9");
		for(int i = 0; i < salesGrowths09.size(); i++){
			if (!salesGrowths09.get(i).getOneYearBackMTD().equals("0.0000")) {
				model09.setOneYearBackMTD(salesGrowths09.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model09.setTwoYearBackMTD(salesGrowths09.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model09.setPreviousYearMonthMTD(salesGrowths09.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths09.get(i).getPreviousYTD().equals("0.0000")) {
				model09.setPreviousYTD(salesGrowths09.get(i).getPreviousYTD());
				
			} else if (!salesGrowths09.get(i).getTwoYearYTD().equals("0.0000")) {
				model09.setTwoYearYTD(salesGrowths09.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model10 = new CompiledModel();
		model10.setProduct("Product 10");
		for(int i = 0; i < salesGrowths10.size(); i++){
			if (!salesGrowths10.get(i).getOneYearBackMTD().equals("0.0000")) {
				model10.setOneYearBackMTD(salesGrowths10.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model10.setTwoYearBackMTD(salesGrowths10.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model10.setPreviousYearMonthMTD(salesGrowths10.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths10.get(i).getPreviousYTD().equals("0.0000")) {
				model10.setPreviousYTD(salesGrowths10.get(i).getPreviousYTD());
				
			} else if (!salesGrowths10.get(i).getTwoYearYTD().equals("0.0000")) {
				model10.setTwoYearYTD(salesGrowths10.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model11 = new CompiledModel();
		model11.setProduct("Product 11");
		for(int i = 0; i < salesGrowths11.size(); i++){
			if (!salesGrowths11.get(i).getOneYearBackMTD().equals("0.0000")) {
				model11.setOneYearBackMTD(salesGrowths11.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model11.setTwoYearBackMTD(salesGrowths11.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model11.setPreviousYearMonthMTD(salesGrowths11.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths11.get(i).getPreviousYTD().equals("0.0000")) {
				model11.setPreviousYTD(salesGrowths11.get(i).getPreviousYTD());
				
			} else if (!salesGrowths11.get(i).getTwoYearYTD().equals("0.0000")) {
				model11.setTwoYearYTD(salesGrowths11.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model12 = new CompiledModel();
		model12.setProduct("Product 12");
		for(int i = 0; i < salesGrowths12.size(); i++){
			if (!salesGrowths12.get(i).getOneYearBackMTD().equals("0.0000")) {
				model12.setOneYearBackMTD(salesGrowths12.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model01.setTwoYearBackMTD(salesGrowths12.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model12.setPreviousYearMonthMTD(salesGrowths12.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths12.get(i).getPreviousYTD().equals("0.0000")) {
				model12.setPreviousYTD(salesGrowths12.get(i).getPreviousYTD());
				
			} else if (!salesGrowths12.get(i).getTwoYearYTD().equals("0.0000")) {
				model12.setTwoYearYTD(salesGrowths12.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model13 = new CompiledModel();
		model13.setProduct("Product 13");
		for(int i = 0; i < salesGrowths13.size(); i++){
			if (!salesGrowths13.get(i).getOneYearBackMTD().equals("0.0000")) {
				model13.setOneYearBackMTD(salesGrowths13.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model13.setTwoYearBackMTD(salesGrowths13.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model13.setPreviousYearMonthMTD(salesGrowths13.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths13.get(i).getPreviousYTD().equals("0.0000")) {
				model13.setPreviousYTD(salesGrowths13.get(i).getPreviousYTD());
				
			} else if (!salesGrowths13.get(i).getTwoYearYTD().equals("0.0000")) {
				model13.setTwoYearYTD(salesGrowths13.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model14 = new CompiledModel();
		model14.setProduct("Product 14");
		for(int i = 0; i < salesGrowths14.size(); i++){
			if (!salesGrowths14.get(i).getOneYearBackMTD().equals("0.0000")) {
				model14.setOneYearBackMTD(salesGrowths14.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model14.setTwoYearBackMTD(salesGrowths14.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths01.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model14.setPreviousYearMonthMTD(salesGrowths14.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths14.get(i).getPreviousYTD().equals("0.0000")) {
				model14.setPreviousYTD(salesGrowths14.get(i).getPreviousYTD());
				
			} else if (!salesGrowths14.get(i).getTwoYearYTD().equals("0.0000")) {
				model14.setTwoYearYTD(salesGrowths14.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model15 = new CompiledModel();
		model15.setProduct("Product 15");
		for(int i = 0; i < salesGrowths15.size(); i++){
			if (!salesGrowths15.get(i).getOneYearBackMTD().equals("0.0000")) {
				model15.setOneYearBackMTD(salesGrowths15.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model15.setTwoYearBackMTD(salesGrowths15.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model15.setPreviousYearMonthMTD(salesGrowths15.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths15.get(i).getPreviousYTD().equals("0.0000")) {
				model15.setPreviousYTD(salesGrowths15.get(i).getPreviousYTD());
				
			} else if (!salesGrowths15.get(i).getTwoYearYTD().equals("0.0000")) {
				model15.setTwoYearYTD(salesGrowths15.get(i).getTwoYearYTD());
			}
		}
		
		// model 16
		CompiledModel model16 = new CompiledModel();
		model16.setProduct("Product 16");
		for(int i = 0; i < salesGrowths16.size(); i++){
			if (!salesGrowths16.get(i).getOneYearBackMTD().equals("0.0000")) {
				model16.setOneYearBackMTD(salesGrowths16.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model16.setTwoYearBackMTD(salesGrowths16.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model16.setPreviousYearMonthMTD(salesGrowths16.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths16.get(i).getPreviousYTD().equals("0.0000")) {
				model16.setPreviousYTD(salesGrowths16.get(i).getPreviousYTD());
				
			} else if (!salesGrowths16.get(i).getTwoYearYTD().equals("0.0000")) {
				model16.setTwoYearYTD(salesGrowths16.get(i).getTwoYearYTD());
			}
		}
		
		CompiledModel model17 = new CompiledModel();
		model17.setProduct("Product 17");
		for(int i = 0; i < salesGrowths17.size(); i++){
			if (!salesGrowths17.get(i).getOneYearBackMTD().equals("0.0000")) {
				model17.setOneYearBackMTD(salesGrowths17.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model17.setTwoYearBackMTD(salesGrowths17.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model17.setPreviousYearMonthMTD(salesGrowths17.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths17.get(i).getPreviousYTD().equals("0.0000")) {
				model17.setPreviousYTD(salesGrowths17.get(i).getPreviousYTD());
				
			} else if (!salesGrowths17.get(i).getTwoYearYTD().equals("0.0000")) {
				model17.setTwoYearYTD(salesGrowths17.get(i).getTwoYearYTD());
			}
		}
	
		
		CompiledModel model18 = new CompiledModel();
		model18.setProduct("Product 18");
		for(int i = 0; i < salesGrowths18.size(); i++){
			if (!salesGrowths18.get(i).getOneYearBackMTD().equals("0.0000")) {
				model18.setOneYearBackMTD(salesGrowths18.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model18.setTwoYearBackMTD(salesGrowths18.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model18.setPreviousYearMonthMTD(salesGrowths18.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths18.get(i).getPreviousYTD().equals("0.0000")) {
				model18.setPreviousYTD(salesGrowths18.get(i).getPreviousYTD());
				
			} else if (!salesGrowths18.get(i).getTwoYearYTD().equals("0.0000")) {
				model18.setTwoYearYTD(salesGrowths18.get(i).getTwoYearYTD());
			}
		}
		
		// model 3
		CompiledModel model19 = new CompiledModel();
		model19.setProduct("Product 19");
		for(int i = 0; i < salesGrowths19.size(); i++){
			if (!salesGrowths19.get(i).getOneYearBackMTD().equals("0.0000")) {
				model19.setOneYearBackMTD(salesGrowths19.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model19.setTwoYearBackMTD(salesGrowths19.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model19.setPreviousYearMonthMTD(salesGrowths19.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths19.get(i).getPreviousYTD().equals("0.0000")) {
				model19.setPreviousYTD(salesGrowths19.get(i).getPreviousYTD());
				
			} else if (!salesGrowths19.get(i).getTwoYearYTD().equals("0.0000")) {
				model19.setTwoYearYTD(salesGrowths19.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 4
		CompiledModel model20 = new CompiledModel();
		model20.setProduct("Product 20");
		for(int i = 0; i < salesGrowths20.size(); i++){
			if (!salesGrowths20.get(i).getOneYearBackMTD().equals("0.0000")) {
				model20.setOneYearBackMTD(salesGrowths20.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model20.setTwoYearBackMTD(salesGrowths20.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model20.setPreviousYearMonthMTD(salesGrowths20.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths20.get(i).getPreviousYTD().equals("0.0000")) {
				model20.setPreviousYTD(salesGrowths04.get(i).getPreviousYTD());
				
			} else if (!salesGrowths20.get(i).getTwoYearYTD().equals("0.0000")) {
				model20.setTwoYearYTD(salesGrowths20.get(i).getTwoYearYTD());
			}
		}
		
		
		
		
		// model 5
		CompiledModel model21 = new CompiledModel();
		model21.setProduct("Product 21");
		for(int i = 0; i < salesGrowths21.size(); i++){
			if (!salesGrowths21.get(i).getOneYearBackMTD().equals("0.0000")) {
				model21.setOneYearBackMTD(salesGrowths21.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model21.setTwoYearBackMTD(salesGrowths21.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model21.setPreviousYearMonthMTD(salesGrowths21.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths21.get(i).getPreviousYTD().equals("0.0000")) {
				model21.setPreviousYTD(salesGrowths21.get(i).getPreviousYTD());
				
			} else if (!salesGrowths21.get(i).getTwoYearYTD().equals("0.0000")) {
				model21.setTwoYearYTD(salesGrowths21.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 6
		CompiledModel model22 = new CompiledModel();
		model22.setProduct("Product 22");
		for(int i = 0; i < salesGrowths22.size(); i++){
			if (!salesGrowths22.get(i).getOneYearBackMTD().equals("0.0000")) {
				model22.setOneYearBackMTD(salesGrowths22.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model22.setTwoYearBackMTD(salesGrowths22.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model22.setPreviousYearMonthMTD(salesGrowths22.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths22.get(i).getPreviousYTD().equals("0.0000")) {
				model22.setPreviousYTD(salesGrowths22.get(i).getPreviousYTD());
				
			} else if (!salesGrowths22.get(i).getTwoYearYTD().equals("0.0000")) {
				model22.setTwoYearYTD(salesGrowths22.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 7
		
		CompiledModel model23 = new CompiledModel();
		model23.setProduct("Product 23");
		for(int i = 0; i < salesGrowths23.size(); i++){
			if (!salesGrowths23.get(i).getOneYearBackMTD().equals("0.0000")) {
				model23.setOneYearBackMTD(salesGrowths23.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model23.setTwoYearBackMTD(salesGrowths23.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model23.setPreviousYearMonthMTD(salesGrowths23.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths23.get(i).getPreviousYTD().equals("0.0000")) {
				model23.setPreviousYTD(salesGrowths23.get(i).getPreviousYTD());
				
			} else if (!salesGrowths23.get(i).getTwoYearYTD().equals("0.0000")) {
				model23.setTwoYearYTD(salesGrowths23.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 8
		CompiledModel model24 = new CompiledModel();
		model24.setProduct("Product 24");
		for(int i = 0; i < salesGrowths24.size(); i++){
			if (!salesGrowths24.get(i).getOneYearBackMTD().equals("0.0000")) {
				model24.setOneYearBackMTD(salesGrowths24.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model24.setTwoYearBackMTD(salesGrowths24.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model24.setPreviousYearMonthMTD(salesGrowths24.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths24.get(i).getPreviousYTD().equals("0.0000")) {
				model24.setPreviousYTD(salesGrowths08.get(i).getPreviousYTD());
				
			} else if (!salesGrowths24.get(i).getTwoYearYTD().equals("0.0000")) {
				model24.setTwoYearYTD(salesGrowths24.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 9
		
		CompiledModel model25 = new CompiledModel();
		model25.setProduct("Product 25");
		for(int i = 0; i < salesGrowths25.size(); i++){
			if (!salesGrowths25.get(i).getOneYearBackMTD().equals("0.0000")) {
				model25.setOneYearBackMTD(salesGrowths25.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model25.setTwoYearBackMTD(salesGrowths25.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model25.setPreviousYearMonthMTD(salesGrowths25.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths25.get(i).getPreviousYTD().equals("0.0000")) {
				model25.setPreviousYTD(salesGrowths25.get(i).getPreviousYTD());
				
			} else if (!salesGrowths25.get(i).getTwoYearYTD().equals("0.0000")) {
				model25.setTwoYearYTD(salesGrowths25.get(i).getTwoYearYTD());
			}
		}
		
		
		
		// model 10
		CompiledModel model26 = new CompiledModel();
		model26.setProduct("Product 26");
		for(int i = 0; i < salesGrowths26.size(); i++){
			if (!salesGrowths26.get(i).getOneYearBackMTD().equals("0.0000")) {
				model26.setOneYearBackMTD(salesGrowths26.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model26.setTwoYearBackMTD(salesGrowths26.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model26.setPreviousYearMonthMTD(salesGrowths26.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths26.get(i).getPreviousYTD().equals("0.0000")) {
				model26.setPreviousYTD(salesGrowths26.get(i).getPreviousYTD());
				
			} else if (!salesGrowths26.get(i).getTwoYearYTD().equals("0.0000")) {
				model26.setTwoYearYTD(salesGrowths26.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 11
		CompiledModel model27 = new CompiledModel();
		model27.setProduct("Product 27");
		for(int i = 0; i < salesGrowths27.size(); i++){
			if (!salesGrowths27.get(i).getOneYearBackMTD().equals("0.0000")) {
				model27.setOneYearBackMTD(salesGrowths27.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model27.setTwoYearBackMTD(salesGrowths27.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model27.setPreviousYearMonthMTD(salesGrowths27.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths27.get(i).getPreviousYTD().equals("0.0000")) {
				model27.setPreviousYTD(salesGrowths27.get(i).getPreviousYTD());
				
			} else if (!salesGrowths27.get(i).getTwoYearYTD().equals("0.0000")) {
				model27.setTwoYearYTD(salesGrowths27.get(i).getTwoYearYTD());
			}
		}
		
		// model 12
		CompiledModel model28 = new CompiledModel();
		model28.setProduct("Product 28");
		for(int i = 0; i < salesGrowths28.size(); i++){
			if (!salesGrowths28.get(i).getOneYearBackMTD().equals("0.0000")) {
				model28.setOneYearBackMTD(salesGrowths28.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model28.setTwoYearBackMTD(salesGrowths28.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model28.setPreviousYearMonthMTD(salesGrowths28.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths28.get(i).getPreviousYTD().equals("0.0000")) {
				model28.setPreviousYTD(salesGrowths28.get(i).getPreviousYTD());
				
			} else if (!salesGrowths28.get(i).getTwoYearYTD().equals("0.0000")) {
				model28.setTwoYearYTD(salesGrowths28.get(i).getTwoYearYTD());
			}
		}
		
		// model 13
		CompiledModel model29 = new CompiledModel();
		model29.setProduct("Product 29");
		for(int i = 0; i < salesGrowths29.size(); i++){
			if (!salesGrowths29.get(i).getOneYearBackMTD().equals("0.0000")) {
				model29.setOneYearBackMTD(salesGrowths29.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model29.setTwoYearBackMTD(salesGrowths29.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model29.setPreviousYearMonthMTD(salesGrowths29.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths29.get(i).getPreviousYTD().equals("0.0000")) {
				model29.setPreviousYTD(salesGrowths29.get(i).getPreviousYTD());
				
			} else if (!salesGrowths29.get(i).getTwoYearYTD().equals("0.0000")) {
				model29.setTwoYearYTD(salesGrowths29.get(i).getTwoYearYTD());
			}
		}
		
		
		// model 14
		
		CompiledModel model30 = new CompiledModel();
		model30.setProduct("Product 30");
		for(int i = 0; i < salesGrowths30.size(); i++){
			if (!salesGrowths30.get(i).getOneYearBackMTD().equals("0.0000")) {
				model30.setOneYearBackMTD(salesGrowths30.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model30.setTwoYearBackMTD(salesGrowths30.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model30.setPreviousYearMonthMTD(salesGrowths30.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths30.get(i).getPreviousYTD().equals("0.0000")) {
				model30.setPreviousYTD(salesGrowths30.get(i).getPreviousYTD());
				
			} else if (!salesGrowths30.get(i).getTwoYearYTD().equals("0.0000")) {
				model30.setTwoYearYTD(salesGrowths30.get(i).getTwoYearYTD());
			}
		}
		
		// model 15
		CompiledModel model31 = new CompiledModel();
		model31.setProduct("Unknown Brand");
		for(int i = 0; i < salesGrowths31.size(); i++){
			if (!salesGrowths31.get(i).getOneYearBackMTD().equals("0.0000")) {
				model31.setOneYearBackMTD(salesGrowths31.get(i).getOneYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearBackMTD().equals("0.0000")) {
				model31.setTwoYearBackMTD(salesGrowths31.get(i).getTwoYearBackMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYearMonthMTD().equals("0.0000")) {
				model31.setPreviousYearMonthMTD(salesGrowths31.get(i).getPreviousYearMonthMTD());
				
			} else if (!salesGrowths31.get(i).getPreviousYTD().equals("0.0000")) {
				model31.setPreviousYTD(salesGrowths31.get(i).getPreviousYTD());
				
			} else if (!salesGrowths31.get(i).getTwoYearYTD().equals("0.0000")) {
				model31.setTwoYearYTD(salesGrowths31.get(i).getTwoYearYTD());
			}
		}
	
		
		
		// lets add to the compiled model list
		compiledModels.add(model01);
		compiledModels.add(model02);
		compiledModels.add(model03);
		compiledModels.add(model04);
		compiledModels.add(model05);
		compiledModels.add(model06);
		compiledModels.add(model07);
		compiledModels.add(model08);
		compiledModels.add(model09);
		compiledModels.add(model10);
		compiledModels.add(model11);
		compiledModels.add(model12);
		compiledModels.add(model13);
		compiledModels.add(model14);
		compiledModels.add(model15);
		compiledModels.add(model16);
		compiledModels.add(model17);
		compiledModels.add(model18);
		compiledModels.add(model19);
		compiledModels.add(model20);
		compiledModels.add(model21);
		compiledModels.add(model22);
		compiledModels.add(model23);
		compiledModels.add(model24);
		compiledModels.add(model25);
		compiledModels.add(model26);
		compiledModels.add(model27);
		compiledModels.add(model28);
		compiledModels.add(model29);
		compiledModels.add(model30);
		compiledModels.add(model31);
		//  lets return the compiled list
//		System.out.println(compiledModels);
		
		
		//return compiledModels;
		ArrayList<CompiledModel> temp = new ArrayList<CompiledModel>();
		
		for (int i = 0; i < compiledModels.size(); i++) {
			if (compiledModels.get(i).getOneYearBackMTD() != null &&
				compiledModels.get(i).getTwoYearBackMTD() != null &&
				compiledModels.get(i).getPreviousYearMonthMTD() != null &&
				compiledModels.get(i).getPreviousYTD() != null &&
				compiledModels.get(i).getTwoYearYTD() != null 
					) {
				
				temp.add(compiledModels.get(i));
			}
		}
		return temp;
	}
	
}
