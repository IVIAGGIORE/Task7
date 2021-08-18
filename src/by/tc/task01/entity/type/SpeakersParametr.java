package by.tc.task01.entity.type;

import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.CriteriaParametr;
import by.tc.task01.entity.criteria.SearchCriteria.Speakers;

public class SpeakersParametr implements CriteriaParametr{

	@Override
	public void parametr(Criteria criteria, String[] params) {
		for(int i = 0; i < params.length; i++) {
			String[] applinceParam = params[i].split("=");
					
			if(applinceParam[1].toUpperCase().compareTo(Speakers.SPEAKERS.toString()) == 0) {
				criteria.add("TYPE",Speakers.SPEAKERS.toString());
			}
			if(applinceParam[1].toUpperCase().compareTo(Speakers.POWER_CONSUMPTION.toString()) == 0) {
				criteria.add(Speakers.POWER_CONSUMPTION.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Speakers.NUMBER_OF_SPEAKERS.toString()) == 0) {
				criteria.add(Speakers.NUMBER_OF_SPEAKERS.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Speakers.FREQUENCY_RANGE.toString()) == 0) {
				criteria.add(Speakers.FREQUENCY_RANGE.toString(), applinceParam[1]);
			}
			if(applinceParam[1].toUpperCase().compareTo(Speakers.CORD_LENGTH.toString()) == 0) {
				criteria.add(Speakers.CORD_LENGTH.toString(), applinceParam[1]);
			}
		}
		
	}

}
