package com.tq.day4.whiledowhile;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = s.nextInt();
		int temp;
		temp=num;
		int sum=0;
		while (num>0)
		{
		int digit=num%10;
		int cube=digit*digit*digit;
		sum=sum+cube;
		num=num/10;	
		}
		num=temp;
		System.out.println(sum);
		if(num==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not an Armstrong Number");
		}
		s.close();
	}

}
