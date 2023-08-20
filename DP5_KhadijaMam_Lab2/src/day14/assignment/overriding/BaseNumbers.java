package day14.assignment.overriding;

import java.util.Scanner;

/*5.Create a base class to get two numbers from user in the base class. 
 * The derived class contains a method ‘dispMax()’. 
 * Which displays maximum of two numbers and a method ‘dispMin()’ to display minimum of two numbers.
 * Use constructors.
 * */

class Base
{
	int no1;
	int no2;
	Base(int no1,int no2)
	{
		this.no1=no1;
		this.no2=no2;
	}
}
class Derived extends Base
{
	Derived(int no1, int no2)
	{
		super(no1, no2);
	}
	void dispMax()
	{
		if(no1>no2)
		{
			System.out.println("Maximum No is First number"+no1);
		}
		else
		{
			System.out.println("Maximum No is Second number"+no2);
		}		
	}
	void dispMin()
	{
		if(no1<no2)
		{
			System.out.println("Minimum No is First number"+no1);
		}
		else
		{
			System.out.println("Minimum No is Second number"+no2);
		}	
	}
	void show() {
		this.dispMax();
		this.dispMin();
	}
}
public class BaseNumbers
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number");
		int no1=sc.nextInt();
		int no2=sc.nextInt();
		Derived d = new Derived(no1,no2);
		d.show();
		sc.close();
	}
}
