package com.assignment;


import java.util.Scanner;

//class NegativeAgeException extends Exception//--- checked exception
class NegativeAgeException extends RuntimeException//---unchecked exception
{
	public NegativeAgeException(String message)
	{
		super(message);
	}
}
class Age
{
	public static void checkAge(int age) //unchecked exception
//	public static void checkAge(int age) throws NegativeAgeException//--checked exception
	{
		if (age<0) {
			throw new NegativeAgeException("Please enter age greater than Zero");
		}
		else
		{
			System.out.println("Correct age");
		}
	}
}
public class NegativeAge {
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Age");
		int age=s.nextInt();
		try
		{
			Age.checkAge(age);
		}
		catch(NegativeAgeException e)
		{
			System.out.println(e.getMessage());
		}
		s.close();
	}

}
