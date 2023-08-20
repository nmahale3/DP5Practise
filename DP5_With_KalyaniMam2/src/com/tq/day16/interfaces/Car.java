package com.tq.day16.interfaces;

interface CngCar
{
	void drive();
	void cngCarKit();
}

interface PetrolCar
{
	void drive();
	void PetrolCarKit();
}

class HybridCar implements CngCar,PetrolCar
{

	@Override
	public void PetrolCarKit() {
		System.out.println("Petrol Kit");

	}

	@Override
	public void drive() {
		System.out.println("Drive Hybrid Car");

	}

	@Override
	public void cngCarKit() {
		System.out.println("CNG Kit");

	}

}

public class Car {

	public static void main(String[] args)
	{
		HybridCar hc = new HybridCar();
		hc.PetrolCarKit();
		hc.cngCarKit();
		hc.drive();

	}
}
