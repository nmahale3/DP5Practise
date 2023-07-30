package com.test2;
/*5. Write a program to define a class Employee to accept emp_id, emp _name, basic_salary
from the user and display the gross_salary.
 * */
import java.util.Scanner;


class Employee
{
	String eName;
	int eID;
	double eBasicSalary;
	double grossSalary;
	
//	public Employee() {
//		
//	}
//	public Employee(int eID,String eName, double eBasicSalary) {
//
//		this.eName = eName;
//		this.eID = eID;
//		this.eBasicSalary = eBasicSalary;
//		
//
//	}

	//double calculateGrossSalary()
	public void calculateGrossSalary()
	{
		//			Another way
		//		public double calculateGrossSalary() {
		//	        double hra = 0.15 * eBasicSalary; // Assuming 15% of basic_salary as House Rent Allowance (HRA)
		//	        double da = 0.10 * eBasicSalary; // Assuming 10% of basic_salary as Dearness Allowance (DA)
		//	        double gross_salary = eBasicSalary + hra + da;
		//	        return gross_salary;
		Scanner s = new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		eID = s.nextInt();

		System.out.print("Enter Employee Name: ");
		eName = s.next();

		System.out.print("Enter Basic Salary: ");
		eBasicSalary = s.nextDouble();
		s.close();
		
		if(eBasicSalary>0&&eBasicSalary<=10000)
		{
			grossSalary=eBasicSalary+(0.2*eBasicSalary)+(0.8*eBasicSalary);
			//System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");
		}
		if(eBasicSalary>10000&&eBasicSalary<=20000)
		{
			grossSalary=eBasicSalary+(0.25*eBasicSalary)+(0.90*eBasicSalary);
			System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");
		}
		if(eBasicSalary>20000)
		{
			grossSalary=eBasicSalary+(0.3*eBasicSalary)+(0.95*eBasicSalary);
			//System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");
		}

//		return grossSalary;
	}
//	 public void displayEmployeeDetails(double grossSalary)
	 public void displayEmployeeDetails()
	{
	        System.out.println("Employee ID: " + eID);
	        System.out.println("Employee Name: " + eName);
	        System.out.println("Basic Salary: " + eBasicSalary);
//	        System.out.println("the Gross salary of an Employee : "+calculateGrossSalary()+" Rs.");
	        System.out.println("the Gross salary of an Employee : "+grossSalary+" Rs.");

	}
}
public class Prog5 {

	public static void main(String[] args) {
//
//	Scanner s = new Scanner(System.in);
//
//		System.out.print("Enter Employee ID: ");
//		int eID = s.nextInt();
//
//		System.out.print("Enter Employee Name: ");
//		String eName = s.next();
//
//		System.out.print("Enter Basic Salary: ");
//		double eBasicsalary = s.nextDouble();	
		
	Employee e = new Employee();
	e.calculateGrossSalary();
	e.displayEmployeeDetails();

	
		
		

	}

}
