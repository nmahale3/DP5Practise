package com.filewriter;

import java.util.Scanner;

public class CalculatorTest {

	public static void main(String[] args) {


		System.out.println("Menu\n1.Addition\n2.Substraction\n3.Multiplication\n4.Division");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your choice");
		int choice=s.nextInt();
		switch(choice)
		{
		case 1:
			System.out.println("Enter two numbers");
			int d=Calculator.add(s.nextInt(), s.nextInt());
			System.out.println("Addition : "+d);
			break;
		case 2:
			System.out.println("Enter two numbers");
			int e=Calculator.sub(s.nextInt(), s.nextInt());
			System.out.println("Substraction : "+e);
		case 3:
			System.out.println("Enter two numbers");
			int f=Calculator.mul(s.nextInt(), s.nextInt());
			System.out.println("Addition : "+f);
			break;
		case 4:
			try {
			System.out.println("Enter two numbers");
			int g=Calculator.div(s.nextInt(), s.nextInt());
			System.out.println("Substraction : "+g);
			}
			catch(ArithmeticException ae)
			{
				System.out.println(ae.getMessage());
			}
			break;
		default:
			System.out.println("Please enter valid choice");
		}
		s.close();
	}

}
