package com.test3;
abstract class Demo
{
	 public Demo()
	{
		System.out.println("This is Constructor of Abstact class");
	}
	 
	 public abstract void a_method();
	 public void b_method()
	 {
		 System.out.println("This is Normal method of abstract class");
	 }
	
}
class Subclass extends Demo
{

	@Override
	public void a_method() {
		System.out.println("This is abstract method");	
	}
	
}
public class Program9 {

	public static void main(String[] args) {
		Demo d= new Subclass();
		d.a_method();
		d.b_method();
	}
}
