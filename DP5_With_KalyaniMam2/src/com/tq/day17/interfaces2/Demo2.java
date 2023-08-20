package com.tq.day17.interfaces2;

interface InterfaceA
{
	default void show()
	{
		System.out.println("Interface A");
	}
}

interface InterfaceB
{
	default void show()
	{
		System.out.println("Interface B");
	}
}

class Classss implements InterfaceA,InterfaceB
{

	@Override
	public void show() {
		// parent method calling inside child class by interfaces name 
		// by using this we didnt get any ambiguity error
		InterfaceA.super.show();
		InterfaceB.super.show();
		System.out.println("Child");
	}
	
	
}

public class Demo2 {

	public static void main(String[] args) {
		Classss cs = new Classss();
		cs.show();
	}
}
