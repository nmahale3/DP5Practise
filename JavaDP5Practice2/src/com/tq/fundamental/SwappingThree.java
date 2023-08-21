package com.tq.fundamental;

public class SwappingThree 
{
	public static void main(String[] args) 
	{
		int num1=50,num2=30,temp;

		System.out.println("------Numbers befor Swapping------");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
		
		temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("------Numbers after Swapping------");
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
}
