package day18.array.assignment;

import java.util.Scanner;

/*
5.WAP to print all negative elements in an array 
and also count total number of negative elements in an array.
 */public class Program5 {
	 public static void negativeNumbers()
	 {
		 Scanner s = new Scanner(System.in);
		 System.out.println("Enter length of an element");
		 int num=s.nextInt();
		 int count=0;
		 if (num>0) 
		 {
			 System.out.println("Length of an array is :"+num);
			 int arr[]=new int[num];
			 System.out.println("Enter "+num+ " Elements");
			 for (int i = 0; i < arr.length; i++) 
			 {
				 arr[i]=s.nextInt();
			 }
			 System.out.println("Negative Numbers");
			 for (int i = 0; i < arr.length; i++) 
			 {
			
				 if(0>arr[i])
				 {
					 count+=1;
					 System.out.print(arr[i]+" ");
				 }
				 
			 }
			
		 } System.out.print("\nTotal Negative elements are : "+count+" ");
		 s.close();
	 }
	 public static void main(String[] args) 
	 {
		 negativeNumbers();
	 }
 }
