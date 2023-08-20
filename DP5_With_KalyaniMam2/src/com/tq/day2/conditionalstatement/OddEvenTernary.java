package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class OddEvenTernary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number to Check it's Odd or Even");
		int num = sc.nextInt();
		String number=(num%2==0)?"Number is Even":"Number is Odd";
		System.out.println(number);
		sc.close();
	}

}
