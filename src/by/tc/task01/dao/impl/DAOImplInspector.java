package by.tc.task01.dao.impl;

import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria.TabletPC;

public class DAOImplInspector {

	public static void main(String[] args) {
		Criteria criteriaTabletPC = new Criteria(TabletPC.class.getSimpleName());
		criteriaTabletPC.add(TabletPC.COLOR.toString(), "BLUE");
		criteriaTabletPC.add(TabletPC.DISPLAY_INCHES.toString(), 14);
		criteriaTabletPC.add(TabletPC.MEMORY_ROM.toString(), 4);
		
		ApplianceDAO appDAO = new FileApplianceDAO();
		
		List<Appliance> apps = appDAO.find(criteriaTabletPC);

	}

}
