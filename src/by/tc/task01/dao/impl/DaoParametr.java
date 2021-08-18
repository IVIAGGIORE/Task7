package by.tc.task01.dao.impl;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.SearchCriteria.Type;

public class DaoParametr {
	private Map<Type, Object> parametr = new HashMap<>();
	
	public DaoParametr() {
		parametr.put(Type.LAPTOP, new Laptop());
		parametr.put(Type.OVEN, new Oven());
		parametr.put(Type.REFRIGERATOR, new Refrigerator());
		parametr.put(Type.SPEAKERS, new Speakers());
		parametr.put(Type.TABLEPC, new TabletPC());
		parametr.put(Type.VACUUMCLEANER, new VacuumCleaner());
	}
	
	public Appliance takeParametr(String typeName) {
				
		Type type = Type.valueOf(typeName.toUpperCase().trim());
			
		Appliance appliance = (Appliance) parametr.get(type);
		
		return appliance;
	}



}
