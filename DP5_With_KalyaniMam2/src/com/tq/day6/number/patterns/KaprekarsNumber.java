package com.tq.day6.number.patterns;

import java.util.Scanner;

public class KaprekarsNumber {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter any number");
		int num = sc.nextInt();
		System.out.println("Original number "+num);
		int square = num*num;
		System.out.println("Square number "+square);
		int temp=num,sum=0,count=0,pow=1;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(count);
		num=temp;
		while(square>0)
		{
			for (int i = 1; i <=count; i++)
			{
				pow=pow*10;
			}
			int digit=square%pow;
			sum=sum+digit;
			square/=pow;
			
		}
		System.out.println(sum);
		if(sum==temp)
		{
			System.out.println("Kaprekar");
		}
		else
		{
			System.out.println("Not");
		}
		sc.close();
	}
}
