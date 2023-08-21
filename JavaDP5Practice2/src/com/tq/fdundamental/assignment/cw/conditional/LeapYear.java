package com.tq.fdundamental.assignment.cw.conditional;

import java.util.Scanner;

public class LeapYear 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year to check the year is lep year or not?");
		int n = sc.nextInt();
		if(n%4==0 || n%400==0)
		{
			System.out.println(n+" is Leap Year");
		}
		else if (n%100==0)
		{
			System.out.println(n+" is not Leap Year");
		}
		else
			System.out.println(n+" is not Leap Year");
		sc.close();
	}
}

