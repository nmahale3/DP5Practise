package com.tq.day13.overriding;

class eBay extends Companies
{
	@Override
	void address()
	{
		System.out.println("eBay");
	}
}

class Companies
{
	void address()
	{
		System.out.println(" Companies ");
	}
	
//	int add(int a , float b) 
//	{
//		System.out.println("Hiiii...");
//		return (int) (a+b);
//	}
//	float add( float a , int b) 
//	{
//		System.out.println("Hello...");
//		return a+b;
//	}
}
public class Company {
	public static void main(String[] args) {
		eBay e = new eBay();
		e.address();
		
		Companies c = new Companies();
//		c.add(10, 10);
		
	}
}
