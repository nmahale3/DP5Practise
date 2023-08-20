package com.tq.day18.arraylogical;

import java.util.Scanner;

//Write a Program fo sum of an array
public class SumOfArray
{

	public static int findSumOfArray(int a[])
	{
		int sum=0;
		int len=a.length;
		for (int i = 0; i <len; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		int num[]= new int[10];
		int i,len=num.length, n;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of Element :");
		n=scanner.nextInt();
		
		for (int j = 0; j < len; j++) {
			System.out.println("Enter Element");
			num[j]=scanner.nextInt();
		
		int ans =findSumOfArray(num);
		System.out.println(ans);
		}
		
	}
}
