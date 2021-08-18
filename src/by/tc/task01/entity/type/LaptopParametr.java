package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.SearchCriteria.Laptop;

public class LaptopParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
					
			if(applinceParam[1].toUpperCase().compareTo(Laptop.LAPTOP.toString()) == 0) {
				criteria.add("TYPE", Laptop.LAPTOP.toString());
			}
			if(applinceParam[0].compareTo(Laptop.BATTERY_CAPACITY.toString()) == 0) {
				criteria.add(Laptop.BATTERY_CAPACITY.toString(), applinceParam[1]);
			}
			if(applinceParam[0].compareTo(Laptop.OS.toString()) == 0) {
				criteria.add(Laptop.OS.toString(), applinceParam[1]);
			}
			if(applinceParam[0].compareTo(Laptop.MEMORY_ROM.toString()) == 0) {
				criteria.add(Laptop.MEMORY_ROM.toString(), applinceParam[1]);
			}
			if(applinceParam[0].compareTo(Laptop.SYSTEM_MEMORY.toString()) == 0) {
				criteria.add(Laptop.SYSTEM_MEMORY.toString(), applinceParam[1]);
			}
			if(applinceParam[0].compareTo(Laptop.CPU.toString()) == 0) {
				criteria.add(Laptop.CPU.toString(), applinceParam[1]);
			}
			if(applinceParam[0].compareTo(Laptop.DISPLAY_INCHS.toString()) == 0) {
				criteria.add(Laptop.DISPLAY_INCHS.toString(), applinceParam[1]);
			}
			
		}
	
	}

}
