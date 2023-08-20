package com.tq.looping.assignmentsbymam;

import java.util.Scanner;

public class ProductofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner a = new Scanner(System.in);
		System.out.println("Enter any number");
		int num=a.nextInt();
		int prod=1,temp=num;
		while(num>0)
		{
			int digit = num%10; 
			prod*=digit;
			num=num/10;
		}
		System.out.println("the product of each digit of "+temp+" = "+prod);
		a.close();
	}

}
