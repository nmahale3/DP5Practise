package com.test2;
/*3.Create a base class Building
 *  that stores the number of floors of a building, number of rooms and it’s total foot age.
 *  Create a derived class House that inherits Building and also stores the number of bedrooms and bathrooms.
 *  Demonstrate the working of the classes.
 *  create a second derived class Office that inherits Building  and stores the number of telephones and tables.
 * Now demonstrate the working of all three classes*/

class Building
{
	int floors;
	int rooms;
	int footage;
	public Building(int floors, int rooms, int footage) {
		this.floors = floors;
		this.rooms = rooms;
		this.footage = footage;
	}
	public int getFloors() {
		return floors;
	}
	public int getRooms() {
		return rooms;
	}
	public int getFootage() {
		return footage;
	}

public void show ()
{
	
	System.out.println("Floors:\t"+floors);
	System.out.println("Rooms:\t"+rooms);
	System.out.println("Footage:\t"+footage+"Sq. ft.");
}
}

class House extends Building
{
	int bedrooms ;
	int bathrooms;
	public House(int floors, int rooms, int footage, int bedrooms, int bathrooms) {
		super(floors, rooms, footage);
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("Bedrooms:\t"+bedrooms);
		System.out.println("Bathooms:\t"+bathrooms+"\n");
	
	}
	
}
class Office extends Building
{
	int telphones ;
	int tables ;
	public Office(int floors, int rooms, int footage, int telphones, int tables) {
		super(floors, rooms, footage);
		this.telphones = telphones;
		this.tables = tables;
	}
	public int getTelphones() {
		return telphones;
	}
	public int getTables() {
		return tables;
	}
	@Override
	public void show()
	{
		super.show();
		System.out.println("Telephones:\t"+telphones);
		System.out.println("Tables:\t"+tables);
	
	}
	
}
public class Prog3 {

	public static void main(String[] args) {
		Building b ;
		System.out.println("----Building Details----");
		b=new Building(10, 40, 1000);
		b.show();
		System.out.println("\n----House Details----");
		b=new House(2, 8, 1400, 4, 4);
		b.show();
		System.out.println("\n----Office Details----");
		b=new Office(10, 50, 3500,110, 50);
		b.show();
	}

}
