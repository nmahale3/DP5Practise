package com.finallyblock;

import java.util.InputMismatchException;

public class NestedTryCatch {
	public static void main(String[] args) {
		String s=null;
		int num[]= {4,5,6,7,8};
		int a=10;
		int b=0;
		try
		{
			//			block-I
			try 
			{
				System.out.println(a/b);
			}
			catch (ArithmeticException e) 
			{
				System.out.println(e.getMessage());
			}
			//			block-II
			try 
			{
				System.out.println(s.length());
			}
			catch (NullPointerException e) 
			{
				System.out.println(e.getMessage());
			}
			//			Block-III
			try
			{
				System.out.println(num[10]);
			}
			catch (InputMismatchException e) 
			{
				System.out.println(e.getMessage());
			}	
		} 
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
