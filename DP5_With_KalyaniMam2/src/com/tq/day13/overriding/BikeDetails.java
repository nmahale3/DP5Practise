package com.tq.day13.overriding;

class Bike {

	String colour;
	String name;
	double speed;
	public void bikeInfo(String name,String colour,double speed) 
	{
		this.name = name;
		this.colour = colour;
		this.speed = speed ;
	}
}

class Bike1 extends Bike {
	@Override
	public void bikeInfo(String name,String colour,double speed) 
	{
		this.name = name;
		this.colour = colour;
		this.speed = speed ;
	}
}



public class BikeDetails {

	public static void main(String[] args) {

		Bike b = new Bike();
		b.bikeInfo("Platina","Red",50.00);

		Bike1 b1=new Bike1();
		b1.bikeInfo("Pulsar","Black",80.00);

		System.out.println("Bike Name "+b1.name+" Bike Colour "+b1.colour+" Bike Speed "+b1.speed+" kmph");

	}

}
