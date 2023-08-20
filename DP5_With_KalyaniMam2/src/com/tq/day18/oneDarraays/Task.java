package com.tq.day18.oneDarraays;
/*
 * 
 */
import java.util.Scanner;

public class Task {
	

	public static void main(String[] args) {
	
		String name[]=new String[10];
		int len=name.length;
		int i,n;
		
		Scanner s = new Scanner(System.in);
		System.out.println("Enter how many names you want to add in array?");
		n=s.nextInt();	
		
		for (i= 0;i<n;i++)
		{
			System.out.println("Enter names:");
			name[i]=s.next();
			
		}
		System.out.println("------------Array----------");
		for (i= 0;i<n;i++)
		{
			System.out.println("Name["+i+"]:"+name[i]);		
		}
		s.close();
	}

}
