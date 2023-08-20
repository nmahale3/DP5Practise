package com.tq.day14.overridingiheritance;

class Mobile{
	public void msg() {
		System.out.println("All Mobiles");
	}
}
class Android extends Mobile{
	public void msg()
	{
		System.out.println("Android Mobile");
	}
	public void msg1()
	{
		System.out.println("Budget Mobiles");
	}
}

class BasicMobiles extends Mobile
{
	public void msg()
	{
		System.out.println("Basic Mobiles");
	}
	public void msg2()
	{
		System.out.println("Only calling and Messaging");
	}
}


public class RuntimePoly {
	
	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.msg();
		Mobile m1= new Android();
		m1.msg();
		m1= new BasicMobiles();
		m1.msg();
	}

}
