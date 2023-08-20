package com.tq.day3.loops;

import java.util.Scanner;

public class PrimeCount {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				count++;
			}
		}
		if (count==0) 
		{
			System.out.println(num+" is Prime Number");
		}
		else
		{
			System.out.println(num+" is not Prime Number");
		}
		sc.close();
		
	}

}
