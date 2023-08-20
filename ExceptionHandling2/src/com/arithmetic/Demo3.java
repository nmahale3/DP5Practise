package com.arithmetic;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo3 {
	
	public static void main(String[] args) {
		int num[]=new int[5];
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the elements");
		try
		{
			for (int i = 0; i < num.length; i++) {
				num[i]=s.nextInt();
				
			}
		}
		catch(ArrayIndexOutOfBoundsException a)
		{
			System.out.println(a.getMessage());
		}

		catch (InputMismatchException i) {
			System.out.println("input missmatch Exception");
			i.printStackTrace();
		}
		System.out.println("----------Array----------");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
	}

}
