package by.tc.task01.dao.impl;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

public class FileApplianceDAO implements ApplianceDAO {
	private List<String> lines;

	@Override
	public List<Appliance> find(Criteria criteria) {

		List<Appliance> subject = new ArrayList<Appliance>();

		readText();

		if (criteria.getType().toString().compareTo("ALL") == 0) {
			searchALL(subject);
		}else {
			search(subject, criteria);
		}

		return subject;
	}

	private void search(List<Appliance> subject, Criteria criteria) {
		for (int i = 0; i < lines.size(); i++) {
			String[] meaning = lines.get(i).split(":");
			DaoParametr parametr = new DaoParametr();
			if (!meaning[0].equals("")) {
				if(meaning[0].toUpperCase().trim().compareTo(criteria.getType().toString()) == 0)
				{
					Appliance appliance = parametr.takeParametr(meaning[0]);
					appliance.parametrLines(meaning[1]);
					
					if(appliance.comparison(criteria)) {
						subject.add(appliance);
					}
					
				}
				
			}
		
		}
	}

	

	private void searchALL(List<Appliance> subject) {
	
		for (int i = 0; i < lines.size(); i++) {
			DaoParametr parametr = new DaoParametr();
			String[] meaning = lines.get(i).split(":");
			if (!meaning[0].equals("")) {
				Appliance appliance = parametr.takeParametr(meaning[0]);
				appliance.parametrLines(meaning[1]);
				subject.add(appliance);
			}
		}
	}

	private void readText() {
		try {
			lines = Files.readAllLines(Paths.get("D:\\java\\layered-arch-01\\src\\resources\\appliances_db.txt"),
					StandardCharsets.UTF_8);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public String add(String request) {
		
		readText(); 
		String[] str1 = request.split(" ", 2); 
		String[] str2; 
		String[] str3 =  str1[0].split("=");
				
		for (int i = 0; i <lines.size(); i++) { 
			str2 = lines.get(i).split(" : ");
			
				if(str2[0].toUpperCase().trim().compareTo(str3[1].toUpperCase()) == 0) {
				
				lines.add(i, outcome (request)); 
			
				break; 
				} 
			}
		 writeText(); 
		 return "выполнено";
	}
	
	 private String outcome(String request) {
		String[] str1 = request.split("=", 2); 
		String[] str2 = str1[1].split(" ", 2);
		
		return str2[0] + " : " + str2[1];
	}

	private void writeText() { 
		 FileWriter writer; 
		 try {
			 writer = new FileWriter("D:\\java\\layered-arch-01\\src\\resources\\appliances_db.txt");
			 for(String neaws: lines) { writer.write(neaws.toString() + '\n');  
			 }
			 writer.close(); }
		 catch (IOException e)  { 
			 e.printStackTrace(); 
			 } 
		 
		 }

	@Override
	public String remove(String request) {
		readText();
		 
			 for(int i = 0; i < lines.size(); i++) {
				 if(lines.get(i).toString().compareTo(outcome (request)) == 0) { 
					 lines.remove(i);
				 } 
			 } 
		writeText(); 
		 		
		return "ok";

	}

	

}

//you may add your own new classes