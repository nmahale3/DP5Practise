package com.tq.day3.homework;
import java.util.Scanner;

public class SumNumberofFactors {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num=s.nextInt();
		int count=0;
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			{
				count+=i;
			}
//			System.out.print(count+" ");
		}
		
			System.out.println(count);
		s.close();
	}
}
