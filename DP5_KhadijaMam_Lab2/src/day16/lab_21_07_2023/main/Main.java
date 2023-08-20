package day16.lab_21_07_2023.main;

import day16.lab_21_07_2023.model.sub.Employee;
import day16.lab_21_07_2023.service.EmployeeServices;

public class Main {
//	String pName, int pAge, String pAddress, String eDesignation
	public static void main(String[] args) {
		Employee e = new Employee("Navin Mahale",26,"Surat City","Jr Software Engineer");
		EmployeeServices es=new EmployeeServices();
		System.out.println(es.isEligibleForRetirement(e));
	}

}
