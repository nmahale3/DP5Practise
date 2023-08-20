package com.tq.day3.loops;
import java.util.Scanner;

public class PrimeBoolean {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check is it prime or not");
		int num = sc.nextInt();
		boolean isPrime = true;
		for(int i=2;i<num;i++)
		{
			if (num%i==0) 
			{
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println(num+" is Prime Number");
		}
		else
		{
			System.out.println(num+" is not Prime Number");
		}
		sc.close();
	}

}
