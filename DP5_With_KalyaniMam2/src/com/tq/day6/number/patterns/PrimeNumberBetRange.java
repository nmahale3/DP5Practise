package com.tq.day6.number.patterns;

import java.util.Scanner;

public class PrimeNumberBetRange {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Start Range of prime number");
		int startRange=sc.nextInt();
		System.out.println("Enter End Range of prime number");
		int endRange=sc.nextInt();
		int count=0;
		for(int i=startRange;i<=endRange;i++)
		{
			if(i>1)
				
			{		
			
				boolean isPrime=true;
				for (int j = 2; j <=i-1; j++)
				{
					
					if(i%j==0)
					{
						
						isPrime = false;
						//count++;
						break;
					}
				
				}
				if(isPrime==true)
				{
					System.out.print(i+" ");
					count++;
				}
					
			}
		
				
		}	System.out.println("\n"+count);
		sc.close();	
		System.out.println();
		
	}

}
