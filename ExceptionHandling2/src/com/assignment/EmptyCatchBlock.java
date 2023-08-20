package com.assignment;

/*7. WAP to check can we have an empty catch block?*/
public class EmptyCatchBlock {
	
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
	try {
		System.out.println(arr[5]);
	} catch (ArrayIndexOutOfBoundsException e) {
		
	}
	}

}
