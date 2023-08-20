package com.tq.day4.homework;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int temp=num,sum=0,product=1;
		while (num>0)
		{
			int digit=num%10;
			sum=digit+sum;
			product=product*digit;
			num=num/10;
		}
		System.out.println(sum);
//		num=temp;
//		while (num>0)
//		{
//			int digit=num%10;
//			product=product*digit;
//			num=num/10;
//		}
		System.out.println(product);
		num=temp;	
		if(sum==product)
		{
			System.out.println("Spy Number");
		}
		else
		{
			System.out.println("not Spy Number");
		}
		sc.close();
	}

}
