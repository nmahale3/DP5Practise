package com.tq.fundamental.hw;

import java.util.Scanner;

public class Xobin1Example {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		// First Way Max between three
		int num=(a>b&&a>c)?a:(b>c)?b:c;
		System.out.println(num);
		
		// Second way if else
		if(a>b)
		{
			if(a>c)
			{
				System.out.println(a);
			}
			else
			{
				System.out.println(c);
			}
		}
		else if (b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}
	sc.close();
	}
	
}
