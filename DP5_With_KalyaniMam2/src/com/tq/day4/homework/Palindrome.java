package com.tq.day4.homework;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number to check palindrome or not");
		int num = s.nextInt();
		s.close();
		int sum=0;
		int temp=num;
		for (; num>0;) {
			int rem=num%10;
			sum=(sum*10)+rem;
			num=num/10;
		}
		num=temp;
		System.out.println(sum);
		s.close();
	}
}
