package by.tc.task01.entity;



import by.tc.task01.entity.criteria.Criteria;

public class Laptop implements Appliance{
	private  String name;
	private  double batteryCapacity;
	private  String os;
	private  int memoryRow;
	private  int systemMemory;
	private  double cpu;
	private  int displayInchs;
	
	public Laptop() {
		
	}
	
	
	public String getName() {
		return name;
	}


	public void setName() {
		this.name = "Laptop";
	}


	public double getBatteryCapacity() {
		return batteryCapacity;
	}
	public void setBatteryCapacity(double batteryCapacity) {
		this.batteryCapacity = batteryCapacity;
	}
	public String getOs() {
		return os;
	}
	public void setOs(String os) {
		this.os = os;
	}
	public int getMemoryRow() {
		return memoryRow;
	}
	public void setMemoryRow(int memoryRow) {
		this.memoryRow = memoryRow;
	}
	public int getSystemMemory() {
		return systemMemory;
	}
	public void setSystemMemory(int systemMemory) {
		this.systemMemory = systemMemory;
	}
	public double getCpu() {
		return cpu;
	}
	public void setCpu(double cpu) {
		this.cpu = cpu;
	}
	public int getDisplayInchs() {
		return displayInchs;
	}
	public void setDisplayInchs(int displayInchs) {
		this.displayInchs = displayInchs;
	}
	
	@Override
	public String getText() {
		return "Laptop : BATTERY_CAPACITY=" + batteryCapacity + ", OS=" + os + ", MEMORY_ROM=" + memoryRow
				+ ", SYSTEM_MEMORY=" + systemMemory + ", CPU=" + cpu + ", DISPLAY_INCHS=" + displayInchs;
	}
	@Override
	public String getNameAppliance() {
		return getName();
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
			if(data[0].trim().compareTo("OS") == 0) {
				setOs(data[1]);
			}
			if(data[0].trim().compareTo("MEMORY_ROM") == 0) {
				setMemoryRow(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("SYSTEM_MEMORY") == 0) {
				setSystemMemory(Integer.parseInt(data[1]));
			}
			if(data[0].trim().compareTo("CPU") == 0) {
				setCpu(Double.parseDouble(data[1]));
			}
			if(data[0].trim().compareTo("DISPLAY_INCHS") == 0) {
				setDisplayInchs(Integer.parseInt(data[1]));
			}
		}
		
	}


	@Override
	public boolean comparison(Criteria criteria) {
		
		
		
		if (!(criteria.getKeyCriteria("BATTERY_CAPACITY").toString().compareTo("ALL") == 0) &&				
				Double.toString(getBatteryCapacity()).compareTo(criteria.getKeyCriteria("BATTERY_CAPACITY").toString()) != 0 ) {
			return false;
		}
		if( !(criteria.getKeyCriteria("OS").toString().compareTo("ALL") == 0) &&
				getOs().toUpperCase().compareTo(criteria.getKeyCriteria("OS").toString().toUpperCase()) != 0) {
			return false;
		}
		
		if(!(criteria.getKeyCriteria("MEMORY_ROM").toString().compareTo("ALL") == 0) &&
				Integer.toString(getMemoryRow()).compareTo(criteria.getKeyCriteria("MEMORY_ROM").toString()) != 0  ) {
			return false;
		}
		if(!(criteria.getKeyCriteria("SYSTEM_MEMORY").toString().compareTo("ALL") == 0) &&
				Integer.toString(getSystemMemory()).compareTo(criteria.getKeyCriteria("SYSTEM_MEMORY").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("CPU").toString().compareTo("ALL") == 0) &&
				Double.toString(getCpu()).compareTo(criteria.getKeyCriteria("CPU").toString()) != 0) {
			return false;
		}
		if(!(criteria.getKeyCriteria("DISPLAY_INCHS").toString().compareTo("ALL") == 0) &&
				Integer.toString(getDisplayInchs()).compareTo(criteria.getKeyCriteria("DISPLAY_INCHS").toString()) != 0) {
			return false;
		}
		return true;
		
	}





	
	
}
