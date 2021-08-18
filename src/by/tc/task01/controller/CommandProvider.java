package by.tc.task01.controller;

import java.util.HashMap;
import java.util.Map;

import by.tc.task01.controller.impl.AddApplianceCommand;
import by.tc.task01.controller.impl.FineApplianceCommand;
import by.tc.task01.controller.impl.RemoveApplianceCommand;

public class CommandProvider{
	private Map<ComandName, Command> commands = new HashMap<>();
	
	public CommandProvider() {
		commands.put(ComandName.FIND, new FineApplianceCommand());
		commands.put(ComandName.ADD, new AddApplianceCommand());
		commands.put(ComandName.REMOVE, new RemoveApplianceCommand());
	}
	
	public Command takeCommand(String commandName) {
		
		ComandName name = ComandName.valueOf(commandName.toUpperCase());
		
		Command command = commands.get(name);
		return command;
		
	}
}
