package com.arraypractice;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Example1 
{
	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter size of an array");
		int size = s.nextInt();
		int number[] = new int[size];
		System.out.println("Enter elements");
		try 
		{
			for (int i = 0; i < number.length; i++) 
			{
				number[i] = s.nextInt();
				if (number[i] < 0 || number[i] > 9) 
				{
					System.out.println("Please enter the number from 1 to 9 only");
					break;
				}
			}
		}
		catch (ArithmeticException e) 
		{
			System.out.println(e.getMessage());
		}
		catch (InputMismatchException e) 
		{
			e.printStackTrace();
		}

		for (int n:number) 
		{
			System.out.print(n+" ");
		}
		for (int i = 0; i < number.length; i++) 
		{
			for (int j = 0; j < number.length; j++) 
			{
				if(number[j]>number[j+1])
				{
					int temp=number[j];
					number[j]=number[j+1];
					number[j+1]=temp;
				}
			}

		}

	}

}
