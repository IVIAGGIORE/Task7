package by.tc.task01.main;

import static by.tc.task01.entity.criteria.SearchCriteria.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import by.tc.task01.controller.Controller;
import by.tc.task01.dao.impl.FileApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

public class Main {
	
	
	
	
	

	public static void main(String[] args) {
	
		
	Controller controller = new Controller();
	
	String request = "";
	String response;
	int answer;
	int work = 0;
	
	String meaning;
	while (work == 0) {
		System.out.println("найти - 1, добавить - 2, удалить - 3");
		answer = sr.nextInt();
		if (answer == 1) {
			request = "FIND";
		}
		if (answer == 2) {
			request = "ADD";
		}
		if (answer == 3) {
			request = "REMOVE";
		}
		System.out.println("TYPE 0 - all, Laptop - 1, Oven - 2, Refrigirator - 3, speakers - 4, TabletPC - 5, VacemCleaner - 6");
		answer = sr.nextInt();
		if (answer == 0) {
			request = request + " TYPE=all";
		}
		if (answer == 1) {
			request = request + " TYPE=Laptop";
			System.out.println("BATTERY_CAPACITY 0 - all, другое значение");
			request = request + " BATTERY_CAPACITY=" + readKeyboard();
			System.out.println("OS 0 - all, другое значение");
			request = request + " OS=" + readKeyboard();
			System.out.println("MEMORY_ROM 0 - all, другое значение");
			request = request + " MEMORY_ROM=" + readKeyboard();
			System.out.println("SYSTEM_MEMORY 0 - all, другое значение");
			request = request + " SYSTEM_MEMORY=" + readKeyboard();
			System.out.println("CPU 0 - all, другое значение");
			request = request + " CPU=" + readKeyboard();
			System.out.println("DISPLAY_INCHS 0 - all, другое значение");
			request = request + " DISPLAY_INCHS=" + readKeyboard();
		}
		if (answer == 2) {
			request = request + " TYPE=Oven";
			System.out.println("POWER_CONSUMPTION 0 - all, другое значение");
			request = request + " POWER_CONSUMPTION=" + readKeyboard();
			System.out.println("WEIGHT 0 - all, другое значение");
			request = request + " WEIGHT=" + readKeyboard();
			System.out.println("CAPACITY 0 - all, другое значение");
			request = request + " CAPACITY=" + readKeyboard();
			System.out.println("DEPTH 0 - all, другое значение");
			request = request + " DEPTH=" + readKeyboard();
			System.out.println("HEIGHT 0 - all, другое значение");
			request = request + " HEIGHT=" + readKeyboard();
			System.out.println("WIDTH 0 - all, другое значение");
			request = request + " WIDTH=" + readKeyboard();
			
		}
		if (answer == 3) {
			request = request + " TYPE=Refrigirator";
			System.out.println("POWER_CONSUMPTION 0 - all, другое значение");
			request = request + " POWER_CONSUMPTION=" + readKeyboard();
			System.out.println("WEIGHT 0 - all, другое значение");
			request = request + " WEIGHT=" + readKeyboard();
			System.out.println("FREEZER_CAPACITY 0 - all, другое значение");
			request = request + " FREEZER_CAPACITY=" + readKeyboard();
			System.out.println("OVERALL_CAPACITY 0 - all, другое значение");
			request = request + " OVERALL_CAPACITY=" + readKeyboard();
			System.out.println("HEIGHT 0 - all, другое значение");
			request = request + " HEIGHT=" + readKeyboard();
			System.out.println("WIDTH 0 - all, другое значение");
			request = request + " WIDTH=" + readKeyboard();
		}
		if (answer == 4) {
			request = request + " TYPE=Speakers";
			System.out.println("POWER_CONSUMPTION 0 - all, другое значение");
			request = request + " POWER_CONSUMPTION=" + readKeyboard();
			System.out.println("NUMBER_OF_SPEAKERS 0 - all, другое значение");
			request = request + " NUMBER_OF_SPEAKERS=" + readKeyboard();
			System.out.println("FREQUENCY_RANGE 0 - all, другое значение");
			request = request + " FREQUENCY_RANGE=" + readKeyboard();
			System.out.println("CORD_LENGTH 0 - all, другое значение");
			request = request + " CORD_LENGTH=" + readKeyboard();
		}
		if (answer == 5) {
			request = request + " TYPE=TabletPC";
			System.out.println("BATTERY_CAPACITY 0 - all, другое значение");
			request = request + " BATTERY_CAPACITY=" + readKeyboard();
			System.out.println("DISPLAY_INCHES 0 - all, другое значение");
			request = request + " DISPLAY_INCHES=" + readKeyboard();
			System.out.println("MEMORY_ROM 0 - all, другое значение");
			request = request + " MEMORY_ROM=" + readKeyboard();
			System.out.println("FLASH_MEMORY_CAPACITY 0 - all, другое значение");
			request = request + " FLASH_MEMORY_CAPACITY=" + readKeyboard();
			System.out.println("COLOR 0 - all, другое значение");
			request = request + " COLOR=" + readKeyboard();
		}
		if (answer == 6) {
			request = request + " TYPE=VacemCleaner";
			System.out.println("POWER_CONSUMPTION 0 - all, другое значение");
			request = request + " POWER_CONSUMPTION=" + readKeyboard();
			System.out.println("FILTER_TYPE 0 - all, другое значение");
			request = request + " FILTER_TYPE=" + readKeyboard();
			System.out.println("BAG_TYPE 0 - all, другое значение");
			request = request + " BAG_TYPE=" + readKeyboard();
			System.out.println("WAND_TYPE 0 - all, другое значение");
			request = request + " WAND_TYPE=" + readKeyboard();
			System.out.println("MOTOR_SPEED_REGULATION 0 - all, другое значение");
			request = request + " MOTOR_SPEED_REGULATION=" + readKeyboard();
			System.out.println("CLEANING_WIDTH 0 - all, другое значение");
			
		}
	work = 1;
	}

	response = controller.doAction(request);

	}

	private static String readKeyboard() {
		Scanner sr = new Scanner(System.in);
		String meaning;
		while(sr.hasNextLine()) {
			meaning = sr.nextLine();
			return (meaning.compareTo("0") == 0) ? "ALL" : meaning;
		}
		sr.close();
		return null;
	}

}
