package com.xobintest;

public class SecondLargest {

	public static void main(String[] args) {
		int arr[] = { 23,100 , 45, 6, 67, 78, 10 };
		System.out.println("----------Second Largest if First is greater----------");
		secondLargestNumber(arr);
	}

	private static void secondLargestNumber(int[] arr) {
		int largest = arr[0], secondLargest = arr[1],sum=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > largest) {
				secondLargest = largest;
				largest = arr[i];
				
			} else if (arr[i] > secondLargest &&  largest>arr[i] ) {
				secondLargest = arr[i];
			}
			
			
			
		}System.out.println("Largest :"+largest);
		System.out.println("Second Largest :"+secondLargest);
	
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]<secondLargest)
			{
				sum=sum+arr[i];
			}
		}
		System.out.println(sum);
	
	}

}
