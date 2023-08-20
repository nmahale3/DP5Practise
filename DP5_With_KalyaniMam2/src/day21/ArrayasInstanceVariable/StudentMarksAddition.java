package day21.ArrayasInstanceVariable;

import java.util.Arrays;

public class StudentMarksAddition 
{
	int rollno;
	String name;
	int marks[];
	static int sum;
	
	public StudentMarksAddition(int rollno,String name,int marks[]) 
	{
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
	}
	
	
	public void display()
	{
		System.out.println("Roll No : "+rollno);
		System.out.println("Stud Name : "+name);
		System.out.println("Stud Marks : "+Arrays.toString(marks));
		
	}
	
	public static void totalSumOfMarks(int a[])
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>=35)
			sum=sum+a[i];
		}
		System.out.println("Total Marks : "+sum);

		System.out.println("Avg of the marks : "+sum/a.length);
		
		System.out.println("-------------------------------------");
		
	}
	
	
	public static void main(String[] args) {
		
		int m1[]= {76,87,67,98,54};
		StudentMarksAddition sma= new StudentMarksAddition(1232, "Navin", m1);
		sma.display();
		totalSumOfMarks(m1);
	
	}

}
