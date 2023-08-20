package com.tq.day4.homework;

import java.util.Scanner;

public class TableWhile {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the number of Table");
		int num=s.nextInt();
		int i=1;		
		while(i<=10)
		{
		System.out.println(num+" * "+i+" = "+(num*i));
		i++;
		}
		s.close();

	}

}
