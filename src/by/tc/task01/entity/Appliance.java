package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public interface Appliance {
	
	boolean comparison(Criteria criteria);
	String getText();
	String getNameAppliance();
	void parametrLines(String meaning);
}
