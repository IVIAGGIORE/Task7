package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class Refrigerator implements Appliance{

	private String name;
	private  int powerConsumpion;
	private  int weight;
	private  int freezerCapacity;
	private  double overallCzpzcity;
	private  int height;
	private  int width;
	
	public Refrigerator() {
		
	}

	public String getName() {
		return name;
	}

	public void setName() {
		this.name = "Refrigerator";
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
	public int getFreezerCapacity() {
		return freezerCapacity;
	}
	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}
	public double getOverallCzpzcity() {
		return overallCzpzcity;
	}
	public void setOverallCzpzcity(double overallCzpzcity) {
		this.overallCzpzcity = overallCzpzcity;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	
	@Override
	public String getText() {
		return "Refrigerator : POWER_CONSUMPTION=" + powerConsumpion + ", WEIGHT=" + weight + ", FREEZER_CAPACITY="
				+ freezerCapacity + ", OVERALL_CAPACITY=" + overallCzpzcity + ", HEIGHT=" + height + ", WIDTH=" + width;
	}
	@Override
	public String getNameAppliance() {
		return "Refrigerator";
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
			if(data[0].trim().compareTo("FREEZER_CAPACITY") == 0) {
				setFreezerCapacity(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("OVERALL_CAPACITY") == 0) {
				setOverallCzpzcity(Double.parseDouble(data[1]));
			}
			if(data[0].trim().compareTo("HEIGHT") == 0) {
				setHeight(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("WIDTH") == 0) {
				setWidth(Integer.parseInt(data[1]));
			}
			
		}
		
	}

	@Override
	public boolean comparison(Criteria criteria) {
		if (!(criteria.getKeyCriteria("POWER_CONSUMPTION").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getPowerConsumpion()).compareTo(criteria.getKeyCriteria("POWER_CONSUMPTION").toString()) != 0 ) {
			return false;
		}
		
		if(!(criteria.getKeyCriteria("WEIGHT").toString().compareTo("ALL") == 0) &&
				Integer.toString(getWeight()).compareTo(criteria.getKeyCriteria("WEIGHT").toString()) != 0  ) {
			return false;
		}
		if(!(criteria.getKeyCriteria("FREEZER_CAPACITY").toString().compareTo("ALL") == 0) &&
				Integer.toString(getFreezerCapacity()).compareTo(criteria.getKeyCriteria("FREEZER_CAPACITY").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("OVERALL_CAPACITY").toString().compareTo("ALL") == 0) &&
				Double.toString(getOverallCzpzcity()).compareTo(criteria.getKeyCriteria("OVERALL_CAPACITY").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("HEIGHT").toString().compareTo("ALL") == 0) &&
				Integer.toString(getHeight()).compareTo(criteria.getKeyCriteria("HEIGHT").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("WIDTH").toString().compareTo("ALL") == 0) &&
				Integer.toString(getWidth()).compareTo(criteria.getKeyCriteria("WIDTH").toString()) != 0) {
			return false;
		}
		return true;
	}
}