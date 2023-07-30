package com.test2;
/*Write a program to create a class named Vehicle
 having protected instance variables regnNumber, speed, color, ownerName and a method showData ( )
 to show “This is a vehicle class”.
 Inherit the Vehicle class into subclasses named Bus and Car 
 having individual private instance variables routeNumber in Bus and manufacturerName in Car
 and both of them having showData ( ) method.
 showing all details of Bus and Car respectively with content of the super class’s showData ( ) method.
 */

class Vehicle{
	protected int regnNumber;
	protected String color;
	protected String ownerName;
	protected double speed;


	public Vehicle(int regnNumber, String color, String ownerName, double speed) 
	{
		this.regnNumber = regnNumber;
		this.color = color;
		this.ownerName = ownerName;
		this.speed = speed;
	}

	void showData()
	{
		System.out.println("This is Vehicle Class");
	}

}

class Cars extends Vehicle
{

	private String manufacturerName;

	public Cars(int regnNumber, String color, String ownerName, double speed, String manufacturerName)
	{
		super(regnNumber, color, ownerName, speed);
		this.manufacturerName = manufacturerName;
	}


	@Override
	void showData()
	{
		System.out.println("Car Registration Number:\t"+regnNumber);
		System.out.println("Car Color:\t"+color);
		System.out.println("car Owner name:\t"+ownerName);
		System.out.println("Car Speed:\t"+speed);
		System.out.println("Car Manufacturer Name:\t"+manufacturerName);
	}

}
class Bus extends Vehicle
{

	private int routeNumber;

	public Bus(int regnNumber, String color, String ownerName, double speed, int routeNumber)
	{
		super(regnNumber, color, ownerName, speed);
		this.routeNumber = routeNumber;
	}


	@Override
	void showData()
	{
		System.out.println("Bus Registration Number:\t"+regnNumber);
		System.out.println("Bus Color:\t"+color);
		System.out.println("Bus Owner name:\t"+ownerName);
		System.out.println("Bus Speed:\t"+speed);
		System.out.println("Bus Manufacturer Name:\t"+routeNumber);
	}

}

public class Prog1 {

	public static void main(String[] args) 
	{
		Vehicle v;
		System.out.println("------Vehical Details------");
		v=new Vehicle(1,"","",0);
		v.showData();
		System.out.println("================================================================\n");
		
		System.out.println("------Car Details------");
		v= new Cars(6515, "Red", "Jitendra", 110.88, "Audi");
		v.showData();		
		System.out.println("================================================================\n");

		System.out.println("------Bus Details------");
		v= new Bus(5090807, "White", "Navin", 65.88, 362);
		v.showData();
	}

}
