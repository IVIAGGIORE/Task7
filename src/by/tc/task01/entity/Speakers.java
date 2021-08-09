package by.tc.task01.entity;

public class Speakers implements Appliance{
	
	private  int powerConsumption;
	private  int numberofSpeakers;
	private  String frequencyRange;
	private  int cordLength;
	
	
	public Speakers(int powerConsumption, int numberofSpeakers, String frequencyRange, int cordLength) {
		setPowerConsumption(powerConsumption);
		setNumberofSpeakers(numberofSpeakers);
		setFrequencyRange(frequencyRange);
		setCordLength(cordLength);
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
		return "Speakers [powerConsumption=" + powerConsumption + ", numberofSpeakers=" + numberofSpeakers
				+ ", frequencyRange=" + frequencyRange + ", cordLength=" + cordLength + "]";
	}
}
