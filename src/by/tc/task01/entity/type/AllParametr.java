package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;

public class AllParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
			criteria.add(applinceParam[0], applinceParam[1]);
		}
		
	}

}
