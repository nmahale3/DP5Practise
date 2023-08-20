package com.tq.day13.overriding;

/*5)WAP to create class Programmer with Method workingHours().
 * create class Employee which extends Programmer implement workingHours()differently in child.
 */
class Employee extends Programmer
{
	public void workingHours()
	{
		System.out.println("Employee Class");
	}
	
}

class Programmer
{
	protected void workingHours()
	{
		System.out.println("Programmer class");
	}
	
}
public class Program {
	public static void main(String[] args) {
		Employee e = new Employee();
		e.workingHours();
	}

}
