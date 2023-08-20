package com.tq.day17.interfaces2;

import java.io.Serializable;

@FunctionalInterface
// Functional interface have only one interface
// by using @FunctionalInterface we can declare it
// it is also known as Single abstract method interface
// from java 8 it is usable to runnable printable interface

interface Washable
{
	void wash();//abstract method
	//	void dry(); it will show error for other method because F.I. have only one abstract method 
	//				and can have multiple static,private,default methods inside it
	default void m1() 
	{
	}

}
@FunctionalInterface
interface a
{
	void m1();
	// if the interface is normal so it can be empty
}

class B implements Serializable
{
	
}
public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
