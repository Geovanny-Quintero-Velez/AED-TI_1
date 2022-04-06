package model;

public class Office {
	
	//Attributes
	private String id = "";
	//Relations
	private Person person;
	//Methods
	public Office(String pId) {
		id = pId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Person getPerson() {
		return person;
	}
	public void setPerson(Person person) {
		this.person = person;
	}
}
