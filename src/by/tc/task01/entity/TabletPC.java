package by.tc.task01.entity;

public class TabletPC implements Appliance{
	private  double batteryCapacity;
	private  int displayInches;
	private  int memoryRow;
	private  int flashMemoryCapacity;
	private  String color;
	
	
	
	public TabletPC(double batteryCapacity, int memoryRom, int displayInches, int flashMemoryCapacity, String color) {
	setBatteryCapacity(batteryCapacity);
	setDisplayInches(displayInches);
	setMemoryRow(memoryRom);
	setFlashMemoryCapacity(flashMemoryCapacity);
	setColor(color);
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
		return "TabletPC [batteryCapacity=" + batteryCapacity + ", displayInches=" + displayInches + ", memoryRow="
				+ memoryRow + ", flashMemoryCapacity=" + flashMemoryCapacity + ", color=" + color + "]";
	}
}
