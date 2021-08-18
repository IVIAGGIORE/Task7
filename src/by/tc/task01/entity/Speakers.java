package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class Speakers implements Appliance{
	private  String name;
	private  int powerConsumption;
	private  int numberofSpeakers;
	private  String frequencyRange;
	private  int cordLength;
	
	public Speakers() {
		
	}
	

	public String getName() {
		return name;
	}


	public void setName() {
		this.name = "Speakers";
	}


	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	
	public int getNumberofSpeakers() {
		return numberofSpeakers;
	}


	public void setNumberofSpeakers(int numberofSpeakers) {
		this.numberofSpeakers = numberofSpeakers;
	}


	public String getFrequencyRange() {
		return frequencyRange;
	}


	public void setFrequencyRange(String frequencyRange) {
		this.frequencyRange = frequencyRange;
	}


	public int getCordLength() {
		return cordLength;
	}


	public void setCordLength(int cordLength) {
		this.cordLength = cordLength;
	}
	

	@Override
	public String getText() {
		return "Speakers : POWER_CONSUMPTION=" + powerConsumption + ", NUMBER_OF_SPEAKERS=" + numberofSpeakers
				+ ", FREQUENCY_RANGE=" + frequencyRange + ", CORD_LENGTH=" + cordLength;
	}
	@Override
	public String getNameAppliance() {
		return "Speakers";
	}


	@Override
	public void parametrLines(String meaning) {
		setName();
		
		String[] parametr = meaning.split(",");
		
		for(int i = 0; i < parametr.length; i++) {
			String[] data = parametr[i].split("=");
	
			if(data[0].trim().compareTo("POWER_CONSUMPTION") == 0) {
				setPowerConsumption(Integer.parseInt(data[1]));

			}
			if(data[0].trim().compareTo("NUMBER_OF_SPEAKERS") == 0) {
				setNumberofSpeakers(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("FREQUENCY_RANGE") == 0) {
				setFrequencyRange(data[1]);
			}
			if(data[0].trim().compareTo("CORD_LENGTH") == 0) {
				setCordLength(Integer.parseInt(data[1]));
			}
			
		}
		
	}


	@Override
	public boolean comparison(Criteria criteria) {
		if (!(criteria.getKeyCriteria("POWER_CONSUMPTION").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getPowerConsumption()).compareTo(criteria.getKeyCriteria("POWER_CONSUMPTION").toString()) != 0 ) {
			return false;
		}
		if( !(criteria.getKeyCriteria("FREQUENCY_RANGE").toString().compareTo("ALL") == 0) &&
				getFrequencyRange().toUpperCase().compareTo(criteria.getKeyCriteria("FREQUENCY_RANGE").toString().toUpperCase()) != 0) {
			return false;
		}
		
		if(!(criteria.getKeyCriteria("NUMBER_OF_SPEAKERS").toString().compareTo("ALL") == 0) &&
				Integer.toString(getNumberofSpeakers()).compareTo(criteria.getKeyCriteria("NUMBER_OF_SPEAKERS").toString()) != 0  ) {
			return false;
		}
		if(!(criteria.getKeyCriteria("CORD_LENGTH").toString().compareTo("ALL") == 0) &&
				Integer.toString(getCordLength()).compareTo(criteria.getKeyCriteria("CORD_LENGTH").toString()) != 0) {
			return false;
		}
		
		return true;
	}
}
