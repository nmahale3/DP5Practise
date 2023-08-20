package com.tq.day4.homework;

public class sum1_10EvenWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=10;
		int i=1,sum=0;
		while(i<=range)
		{
			if(i%2==0)
				sum+=i;
			i++;
		}
		System.out.println(sum);
	}

}

