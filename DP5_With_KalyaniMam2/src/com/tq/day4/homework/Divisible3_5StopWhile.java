package com.tq.day4.homework;

public class Divisible3_5StopWhile {

	public static void main(String[] args) {
		int num=20;
		int i=1;
		while(i<=num)
		{
			if(i%3==0&&i%5==0)
			{
				break;
			}
			System.out.println(i);
			i++;
		}
	}
	
}
