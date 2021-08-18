package by.tc.task01.controller.impl;

import java.util.ArrayList;
import java.util.List;

import by.tc.task01.controller.Command;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.main.PrintApplianceInfo;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class FineApplianceCommand extends ReadRequest implements Command{
	
	private Criteria criteria = new Criteria();
	
	@Override
	public String execute(String request) {
		criteria = read(request);

		String response = "";
		
		List<Appliance> appliance = new ArrayList<Appliance>();

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		appliance = service.find(criteria);
		
		for (Appliance b : appliance) {
			response = response + b.getText();
		}
		
		return response;
	}

}
