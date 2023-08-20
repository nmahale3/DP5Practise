
package com.finallyblock;

public class Demo1 {

	public static void main(String[] args) {
		
//		try-finally
//		try-catch-finally
		int a=10;
		int b=0;
		try {
			int div=a/b;
		System.out.println("div :"+div);	
		} 
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		finally {
		System.out.println("Always executes");
		}
		System.out.println("End ");
	}	

}
