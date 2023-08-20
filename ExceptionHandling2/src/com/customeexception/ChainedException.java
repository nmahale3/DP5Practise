package com.customeexception;

import java.io.IOException;

public class ChainedException {

	public static void divide(int a,int b) {
		try
		{
			int div=a/b;
			System.out.println("Division : "+div);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception arise : "+e);
			ArithmeticException ae=new ArithmeticException();
			ae.initCause(new IOException("Dividing number by zero. please do not enter Zero"));
			throw ae;
		}
	}
	public static void main(String[] args) {
		int a=10;
		int b=0;
		
		try {
			divide(a, b);
		} catch (ArithmeticException e) {
			System.out.println(e.getCause());
		}
	}

}
