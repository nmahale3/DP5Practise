package day18.array.assignment;

import java.util.Arrays;
import java.util.Scanner;

//10.	WAP to insert an element in a specific position into an array.
public class Program10 {

	private static void inSertElement(int []arr,int index,int n) 
	{
		if(index<arr.length)
		{
			arr[index]=n;
		}
		else
		{
			System.out.println("Array Index out of Bound");
		}
	System.out.println(Arrays.toString(arr));
		
	}
	public static void main(String[] args) {
		
		int arr[]= {32,45,65,76,48,36};
		int index,num;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter number");
		num=s.nextInt();
		System.out.println("Enter Index");
		index=s.nextInt();
		inSertElement(arr, index, num);
//	error to print an array after inserting an element
		
	}
}
