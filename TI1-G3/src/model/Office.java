package model;

public class Office {
	
	//Attributes
	private int floor = 0;
	private String id = "";
	//Relations
	private Person persons;
	//Methods
	public Office(int pFloor, String pId) {
		floor = pFloor;
		id = pId;
	}
	public int getFloor() {
		return floor;
	}
	public void setFloor(int floor) {
		this.floor = floor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
}
