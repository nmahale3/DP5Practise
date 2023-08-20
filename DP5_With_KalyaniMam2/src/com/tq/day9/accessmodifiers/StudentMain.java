package com.tq.day9.accessmodifiers;

public class StudentMain extends Student  {

	public static void main(String[] args) {

		Student s = new Student();
		s.setID(123);
		s.setName("Navin");
		s.setMarks(80);


		s.getId();
		s.getName();
		s.getMarks();

		if(s.isB()==true)
		{
			System.out.println("Student Name :"+s.getName());
			System.out.println("Student ID : "+s.getId());
			System.out.println("Student Marks : "+s.getMarks());
		}
		else
		{
			System.out.println("Your Not Eligible");
		}

	}

}
