package com.test3;

interface A
{
	void myMethod();
}
class B
{
	
	public void myMethod()
	{
		System.out.println("My Method");
	}
}
class C extends B implements A
{

}
public class Prog3MainClass {
	public static void main(String[] args)
	{
		A a = new C();
		a.myMethod();
		}
	
}
