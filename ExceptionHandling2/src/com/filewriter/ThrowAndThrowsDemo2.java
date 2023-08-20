package com.filewriter;

import java.io.IOException;

// use of throw : it stops the flow wherever the program flow gets stuck after throwing the exception
public class ThrowAndThrowsDemo2 {

	public static void checkAge(int age) throws IOException {
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
			checkAge(36);
		}
		catch(IOException e)
		{
			System.out.println("Message : "+e.getMessage());
		}
		System.out.println("-----------End-----------");

	}

}
