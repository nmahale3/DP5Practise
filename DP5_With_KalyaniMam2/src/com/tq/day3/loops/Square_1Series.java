package com.tq.day3.loops;

import java.util.Scanner;

public class Square_1Series {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number till how you want series");
		int num = sc.nextInt();
		for (int i = 1; i <= num; i++) 
		{
			System.out.print(((i*i)-1)+" ");
		}
		sc.close();
	}

}
