package com.tq.day10.polymorphism;

public class CarMain {
	
	public static void main(String[] args)
	{
		Car c=new Car();
		c.carProperties("Audi", "A6+", 4000000, new Engine("\nIC Engine","4 Stroke"));
		c.showCarProperties();
	}

}
