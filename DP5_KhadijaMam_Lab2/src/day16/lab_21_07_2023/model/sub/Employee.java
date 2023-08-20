package day16.lab_21_07_2023.model.sub;

import day16.lab_21_07_2023.model.*;

public class Employee extends Person {

	public String eName;
	public String eDesignation;
	public Employee(String pName, int pAge, String pAddress, String eDesignation)
	{
		super(pName, pAge, pAddress);
		this.eDesignation = eDesignation;
	}
	public Employee()
	{
		
	}
//	public String geteName() {
//		return eName;
//	}
//	public void seteName(String eName) {
//		this.eName = eName;
//	}
	public String geteDesignation() {
		return eDesignation;
	}
	public void seteDesignation(String eDesignation) {
		this.eDesignation = eDesignation;
	}

	@Override
	public String toString() {
	
		return super.toString()+"\nPerson Designation: "+eDesignation+" ";
	}
	
}
