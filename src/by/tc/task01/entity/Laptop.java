package by.tc.task01.entity;

public class Laptop implements Appliance{
	
	private  double batteryCapacity;
	private  String os;
	private  int memoryRow;
	private  int systemMemory;
	private  double cpu;
	private  int displayInchs;
	
	public Laptop(int batteryCapacity, String os, int memoryRow, int systemMemory, double cpu, int displayInchs) {
		setBatteryCapacity(batteryCapacity);
		setOs(os);
		setMemoryRow(memoryRow);
		setSystemMemory(systemMemory);
		setCpu(cpu);
		setDisplayInchs(displayInchs);		
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
		return "Laptop [batteryCapacity=" + batteryCapacity + ", os=" + os + ", memoryRow=" + memoryRow
				+ ", systemMemory=" + systemMemory + ", cpu=" + cpu + ", displayInchs=" + displayInchs + "]";
	}
	
}
