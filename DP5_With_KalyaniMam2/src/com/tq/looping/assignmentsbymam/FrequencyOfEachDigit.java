package com.tq.looping.assignmentsbymam;

import java.util.Scanner;

public class FrequencyOfEachDigit {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any number" );
		int num=sc.nextInt();
		sc.close();
		int count=0;
		for(int i =0;i<=9;i++)
		{
			while(num>0)
			{
				count++;
				num/=10;
			}			
			if(count==i)
			{
				System.out.println(i+" "+count);
			}
		}
	}
}



