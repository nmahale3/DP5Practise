package com.tq.day1.opeandDatatype;

public class Unaryops 
{
	public static void main(String[] args) {
		
	int  x,a=4, b=1;
	
	 x=++a - --b  /* - b--*/ + a + b - --a;
	 System.out.println(x+" "+a+" "+b);
	 
	 x=b-- + --b + a - b + --a + a++;
	 System.out.println(x+" "+a+" "+b);
	 
	 x=--a - --a + a - a + b--;
	 System.out.println(x+" "+a+" "+b);
	}
   
}
