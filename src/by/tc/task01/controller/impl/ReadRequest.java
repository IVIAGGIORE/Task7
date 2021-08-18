package by.tc.task01.controller.impl;


import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.CriteriaProvider;

public class ReadRequest {
	private final CriteriaProvider criteriaProvider = new CriteriaProvider();

	public Criteria read(String request) {
	Criteria criteria = new Criteria();
	String[] params = request.split("\\s+");
	
	CriteriaParametr criteriaparametr = null;
		
	String[] applinceParam = params[0].split("=");
		if(applinceParam[0].compareTo("TYPE") == 0) {
			criteriaparametr = criteriaProvider.takeProvider(applinceParam[1]);
		}
	
		
	criteriaparametr.parametr(criteria, params);
		
	return criteria;
	}
	
	//
	

	
	
	
	
}
