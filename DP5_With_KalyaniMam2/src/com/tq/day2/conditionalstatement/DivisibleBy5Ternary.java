package com.tq.day2.conditionalstatement;

import java.util.Scanner;

public class DivisibleBy5Ternary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int number = sc.nextInt();
		String result = (number%5==0)?"Divisible by 5":"Not Divisible by 5";
		System.out.println(result);
		sc.close();
	}

}
