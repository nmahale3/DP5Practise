package com.tq.day3.homework;
import java.util.Scanner;

public class Table {
 
	public static void main(String[] args)
	{
		Scanner A = new Scanner(System.in);
		System.out.println("Enter the number Whose table you want");
		int a=A.nextInt();
		for (int i = 1; i < 11; i++) {
			System.out.println(a+" * "+i+" = "+(a*i));
		}
		A.close();
	}
}
