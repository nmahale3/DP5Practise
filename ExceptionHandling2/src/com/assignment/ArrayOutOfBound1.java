package com.assignment;

//WAP which throws ArrayIndexOutBoundsException.
//In the console, 
//observe the stack trace and the line number from where the Exception is thrown

public class ArrayOutOfBound1 {
	
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		try {
		for (int i = 0; i <= arr.length; i++) {
			System.out.println(arr[i]);
		}
		}
		catch (ArrayIndexOutOfBoundsException e) {
		e.printStackTrace();
		}
	}
	

}
