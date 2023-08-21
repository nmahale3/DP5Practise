package com.tq.fundamental.assignment.hw.conditional;

import java.util.Scanner;

public class Month {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The number of month");
		int num = sc.nextInt();
		if(num==1||num==3||num==5||num==7||num==8||num==10||num==12)
		{
			System.out.println("The month having 31 Days");
		}
		else if(num==4||num==6||num==9||num==11)
		{
			System.out.println("The month having 30 Days");
		}
		else if(num==2)
		{
			System.out.println("The month having 28-29 Days");
		}
		else
			System.out.println("Enter Valid month number");
		sc.close();
	}

}
