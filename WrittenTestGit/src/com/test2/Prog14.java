package com.test2;

class Parent 
{
	public void Print()
	{
		System.out.println("Parent");
	}
}
class Childs extends Parent
{ 
	public void Print()
	{
		System.out.println("Child");
	}
} 
//class Main
public class Prog14
{
	public static void PrintMain(Parent o)
	{ 
		o.Print();
	} 
	public static void main(String[] args) 
	{
		Parent x = new Parent();
		Parent y = new Childs(); 
		Childs z = new Childs();
		PrintMain(x);
		PrintMain(y); 
		PrintMain(z);
	}
}
