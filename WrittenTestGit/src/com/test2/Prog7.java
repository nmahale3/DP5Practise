package com.test2;
/*7. Write a program to demonstrate use of 'this' keyword.
 * */
//This keyword with method and Variables
class Counter {
	private int count;

	public Counter() {
		this.count = 0;
	}

	public void increment() {
		// Using 'this' to call the 'incrementBy' method with the current object as an argument
		this.incrementBy(1);
	}

	public void incrementBy(int value) {
		this.count += value;
	}

	public int getCount() {
		return this.count;
	}
}
// This keyword method and this keyword with constructors
class Person {
    private String name;
    private int age;

    // Parameterized constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Constructor with default age
    public Person(String name) {
        // Using 'this()' to call the parameterized constructor with default age as 0
        this(name, 0);
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
    }
}
public class Prog7 {
	public static void main(String[] args) {

//  For Methods
		System.out.println("For Methods");
		Counter counter = new Counter();
		counter.increment(); // Increment by 1
		counter.incrementBy(5); // Increment by 5

		System.out.println("Count: " + counter.getCount());

		System.out.println("=======================================================");
		
// For Constructors	
		System.out.println("For Constructors");
		  Person person1 = new Person("Alice", 30);
	        Person person2 = new Person("Bob");

	        person1.displayDetails();
	        person2.displayDetails();
	}
}