package model;

import java.util.ArrayList;

import Structures.DoubleLinkedList;

public class Building {
	
	//Attributes
	private String id = "";
	private boolean elevator = false;
	//Relations
	private DoubleLinkedList<Floor> floors = new DoubleLinkedList<>();
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
	public DoubleLinkedList<Floor> getFloors() {
		return floors;
	}
	public void setFloors(DoubleLinkedList<Floor> floors) {
		this.floors = floors;
	}
}
