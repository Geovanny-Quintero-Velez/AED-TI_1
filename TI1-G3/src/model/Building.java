package model;

import java.util.ArrayList;

public class Building {
	
	//Attributes
	private String id = "";
	private boolean elevator = false;
	//Relations
	private ArrayList<Office> offices = new ArrayList<>();
	//Methods
	public Building(String id) {
		this.id = id;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public boolean isElevator() {
		return elevator;
	}
	public void setElevator(boolean elevator) {
		this.elevator = elevator;
	}
	
	public ArrayList<Office> getOffices(){
		return offices;
	}
}
