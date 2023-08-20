package com.tq.day1.opeandDatatype;

import java.util.Scanner;

public class PowerNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base ");
		int base=sc.nextInt();
		System.out.println("Enter the exponent");
		int expo = sc.nextInt();
		int pow=1;
		for (int i = 1; i <=expo; i++)
		{
			pow = pow*base;
		}
		System.out.println("Base "+base+" Exponent "+pow);		
		sc.close();
	}

}
