package com.tq.fundamental.hw;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of an Employee");
		double salary = sc.nextDouble();
		System.out.println("Enter service years of an Employee");
		int service = sc.nextInt();
		if(service>5)
		{
			salary = salary + (salary*0.5);
			System.out.println("Salary of an employee after "+service+" years = "+salary+" Rs.");
		}
		else
		{
			System.out.println("Salary of an employee after "+service+" years = "+salary+" Rs.");
		}
		sc.close();
	}

}
