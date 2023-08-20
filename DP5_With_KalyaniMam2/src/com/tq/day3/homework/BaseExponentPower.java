package com.tq.day3.homework;
import java.util.*; 
public class BaseExponentPower {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base");
		int base = sc.nextInt();
		System.out.println("Enter the Exponent");
		int exponent = sc.nextInt();
		int power=1;
		for (int i = 1; i <=exponent; i++)
		{
			power=power*base;
		}
		System.out.println(base+"^"+exponent+"="+power);
		sc.close();
	}
	
	
	
}
