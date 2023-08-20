package com.tq.day17.interfaces2;

interface Cals
{
	public void m1();
	public void m2();
	public void m3();
}

abstract class CalsChild implements Cals
{
	public void m2() 
	{
		System.out.println("M2 Child Method");
	}
}
class CalsSubChild extends CalsChild
{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}
	
}
public class Demo3 {

	public static void main(String[] args) {
		CalsSubChild csc = new CalsSubChild();
		csc.m2();
	}
}
