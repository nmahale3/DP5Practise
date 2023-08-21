package com.tq.fundamental.assignment.hw.conditional;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int num = sc.nextInt();
		if(num%2==0)
			System.out.println(num+" is Even number");
		else if(num%2!=0)
			System.out.println(num+" is Odd number");
		else
			System.out.println("Enter Valid number");
		sc.close();

	}

}
