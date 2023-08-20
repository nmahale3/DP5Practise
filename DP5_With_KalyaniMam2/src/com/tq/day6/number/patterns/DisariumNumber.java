package com.tq.day6.number.patterns;

import java.util.Scanner;

public class DisariumNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0,temp=num,sum=0;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
		num=temp;
		while(num>0)
		{
			int digit=num%10;
			int pow=1;
			for(int i=1;i<=count;i++)
			{
				pow=pow*digit;

			}
			sum+=pow;
			count--;
			num/=10;
		}	
		System.out.println(sum);
		if (temp==sum) 
		{
			System.out.println("Disarium");
		}
		else
		{
			System.out.println("not Disarium");
		}
		sc.close();
	}
}
