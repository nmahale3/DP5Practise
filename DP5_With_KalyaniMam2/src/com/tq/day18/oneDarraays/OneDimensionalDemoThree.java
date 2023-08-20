package com.tq.day18.oneDarraays;

import java.util.Scanner;

public class OneDimensionalDemoThree {

	public static void main(String[] args) {
	
		double marks[]=new double[10];
		int len=marks.length;
		int i,n;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many marks you want to add in array?");
		n=s.nextInt();
		s.close();
		
		for (i= 0;i<n;i++)
		{
			System.out.println("Enter marks:");
			marks[i]=s.nextDouble();
			
		}
		System.out.println("------------Array----------");
		for (i= 0;i<n;i++)
		{
			System.out.println("Marks["+i+"]:"+marks[i]);
			
			
		}
	}

}
