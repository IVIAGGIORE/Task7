package by.tc.task01.controller.impl;


import by.tc.task01.controller.Command;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class AddApplianceCommand implements Command {

	
	@Override
	public String execute(String request) {
		String response;

		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
				
		response = service.add(request);

		return response;
	}

}
