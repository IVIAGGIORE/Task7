package by.tc.task01.entity.criteria;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.entity.criteria.SearchCriteria.Type;
import by.tc.task01.entity.type.AllParametr;
import by.tc.task01.entity.type.LaptopParametr;
import by.tc.task01.entity.type.OvenParametr;
import by.tc.task01.entity.type.RefrigeratorParametr;
import by.tc.task01.entity.type.SpeakersParametr;
import by.tc.task01.entity.type.TabletPCParametr;
import by.tc.task01.entity.type.VacuumCleanerParametr;


public class CriteriaProvider {
	private Map <Type, CriteriaParametr> commands = new HashMap<>();
	
	public CriteriaProvider() {
		commands.put(Type.ALL, new AllParametr());
		commands.put(Type.OVEN, new OvenParametr());
		commands.put(Type.LAPTOP, new LaptopParametr());
		commands.put(Type.REFRIGERATOR, new RefrigeratorParametr());
		commands.put(Type.VACUUMCLEANER, new VacuumCleanerParametr());
		commands.put(Type.TABLEPC, new TabletPCParametr());
		commands.put(Type.SPEAKERS, new SpeakersParametr());
	}
	
	public CriteriaParametr takeProvider(String commandType) {
		Type type = Type.valueOf(commandType.toUpperCase());
		CriteriaParametr criteriaParametr = commands.get(type);
		return criteriaParametr;
	}
}
