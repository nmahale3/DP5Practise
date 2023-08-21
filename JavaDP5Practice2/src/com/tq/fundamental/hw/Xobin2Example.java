package com.tq.fundamental.hw;

import java.util.Scanner;

public class Xobin2Example {
// if we input 12 than show the factors i.e. 2 4 6 8 10 12
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt(); 
		for (int i = 1; i <=num; i++) {
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		sc.close();

	}

}
