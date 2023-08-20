package com.tq.day2.conditionalstatement;
import java.util.Scanner;

public class GreatestUsingNestedIf {
	
	public static void main(String[] args)
	{
		Scanner great = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int num1 = great.nextInt();
		System.out.println("Enter second number");
		int num2 = great.nextInt();
		System.out.println("Enter third number");
		int num3 = great.nextInt();
		
		if(num1>num2)
		{
			if(num1>num3)
			{
				System.out.println(num1+" is Greater among three numbers");
			}
			else
			{
				System.out.println(num2+" is Greater among three numbers");
			}
		}
		else if(num2>num3)
		{
			System.out.println(num2+" is Greater among three numbers");
		}
		else
		{
			System.out.println(num3+" is Greater among three numbers");
		}
		great.close();
	}
	

}
