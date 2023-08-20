package com.assignment;
//2.WAP to use catch / handle the ArrayIndexOutOfBoundsException exception.
public class TryCatchException2 {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please enter upto index only");
		}
	}
}
