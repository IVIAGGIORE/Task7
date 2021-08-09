package by.tc.task01.entity;

public class Oven implements Appliance{
	
	private  int powerConsumpion;
	private int weight;
	private int capacity;
	private int depth;
	private double heicht;
	private double width;
	
	public Oven(int powerConsumpion, int weight, int capacity, int depth, double heicht, double width) {
		
		setPowerConsumpion(powerConsumpion);
		setWeight(weight);
		setCapacity(capacity);
		setDepth(depth);
		setHeicht(heicht);
		setWidth(width);
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
		return "Oven [powerConsumpion=" + powerConsumpion + ", weight=" + weight + ", capacity=" + capacity + ", depth="
				+ depth + ", heicht=" + heicht + ", width=" + width + "]";
	}
}
