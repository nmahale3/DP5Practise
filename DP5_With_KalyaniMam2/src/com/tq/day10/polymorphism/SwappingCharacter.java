package com.tq.day10.polymorphism;

public class SwappingCharacter {

	char a1;
	char b1;
	public SwappingCharacter(char a, char b) {
		// by using third variable
//		a1=a;
//		b1=b;
//		char temp=a1;
//		a1=b1;
//		b1=temp;
		System.out.println(a+"... "+b);
		// without using third variable - error
//		a1=a1+b1;
//		b1=a1-b1;
//		a1=a1-b1;
		
		a=(char)(a+b);
		b=(char)(a-b);
		a=(char)(a-b);
		
		System.out.println(a+"... "+b);

	}
	public  void show()
	{
		System.out.println(a1+" "+b1);
	}
	public static void main(String[]args)
	{
		SwappingCharacter s = new SwappingCharacter('a','b');
		s.show();
	}


}
