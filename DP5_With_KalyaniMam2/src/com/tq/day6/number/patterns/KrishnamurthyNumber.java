package com.tq.day6.number.patterns;

import java.util.Scanner;

public class KrishnamurthyNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num = sc.nextInt();
		int sum=0,temp=num,digit,fact;
		while(num>0)
		{
			fact=1;
			digit=num%10;
			for(int i=1;i<=digit;i++)
			{
				fact*=i;
			}
			num/=10;
			sum+=fact;
		}
		
		System.out.println(sum);
		
		num=temp;
		if (num==sum) {
			System.out.println("Krishnamurthy Number");
		}
		else
		{
			System.out.println("not Krishnamurthy Number");
		}
		sc.close();
	}

}
