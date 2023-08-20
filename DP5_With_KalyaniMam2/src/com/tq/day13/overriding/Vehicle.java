package com.tq.day13.overriding;


class Vehicle1
{
	public String accelerate(long mph) {
		return "The vehicle accelerates to " + mph + " mph.";
	}

	public String stop() {
		return "The vehicle has stopped.";
	}

	public String run() {
		return "The vehicle is running.";
	}
}
class Car1 extends Vehicle1
{
	@Override
	public String accelerate(long mph) {
		return "The car accelerates to " + mph + " mph.";
	}
}

public class Vehicle
{
	public static void main(String[] args)
	{
		Vehicle1 vehicle = new Vehicle1();
		System.out.println(vehicle.accelerate(50));
		System.out.println(vehicle.stop());
		System.out.println(vehicle.run());

		Car1 car = new Car1();
		System.out.println(car.accelerate(100));
		System.out.println(car.stop());
		System.out.println(car.run());
	}
}