package com.test3;

import java.util.Arrays;

interface Exam { 
	public void cal_percentage();

}

class Result implements Exam {

	int marks[];
	double percentage;
	public Result(int marks[]) {
		this.marks = marks;
	}

	@Override
	public void cal_percentage() {
		int totalMarks = 0;
		for (int i = 0; i < marks.length; i++) {
			totalMarks += marks[i];
		}
		System.out.println("Total Marks of Student:\t" + totalMarks);
		percentage=(totalMarks*100)/(marks.length*100);
	}

	public void dipslay() {
		System.out.println("Percentage of students:\t" + percentage);
	}
}

class Student extends Result {
	String name;
	int rollno;
	int marks[];


	public Student(String name, int rollno,int marks[]) {
		super(marks);
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}

	public void show() {
		System.out.println("Student name:\t" + name);
		System.out.println("Student R.No:\t" + rollno);
		System.out.println("Student Marks:\t" + Arrays.toString(marks));
	}
}

public class Program10 {
	public static void main(String[] args) {

		int arr[] = { 55, 70, 75, 80, 99 };

		Student s = new Student("Navin", 142, arr);
		s.show();
		
		Result r = new Result(arr);
		r.cal_percentage();
		r.dipslay();
	}
}