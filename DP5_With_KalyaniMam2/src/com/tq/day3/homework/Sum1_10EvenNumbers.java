package com.tq.day3.homework;

public class Sum1_10EvenNumbers {
	public static void main(String[] args) {
		int sum=0;
		for (int i = 1; i <=10 ; i++) 
		{
			if(i%2==0)
			{
				sum+=i;
			}
			
		}
		System.out.println("Sum of first 10 Even numbers = "+sum);
	}

}
