package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class VacuumCleaner implements Appliance{
	
	private String name;
	private  int powerConsumption;
	private String filterType;
	private String bagType;
	private String wandType;
	private int motorSpeedRegulation;
	private int cleaningWidth;
	
	public VacuumCleaner() {
		
	}


	public String getName() {
		return name;
	}


	public void setName() {
		this.name = "VacuumCleaner";
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
		return "VacuumCleaner : POWER_CONSUMPTION=" + powerConsumption + ", FILTER_TYPE=" + filterType + ", BAG_TYPE="
				+ bagType + ", WAND_TYPE=" + wandType + ", MOTOR_SPEED_REGULATION=" + motorSpeedRegulation
				+ ", CLEANING_WIDTH=" + cleaningWidth;
	}
	@Override
	public String getNameAppliance() {
		return "VacuumCleaner";
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
			if(data[0].trim().compareTo("FILTER_TYPE") == 0) {
				setFilterType(data[1]);
			}
			if(data[0].trim().compareTo("BAG_TYPE") == 0) {
				setBagType(data[1]);
			}
			if(data[0].trim().compareTo("WAND_TYPE") == 0) {
				setWandType(data[1]);
			}
			if(data[0].trim().compareTo("MOTOR_SPEED_REGULATION") == 0) {
				setMotorSpeedRegulation(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("CLEANING_WIDTH") == 0) {
				setCleaningWidth(Integer.parseInt(data[1]));
			}
		}
		
	}


	@Override
	public boolean comparison(Criteria criteria) {
		if (!(criteria.getKeyCriteria("POWER_CONSUMPTION").toString().compareTo("ALL") == 0) &&				
				Integer.toString(getPowerConsumption()).compareTo(criteria.getKeyCriteria("POWER_CONSUMPTION").toString()) != 0 ) {
			return false;
		}
		if( !(criteria.getKeyCriteria("FILTER_TYPE").toString().compareTo("ALL") == 0) &&
				getFilterType().toUpperCase().compareTo(criteria.getKeyCriteria("FILTER_TYPE").toString().toUpperCase()) != 0) {
			return false;
		}
		
		if( !(criteria.getKeyCriteria("BAG_TYPE").toString().compareTo("ALL") == 0) &&
				getBagType().toUpperCase().compareTo(criteria.getKeyCriteria("BAG_TYPE").toString().toUpperCase()) != 0) {
			return false;
		}
		if( !(criteria.getKeyCriteria("WAND_TYPE").toString().compareTo("ALL") == 0) &&
				getWandType().toUpperCase().compareTo(criteria.getKeyCriteria("WAND_TYPE").toString().toUpperCase()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("MOTOR_SPEED_REGULATION").toString().compareTo("ALL") == 0) &&
				Integer.toString(getMotorSpeedRegulation()).compareTo(criteria.getKeyCriteria("MOTOR_SPEED_REGULATION").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("CLEANING_WIDTH").toString().compareTo("ALL") == 0) &&
				Integer.toString(getCleaningWidth()).compareTo(criteria.getKeyCriteria("CLEANING_WIDTH").toString()) != 0) {
			return false;
		}
		return true;
	}
	
}
