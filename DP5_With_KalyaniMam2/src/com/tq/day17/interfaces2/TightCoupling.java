package com.tq.day17.interfaces2;

interface Vehicle
{
	void move();
}


class Car implements Vehicle
{

	@Override
	public void move() {
		System.out.println("We use Car for Travelling");
	}

}

class Bike implements Vehicle
{
	@Override
	public void move() 
	{
		System.out.println("We use Bike for Travelling");
	}
}
class Bus implements Vehicle
{
	@Override
	public void move()
	{
		System.out.println("We use Bus for Travelling");
	}

}

class Traveler
{ 
	private Vehicle v;

	public Vehicle getV() {
		return v;
	}

	public void setV(Vehicle v) {
		this.v = v;
	}
	
	public void startJourney() {
		v.move();
	}
}


public class TightCoupling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Traveler t = new Traveler(); 
		t.setV(new Car());
		t.startJourney();
		
		t.setV(new Bike());
		t.startJourney();
	}

}
