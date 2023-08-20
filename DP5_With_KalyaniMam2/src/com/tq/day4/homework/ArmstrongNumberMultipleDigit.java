package com.tq.day4.homework;

import java.util.Scanner;

public class ArmstrongNumberMultipleDigit {

	public static void main(String[] args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number to check Armstrong number");
	int num=sc.nextInt();
	int temp=num;
	int count=0;
	double sum=0;
	
	
	while(num>0)
	{
		num/=10;
		count++;
	}
	num=temp;
	
	int dig;
	while(num>0)
	{
		 dig=num%10;
		sum=(sum) + (Math.pow(dig,count));
		num=num/10;
	}
	num=temp;
	System.out.println(sum);
	if(temp==sum)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not an Armstrong Number");
	}
	sc.close();
	}

}
