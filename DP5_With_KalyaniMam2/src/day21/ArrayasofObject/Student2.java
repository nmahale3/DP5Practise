package day21.ArrayasofObject;

import java.util.Arrays;

public class Student2 {

	private String name;
	private int rollno;
	private double marks[];

	Student2() {

	}
	public Student2(String name, int rollno, double[] marks) {
		
		this.name = name;
		this.rollno = rollno;
		this.marks = marks;
	}
	
	public void display()
	{
		System.out.println("Name 	:\t"+name);
		System.out.println("Roll No :\t"+rollno);
		System.out.println("Marks   :\t"+Arrays.toString(marks));
		
//		for (int i = 0; i < marks.length; i++) {
//			System.out.println(marks[i]);
//		}
	}
	
	
	@Override
	public String toString() {
		return "Student2 [name=" + name + ", rollno=" + rollno + ", marks=" + Arrays.toString(marks) + "]";
	}

	
	
	

}
