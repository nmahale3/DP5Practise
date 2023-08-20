package com.tq.day8.oops.thiis.stattic.constructors;

import java.util.Scanner;

public class Student {

	int sId;
	String sName;
	int sMaths;
	int sPhy;
	int sChem;
	double percentage;

	public Student(int sId,String sName) 
	{
		this.sId = sId;
		this.sName = sName;
	}

	public void calculatePer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Maths Marks");
		sMaths=sc.nextInt();
		System.out.println("Enter Physics Marks");
		sPhy=sc.nextInt();
		System.out.println("Enter Chemistry Marks");
		sChem=sc.nextInt();
		if(sMaths>0&&sPhy>0&&sChem>0)
		{ 
			percentage = ((sMaths+sPhy+sChem)*100)/300;
			System.out.println(percentage);

		}
		else
		{
			System.out.println("You are absent");
		}
		sc.close();

	}

	public void showDetails()
	{

		System.out.println("Student Id : "+sId);
		System.out.println("Student Name : "+sName);
		System.out.println("Maths Marks : "+sMaths);
		System.out.println("Physics Marks : "+sPhy);
		System.out.println("Chemistry Marks : "+sChem);
		if(percentage<35)
		{
			System.out.println("Sorry You Are not Appeared for next class");
		}
		else if(percentage>35)
		{
			System.out.println("Congratulation You got "+percentage+" % with E grade");
		}
		else if(percentage>=35&&percentage<45)
		{
			System.out.println("Congratulation You got "+percentage+" % with D grade");
		}
		else if(percentage>=45&&percentage<55)
		{
			System.out.println("Congratulation You got "+percentage+" % with C grade");
		}
		else if(percentage>=55&&percentage<65)
		{
			System.out.println("Congratulation You got "+percentage+" % with B grade");
		}
		else if(percentage>=65&&percentage<85)
		{
			System.out.println("Congratulation You got "+percentage+" % with A grade");
		}
		else
		{
			System.out.println("Congratulation You got "+percentage+" % with A+ grade");
		}
	}


	public static void main(String[] args) {

		Student s=new Student(1234,"Bhagyesh");
		s.calculatePer();
		s.showDetails();


	}


}
