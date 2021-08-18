package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.SearchCriteria.VacuumCleaner;

public class VacuumCleanerParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
					
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.VACUUMCLEANER.toString()) == 0) {
				criteria.add(VacuumCleaner.VACUUMCLEANER.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.POWER_CONSUMPTION.toString()) == 0) {
				criteria.add(VacuumCleaner.POWER_CONSUMPTION.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.FILTER_TYPE.toString()) == 0) {
				criteria.add(VacuumCleaner.FILTER_TYPE.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.BAG_TYPE.toString()) == 0) {
				criteria.add(VacuumCleaner.BAG_TYPE.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.WAND_TYPE.toString()) == 0) {
				criteria.add(VacuumCleaner.WAND_TYPE.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.MOTOR_SPEED_REGULATION.toString()) == 0) {
				criteria.add(VacuumCleaner.MOTOR_SPEED_REGULATION.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(VacuumCleaner.CLEANING_WIDTH.toString()) == 0) {
				criteria.add(VacuumCleaner.CLEANING_WIDTH.toString(), applinceParam[1]);
			}
		}
		
	}

}
