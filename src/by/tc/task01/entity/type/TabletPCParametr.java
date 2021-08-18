package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class TabletPCParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
					
			if(applinceParam[1].toUpperCase().compareTo(TabletPC.TABLEPC.toString()) == 0) {
				criteria.add("TYPE", TabletPC.TABLEPC.toString());
			}
			if(applinceParam[1].toUpperCase().compareTo(TabletPC.BATTERY_CAPACITY.toString()) == 0) {
				criteria.add(TabletPC.BATTERY_CAPACITY.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(TabletPC.DISPLAY_INCHES.toString()) == 0) {
				criteria.add(TabletPC.DISPLAY_INCHES.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(TabletPC.MEMORY_ROM.toString()) == 0) {
				criteria.add(TabletPC.MEMORY_ROM.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(TabletPC.FLASH_MEMORY_CAPACITY.toString()) == 0) {
				criteria.add(TabletPC.FLASH_MEMORY_CAPACITY.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(TabletPC.COLOR.toString()) == 0) {
				criteria.add(TabletPC.COLOR.toString(), applinceParam[1]);
			}
		}
		
	}

}
