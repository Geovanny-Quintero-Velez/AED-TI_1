package model;

public class Floor {
	
	private int numFloor;
	private Office[] offices;

	public Floor(int numFloor, int numOffices) {
		this.setNumFloor(numFloor);
		offices = new Office[numOffices];
	}

	public int getNumFloor() {
		return numFloor;
	}

	public void setNumFloor(int numFloor) {
		this.numFloor = numFloor;
	}

	public Office[] getOffices() {
		return offices;
	}

	public void setOffices(Office[] offices) {
		this.offices = offices;
	}
}
