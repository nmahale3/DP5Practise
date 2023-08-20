package com.tq.day15.abstraction;

abstract class Vehicle{
	Vehicle(String name)
	{
		System.out.println(name);
	}
	abstract void wheels();
	public void fuel()
	{
		System.out.println("Diesel Petrol");
	}
}

class Bike extends Vehicle{

	Bike(String name)
	{
		super(name);
		System.out.println(name);
	}

	@Override
	void wheels() 
	{
		System.out.println("Two Wheels");		
	}
}

class Car extends Vehicle{

	Car(String name)
	{
		super(name);
		System.out.println(name);
	}

	@Override
	void wheels() 
	{
		System.out.println("Four Wheels");		
	}
}


public class Abstractions {
	

}
