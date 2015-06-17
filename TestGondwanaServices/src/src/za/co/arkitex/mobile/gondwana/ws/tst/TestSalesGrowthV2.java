package za.co.arkitex.mobile.gondwana.ws.tst;

import java.util.ArrayList;

import za.co.arkitex.mobile.domain.growth.CompiledModel;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;
import za.co.arkitex.mobile.domain.growth.SalesGrowth;
import za.co.arkitex.mobile.gondwana.db.SalesGrowthQueryV2;

public class TestSalesGrowthV2 {

	public static void main(String[] args) {
		SalesGrowthQueryV2 query = new SalesGrowthQueryV2();
		query.queryDefault("2013", "LEA GLEN +S - 4924");
		
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
			}
		}
		
		

		
		ArrayList<CompiledModel> compiledModels = new ArrayList<CompiledModel>();
		
		
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
		
		compiledModels.add(model01);
		
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
		compiledModels.add(model02);
		
		
		
		
		
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
		
	
		
		System.out.println(model01);
		System.out.println(model02);
		System.out.println(model03);
		System.out.println(model04);
		System.out.println(model05);
		System.out.println(model06);
		System.out.println(model07);
		System.out.println(model08);
		System.out.println(model09);
		System.out.println(model10);
		System.out.println(model11);
		System.out.println(model12);
		System.out.println(model13);
		System.out.println(model14);
		System.out.println(model15);
		System.out.println(model16);
	
		

	}

}
