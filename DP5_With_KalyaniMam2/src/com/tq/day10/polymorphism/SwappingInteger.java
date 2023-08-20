package com.tq.day10.polymorphism;

public class SwappingInteger {
	int a1;
	int b1;
	 public SwappingInteger(int a, int b)
	 // public void SwappingInteger(int a, int b)- by method
	{
		a1=a;
		b1=b;

		a1=a1+b1;
		b1=a1-b1;
		a1=a1-b1;


		//this is Showing same Values as inputed 
		/* 
		 * this.a=a;
		 * this.b=b;
		 * a=a+b;
		 * b=a-b;
		 * a=a-b;
		 * */

	}

	public void show() {

		System.out.println(a1+" "+b1);
	}

	public static void main(String[] args) {

		SwappingInteger s = new SwappingInteger(10, 15);
		s.show();
	}

}
