package com.tq.day4.homework;
import java.util.*;

public class FactorialSumofNumbers {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		int fact=1,sum=0;
		for(int i = 01 ; i <= num ; i++)
		{
			sum=sum+(fact*=i);
		}
		System.out.println(sum);
		sc.close();
	}
}
