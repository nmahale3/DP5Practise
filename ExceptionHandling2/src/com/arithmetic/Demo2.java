package com.arithmetic;

public class Demo2 {

	public static void main(String[] args) {
		int num[]= {10,20,30,40,50};
		try 
		{
			for (int i = 0; i <= num.length; i++) {
				System.out.println(num[i]);
			}
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);//class & messages
			System.out.println(e.getMessage());//messages
			System.out.println(e.getClass());//class
			e.printStackTrace();//class,names,discriptions and line number
		}
		System.out.println("End");
	}
}
