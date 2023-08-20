package com.tq.day3.homework;

public class Divisible3_5Skip {


	public static void main(String[] args) {
		int num=20;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 && i%5==0)
			{
				continue;
			}
			System.out.println(i);
		}	
	}
}
