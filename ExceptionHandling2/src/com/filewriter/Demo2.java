package com.filewriter;
//classforname
public class Demo2 {
	
	public static void main(String[] args) {
		System.out.println("-----Start-----");

		try 
		{
//			Class clsname=Class.forName("com.exception.demo.ExceptionHandling");
			Class clsname=Class.forName("java.lang.String");
		System.out.println("Class Name : "+clsname);
		} catch (Exception e) 
		{
	System.out.println("please check name of class");
		}
		System.out.println("-----End-----");
	}

}
