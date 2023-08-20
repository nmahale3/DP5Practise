package com.tq.day6.number.patterns;

import java.util.Scanner;

public class TriomorphicNumber {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num=s.nextInt();
		int temp=num;
		int cube=num*num*num,count=0,pow=1;
		while(num>0)
		{
			num/=10;
			count++;
		}
		System.out.println(cube);
		System.out.println(count);
		num=temp;
			for(int i=1;i<=count;i++)
			{
				pow=pow*10;
			}
		int tri=cube%pow;
		if(tri==num)
		{
			System.out.println("Triomorphic Number");
		}
		else
		{
			System.out.println("No Triomorphic Number");
		}
		s.close();
	}

}
