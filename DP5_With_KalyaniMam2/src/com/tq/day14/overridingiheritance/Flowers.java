package com.tq.day14.overridingiheritance;

class Flower 
{
	public static void fregrance() 
	{
		System.out.println("Folwer method");
	}
}

class Rose extends Flower
{
	public static void fregrance()
	{
		
		System.out.println("Rose Method");
	}
}

public class Flowers {

	public static void main(String[] args) {
		Flower f = new Flower();
		f.fregrance();// Method Hiding Static method cannt be overridden
		main(" ");
	}

	public static void main(String a) {
		System.out.println("Overloading");//Method Overloading - main method or any static method can be overload by changing the parameters
	}
	
}
