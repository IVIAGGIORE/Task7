package by.tc.task01.dao.impl;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.Laptop;
import by.tc.task01.entity.Oven;
import by.tc.task01.entity.Refrigerator;
import by.tc.task01.entity.Speakers;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.TabletPC;
import by.tc.task01.entity.VacuumCleaner;
import by.tc.task01.entity.criteria.Criteria;

public class FileApplianceDAO implements ApplianceDAO{
	private List<String> lines;
	private String[] arrOfStr;
	private String[] arrStr;
	
	@Override
	public List<Appliance> find(Criteria criteria) {
		
		List<Appliance> subject = new ArrayList<Appliance>();
		
		try {
			lines = Files.readAllLines(Paths.get("D:\\java\\layered-arch-01\\src\\resources\\appliances_db.txt"), StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		for (int i = 0; i < lines.size(); i++) {
			arrOfStr = lines.get(i).split(":");
			switch (criteria.getGroupSearchName()) {
				case ("Oven"): 
					System.out.println(arrOfStr[0]);
						if(arrOfStr[0].compareTo("Oven ") == 0) {
							
							arrOfStr = transformation (arrOfStr[1]);
							subject.add(new Oven(Integer.parseInt(arrOfStr[0]), Integer.parseInt(arrOfStr[1]), Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]), Double.parseDouble(arrOfStr[4]), Double.parseDouble(arrOfStr[5]) ));
						}						
						break;
				case ("Laptop"): 
							if(arrOfStr[0].compareTo("Laptop ") == 0) {
							arrOfStr = transformation (arrOfStr[1]);
							subject.add(new Laptop(Double.parseDouble(arrOfStr[0]), arrOfStr[1], Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]), Double.parseDouble(arrOfStr[4]), Integer.parseInt(arrOfStr[5]) ));
						}		
						break;
				case ("Refrigerator"): 
					if(arrOfStr[0].compareTo("Refrigerator ") == 0) {
						arrOfStr = transformation (arrOfStr[1]);
						subject.add(new Refrigerator(Integer.parseInt(arrOfStr[0]), Integer.parseInt(arrOfStr[1]), Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]), Integer.parseInt(arrOfStr[4]), Integer.parseInt(arrOfStr[5])));
					}		
					break;
				case ("Speakers"): 
					if(arrOfStr[0].compareTo("Speakers ") == 0) {
						arrOfStr = transformation (arrOfStr[1]);
						subject.add(new Speakers(Integer.parseInt(arrOfStr[0]), Integer.parseInt(arrOfStr[1]), arrOfStr[2], Integer.parseInt(arrOfStr[3])));
					}		
					break;
				case ("TabletPC"): 
					if(arrOfStr[0].compareTo("TabletPC ") == 0) {
						arrOfStr = transformation (arrOfStr[1]);
						subject.add(new TabletPC(Double.parseDouble(arrOfStr[0]), Integer.parseInt(arrOfStr[1]), Integer.parseInt(arrOfStr[2]), Integer.parseInt(arrOfStr[3]), arrOfStr[4]));
					}		
					break;	
				case ("VacuumCleaner"): 
					if(arrOfStr[0].compareTo("VacuumCleaner ") == 0) {
						arrOfStr = transformation (arrOfStr[1]);
						subject.add(new VacuumCleaner(Integer.parseInt(arrOfStr[0]), arrOfStr[1], arrOfStr[2], arrOfStr[3], Integer.parseInt(arrOfStr[4]), Integer.parseInt(arrOfStr[5])));
					}		
					break;	
		
			}
			
			
		}

		return subject;
	}

	private String[] transformation(String string) {
		String[] str1;
		str1 = string.split(",");
		
		String[] str2;
		String[] str3 = new String[str1.length];
		
		for(int i = 0; i < str1.length; i++) {
			str2 = str1[i].split("=");
			str3[i] = str2[1];
		}
		return str3;
	}

	@Override
	public void add(Appliance appliance) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(Appliance appliance) {
		// TODO Auto-generated method stub
		
	}


	
	
	
	// you may add your own code here

}


//you may add your own new classes