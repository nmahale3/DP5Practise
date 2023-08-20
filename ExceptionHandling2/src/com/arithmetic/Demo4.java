package com.arithmetic;

public class Demo4 {

	public static void main(String[] args) {

		String s=null;
		int a= 10;
		int b= 0;
		int num[]= {4,5,6,7,8};
		try {
			int div =a/1;
			System.out.println("div:\t"+div);
			System.out.println("array:\t"+num[12]);
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("Please don't divide by zero");
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check index number");
		}
		catch (RuntimeException e) {
			System.out.println("Runtime exception");
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("Rest of the code");
	}
}
