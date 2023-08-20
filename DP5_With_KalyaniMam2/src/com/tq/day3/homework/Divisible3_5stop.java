package com.tq.day3.homework;

public class Divisible3_5stop {

	public static void main(String[] args) {
		int num=20;
		for(int i=1;i<=num;i++)
		{
			if(i%3==0 && i%9==0)
			{
				break;
			}
			System.out.println(i);
		}	
	}
}
