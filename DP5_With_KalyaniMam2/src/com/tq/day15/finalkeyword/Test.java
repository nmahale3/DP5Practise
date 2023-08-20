package com.tq.day15.finalkeyword;

public class Test
{
	final  int num = 200;
	final int num1;
	Test()// we can initialized value of final var by using constructor
	{
		num1=202;
	}
	Test(String name)
	{
		num1=656;
		// if one or more than one constructor then it is mandatory to initialized the final variable inside each and every Constructor as a local variable.
		// it is mandatory to initialize.
	}
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println(t.num);//to call final keyword we required object of a class and we can call it by objectreference.var_name.
	}
	
}
