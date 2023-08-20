package day16.lab_21_07_2023.service;

import day16.lab_21_07_2023.model.sub.Employee;

public class EmployeeServices {
	
	Employee emp;
//	public boolean isEligibleForRetirement(Employee emp) - by boolean return type
	public String isEligibleForRetirement(Employee emp)	//- by string return type method 
	{
		this.emp=emp;
		int age = emp.getpAge();
		if(age>=60)
		{
			return "Eligible for Retirement";
//			return true;
		}
		else
		{
			return "Not Eligible for retirement";
//			return false;
		}
	}
}
