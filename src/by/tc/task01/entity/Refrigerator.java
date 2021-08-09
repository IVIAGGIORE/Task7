package by.tc.task01.entity;

public class Refrigerator implements Appliance{
	private  int powerConsumpion;
	private  int weight;
	private  int freezerCapacity;
	private  int overallCzpzcity;
	private  int height;
	private  int width;
	
	public Refrigerator(int powerConsumpion, int weight, int freezerCapacity, int overallCzpzcity, int height, int width) {
		setPowerConsumpion(powerConsumpion);
		setWeight(weight);
		setFreezerCapacity(freezerCapacity);
		setOverallCzpzcity(overallCzpzcity);
		setHeight(height);
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
	public int getFreezerCapacity() {
		return freezerCapacity;
	}
	public void setFreezerCapacity(int freezerCapacity) {
		this.freezerCapacity = freezerCapacity;
	}
	public int getOverallCzpzcity() {
		return overallCzpzcity;
	}
	public void setOverallCzpzcity(int overallCzpzcity) {
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
		return "Refrigerator [powerConsumpion=" + powerConsumpion + ", weight=" + weight + ", freezerCapacity="
				+ freezerCapacity + ", overallCzpzcity=" + overallCzpzcity + ", height=" + height + ", width=" + width
				+ "]";
	}
}