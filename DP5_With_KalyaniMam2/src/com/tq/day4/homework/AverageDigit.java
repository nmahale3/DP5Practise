package com.tq.day4.homework;
import java.util.Scanner;
public class AverageDigit {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Number");
	int num = sc.nextInt();
	int sum=0;
//	int temp=num;
	int count=0;
	while (num>0)
	{
	int digit=num%10;
	sum=sum+digit;
	num=num/10;
	count++;
	}
	System.out.println(sum);
	System.out.println("Average = "+(sum/count));
	sc.close();
}
}
