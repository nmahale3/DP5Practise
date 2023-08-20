package com.customeexception;

import java.io.FileNotFoundException;
import java.io.IOException;

class Parent
{
	public void m1(int a)
	{
		System.out.println("a : "+a);
	}
public void m2(double d)throws IOException,RuntimeException {
	System.out.println("d : "+d);	
	}
}

class Child extends Parent
{
	/*case-1 not possible  cant throw checked exception
	 * public void m1(int a) throws IOException 
	 * { 
	 * System.out.println("a : "+a*10);
	 *  }
	 */
	/*case-2 possible  can throw unchecked exception
		public void m1(int a) throws ArithmeticException 
	  { 
	  System.out.println("a : "+a*10);
	   }
	 */
	public void m1(int a) throws ArithmeticException
	 { 
	 System.out.println("a : "+a);
	 }
	
	public void m2(double d) throws FileNotFoundException,ArithmeticException
	 { 
	 System.out.println("d : "+d);
	 }
	
	
}

public class MethodOverridngInException {
public static void main(String[] args) {
	Child c = new Child();
	c.m1(12);
	try {
		c.m2(673);
	} catch (FileNotFoundException|ArithmeticException e) {
		
		e.printStackTrace();
	} 
}
}
