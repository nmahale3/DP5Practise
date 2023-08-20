package day18.array.assignment;
/*
 * 2.WAP to accept dimension of 1D array and 
 * create and accept data in that array. 
 * Calculate the sum and average value of array elements.
 * 
 */

import java.util.Scanner;

public class Program2 {

	public static void sumAverage()
	{
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int n = scanner.nextInt();
		int sum = 0;
		double average;
		int[] array = new int[n];

		System.out.println("Enter " + n + " elements:");
		for (int i = 0; i < n; i++) 
		{
			array[i] = scanner.nextInt();
			sum = sum+array[i];
		}		
		System.out.println("Elements of the array:");

		for (int i: array) 
		{
			System.out.print(i + " ");
		}
		average = (double) sum / n;
		System.out.println("\nSum of elements: " + sum);
		System.out.println("Average of elements: " + average);
		scanner.close();
	}

	public static void main(String[] args) {
		sumAverage();
	}
}


