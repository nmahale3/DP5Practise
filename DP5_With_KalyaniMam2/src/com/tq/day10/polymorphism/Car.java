package com.tq.day10.polymorphism;

public class Car {
	
	int price;
	String name ;
	String modelNumber;
	Engine e;
	
	public void carProperties(String name,String modelNumber,int price,Engine e) 
	{
		this.price=price;
		this.name=name;
		this.modelNumber=modelNumber;
		this.e=e;
	}
	
	public void showCarProperties()
	{
		System.out.println("Car name : "+name+" model number : "+modelNumber+" Car Price : "+price+" "+e);
	}
	

}

class Engine {
	
	String type;
	String stroke;
	
	public Engine(String type,String stroke)
	{
		this.type=type;
		this.stroke=stroke;
	}
	
	public void showEngine()
	{
		System.out.println("Engine type : "+type+" Stroke : "+stroke);
	}
	
	public String toString()
	{
		return "Engine type : "+type+" Stroke : "+stroke; 
	}
	
	
}