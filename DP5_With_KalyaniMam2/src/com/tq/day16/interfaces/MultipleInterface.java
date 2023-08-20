package com.tq.day16.interfaces;

interface intA
{
	void m1();
}
interface intB
{
	void m2();
}

class SimpleChild implements intA,intB
{

	@Override
	public void m2() {
		System.out.println("Second Interface M1 Method");
	}

	@Override
	public void m1() {
		System.out.println("First Interface M1 Method");
	}

}

public class MultipleInterface {

	public static void main(String[] args) {
		SimpleChild s = new SimpleChild();
		s.m1();
		s.m2();
	}
}
