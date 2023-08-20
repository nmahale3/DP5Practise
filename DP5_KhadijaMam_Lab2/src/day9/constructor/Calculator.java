package day9.constructor;

import java.util.Scanner;

public class Calculator {

	int add;
	double multi;
	double divi;
	int sub;

	Scanner s = new Scanner(System.in);

	int addition()
	{
		System.out.println("Enter the First number");
		int a=s.nextInt();
		System.out.println("Enter the Second number");
		int b=s.nextInt();
		int adds=a+b;

		return adds;
	}

	double multiplication()
	{
		System.out.println("Enter the First number");
		double a=s.nextDouble();
		System.out.println("Enter the Second number");
		double b=s.nextDouble();
		double mul=a*b;
		System.out.println("Addition of the numbers");
		return mul;
	}

	double division()
	{
		System.out.println("Enter the First number");
		double c=s.nextDouble();
		System.out.println("Enter the Second number");
		double d=s.nextDouble();
		double mul=c/d;
		return mul;
	}

	double substraction()
	{
		System.out.println("Enter the First number");
		double a=s.nextDouble();
		System.out.println("Enter the Second number");
		double b=s.nextDouble();
		double subst=a-b;

		return subst;
	}	


	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		int option;
		char ch;
		Scanner sc  = new Scanner(System.in);
		do
		{
			option = sc.nextInt();
			System.out.println("Enter choice : ");
			System.out.println("1. add 2. multi 3. divi 4. sub");
			switch(option)
			{
			case 1: 
				System.out.println("Addition :");
				c.addition();
				break;
			case 2: 
				System.out.println("Multiplication :");
				c.multiplication();
				break;
			case 3: 
				System.out.println("Division :");
				c.division();
				break;
			case 4: 
				System.out.println("Substract :");
				c.substraction();
				break;
			default:
				System.out.println("Please enter valid choice");
				break;


			}
			System.out.println("Do you Want to continue?");
			ch=sc.next().charAt(0);

		}while(ch=='y'||ch=='Y');
	}

}


