package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.SearchCriteria.Refrigerator;

public class RefrigeratorParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
					
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.REFRIGERATOR.toString()) == 0) {
				criteria.add("TYPE", Refrigerator.REFRIGERATOR.toString());
			}
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.POWER_CONSUMPTION.toString()) == 0) {
				criteria.add(Refrigerator.POWER_CONSUMPTION.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.WEIGHT.toString()) == 0) {
				criteria.add(Refrigerator.WEIGHT.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.FREEZER_CAPACITY.toString()) == 0) {
				criteria.add(Refrigerator.FREEZER_CAPACITY.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.OVERALL_CAPACITY.toString()) == 0) {
				criteria.add(Refrigerator.OVERALL_CAPACITY.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.HEIGHT.toString()) == 0) {
				criteria.add(Refrigerator.HEIGHT.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Refrigerator.WIDTH.toString()) == 0) {
				criteria.add(Refrigerator.WIDTH.toString(), applinceParam[1]);
			}
			
		}
		
	}

}
