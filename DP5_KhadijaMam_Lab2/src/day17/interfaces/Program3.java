package day17.interfaces;

interface Bike 
{
	void offer();
	default void details() 
	{
		System.out.println("This is a bike.");
	}
}

//Scooty interface
interface Scooty 
{
	void offer();
	default void details()
	{
		System.out.println("This is a scooty.");
	}
}
class BuySomething implements Bike, Scooty {
	@Override
	public void offer() {
		System.out.println("Offer: Get a discount on your purchase!");
	}

	public void details() {
		Bike.super.details();// calling interface methods by interfacename.super.methodname
		Scooty.super.details();
	}
}

public class Program3
{
	public static void main(String[] args) {
		BuySomething buySomething = new BuySomething();
		buySomething.offer();

		buySomething.details();
	}
}
