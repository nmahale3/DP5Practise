package com.tq.day7.oops.method;

import java.util.Scanner;

public class Student {
	
	int sId;
	String sName;
	String sEmail;
	
	public void acceptDetails(int id,String name,String email)
	{
		sId = id;
		sName = name;
		sEmail = email;	
	}
	public void showDetails()
	{
		System.out.println(sId+" "+sName+" "+sEmail);
	}

	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		Student s1=new Student();
		System.out.println("HashCode = "+s1);
		System.out.println("Enter Student ID");
		s1.sId=sc.nextInt();
		System.out.println("Enter Student Name");
		sc.nextLine();
		s1.sName=sc.nextLine();
		System.out.println("Enter Student Email");
		//sc.nextLine();
		s1.sEmail=sc.nextLine();
	
		s1.acceptDetails(s1.sId, s1.sName, s1.sEmail);
		s1.showDetails();
		System.out.println("\n");
		Student s2=new Student();
		System.out.println("HashCode = "+s2 );
		System.out.println("Enter Student ID");
		s2.sId=sc.nextInt();
		System.out.println("Enter Student Name");
		sc.nextLine();
		s2.sName=sc.nextLine();
		System.out.println("Enter Student Email");
		//sc.nextLine();
		s2.sEmail=sc.nextLine();
	
		s2.acceptDetails(s2.sId, s2.sName, s2.sEmail);
		s2.showDetails();
	sc.close();
	}
}
