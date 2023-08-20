package com.tq.day15.abstraction;


abstract class Animal{
	
	public abstract void makeSound();
	public void eat()
	{
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal
{
	public void makeSound() {
		System.out.println("Dog barks");
	}
}


class Cat extends Animal{
	public void makeSound() {
		System.out.println("Cat Meowsss");
	}
}
public class Test {

	public static void main(String[] args) {
		
		Animal a=new Dog();
		a.eat();
		a.makeSound();
		System.out.println("++++++++++++++++++++++++++++++");
		
		
		a=new Cat();
		a.eat();
		a.makeSound();
	}
	
}
