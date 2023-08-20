package com.tq.day14.overridingiheritance;

class Fruits {
	
	public void color()
	{
		System.out.println("Fruits Class");
	}

}

class Apple extends Fruits
{
	public void color()
	{
		System.out.println("Apples : Red");
	}
}

class Banana extends Fruits
{
	public void color()
	{
		System.out.println("Bananas : Yellow");
	}
}

public class Fruit
{
	public static void main(String[] args) {
		Fruits f = new Fruits();
		f.color();
		Apple a=new Apple();
		a.color();
		Banana b=new Banana();
		b.color(); 
		System.out.println("-----------------");
		Fruits f1;
		f1=new Fruits();
		//f1=f;
		f1.color();
		f1= new Apple();
		f1.color();
		f1=new Banana();
		f1.color();
		
		
		
	}
}