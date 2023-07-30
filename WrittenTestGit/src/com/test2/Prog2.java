package com.test2;
/*2. Create a class called Time, which has three private instance variables – hour, min and sec.
It contains a method called add( ) which takes one Time object as parameter 
and print the added value of the calling Time object and passes Time object.
In the main method, declare two Time objects
and assign values using constructor and call the add() method.
 */

class Time {
	private int hour;
	private int min;
	private int sec;
	public Time(int hour, int min, int sec)
	{
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}

	public void add(Time object) 

	{
		System.out.println("Old Time");
		System.out.println( hour + " hours, " + min + " minutes, " + sec + " seconds.\n");
		int newHour = this.hour + object.hour;
		int newMin = this.min + object.min;
		int newSec = this.sec + object.sec;

		if (newSec >= 60) {
			newMin += newSec / 60;
			newSec = newSec % 60;
		}

		if (newMin >= 60) {
			newHour += newMin / 60;
			newMin = newMin % 60;
		}

		if (newHour >= 24) {
			newHour = newHour % 24;
		}
		System.out.println("New Added Time");
		System.out.println(newHour + " hours, " + newMin + " minutes, " + newSec + " seconds.");
	}

}



public class Prog2 {

	public static void main(String[] args) {
		Time t1= new Time(5, 30, 25);
		Time t2= new Time(25, 15, 10);
		t1.add(t2);

	}

}
