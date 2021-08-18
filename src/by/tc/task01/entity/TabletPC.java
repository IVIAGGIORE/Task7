package by.tc.task01.entity;

import by.tc.task01.entity.criteria.Criteria;

public class TabletPC implements Appliance{
	
	private  String name;
	private  double batteryCapacity;
	private  int displayInches;
	private  int memoryRow;
	private  int flashMemoryCapacity;
	private  String color;
	
	public TabletPC() {
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName() {
		this.name = "TabletPC";
	}


	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public int getDisplayInches() {
		return displayInches;
	}
	public void setDisplayInches(int displayInches) {
		this.displayInches = displayInches;
	}
	public int getMemoryRow() {
		return memoryRow;
	}
	public void setMemoryRow(int memoryRow) {
		this.memoryRow = memoryRow;
	}
	public int getFlashMemoryCapacity() {
		return flashMemoryCapacity;
	}
	public void setFlashMemoryCapacity(int flashMemoryCapacity) {
		this.flashMemoryCapacity = flashMemoryCapacity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}	
	
	@Override
	public String getText() {
		return "TabletPC : BATTERY_CAPACITY=" + batteryCapacity + ", DISPLAY_INCHES=" + displayInches + ", MEMORY_ROM="
				+ memoryRow + ", FLASH_MEMORY_CAPACITY=" + flashMemoryCapacity + ", COLOR=" + color;
	}
	@Override
	public String getNameAppliance() {
		return "TabletPC";
	}


	@Override
	public void parametrLines(String meaning) {
		setName();
		
		String[] parametr = meaning.split(",");
		
		for(int i = 0; i < parametr.length; i++) {
			String[] data = parametr[i].split("=");
	
			if(data[0].trim().compareTo("BATTERY_CAPACITY") == 0) {
				setBatteryCapacity(Double.parseDouble(data[1]));

			}
			if(data[0].trim().compareTo("DISPLAY_INCHES") == 0) {
				setDisplayInches(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("MEMORY_ROM") == 0) {
				setMemoryRow(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("FLASH_MEMORY_CAPACITY") == 0) {
				setFlashMemoryCapacity(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("COLOR") == 0) {
				setColor(data[1]);
			}
			
		}
		
	}


	@Override
	public boolean comparison(Criteria criteria) {
		if (!(criteria.getKeyCriteria("BATTERY_CAPACITY").toString().compareTo("ALL") == 0) &&				
				Double.toString(getBatteryCapacity()).compareTo(criteria.getKeyCriteria("BATTERY_CAPACITY").toString()) != 0 ) {
			return false;
		}
		if( !(criteria.getKeyCriteria("COLOR").toString().compareTo("ALL") == 0) &&
				getColor().toUpperCase().compareTo(criteria.getKeyCriteria("COLOR").toString().toUpperCase()) != 0) {
			return false;
		}
		
		if(!(criteria.getKeyCriteria("DISPLAY_INCHES").toString().compareTo("ALL") == 0) &&
				Integer.toString(getDisplayInches()).compareTo(criteria.getKeyCriteria("DISPLAY_INCHES").toString()) != 0  ) {
			return false;
		}
		if(!(criteria.getKeyCriteria("MEMORY_ROM").toString().compareTo("ALL") == 0) &&
				Integer.toString(getMemoryRow()).compareTo(criteria.getKeyCriteria("MEMORY_ROM").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("FLASH_MEMORY_CAPACITY").toString().compareTo("ALL") == 0) &&
				Integer.toString(getFlashMemoryCapacity()).compareTo(criteria.getKeyCriteria("FLASH_MEMORY_CAPACITY").toString()) != 0) {
			return false;
		}
		
		return true;
	}
}
