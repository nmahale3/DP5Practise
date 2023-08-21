	package com.tq.fundamental.assignment.hw.conditional;

import java.util.Scanner;

public class EmpSalary {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter salary of the employee");
		double salary = sc.nextDouble();
		if(salary>0&&salary<=10000)
		{
			double grossSalary=salary+(0.2*salary)+(0.8*salary);
			System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");
		}
		else if(salary>10000&&salary<=20000)
		{
			double grossSalary=salary+(0.25*salary)+(0.90*salary);
			System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");
		}
		else if(salary>20000)
		{
			double grossSalary=salary+(0.3*salary)+(0.95*salary);
			System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");
		}
		sc.close();
	}

}
