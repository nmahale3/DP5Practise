package com.tq.day7.oops.method;

public class Car {

	String carName;
	double price;
	String modelNumber; 

	
	public static void main(String[] args) {
	     Car c1=new Car();
	     c1.carName="Rolls Royce Dawn";
	     c1.modelNumber="a 6598 cc";
	     c1.price=62500000;
	     System.out.println("Car Name = "+c1.carName+", Car Model Number = "+c1.modelNumber+", Car Price = "+c1.price);
	     
	     Car c2=new Car();
	     c2.carName="Rolls Royce Ghost";
	     c2.modelNumber=" V12 Extended";
	     c2.price=69500000;
	     System.out.println("Car Name = "+c2.carName+", Car Model Number = "+c2.modelNumber+", Car Price = "+c2.price);
	     
	     Car c3=new Car();
	     c3.carName="BMW ";
	     c3.modelNumber=" XM";
	     c3.price=26000000;
	     System.out.println("Car Name = "+c3.carName+", Car Model Number = "+c3.modelNumber+", Car Price = "+c3.price);
	     
	     
	}
}
