package com.tq.day13.overriding;

class Test
{
	 void testDrive()// rule2 with higher priority in child class
//	public void tesDrive()
	{
		System.out.println("Simple test ");
	}

}

class Test1 extends Test
{
	//public void testDrive()
	public void testDrive()
	{
		System.out.println("Child Test class");
	}

public static void main(String []args)
{
	Test t = new Test();
	t.testDrive();//Rule-1 Same Method name with same signature
	
	Test1 t1= new Test1();
	t1.testDrive();
	
	
}

}