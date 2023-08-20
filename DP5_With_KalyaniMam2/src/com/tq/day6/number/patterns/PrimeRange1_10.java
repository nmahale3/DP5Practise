package com.tq.day6.number.patterns;


public class PrimeRange1_10 {
	
	public static void main(String[] args) {
		
	for (int num = 1; num <=10 ; num++)
	{
		boolean isPrime=true;
		for (int i = 2; i<=num-1; i++)
		{
			if(num%i==0) 
			{
				isPrime=false;
				break;
			}
		}
		if (isPrime==true) {
			System.out.println(num);
		}
	}
	
	}

}
