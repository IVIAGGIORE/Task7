package by.tc.task01.entity;

public class VacuumCleaner implements Appliance{
	private  int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	
	public VacuumCleaner(int powerConsumption, String filterType, String bagType, String wandType, int motorSpeedRegulation, int cleaningWidth) {
		setPowerConsumption(powerConsumption);
		setFilterType(filterType);
		setBagType(bagType);
		setWandType(wandType);
		setMotorSpeedRegulation(motorSpeedRegulation);
		setCleaningWidth(cleaningWidth);
	}

	public int getPowerConsumption() {
		return powerConsumption;
	}
	public void setPowerConsumption(int powerConsumption) {
		this.powerConsumption = powerConsumption;
	}
	public String getFilterType() {
		return filterType;
	}


	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}


	public String getBagType() {
		return bagType;
	}


	public void setBagType(String bagType) {
		this.bagType = bagType;
	}


	public String getWandType() {
		return wandType;
	}


	public void setWandType(String wandType) {
		this.wandType = wandType;
	}


	public int getMotorSpeedRegulation() {
		return motorSpeedRegulation;
	}


	public void setMotorSpeedRegulation(int motorSpeedRegulation) {
		this.motorSpeedRegulation = motorSpeedRegulation;
	}


	public int getCleaningWidth() {
		return cleaningWidth;
	}


	public void setCleaningWidth(int cleaningWidth) {
		this.cleaningWidth = cleaningWidth;
	}
	
	@Override
	public String getText() {
		return "VacuumCleaner [powerConsumption=" + powerConsumption + ", filterType=" + filterType + ", bagType="
				+ bagType + ", wandType=" + wandType + ", motorSpeedRegulation=" + motorSpeedRegulation
				+ ", cleaningWidth=" + cleaningWidth + "]";
	}
	
}
