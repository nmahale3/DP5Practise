package com.arithmetic;
//default arithmetic handler
public class Demo1 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		try
		{
			int div =a/b;
			System.out.println(div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error");
		}
		System.out.println("Thanks");
	}
}
