package com.assignment;
//WAP to catch multiple exceptions. 
//i.e ArrayIndexOutOfBoundsException and ArithmeticException
public class MultipleException3 {
	
	public static void main(String[] args) {
		
		int a=10,b=0;
		int div;
		int arr[]= {1,2,3,4};
		try {
			div=a/b;
	
			for (int i = 0; i <= arr.length; i++) {
				System.out.println(arr[i]);
			}
		}
		catch (ArithmeticException |ArrayIndexOutOfBoundsException e ) {
			
			e.printStackTrace();
		}
		
	}

}
