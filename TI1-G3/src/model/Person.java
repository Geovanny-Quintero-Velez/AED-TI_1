package model;

public class Person {
	//Attributes
	private String name = "";
	private int floor = 0;
	//Methods
	public Person(String pName, int pFloor) {
		name = pName;
		floor = pFloor;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
}
