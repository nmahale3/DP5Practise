package com.tq.day4.homework;

import java.util.Scanner;

public class FactorialWhile {

	public static void main(String[] args) {
		int fact=1;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = s.nextInt();
		int i=1;
		while(i<=num)
		{
			fact*=i;
		
			i++;		
		}
		System.out.println(i-1+"! = "+fact);
		s.close();
	}

}

