package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class Oven implements Appliance{
	
	private String name;
	private  int powerConsumpion;
	private int weight;
	private int capacity;
	private int depth;
	private double heicht;
	private double width;
	
	public Oven() {
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName() {
		this.name = "Oven";
	}


	public int getPowerConsumpion() {
		return powerConsumpion;
	}
	public void setPowerConsumpion(int powerConsumpion) {
		this.powerConsumpion = powerConsumpion;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	public int getDepth() {
		return depth;
	}
	public void setDepth(int depth) {
		this.depth = depth;
	}
	public double getHeicht() {
		return heicht;
	}
	public void setHeicht(double heicht) {
		this.heicht = heicht;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	@Override
	public String getText() {
		return "Oven : POWER_CONSUMPTION=" + powerConsumpion + ", WEIGHT=" + weight + ", CAPACITY=" + capacity + ", DEPTH="
				+ depth + ", HEIGHT=" + heicht + ", WIDTH=" + width ;
	}
	@Override
	public String getNameAppliance() {
		return "Oven";
	}


	@Override
	public void parametrLines(String meaning) {
		setName();
		
		String[] parametr = meaning.split(",");
		
		for(int i = 0; i < parametr.length; i++) {
			String[] data = parametr[i].split("=");
	
			if(data[0].trim().compareTo("POWER_CONSUMPTION") == 0) {
				setPowerConsumpion(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("WEIGHT") == 0) {
				setWeight(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("CAPACITY") == 0) {
				setCapacity(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("DEPTH") == 0) {
				setDepth(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("HEIGHT") == 0) {
				setHeicht(Double.parseDouble(data[1]));
			}
			if(data[0].trim().compareTo("WIDTH") == 0) {
				setWidth(Double.parseDouble(data[1]));
			}
			
		}
		
	}


	@Override
	public boolean comparison(Criteria criteria) {
		if (!(criteria.getKeyCriteria("POWER_CONSUMPTION").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getPowerConsumpion()).compareTo(criteria.getKeyCriteria("POWER_CONSUMPTION").toString()) != 0 ) {
			return false;
		}
		if (!(criteria.getKeyCriteria("WEIGHT").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getWeight()).compareTo(criteria.getKeyCriteria("WEIGHT").toString()) != 0 ) {
			return false;
		}
		if (!(criteria.getKeyCriteria("CAPACITY").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getCapacity()).compareTo(criteria.getKeyCriteria("CAPACITY").toString()) != 0 ) {
			return false;
		}
		if (!(criteria.getKeyCriteria("DEPTH").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getDepth()).compareTo(criteria.getKeyCriteria("DEPTH").toString()) != 0 ) {
			return false;
		}
		if (!(criteria.getKeyCriteria("HEIGHT").toString().compareTo("ALL") == 0) &&				
				Double.toString(getHeicht()).compareTo(criteria.getKeyCriteria("HEIGHT").toString()) != 0 ) {
			return false;
		}
		if (!(criteria.getKeyCriteria("WIDTH").toString().compareTo("ALL") == 0) &&				
				Double.toString(getWidth()).compareTo(criteria.getKeyCriteria("WIDTH").toString()) != 0 ) {
			return false;
		}
		
		
		
		return true;
	}
}
