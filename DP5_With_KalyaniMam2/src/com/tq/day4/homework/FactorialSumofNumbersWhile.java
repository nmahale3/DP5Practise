package com.tq.day4.homework;
import java.util.*;
public class FactorialSumofNumbersWhile {
	public static void main(String []args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int i=sc.nextInt();
		int x=1;
		int fact=1,sum=0;
		while(x<=i)
		{
			sum+=(fact*=x);
			x++;
		}
		System.out.println(sum);
		sc.close();
		
	}
}
