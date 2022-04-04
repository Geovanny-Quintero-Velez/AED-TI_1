package ui;

import java.util.ArrayList;
import java.util.Scanner;

import model.Building;
import model.Office;

public class Main {
	
	private static ArrayList<Building> buildings = new ArrayList<>();
	public static Scanner lector = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the number of buildings.");
		int numBuildings = Integer.parseInt(lector.nextLine());
		for(int x=0;x<numBuildings;x++) {
			String line = lector.nextLine();
			String[] data = line.split(" ");
			String id = data[0];
			buildings.add(new Building(id));
			int people = Integer.parseInt(data[1]);
			for(int i = Integer.parseInt(data[2]);i>0;i--) {
				for(int j = 0;j<Integer.parseInt(data[3]);j++) {
					String numOffice = ""+(i*Integer.parseInt(data[3])-j);
					buildings.get(x).getOffices().add(new Office(i, numOffice));
				}
			}
			for(int i=0;i<people;i++) {
				
			}
		}
		
		System.out.println("");
		for(int i=0;i<numBuildinds;i++) {
			buildings.add(new Building());
		}
		System.out.println("Please enter the building identifier, the person number, the number of floors and the number of offices per floor (In this order and separated by a space).");
		String data = lector.nextLine();
		String[] datos = data.split(" ");
		buildings.get(1).setId(datos[0]);
	}
}