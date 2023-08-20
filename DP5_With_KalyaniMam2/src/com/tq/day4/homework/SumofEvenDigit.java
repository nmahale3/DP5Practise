package com.tq.day4.homework;
import java.util.*;
public class SumofEvenDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num=sc.nextInt();
	int sum=0;
	while(num>0)
	{
		int digit=num%10;
		if(digit%2==0)
		{
			sum+=digit;
		}
		num=num/10;
	}
	System.out.println(sum);
	sc.close();
}
}
