package com.tq.day15.abstraction;

abstract class Mobile 
{
	private String modelName;
	private double price;
	public abstract void call();
	
	public void display()
	{
		System.out.println("Call Method in Mobile");
	}
}

class Base extends Mobile
{

	@Override
	public void call() {
		System.out.println("Basic Mobile method");
	}
	
}

abstract class Android extends Mobile
{
	public abstract void call();
}

class Oneplus extends Android
{

	@Override
	public void call() {
	System.out.println("Oneplus methods");
	}
	
}

public class AbstractMethod {

	public static void main(String[] args) {
		
		Mobile m = new Base();
		m.display();
		System.out.println("--------------------------------------------------------");
		
		Base b = new Base();
		b.call();
		b.display();
		System.out.println("--------------------------------------------------------");
		
		Android a= new Oneplus();
		a.call();
		System.out.println("--------------------------------------------------------");

	}
}
