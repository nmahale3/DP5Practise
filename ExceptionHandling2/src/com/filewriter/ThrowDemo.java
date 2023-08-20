package com.filewriter;
// use of throw : it stops the flow wherever the program flow gets stuck after throwing the exception
public class ThrowDemo {

	public static void checkAge(int age) {
		if(age<35)
		{
//			explicitly throw Exception
			throw new ArithmeticException("Candidate is not eligile for this Designation");
		}
		else
		{
			System.out.println("Welcome : Please fill form Details");
		}
	}
	public static void main(String[] args) {
		System.out.println("-----------Start-----------");
		try
		{
			checkAge(12);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Message : "+e.getMessage());
		}
		System.out.println("-----------End-----------");

	}

}
