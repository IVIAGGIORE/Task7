package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.SearchCriteria.Oven;

public class OvenParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
			
			if(applinceParam[1].toUpperCase().compareTo(Oven.OVEN.toString()) == 0) {
				criteria.add("TYPE", Oven.OVEN.toString());
			}
			if(applinceParam[1].toUpperCase().compareTo(Oven.POWER_CONSUMPTION.toString()) == 0) {
				criteria.add(Oven.POWER_CONSUMPTION.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Oven.WEIGHT.toString()) == 0) {
				criteria.add(Oven.WEIGHT.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Oven.CAPACITY.toString()) == 0) {
				criteria.add(Oven.CAPACITY.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Oven.DEPTH.toString()) == 0) {
				criteria.add(Oven.DEPTH.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Oven.HEIGHT.toString()) == 0) {
				criteria.add(Oven.HEIGHT.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Oven.WIDTH.toString()) == 0) {
				criteria.add(Oven.WIDTH.toString(), applinceParam[1]);
			}
		}
	}

}
