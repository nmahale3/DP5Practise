package com.tq.day4.homework;

public class Sum10NumbersFactors {
	
	public static void main(String[] args) {
		int num=10;
		int i=1,sum=0;
		while(i<=num)
		{
			if(num%i==0)
			{
				System.out.print(i+" ");
				sum+=i;
			}
			i++;
		}
		System.out.println("\nSum of Factors = "+sum);
	}

}
