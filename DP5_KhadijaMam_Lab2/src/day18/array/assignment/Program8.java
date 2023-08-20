package day18.array.assignment;

import java.util.Scanner;

/*
 * 8.	WAP to search for a given number in an array and accordingly print the index if exists.
 */
public class Program8 {

	public static int searchNumberInArray(int[] arr, int target) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int[] array = { 5, 9, 2, 8, 7, 97 };

		System.out.print("Enter the number you want to search for: ");
		int searchNumber = input.nextInt();

		int result = searchNumberInArray(array, searchNumber);

		if (result != -1)
		{
			System.out.println("The number " + searchNumber + " was found at index " + result + ".");
		}
		else
		{
			System.out.println("The number " + searchNumber + " was not found in the array.");
		}

		input.close();
	}
}