package com.tq.day3.homework;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to get factorial");
		int num=sc.nextInt();
		int fact=1;
		for(int i = 1;i<=num;i++)
		{
			fact*=i;
		}
		System.out.println(fact);
		sc.close();
	}

}
