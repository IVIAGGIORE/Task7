package by.tc.task01.controller;

import by.tc.task01.entity.criteria.Criteria;

public class Controller {

	private static final int COMMAND_NAME = 0;
	private final CommandProvider provider = new CommandProvider();
	
	public String doAction(String request) {
		
		String[] params = request.split("\\s+", 2);
		
		String commandName = params[COMMAND_NAME];
		
		String response;
		
		Command command;
		
		command = provider.takeCommand(commandName);

		response = command.execute(params[1]);
	
		return response;
	}
}
