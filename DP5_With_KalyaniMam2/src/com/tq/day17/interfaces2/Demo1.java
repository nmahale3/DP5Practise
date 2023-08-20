package com.tq.day17.interfaces2;



interface Calculator{
	
	public int add(int a, int b);
	public int sub(int a, int b);
	public int mul(int a, int b);
	public int div(int a, int b);
	
	//from java 1.9 we can use private method
	private void data()
	{
		System.out.println("Private method");
	}
	
	//from java 1.9 we can use static method so child class cant override it
	// inside interface we'll call it by interface name.method name like classes
	static void shareData()
	{
		share();
		System.out.println("Static method in Interface");
	}
	
	private static void share() {
		System.out.println("Private static method");
	}
	
	// from java 1.8 we have started to use default method
	default void display()
	{
		data();
		System.out.println("Default method");
	}
	default void m1()
	{
		System.out.println("M1 Method");
	}
	default void m2()
	{
		System.out.println("M1 Method");
	}
	
	
	
}

class BasicCal implements Calculator
{
	
	@Override
	public int add(int a, int b) {
		
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	@Override
	public int div(int a, int b) {
		// TODO Auto-generated method stub
		return a/b;
	}
	
}

public class Demo1
{
public static void main(String[] args) {
	

	BasicCal b = new BasicCal();
	System.out.println("Addition : "+b.add(12,6));
	System.out.println("Substraction : "+b.sub(12,6));
	System.out.println("Multiplication : "+b.mul(12,6));
	System.out.println("Division : "+b.div(6,6));
	b.display();
	Calculator.shareData();
}
}
