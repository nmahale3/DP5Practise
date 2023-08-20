package day21.ArrayasInstanceVariable;

import java.util.Arrays;

public class Student {

	int rollno;
	String name;
	int marks[];
	
	
	public Student(int rollno, String name, int[] marks) {
	
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + Arrays.toString(marks) + "]";
	}

//	public void display()
//	{
//		System.out.println("Roll Number :"+rollno);
//		System.out.println("Stud Name :"+name);
//		System.out.println("Stud Marks :"+Arrays.toString(marks));
//	}

	public static void main(String[] args) {
//		Student s1= new Student(111, "Dugge", {12,13,12,32,34})//we cant initialize it
	
		int m[]=new int[5];// it is not allowed
//		Student s1= new Student(111, "Dugge",m);// it will show default values of int datatype
//	m= {67,76,78,97,89};//Also shows an error
	
		int m1[]= {86,76,98,56,76};
		Student s1= new Student(111, "Dugge",m1 );
		//s1.display();
		System.out.println(s1);
	}

}
