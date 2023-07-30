package com.test2;

// 8.Write a program to demonstrate use of 'static' keyword
//Static Variable and method
class StaticDemo1
{
	static
	{
		System.out.println("Static block1");
	}
	static
	{
		System.out.println("Static block2");
	}
	int a = 12;
	static int b = 10;
	public void show()
	{
		System.out.println(a+" "+b);
	}
	public static void display()//static method can call direct by classname.methodname 
	{
		System.out.println("This is Static variable");
	}
	public StaticDemo1() {
	b++;
	System.out.println(b);
	}
	
}


public class Prog8 {

	public static void main(String[] args) {
//1. Static variable we can call directly by classname.varName
		System.out.println("1."+StaticDemo1.b);
//2. static method can call direct by classname.methodname
//3. static method can call directly if its class and main method inside same class 	
		System.out.print("2.");	
		StaticDemo1.display();
		
//4. Constructor with Static new Objects
		System.out.println("4.Constructor upgradation");
//		StaticDemo1 s1=new StaticDemo1();
//		StaticDemo1 s2=new StaticDemo1();
//		StaticDemo1 s3=new StaticDemo1();
//5.static bloc Executes firsts and it executes only once
	}

}
