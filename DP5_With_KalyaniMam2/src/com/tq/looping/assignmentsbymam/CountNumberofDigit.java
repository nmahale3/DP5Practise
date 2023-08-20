package com.tq.looping.assignmentsbymam;

import java.util.Scanner;

public class CountNumberofDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("The number Having "+count+" digits");
		sc.close();
	}

}
